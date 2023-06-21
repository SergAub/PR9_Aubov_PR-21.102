package com.example.pr9_aubov_pr_21102;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;


public class steps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
    }

    public void onClickBrowserActivity(View view) {
        Intent intent = new Intent(this, browser.class);
        startActivity(intent);
    }
}