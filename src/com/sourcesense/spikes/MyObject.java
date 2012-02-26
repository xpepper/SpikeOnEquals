package com.sourcesense.spikes;

public class MyObject {

    private final String string;

    public MyObject(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object arg0) {
        MyObject other = (MyObject) arg0;
        boolean areEquals = string.equals(other.string);
        return areEquals;
    }

    @Override
    public int hashCode() {
        int code = string.hashCode();
        System.out.println(code);
        return code;
    }
}
