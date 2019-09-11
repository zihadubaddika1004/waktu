package com.example.waktu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button goke1,goke2,goke3,goke4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        goke1 = (Button)findViewById(R.id.go1);
        goke1.setOnClickListener(this);
        goke2 = (Button)findViewById(R.id.go2);
        goke2.setOnClickListener(this);
        goke3 = (Button)findViewById(R.id.go3);
        goke3.setOnClickListener(this);
        goke4 = (Button)findViewById(R.id.go4);
        goke4.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.go1:
                Intent moveIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(moveIntent);
                break;
            case R.id.go2:
                Intent moveIntent2 = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(moveIntent2);
                break;
            case R.id.go3:
                Intent moveIntent3 = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(moveIntent3);
                break;
            case R.id.go4:
                Intent moveIntent4 = new Intent(MainActivity.this, Main5Activity.class);
                startActivity(moveIntent4);
                break;
        }
    }
}
