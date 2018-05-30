package com.qspider.navigation.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.qspider.navigation.R;

public class WelcomeFragment extends Fragment {
    private Button login,register;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.welcome_fragment,container,false);
        login=view.findViewById(R.id.loginb);
        register=view.findViewById(R.id.regb);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container,new LoginFragment());
                transaction.addToBackStack("LOGIN");
                transaction.commit();

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction=getActivity().getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment_container,new RegisterFragment());
                transaction.addToBackStack("REGISTER");
                transaction.commit();

            }
        });
        return view;
    }
}
