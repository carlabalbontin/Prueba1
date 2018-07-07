package com.cbalt.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.prueba1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        final Button formButton = findViewById(R.id.formButton);


        // Switch Button
        Switch switchBtn = findViewById(R.id.switchButton);
        switchBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    formButton.setVisibility(View.VISIBLE);
                } else {
                    formButton.setVisibility(View.GONE);
                }
            }
        });



        // Send Form
        formButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                TextInputEditText nombrePersona = findViewById(R.id.nombrePersona);
                String message = nombrePersona.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });
    }
}
