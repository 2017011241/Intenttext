package com.example.a18801.intenttext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Ace extends AppCompatActivity {

  Button last;
    Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ace);
        intent=getIntent();
        String data=intent.getStringExtra("res");
        Toast.makeText(Ace.this,data,Toast.LENGTH_SHORT).show();
        last=(Button)findViewById(R.id.la);
        last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra("data","Mike");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
