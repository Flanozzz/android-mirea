package com.example.androidmirea.domain;

import java.util.ArrayList;

public class Constants {
    static final public String MY_TAG = "MY_TAG";
    static final public String REQUEST_KEY = "REQUEST_KEY";
    static final public String BUNDLE_KEY = "REQUEST_KEY";
    static final public String CHILD_REQUEST_KEY = "CHILD_REQUEST_KEY";
    static final public String BUNDLE_STRING_KEY = "BUNDLE_STRING_KEY";
    static final public String BUNDLE_ID_KEY = "BUNDLE_ID_KEY";

    public static ArrayList<String> Items() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            list.add("элемент " + (i + 1));
        }
        return list;
    }
}
