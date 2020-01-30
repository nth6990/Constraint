package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    EditText Edittext_id, Edittext_password;
    LinearLayout LinearLayout_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Edittext_id=findViewById(R.id.EditText_id);
        Edittext_password=findViewById(R.id.EditText_password);
        LinearLayout_1=findViewById(R.id.LinearLayout_1);

        LinearLayout_1.setClickable(true);
        LinearLayout_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = Edittext_id.getText().toString();
                String password=Edittext_password.getText().toString();

                Intent intent= new Intent(MainActivity.this, LoginActivity.class);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                startActivity(intent);
            }
        });
    }
}
