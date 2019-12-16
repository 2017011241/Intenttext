package com.example.a18801.intenttext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button next;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next=(Button)findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Ace.class);
                intent.putExtra("res","what's your name?");
                startActivityForResult(intent,1);
            }
        });
    }
    protected  void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        switch (requestCode)
        {
            case 1:
                if(resultCode==RESULT_OK)
                {
                    String dat=data.getStringExtra("data");
                    Toast.makeText(MainActivity.this,dat,Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
