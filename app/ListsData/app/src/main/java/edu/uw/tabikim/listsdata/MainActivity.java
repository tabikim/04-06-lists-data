package edu.uw.tabikim.listsdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.lang.Override;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_control_layout);

        Button btn = (Button) findViewById(R.id.btnSearch);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override public void onClick(View v) {
                Log.v(TAG, "Button clicked!");
            }

        });
    }

    public void handleClick(View v) {

    }
}
