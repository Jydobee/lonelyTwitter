package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Duck  extends Animal{

    @Override
    public void swim() {
        Log.d(tag: "James", msg: "Hey, I swim well. ");
    }
    public void fly() {
        Log.d(tag: "James", msg: "I love flying.");

    }
}
