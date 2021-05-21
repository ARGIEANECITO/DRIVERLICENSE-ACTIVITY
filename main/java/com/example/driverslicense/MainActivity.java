package com.example.driverslicense;

import androidx.appcompat.app.AppCompatActivity;

import android.app.*;
import android.os.*;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText n,m,na,g,d,w,h,add,bt,c;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button1);
        n=(EditText) findViewById(R.id.txtname);
        na=(EditText) findViewById(R.id.txtnational);
        g=(EditText) findViewById(R.id.txtgender);
        d=(EditText) findViewById(R.id.txtdob);
        w=(EditText) findViewById(R.id.txtweight);
        h=(EditText) findViewById(R.id.txtheight);
        add=(EditText) findViewById(R.id.txtaddress);
        bt=(EditText) findViewById(R.id.txtblood);

        c=(EditText) findViewById(R.id.txtcondition);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(n.getText().toString().equals("")&&na.getText().toString().equals("")&&g.getText().toString().equals("")&&d.getText().toString().equals("")&&w.getText().toString().equals("")&&h.getText().toString().equals("")&&add.getText().toString().equals("")&&bt.getText().toString().equals("")&&c.getText().toString().equals("")){
                   Toast.makeText(getApplicationContext(), "PLEASE COMPLETE THE DATA! ", Toast.LENGTH_SHORT).show();


                }else{
                   intent = new Intent(getApplicationContext(), id.class);
                   intent.putExtra("EdiTtEXTvALUE", n.getText().toString());

                   intent.putExtra("EdiTtEXTvALUE1", na.getText().toString());
                   intent.putExtra("EdiTtEXTvALUE2", g.getText().toString());
                   intent.putExtra("EdiTtEXTvALUE3", d.getText().toString());
                   intent.putExtra("EdiTtEXTvALUE4", w.getText().toString());
                   intent.putExtra("EdiTtEXTvALUE5", h.getText().toString());
                   intent.putExtra("EdiTtEXTvALUE6", add.getText().toString());
                   intent.putExtra("EdiTtEXTvALUE7", bt.getText().toString());
                   intent.putExtra("EdiTtEXTvALUE8", c.getText().toString());
                   Toast.makeText(getApplicationContext(), "DATA SAVED CREATING ID", Toast.LENGTH_SHORT).show();
                   startActivity(intent);
               }
            }
        });

    }
}