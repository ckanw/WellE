package com.example.welle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class StaffBookDetailActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.staff_book_detail);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btn = findViewById(R.id.btnstaffconfirmbk);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit Intent
                //goToSecondActivity();
                Intent intent = new Intent(StaffBookDetailActivity.this, StaffBookActivity.class);
                startActivity(intent);
            }
        });



        Button btn2 = findViewById(R.id.btnback);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit Intent
                //goToSecondActivity();
                Intent intent = new Intent(StaffBookDetailActivity.this, StaffBookHeaderActivity.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.btnstaffnotice);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit Intent
                //goToSecondActivity();
                Intent intent = new Intent(StaffBookDetailActivity.this, StaffNoticeActivity.class);
                startActivity(intent);
            }
        });







    }
}