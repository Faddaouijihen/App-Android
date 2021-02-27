package com.example.jihenex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user, pwd;
    private Button Btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.user);
        pwd = findViewById(R.id.pwd);
        Btn = findViewById(R.id.Btn);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equals("admin") && pwd.getText().toString().equals("admin")) {

                    Intent intent = new Intent(v.getContext(), MainActivity2.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "ereur!!!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
