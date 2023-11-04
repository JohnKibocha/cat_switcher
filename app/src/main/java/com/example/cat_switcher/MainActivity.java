package com.example.cat_switcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.example.cat_switcher.R;

public class MainActivity extends AppCompatActivity {

    public void switchImageButton(View view){
        Log.i("Info", "The button works");

        ImageView adorableCatImageView = (ImageView) findViewById(R.id.adorableCatImageView);
        adorableCatImageView.setImageResource(R.drawable.cute_cat);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}