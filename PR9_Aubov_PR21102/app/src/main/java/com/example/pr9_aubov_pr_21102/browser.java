package com.example.pr9_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class browser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);

        WebView wv = (WebView) findViewById(R.id.Browser);
        wv.loadUrl("https://www.youtube.com/watch?v=dQw4w9WgXcQ");
    }


}