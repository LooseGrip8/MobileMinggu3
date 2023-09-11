package com.example.androidminggu3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        View BtnLinear =findViewById(R.id.linearBtn);
        View BtnRelative = findViewById(R.id.RelativeBtn);
        View BtnConstraint = findViewById(R.id.Constraintbtn);
        View BtnFrame = findViewById(R.id.Framebtn);
        View BtnTable = findViewById(R.id.TableBtn);
        View BtnMaterial = findViewById(R.id.MaterialBtn);
        View ScrollV = findViewById(R.id.ScrollBtn);
        View ScrollH = findViewById(R.id.ScrollHorizontalContainer);

        BtnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Constraint_Layout.class));
            }
        });
                BtnLinear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Linear_Layout.class));
                    }
                });

                BtnRelative.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Relative_Layout.class));
                    }
                });
                BtnFrame.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Frame_Layout.class));
                    }
                });
                BtnTable.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Table_Layout.class));
                    }
                });
                BtnMaterial.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Material_Design.class));
                    }
                });
                ScrollV.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Scroll_View.class));
                    }
                });
                ScrollH.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(MainActivity.this, Horizontal_Scroll.class));
                    }
                });
    }
}