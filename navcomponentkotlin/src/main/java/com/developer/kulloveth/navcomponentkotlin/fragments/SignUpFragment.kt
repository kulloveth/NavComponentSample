package com.developer.kulloveth.navcomponentkotlin.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.developer.kulloveth.navcomponentkotlin.R
import kotlinx.android.synthetic.main.fragment_sign_up.*

/**
 * A simple [Fragment] subclass.
 */
class SignUpFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
         TextView(activity).apply {
            setText(R.string.hello_blank_fragment)
        }

        return inflater.inflate(R.layout.fragment_sign_up,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        signUpButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_signUpFragment_to_loginFragment, null))

    }


}
