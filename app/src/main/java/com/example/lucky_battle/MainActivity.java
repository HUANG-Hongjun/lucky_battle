package com.example.lucky_battle;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private player p1 =new player();
    private player p2 =new player();
    private TextView hp1;
    private TextView hp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hp1=(TextView) findViewById(R.id.hp1);
        hp2=(TextView) findViewById(R.id.hp2);
        hp1.setText(Integer.toString(p1.getHp()));
        hp2.setText(Integer.toString(p2.getHp()));

    }

    public void atkBouttonClicked(View view){
        p1.setHp(p1.getHp()-p2.attack());
        p2.setHp(p2.getHp()-p1.attack());


        if(p1.getHp()>0&&p2.getHp()>0){
            hp1.setText(Integer.toString(p1.getHp()));
            hp2.setText(Integer.toString(p2.getHp()));
        }
        else if(p1.getHp()<=0){
            Toast.makeText(MainActivity.this, "you win!", Toast.LENGTH_LONG).show();
            hp1.setText(Integer.toString(0));
            hp2.setText(Integer.toString(p2.getHp()));
        }
        else if (p2.getHp()<=0){
            hp1.setText(Integer.toString(p1.getHp()));
            hp2.setText(Integer.toString(0));
            Toast.makeText(MainActivity.this, "you lose!", Toast.LENGTH_LONG).show();
        }


    }



}
