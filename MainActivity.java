package com.example.vinayjohn.daggersimplified;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Dog dog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupActivityComponent();
        printDependencyExample();
    }

    private void setupActivityComponent(){
        App.getAppComponent().inject(this);
    }

    private void printDependencyExample(){
        Toast.makeText(this, dog.getType(), Toast.LENGTH_SHORT).show();
    }
}
