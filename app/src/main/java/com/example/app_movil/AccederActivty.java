package com.example.app_movil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class AccederActivity extends AppCompatActivity {
    private Button btnAcceder;
    private TextView textRegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceder);

        // Encuentra las vistas por ID
        btnAcceder = findViewById(R.id.btn_acceder);
        textRegisterLink = findViewById(R.id.textRegisterLink);

        // Configura el clic en el botón "ACCEDER"
        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navega a LoginActivity
                Intent intent = new Intent(AccederActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        // Configura el clic en el texto "Regístrate"
        textRegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navega a RegistroActivity
                Intent intent = new Intent(AccederActivity.this, RegistroActivity.class);
                startActivity(intent);
            }
        });
    }
}
