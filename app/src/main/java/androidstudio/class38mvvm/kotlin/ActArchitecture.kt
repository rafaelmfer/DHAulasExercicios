package androidstudio.class38mvvm.kotlin

import androidx.lifecycle.Observer
import com.rafaelmfer.codeclasses.R
import com.rafaelmfer.codeclasses.databinding.ActivityArchitectureBinding
import utils.baseviews.ActBind
import utils.hideKeyBoard
import utils.newViewModel
import utils.string
import utils.toast

class ActArchitecture : ActBind<ActivityArchitectureBinding>() {

    override val bindClass = ActivityArchitectureBinding::class.java
    private val viewModel by lazy { newViewModel<ViewModelArchitecture>() }

    override fun ActivityArchitectureBinding.onBoundView() {

//        vm.validaDigito("555") tomar cuidado para não tentar chamar Observers
//        ANTES de tê-los configurado

        arqButton.setOnClickListener {
            viewModel.validaDigito(arqInput.string)
            hideKeyBoard()
        }

        viewModel.text.observe(activity, Observer { retorno -> toast(retorno!!) })

        viewModel.impar.observe(activity, Observer { ehImpar ->
            arqText.text = getString(if (ehImpar!!) R.string.is_odd else R.string.is_even)
        })
    }
}







