package com.example.giuaky_android;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvName323, tvScore323, tvStatus323;
    Button btnBack323;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvName323 = findViewById(R.id.tvName323);
        tvScore323 = findViewById(R.id.tvScore323);
        tvStatus323 = findViewById(R.id.tvStatus323);
        btnBack323 = findViewById(R.id.btnBack323);

        // Nhận dữ liệu
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        double score = intent.getDoubleExtra("score", 0);

        String result = (score >= 5) ? "ĐẬU 🎉" : "RỚT 😢";

        tvName323.setText("Tên: " + name);
        tvScore323.setText("Điểm: " + score);
        tvStatus323.setText("Kết quả: " + result);

        // Quay lại màn hình trước
        btnBack323.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}