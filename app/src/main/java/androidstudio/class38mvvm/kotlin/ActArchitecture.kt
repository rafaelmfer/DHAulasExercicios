package androidstudio.class38mvvm.kotlin

import androidx.lifecycle.Observer
import com.my_utils.baseviews.ActBind
import com.my_utils.extensions.hideKeyBoard
import com.my_utils.extensions.string
import com.my_utils.extensions.toast
import com.my_utils.extensions.viewModel
import com.rafaelmfer.codeclasses.R
import com.rafaelmfer.codeclasses.databinding.ActivityArchitectureBinding

class ActArchitecture : ActBind<ActivityArchitectureBinding>() {

    override val bindClass = ActivityArchitectureBinding::class.java
    private val viewModel by lazy { viewModel<ViewModelArchitecture>() }

    override fun ActivityArchitectureBinding.onBoundView() {

//        vm.validaDigito("555") tomar cuidado para não tentar chamar Observers
//        ANTES de tê-los configurado

        arqButton.setOnClickListener {
            viewModel.validaDigito(arqInput.string)
            hideKeyBoard()
        }

        viewModel.text.observe(this@ActArchitecture, Observer { retorno -> toast(retorno!!) })

        viewModel.impar.observe(this@ActArchitecture, Observer { ehImpar ->
            arqText.text = getString(if (ehImpar!!) R.string.is_odd else R.string.is_even)
        })
    }
}







