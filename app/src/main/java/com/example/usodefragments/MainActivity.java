package com.example.usodefragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bot=findViewById(R.id.btnBBotonActividad);

        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nombre=getIntent().getStringExtra("nombre");
                Toast.makeText(getApplicationContext(),nombre,Toast.LENGTH_LONG).show();

            }
        });


    }
}

