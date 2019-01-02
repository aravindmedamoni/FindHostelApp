package com.example.medamoniaravind.class2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etname;
    String name;
    TextView tvshow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.etusername);

        tvshow = findViewById(R.id.showtxt);



    }

    public void TestClick(View view){


        Intent i = new Intent(MainActivity.this,SeconScreen.class);
        startActivity(i);
    }

    public void TestClick2(View view){
        name = etname.getText().toString();

        tvshow.setText("your username is : " +"\n"+ name);

        Toast.makeText(this, "your username is : " + name, Toast.LENGTH_SHORT).show();
    }

}
