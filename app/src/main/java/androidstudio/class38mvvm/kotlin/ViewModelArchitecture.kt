package androidstudio.class38mvvm.kotlin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import utils.isDigit
import utils.isOdd

class ViewModelArchitecture : ViewModel() {

    //region propriedades
    private val _text = MutableLiveData<String>().apply { value = "" }
    val text: LiveData<String> = _text

    private val _digit = MutableLiveData<Boolean>().apply { value = false }
    val digit: LiveData<Boolean> = _digit

    private val _impar = MutableLiveData<Boolean>().apply { value = false }
    val impar: LiveData<Boolean> = _impar
    //endregion

    fun validaDigito(text: String) {
        var ehDigitu = false
        val retorno = when {
            text.isEmpty() -> "Tá vazio"
            text.isBlank() -> "Tá cheio de espaço"
            !text.isDigit() -> "$text né número não"
            text.length > 3 -> "Máximo 3 dígitos"
            text.isDigit() -> {
                ehDigitu = true
                text
            }
            else -> ""
        }
        _text.value = retorno
        _digit.value = ehDigitu
        _impar.value = if (ehDigitu) retorno.toInt().isOdd else false
    }
}
