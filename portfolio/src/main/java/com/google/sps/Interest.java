package com.google.sps;

import java.util.ArrayList;

public class Interest {
    private ArrayList<String> mylist = new ArrayList<String>();

    public Interest(){
        this.mylist.add("Hiking");
        this.mylist.add("Boxing");
        this.mylist.add("Dancing");
    }

    public ArrayList<String> getList(){
        return mylist;
    }
}