package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.registro.MainActivity;
import com.example.registro.R;
import com.example.registro.RegistroActivity;

public class login extends AppCompatActivity {

    EditText editTextUsername, editTextEmail, editTextPassword;
    Button buttonLogin, buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString().trim();
                String email = editTextEmail.getText().toString().trim();
                String password = editTextPassword.getText().toString().trim();

                // Verificar si el usuario y la contraseña son correctos
                if (username.equals("carlos") && email.equals("carlos@example.com") && password.equals("1234")) {
                    // Inicio de sesión exitoso
                    Toast.makeText(login.this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();
                } else {
                    // Usuario, correo o contraseña incorrectos
                    Toast.makeText(login.this, "Usuario, correo o contraseña incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar la actividad de login
                Intent intent = new Intent(MainActivity.this, com.example.login.login.class);
                startActivity(intent);
            }
        });


    }
}




