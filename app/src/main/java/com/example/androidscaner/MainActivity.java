package com.example.androidscaner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void scanScreen(View view){
        Intent intent = new Intent(this,ScandisplayActivity.class);
        String message = "Display screen of Scan from Device storage";
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void trashScreen(View view){
        Intent intent = new Intent(this,TrashdisplayActivity.class);
        String message = "Display screen of Trash folder";
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}
