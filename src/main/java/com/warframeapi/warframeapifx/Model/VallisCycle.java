package com.warframeapi.warframeapifx.Model;

public class VallisCycle extends Lieux{
    public String isWarm;
    public String shortString;

    public VallisCycle(String id, String expiry, String state, String activation, String timeLeft){
        super(id, expiry, state, activation, timeLeft);
    }

    public VallisCycle(){
        super();
    }

    public String getIsWarm() {
        return isWarm;
    }

    public void setIsWarm(String isWarm) {
        this.isWarm = isWarm;
    }

    public String getShortString() {
        return shortString;
    }

    public void setShortString(String shortString) {
        this.shortString = shortString;
    }
}
