package com.greatcode.codechallengefrontend;

import java.util.ArrayList;

/**
 * Created by marshall.lucas on 8/14/2017.
 */
public class Result {
    private ArrayList<Object> result;

    public ArrayList<Object> getResult() {
        return result;
    }

    public void setResult(ArrayList<Object> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "{ \"result\": " + this.result + " }";
    }
}
