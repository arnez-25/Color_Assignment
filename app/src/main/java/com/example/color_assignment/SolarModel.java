package com.example.color_assignment;

public class SolarModel {

    /* Mars RGB values */
    private int mars_Red = 255;
    private int mars_Green = 89;
    private int mars_Blue = 0;
    /* Moon RGB values */
    private int moon_Red = 207;
    private int moon_Green = 204;
    private int moon_Blue = 196;
    /* Sun RGB values */
    private int sun_Red = 255;
    private int sun_Blue = 0;
    private int sun_Green = 177;
    /* Neptune RGB values */
    private int nept_Red = 66;
    private int nept_Green = 161;
    private int nept_Blue = 255;
    /* Venus RGB values */
    private int venus_Red = 189;
    private int venus_Green = 60;
    private int venus_Blue = 28;
    /* Earth Water RGB values */
    private int earth_Red = 0;
    private int earth_Green = 48;
    private int earth_Blue = 171;



    /* Getter and setter method hell... Sorry I know I'm a goofball */
    public int getEarth_Red() {
        return earth_Red;
    }

    public void setEarth_Red(int earth_Red) {
        this.earth_Red = earth_Red;
    }

    public int getEarth_Green() {
        return earth_Green;
    }

    public void setEarth_Green(int earth_Green) {
        this.earth_Green = earth_Green;
    }

    public int getEarth_Blue() {
        return earth_Blue;
    }

    public void setEarth_Blue(int earth_Blue) {
        this.earth_Blue = earth_Blue;
    }


    public int getNept_Red() {
        return nept_Red;
    }

    public void setNept_Red(int nept_Red) {
        this.nept_Red = nept_Red;
    }

    public int getNept_Green() {
        return nept_Green;
    }

    public void setNept_Green(int nept_Green) {
        this.nept_Green = nept_Green;
    }

    public int getNept_Blue() {
        return nept_Blue;
    }

    public void setNept_Blue(int nept_Blue) {
        this.nept_Blue = nept_Blue;
    }

    public int getVenus_Red() {
        return venus_Red;
    }

    public void setVenus_Red(int venus_Red) {
        this.venus_Red = venus_Red;
    }

    public int getVenus_Green() {
        return venus_Green;
    }

    public void setVenus_Green(int venus_Green) {
        this.venus_Green = venus_Green;
    }

    public int getVenus_Blue() {
        return venus_Blue;
    }

    public void setVenus_Blue(int venus_Blue) {
        this.venus_Blue = venus_Blue;
    }





    /* x and y cordinates so that both seekbar and touch listener can access it */
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMars_Red(int red){
        this.mars_Red = red;
    }

    public int getMars_Blue() {
        return mars_Blue;
    }

    public void setMars_Blue(int mars_Blue) {
        this.mars_Blue = mars_Blue;
    }

    public int getMoon_Red() {
        return moon_Red;
    }

    public void setMoon_Red(int moon_Red) {
        this.moon_Red = moon_Red;
    }

    public int getMoon_Green() {
        return moon_Green;
    }

    public void setMoon_Green(int moon_Green) {
        this.moon_Green = moon_Green;
    }

    public int getMoon_Blue() {
        return moon_Blue;
    }

    public void setMoon_Blue(int moon_Blue) {
        this.moon_Blue = moon_Blue;
    }

    public int getSun_Red() {
        return sun_Red;
    }

    public void setSun_Red(int sun_Red) {
        this.sun_Red = sun_Red;
    }

    public int getSun_Blue() {
        return sun_Blue;
    }

    public void setSun_Blue(int sun_Blue) {
        this.sun_Blue = sun_Blue;
    }

    public int getSun_Green() {
        return sun_Green;
    }

    public void setSun_Green(int sun_Green) {
        this.sun_Green = sun_Green;
    }

    public int getMars_Red() {
        return mars_Red;
    }

    public int getMars_Green() {
        return mars_Green;
    }

    public void setMars_Green(int mars_Green) {
        this.mars_Green = mars_Green;
    }
}
