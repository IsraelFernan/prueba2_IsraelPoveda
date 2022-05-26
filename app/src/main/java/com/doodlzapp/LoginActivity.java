package com.doodlzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = findViewById(R.id.txtUsuario);
    }
    public void ingresar(View view){
        String u = usuario.getText().toString();
        if(u.equals("israel") || u.equals("poveda")){
            Intent i = new Intent(this,MainActivity.class);
            this.startActivity(i);
        }
    }
}