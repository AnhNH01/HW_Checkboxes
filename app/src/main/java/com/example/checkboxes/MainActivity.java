package com.example.checkboxes;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    CheckBox chocoSyrup = null, sprinkles = null, crushedNut = null, cherries = null, cookiesCrumbles = null;
    Button btn = null;
    String message = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocoSyrup = findViewById(R.id.checkBox_choco_syrup);
        chocoSyrup.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b)
                message += compoundButton.getText() + " ";
        });

        sprinkles = findViewById(R.id.checkBox_sprinkles);
        sprinkles.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b)
                message += compoundButton.getText() + " ";
        });

        crushedNut = findViewById(R.id.checkBox_crushed_nuts);
        crushedNut.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b)
                message += compoundButton.getText() + " ";
        });

        cherries = findViewById(R.id.checkBox_cherries);
        crushedNut.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b)
                message += compoundButton.getText() + " ";
        });

        cookiesCrumbles = findViewById(R.id.checkBox_oreo_cookie_crumbles);
        crushedNut.setOnCheckedChangeListener((compoundButton, b) -> {
            if (b)
                message += compoundButton.getText() + " ";
        });

        btn = findViewById(R.id.button);
        btn.setOnClickListener(view -> {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            message = "";
        });
    }


}