package com.developer.kulloveth.navcomponentsample.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.developer.kulloveth.navcomponentsample.R;
import com.google.android.material.button.MaterialButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {

    MaterialButton button;

    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        button = view.findViewById(R.id.sign_up_button);
        button.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_signUpFragment_to_loginFragment, null));

        return view;
    }

}
