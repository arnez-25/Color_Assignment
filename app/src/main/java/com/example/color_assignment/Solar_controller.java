package com.example.color_assignment;

import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;

public class Solar_controller implements SeekBar.OnSeekBarChangeListener, View.OnTouchListener{
    /*
    *  External Citation
    *   Date February 8th 2022
    *   Problem: I didnt know how to make it so that each slider affected and individual RGB value
    *
    *   Resource: Austen from class helped me out with this problem, he showed me some of his code explaining
    *   how I solve this problem
    *
    *   Solution: I add an Int tag for my constructor so that when I assign each seekbar to this controller
    *   I can give it a specific tag to modify the rgb value
    * */
    private int RGB;

    private SolarModel model;
    private Solar drawing;
    public Solar_controller(Solar drawing, int RGB){
           this.RGB = RGB;
           this.drawing = drawing;
           this.model = this.drawing.getModel();
    }
    public Solar_controller(Solar drawing){
        this.drawing = drawing;
        this.model = this.drawing.getModel();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {


        model.setX((int)motionEvent.getX());
        model.setY((int)motionEvent.getY());

        System.out.println(model.getX() + ", " + model.getY());

        return false;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        System.out.println(model.getX() + ", " + model.getY());
        switch (RGB) {
        case 1:
            if ((model.getX() > 900 && model.getX() < 1000) && (model.getY() > 100 && model.getY() < 200)) {
                model.setSun_Red(i);
                drawing.invalidate();
            }
            if((model.getX() > 700 && model.getX() < 800) && (model.getY() > 650 && model.getY() < 750)){
                model.setMoon_Red(i);
                drawing.invalidate();
            }
            if((model.getX() > 965 && model.getX() < 1035) && (model.getY() > 275 && model.getY() < 345)){
                model.setVenus_Red(i);
                drawing.invalidate();
            }
            //Earth
            if((model.getX() > 860 && model.getX() < 1040) && (model.getY() > 410 && model.getY() < 590)){
                model.setEarth_Red(i);
                drawing.invalidate();
            }
            //Mars
            if((model.getX() > 1380 && model.getX() < 1620) && (model.getY() > 480 && model.getY() < 720)){
                model.setMars_Red(i);
                drawing.invalidate();
            }
            //Neptune
            if((model.getX() > 1150 && model.getX() < 1250) && (model.getY() > 800 && model.getY() < 900)){
                model.setNept_Red(i);
                drawing.invalidate();
            }
            break;
        case 2:
            if((model.getX() > 900 && model.getX() < 1000) && (model.getY() > 100 && model.getY() < 200)) {
                model.setSun_Green(i);
                drawing.invalidate();
            }
            if((model.getX() > 700 && model.getX() < 800) && (model.getY() > 650 && model.getY() < 750)){
                model.setMoon_Green(i);
                drawing.invalidate();
            }
            if((model.getX() > 965 && model.getX() < 1035) && (model.getY() > 275 && model.getY() < 345)){
                model.setVenus_Green(i);
                drawing.invalidate();
            }
            //Earth
            if((model.getX() > 860 && model.getX() < 1040) && (model.getY() > 410 && model.getY() < 590)){
                model.setEarth_Green(i);
                drawing.invalidate();
            }
            //Mars
            if((model.getX() > 1380 && model.getX() < 1620) && (model.getY() > 480 && model.getY() < 720)){
                model.setMars_Green(i);
                drawing.invalidate();
            }
            //Neptune
            if((model.getX() > 1150 && model.getX() < 1250) && (model.getY() > 800 && model.getY() < 900)){
                model.setNept_Green(i);
                drawing.invalidate();
            }
            break;
        case 3:
            if((model.getX() > 900 && model.getX() < 1000) && (model.getY() > 100 && model.getY() < 200)) {
                model.setSun_Blue(i);
                drawing.invalidate();
            }
            if((model.getX() > 700 && model.getX() < 800) && (model.getY() > 650 && model.getY() < 750)){
                model.setMoon_Blue(i);
                drawing.invalidate();
            }
            if((model.getX() > 965 && model.getX() < 1035) && (model.getY() > 275 && model.getY() < 345)){
                model.setVenus_Blue(i);
                drawing.invalidate();
            }
            //Earth
            if((model.getX() > 860 && model.getX() < 1040) && (model.getY() > 410 && model.getY() < 590)){
                model.setEarth_Blue(i);
                drawing.invalidate();
            }
            //Mars
            if((model.getX() > 1380 && model.getX() < 1620) && (model.getY() > 480 && model.getY() < 720)){
                model.setMars_Blue(i);
                drawing.invalidate();
            }
            //Neptune
            if((model.getX() > 1150 && model.getX() < 1250) && (model.getY() > 800 && model.getY() < 900)){
                model.setNept_Blue(i);
                drawing.invalidate();
            }
            break;
    }

    }



    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}
