package com.example.color_assignment;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;


public class Solar extends SurfaceView  {

    SolarModel model = new SolarModel();

    /* These are gonna be the paints    */
    Paint Moon = new Paint();
    Paint Moon_Crater = new Paint();
    Paint Sun = new Paint ();
    Paint Mars = new Paint ();
    Paint Earth_water = new Paint();
    Paint Earth_green = new Paint();
    Paint Neptune = new Paint();
    Paint Venus = new Paint();

    public SolarModel getModel(){
        return this.model;
    }

    public Solar(Context context, AttributeSet attrs) {
        super(context, attrs);


        setWillNotDraw(false);

        /* Setting up the paints    */
        setAllColors();

        setBackgroundColor(Color.BLACK); //Better than white non-default

    }

    /* A helper method to set all the colors so I don't to manually do it */
    public void setAllColors(){
        //Moon
        Moon.setColor(Color.rgb(model.getMoon_Red(), model.getMoon_Green(), model.getMoon_Blue()));
        Moon.setStyle(Paint.Style.FILL);
        //Sun
        Sun.setColor(Color.rgb(model.getSun_Red(), model.getSun_Green(), model.getSun_Blue()));
        Sun.setStyle(Paint.Style.FILL);
        //Mars
        Mars.setColor(Color.rgb(model.getMars_Red(), model.getMars_Green(), model.getMars_Blue()));
        Mars.setStyle(Paint.Style.FILL);
        //Earth
        Earth_water.setColor(Color.rgb(model.getEarth_Red(), model.getEarth_Green(), model.getEarth_Blue()));
        Earth_water.setStyle(Paint.Style.FILL);
        //Neptune
        Neptune.setColor(Color.rgb(model.getNept_Red(), model.getNept_Green(), model.getNept_Blue()));
        Neptune.setStyle(Paint.Style.FILL);
        //Venus
        Venus.setColor(Color.rgb(model.getVenus_Red(), model.getVenus_Green(), model.getVenus_Blue()));
        Venus.setStyle(Paint.Style.FILL);


        Earth_green.setColor(0xFF057a09);
        Earth_green.setStyle(Paint.Style.FILL);
        Moon_Crater.setColor(0xFF9c988f);
        Moon_Crater.setStyle(Paint.Style.FILL);

    }

    @Override
    public void onDraw(Canvas canvas){

        // If I changed the color I have to reset the paints as well so the colors update with the drawings
        setAllColors();


        canvas.drawCircle(750.0f, 700.0f, 50.0f,  Moon);
        canvas.drawCircle(950.0f, 150.0f,70.0f, Sun);
        canvas.drawCircle(1000, 310, 35, Venus);
        canvas.drawCircle(950.0f, 500.0f, 90.0f, Earth_water);
        canvas.drawCircle(975,490, 10, Earth_green );
        canvas.drawCircle(900,490, 10, Earth_green );
        canvas.drawCircle(1500, 600, 120, Mars);
        canvas.drawCircle(1200, 850, 50, Neptune);
    }


}
