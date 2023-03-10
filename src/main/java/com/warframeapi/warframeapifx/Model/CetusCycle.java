package com.warframeapi.warframeapifx.Model;

public class CetusCycle extends Lieux{
    public String startString;
    public String active;
    public String isDay;
    public String isCetus;
    public String shortString;

    public CetusCycle(String id, String expiry, String state, String activation, String timeLeft){
        super(id, activation, state, expiry, timeLeft);
    }

    public CetusCycle(){
        super();
    }

    public String getStartString() {
        return startString;
    }

    public void setStartString(String startString) {
        this.startString = startString;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getIsDay() {
        return isDay;
    }

    public void setIsDay(String isDay) {
        this.isDay = isDay;
    }

    public String getIsCetus() {
        return isCetus;
    }

    public void setIsCetus(String isCetus) {
        this.isCetus = isCetus;
    }

    public String getShortString() {
        return shortString;
    }

    public void setShortString(String shortString) {
        this.shortString = shortString;
    }
}
