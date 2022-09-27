package com.hotel;

public class Fooditems {
    Integer Coffee;
    Integer Shake;
    Integer Biriyani;
    Integer Alfaham;

    public Fooditems(Integer coffee, Integer shake, Integer biriyani, Integer alfaham) {
        Coffee = coffee;
        Shake = shake;
        Biriyani = biriyani;
        Alfaham = alfaham;
    }

    public Integer getCoffee() {
        return Coffee;
    }

    public void setCoffee(Integer coffee) {
        Coffee = coffee;
    }

    public Integer getShake() {
        return Shake;
    }

    public void setShake(Integer shake) {
        Shake = shake;
    }

    public Integer getBiriyani() {
        return Biriyani;
    }

    public void setBiriyani(Integer biriyani) {
        Biriyani = biriyani;
    }

    public Integer getAlfaham() {
        return Alfaham;
    }

    public void setAlfaham(Integer alfaham) {
        Alfaham = alfaham;
    }
}


