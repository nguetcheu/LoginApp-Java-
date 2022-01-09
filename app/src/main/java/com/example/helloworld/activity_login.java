package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_login extends AppCompatActivity {

    TextView textViewNom;
    TextView textViewPassword;
    EditText editTextNom;
    EditText editTextPassword;
    Button buttonEnvoyer;
    ImageView imageViewLogo;

    public activity_login() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textViewNom = findViewById(R.id.textViewNom);
        textViewPassword = findViewById(R.id.textViewPassword);
        editTextNom = findViewById(R.id.editTextNom);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonEnvoyer = findViewById(R.id.buttonEnvoyer);
        imageViewLogo = findViewById(R.id.imageViewLogo);

        buttonEnvoyer.setEnabled(false);

        editTextPassword.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        buttonEnvoyer.setEnabled(!editable.toString().isEmpty());
                    }
                }
        );

        editTextNom.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        buttonEnvoyer.setEnabled(!editable.toString().isEmpty());
                    }
                }
        );

        buttonEnvoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

}