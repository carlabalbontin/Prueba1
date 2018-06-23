package com.cbalt.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultsTitle = findViewById(R.id.resultsTitle);
        Intent intent = getIntent();
        String resultText = "Muy bien!";

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        if(TextUtils.isEmpty(message)){
        } else {
            String messageCap = message.substring(0, 1).toUpperCase() + message.substring(1);
            resultText = "Muy bien " + messageCap + "!";
        }

        resultsTitle.setText(resultText);

    }
}
