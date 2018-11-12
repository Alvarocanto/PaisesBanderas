package com.example.alvaro.paisesbanderas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import static android.R.*;

public class MainActivity extends AppCompatActivity {
    Spinner cmbPaises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> adaptadorPaises = ArrayAdapter.createFromResource(this,
                R.array.arrayPaises,
                layout.simple_spinner_item);

        cmbPaises = (Spinner)findViewById(R.id.cmbPaises);

        adaptadorPaises.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        cmbPaises.setAdapter(adaptadorPaises);

        ArrayAdapter<CharSequence>
    }



}