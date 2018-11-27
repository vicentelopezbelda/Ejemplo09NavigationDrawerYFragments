package com.example.alumno.ejemplo09_navigationdraweryfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.alumno.ejemplo09_navigationdraweryfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private Context contexto;

    private Button btnAcceder;
    private EditText txtUser, txtPassword;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        btnAcceder = rootView.findViewById(R.id.btnAcceder);
        txtUser = rootView.findViewById(R.id.txtUser);
        txtPassword = rootView.findViewById(R.id.txtPassword);

        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contexto = context;
    }
}
