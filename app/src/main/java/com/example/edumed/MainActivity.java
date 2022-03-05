package com.example.edumed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gastritis (View view){
        Intent vista = new Intent(this, gastritis.class);
        startActivity(vista);
    }
    public void nauceas (View view){
        Intent vista = new Intent(this, nauceas.class);
        startActivity(vista);
    }

    public void alergia_p (View view){
        Intent vista = new Intent(this, alergia_p.class);
        startActivity(vista);
    }
    public void bronquitis (View view){
        Intent vista = new Intent(this, bronquitis.class);
        startActivity(vista);
    }
    public void diarrea (View view){
        Intent vista = new Intent(this, diarrea.class);
        startActivity(vista);
    }
    public void dolorCabeza (View view){
        Intent vista = new Intent(this, dolordecabeza.class);
        startActivity(vista);
    }
    public void dolorMuscular (View view){
        Intent vista = new Intent(this, dolormusulcar.class);
        startActivity(vista);
    }
    public void oido (View view){
        Intent vista = new Intent(this, ear.class);
        startActivity(vista);
    }
    public void esguince (View view){
        Intent vista = new Intent(this, esguince.class);
        startActivity(vista);
    }
    public void estrenimiento (View view){
        Intent vista = new Intent(this, estrenimiento.class);
        startActivity(vista);
    }
    public void eye (View view){
        Intent vista = new Intent(this, eye.class);
        startActivity(vista);
    }
    public void fiebre (View view){
        Intent vista = new Intent(this, fiebre.class);
        startActivity(vista);
    }
    public void garganta (View view){
        Intent vista = new Intent(this, garganta.class);
        startActivity(vista);
    }
    public void hemorroides (View view){
        Intent vista = new Intent(this, hemorroides.class);
        startActivity(vista);
    }
    public void insomnio (View view){
        Intent vista = new Intent(this, insomnio.class);
        startActivity(vista);
    }
    public void menstruacion (View view){
        Intent vista = new Intent(this, menstruacion.class);
        startActivity(vista);
    }

    public void hongo (View view){
        Intent vista = new Intent(this, hongos.class);
        startActivity(vista);
    }
    public void painback (View view){
        Intent vista = new Intent(this, painback.class);
        startActivity(vista);
    }

    public void nariz (View view){
        Intent vista = new Intent(this, nariz.class);
        startActivity(vista);
    }
    public void unaenterrada (View view){
        Intent vista = new Intent(this, unaenterrada.class);
        startActivity(vista);
    }
    public void urinarios (View view){
        Intent vista = new Intent(this, urinarios.class);
        startActivity(vista);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.overflow,menu);
        return true;
    }
    public boolean onOptionItemSelected(MenuItem item){
        int id = item.getItemId();


        return true;
    }
}