package com.example.wishingapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button button;
    TextView textview;
    public static final String Extra_Name="com.example.wishingapp2.extra.NAME";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        text=findViewById(R.id.editTextTextPersonName);
        textview=findViewById(R.id.textView2);
    }
    public void buttona(View view){
        Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        String nametext=text.getText().toString();
        intent.putExtra(Extra_Name,nametext);
        startActivity(intent);
    }
}