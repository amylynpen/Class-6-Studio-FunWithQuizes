package com.company;
import java.util.*;
public class Question {

    private int pointValue;
    private String text;

    public Question(int pointValue, String text) {
        this.pointValue = pointValue;
        this.text = text;
    }

    public void displayQuestion () { System.out.println(text); }

    public void setPointValue(int x) { this.pointValue = x; }

    public int getPointValue() { return this.pointValue; }

}



/*For each question type be sure to include:

        Class name
        Fields and properties with access modifiers
        Methods with access modifiers
        Any inheritance relationship*/