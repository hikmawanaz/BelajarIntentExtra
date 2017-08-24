package com.hikma.test.belajarintentextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private String dataIntent;
    private TextView textView;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textView);

        dataIntent = getIntent().getExtras().getString(Intent.EXTRA_TEXT);
        //textView.setText(dataIntent);



                if(dataIntent.equals("1")){
                    textView.setText(dataIntent);
                }else if(dataIntent.equals("2")){
                    textView.setText(dataIntent);
                }else{
                    textView.setText("nulll");
                }

    }
}
