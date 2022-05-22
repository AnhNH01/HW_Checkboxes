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
            String append = compoundButton.getText() + " ";
            if (b) {
                message += append;
                //Log.d("Checked", message);
            } else if (message.contains(append)) {
                message = message.replace(append, "");
                //Log.d("Unchecked", message);
            }
        });

        sprinkles = findViewById(R.id.checkBox_sprinkles);
        sprinkles.setOnCheckedChangeListener((compoundButton, b) -> {
            String append = compoundButton.getText() + " ";
            if (b) {
                message += append;
                //Log.d("Checked", message);
            } else if (message.contains(append)) {
                message = message.replace(append, "");
                //Log.d("Unchecked", message);
            }
        });

        crushedNut = findViewById(R.id.checkBox_crushed_nuts);
        crushedNut.setOnCheckedChangeListener((compoundButton, b) -> {
            String append = compoundButton.getText() + " ";
            if (b) {
                message += append;
                //Log.d("Checked", message);
            } else if (message.contains(append)) {
                message = message.replace(append, "");
                //Log.d("Unchecked", message);
            }
        });

        cherries = findViewById(R.id.checkBox_cherries);
        cherries.setOnCheckedChangeListener((compoundButton, b) -> {
            String append = compoundButton.getText() + " ";
            if (b) {
                message += append;
                //Log.d("Checked", message);
            } else if (message.contains(append)) {
                message = message.replace(append, "");
                //Log.d("Unchecked", message);
            }
        });

        cookiesCrumbles = findViewById(R.id.checkBox_oreo_cookie_crumbles);
        cookiesCrumbles.setOnCheckedChangeListener((compoundButton, b) -> {
            String append = compoundButton.getText() + " ";
            if (b) {
                message += append;
                //Log.d("Checked", message);
            } else if (message.contains(append)) {
                message = message.replace(append, "");
                //Log.d("Unchecked", message);
            }
        });

        btn = findViewById(R.id.button);
        btn.setOnClickListener(view -> {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            message = "";
            //Log.d("BtnClk", message);
            chocoSyrup.setChecked(false);
            sprinkles.setChecked(false);
            crushedNut.setChecked(false);
            cookiesCrumbles.setChecked(false);
            cherries.setChecked(false);
        });
    }


}