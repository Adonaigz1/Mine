package com.example.mine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
CheckBox c1;
        CheckBox c2;
                CheckBox c3;
                CheckBox c4;
                Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = findViewById(R.id.checkBox);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        b1 = findViewById(R.id.button);
        String s1 = "games you play";
        if (c1.isChecked()) {
            s1 += "PUBG";
        }

        if (c2.isChecked()) {
            s1 += "COD";
        }
        if (c3.isChecked()) {
            s1 += "NBA 2K22";

        }
        if (c4.isChecked()) {
            s1 += "FIFA 23";
        }
        Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_SHORT).show();
    }
}