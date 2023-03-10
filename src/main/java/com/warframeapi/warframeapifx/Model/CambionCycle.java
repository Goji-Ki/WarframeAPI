package com.warframeapi.warframeapifx.Model;

public class CambionCycle extends Lieux{
    public String active;

    public CambionCycle(String id, String expiry, String state, String activation, String timeLeft){
        super(id, expiry, activation, state, timeLeft);
    }

    public CambionCycle(){
        super();
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
