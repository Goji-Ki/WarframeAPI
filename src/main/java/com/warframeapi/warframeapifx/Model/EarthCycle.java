package com.warframeapi.warframeapifx.Model;

public class EarthCycle extends Lieux{
    public String isDay;

    public EarthCycle(String id, String expiry, String state, String activation, String timeLeft){
        super(id, expiry, activation, state, timeLeft);
    }

    public EarthCycle(){
        super();
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }
}
