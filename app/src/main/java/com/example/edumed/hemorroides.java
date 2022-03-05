package com.example.edumed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hemorroides extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hemorroides);
        this.setTitle(R.string.hemorroides);
    }
    public void estrenimiento (View view){
        Intent vista = new Intent(this, estrenimiento.class);
        startActivity(vista);
    }
}