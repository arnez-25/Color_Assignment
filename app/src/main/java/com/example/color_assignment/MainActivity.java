package com.example.color_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.SeekBar;

import javax.xml.transform.SourceLocator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        SeekBar red = findViewById(R.id.Red);
        SeekBar green = findViewById(R.id.Green);
        SeekBar blue = findViewById(R.id.Blue);

        Solar solar = findViewById(R.id.surfaceView2);



        Solar_controller controller = new Solar_controller(solar);

        // A bit confused on the syntax of this
        solar.setOnTouchListener(controller);


        red.setOnSeekBarChangeListener(new Solar_controller(solar, 1));
        green.setOnSeekBarChangeListener(new Solar_controller(solar, 2));
        blue.setOnSeekBarChangeListener(new Solar_controller(solar, 3));



    }


}