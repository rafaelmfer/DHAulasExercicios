package webservice.androidchallenge2.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import webservice.androidchallenge2.model.pojo.ComicsResponse
import webservice.androidchallenge2.repository.RepositoryMarvel

class ViewModelComicList : ViewModel() {

    var comicsResponse = MutableLiveData<ComicsResponse>()
    private val repositoryMarvel = RepositoryMarvel()

    fun getComics(offset: Int) = CoroutineScope(Dispatchers.IO).launch {
        comicsResponse.postValue(repositoryMarvel.getComics(offset = offset))
    }
}
