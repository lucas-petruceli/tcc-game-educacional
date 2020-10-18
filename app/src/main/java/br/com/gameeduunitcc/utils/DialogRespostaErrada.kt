package br.com.gameeduunitcc.utils

import android.animation.Animator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.fragment.app.DialogFragment
import br.com.gameeduunitcc.R
import kotlinx.android.synthetic.main.dialog_resposta_errada.view.*

class DialogRespostaErrada : DialogFragment(), Animator.AnimatorListener {

    companion object {

        fun newInstance(): DialogRespostaErrada {
            return DialogRespostaErrada()
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_resposta_errada, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.ltAnimateError.addAnimatorListener(this)
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.WRAP_CONTENT
        )
    }


    override fun onAnimationEnd(animation: Animator?) {
        dismiss()
    }

    override fun onAnimationRepeat(animation: Animator?) {}

    override fun onAnimationCancel(animation: Animator?) {}

    override fun onAnimationStart(animation: Animator?) {}
}