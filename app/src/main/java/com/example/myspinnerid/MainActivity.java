package com.example.myspinnerid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] countrynames;
    private Spinner spinner;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countrynames = getResources().getStringArray(R.array.Country_Names);
        spinner = findViewById(R.id.spinnerId);
       button = findViewById(R.id.buttonid);
       textView= findViewById(R.id.textid);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textsampleId,countrynames);
        spinner.setAdapter(adapter);
    }
}