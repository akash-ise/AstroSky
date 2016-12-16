package com.example.akash.astrosky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner1;
    Spinner spinner2;
    String star[];
    String res1;
    String res2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        button = (Button) findViewById(R.id.button);

        //Declare the array
        String [] star=  {"Select any one ","Ashwini","Rohini","Mrigasira","Arudra","Punarvasu",
                "Pushyam","Ashlesha","Makha","Poorva","Uttara","Hasta","Chitta","Swati","Vishakha","Anuradha",
                "Jyeshtha","Moola","Poorvashadha","Uttarashadha","Shravana","Dhanishtha","Shatabhistha",
                "Purvabhadra","Uttarabhadrapada","Revati"};

        //Initialize the array adapter.
        ArrayAdapter adp = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,star);

        //Setting the spinner
        spinner1.setAdapter(adp);
        spinner2.setAdapter(adp);

        //Iteam select listner
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                res1  = String.valueOf(spinner1.getSelectedItemPosition());
                Toast.makeText(MainActivity.this,res1,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //spinner 2 assignment
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                res2  = String.valueOf(spinner2.getSelectedItemPosition());
                Toast.makeText(MainActivity.this,res2,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }//Final end brace
}
