package com.example.balar.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mtk, ipa, ips, inggris, indonesia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtk = findViewById(R.id.mtk);
        mtk.setOnClickListener(this);

        ipa = findViewById(R.id.ipa);
        ipa.setOnClickListener(this);

        ips = findViewById(R.id.ips);
        ips.setOnClickListener(this);

        inggris = findViewById(R.id.inggris);
        inggris.setOnClickListener(this);

        indonesia = findViewById(R.id.indonesia);
        indonesia.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.mtk:
                Intent mtk = new Intent(MainActivity.this, matematika.class);
                startActivity(mtk);
                break;
            case R.id.ipa:
                Intent ipa = new Intent(MainActivity.this, ipa.class);
                startActivity(ipa);
                break;
            case R.id.ips:
                Intent ips = new Intent(MainActivity.this, ips.class);
                startActivity(ips);
                break;
            case R.id.inggris:
                Intent inggris = new Intent(MainActivity.this, inggris.class);
                startActivity(inggris);
                break;
            case R.id.indonesia:
                Intent indonesia = new Intent(MainActivity.this, indonesia.class);
                startActivity(indonesia);
                break;
        }
    }
}