package com.example.medamoniaravind.abc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etname,etpass,etnum;
    String x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname=findViewById(R.id.name);
        etpass=findViewById(R.id.passwordx);
        etnum=findViewById(R.id.number);

    }
    public void buttonclick(View VIEW)
    {
        x=etname.getText().toString();
        y=etpass.getText().toString();
        z=etnum.getText().toString();
        Intent I=new Intent(MainActivity.this,second.class);
                startActivity(I);


    }

}
