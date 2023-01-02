package com.example.covid19new;

public class states {
    String states;
    int cases;
    int active;
    int recover;
    int dead;

    public states(String states, int cases, int active, int recover, int dead) {
        this.states = states;
        this.cases = cases;
        this.active = active;
        this.recover = recover;
        this.dead = dead;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getRecover() {
        return recover;
    }

    public void setRecover(int recover) {
        this.recover = recover;
    }

    public int getDead() {
        return dead;
    }

    public void setDead(int dead) {
        this.dead = dead;
    }
}
