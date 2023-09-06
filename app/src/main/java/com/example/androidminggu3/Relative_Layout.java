package com.example.androidminggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.text.InputType;
import android.view.View;

import java.util.Calendar;
import java.util.Date;

public class Relative_Layout extends AppCompatActivity {

    DatePickerDialog picker;
    EditText eText;
    Button btnGet;
    TextView tvw;

    @Override

    protected void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.relativelayout);
        tvw=(TextView)findViewById(R.id.textview1);
        eText=(EditText) findViewById(R.id.EditText1);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                //Date picker dialog

                picker = new DatePickerDialog(Relative_Layout.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                        eText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                    }
                }, year, month, day);
                picker.show();

            }
        });
        btnGet=(Button)findViewById(R.id.button1);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvw.setText("selected date: "+ eText.getText());
            }
        });
    }
}
