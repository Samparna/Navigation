package com.qspider.navigation.Fragment;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.qspider.navigation.R;

public class LoginFragment extends Fragment {
    private EditText email,password;
    private Button login;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.login_fragment,container,false);
        email=view.findViewById(R.id.emailEt);
        password=view.findViewById(R.id.passEt);
        login=view.findViewById(R.id.loginbutton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e=email.toString();
                String p=password.toString();
                if(e.length()==0)
                {
                    Toast.makeText(getActivity(),"invalid email",Toast.LENGTH_SHORT).show();
                }else if(p.length()==0)
                {
                    Toast.makeText(getActivity(),"invalid password",Toast.LENGTH_SHORT).show();
                }
                AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
                builder.setTitle("ALERT");
                builder.setMessage("Login Successful");
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

            }
        });
        return view;

    }
}
