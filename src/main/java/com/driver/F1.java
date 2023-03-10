package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name,isManual);
        //Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        newSpeed = getCurrentSpeed()+rate;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            changeGear(1);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
            int speed = getCurrentSpeed();
            if(speed>0 && speed<=50){
               changeGear(1);
            }
            if(speed>50 && speed<=100){
                changeGear(2);
            }
            if(speed>100 && speed<=150){
                changeGear(3);
            }
            if(speed>150 && speed<=200){
                changeGear(4);
            }
            if(speed>200 && speed<=250){
                changeGear(5);
            }
            if(speed>250 ){
                changeGear(6);
            }
        }
    }
}
