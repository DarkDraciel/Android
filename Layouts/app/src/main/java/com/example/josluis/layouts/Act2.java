package com.example.josluis.layouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class Act2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button button;
     int posicion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);


        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.ops, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent i;
                switch (posicion){
                    case 0:
                        Toast.makeText(view.getContext(),"Debe elegir alguna de las opciones", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        i = new Intent(Act2.this, Frame.class);
                        startActivity(i);
                        break;
                    case 2:
                        i=  new Intent(Act2.this, Linear.class);
                        startActivity(i);
                        break;
                    case 3:
                       i = new Intent(Act2.this, Relative.class);
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(Act2.this, Table.class);
                        startActivity(i);
                        break;
                }


            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        posicion = adapterView.getSelectedItemPosition();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
