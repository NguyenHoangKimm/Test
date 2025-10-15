package com.example.giuaky_android;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtName323, edtScore323;
    Button btnSend323;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName323 = findViewById(R.id.edtName323);
        edtScore323 = findViewById(R.id.edtScore323);
        btnSend323 = findViewById(R.id.btnSend323);

        btnSend323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName323.getText().toString();
                double score = 0;
                if (!edtScore323.getText().toString().isEmpty()) {
                    score = Double.parseDouble(edtScore323.getText().toString());
                }

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("score", score);
                startActivity(intent);
            }
        });
    }
}