package com.bbs.readcomponent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView value_show;
    EditText get_val, get_val_1;
    Button click_bt, submit_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value_show = findViewById(R.id.show);
        click_bt = findViewById(R.id.click);
        submit_bt = findViewById(R.id.submit);
        get_val = findViewById(R.id.get_value);
        get_val_1 = findViewById(R.id.get_value_1);

        click_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //show value using toast
                showData();
            }
        });

        submit_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this, SecondActivity.class));
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }

    public void showData(){
        Toast.makeText(MainActivity.this, get_val.getText(), Toast.LENGTH_LONG).show();
        Integer sum = Integer.valueOf(get_val.getText().toString()) + Integer.valueOf(get_val_1.getText().toString());
        value_show.setText(String.valueOf(sum));
        Log.d("show", "component worked");
    }
}