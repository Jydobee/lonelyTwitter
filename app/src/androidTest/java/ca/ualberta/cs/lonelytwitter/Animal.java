package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Animal {

    protected String type;
    protected String food;

    public void setType(String type){
        this.type  = type;

    }
    public void setFood(String food){
        this.food  = food;

    }

    public String getType() {
        return this.type


    }

    public void getFood(String food){
        this.food  = food;

    }

    public void swim() {
        Log.d(tag: "James", msg: "Hey, I swim well. ")
    }
}
