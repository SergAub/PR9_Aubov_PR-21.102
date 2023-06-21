package com.example.pr9_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class start extends AppCompatActivity {

    //private ActivityMainBinding bindingClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }

    public void onClickStepsActivity(View view) {
        Intent intent = new Intent(this, steps.class);
        startActivity(intent);
    }

}



