package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button btn;
    TextView tdrink;
    TextView tsuger;
    TextView tice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setClass(Main2Activity.this, MainActivity.class);
                startActivityForResult(i, 0);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 0) {
            if (resultCode == 101) {
                Bundle b = data.getExtras();
                String str1 = b.getString("drink_level");
                String str2 = b.getString("suger_level");
                CharSequence str3 = b.getString("ice_level");

                tdrink = (TextView) findViewById(R.id.tdrink);
                tsuger = (TextView) findViewById(R.id.tsuger);
                tice = (TextView) findViewById(R.id.tice);

                tdrink.setText(str1);
                tsuger.setText(str2);
                tice.setText(str3);
            }
        }
    }
}