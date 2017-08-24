package com.hikma.test.belajarintentextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText editText;
    private String intentString;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intentString = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                intent.putExtra(Intent.EXTRA_TEXT, intentString);

                startActivity(intent);
            }
        });




    }

    public void buttonClick(View view){




    }
}
