package com.warframeapi.warframeapifx.Model;

public class Lieux {
    protected String id;
    protected String expiry;
    //public String isWarm;
    protected String state;
    protected String activation;
    protected String timeLeft;
    //public String shortString;

    public Lieux(String id, String expiry, String state, String activation, String timeLeft) {
        this.id = id;
        this.expiry = expiry;
        this.state = state;
        this.activation = activation;
        this.timeLeft = timeLeft;
    }

    public Lieux(){
        this.id = null;
        this.expiry = null;
        this.state = null;
        this.activation = null;
        this.timeLeft = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getActivation() {
        return activation;
    }

    public void setActivation(String activation) {
        this.activation = activation;
    }

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }
}
