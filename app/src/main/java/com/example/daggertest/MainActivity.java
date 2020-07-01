package com.example.daggertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    public Car car;
    CarComponent carComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carComponent=DaggerCarComponent.create();
//        car=carComponent.getCar();
        carComponent.inject(this);
        car.drive();
    }
}