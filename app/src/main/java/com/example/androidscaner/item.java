package com.example.androidscaner;

/**
 * Created by hotAn on 2016-11-10.
 */

public class item implements Comparable<item>{
    private String name;
    private String data;
    private String date;
    private String path;
    private String image;

    public item(String n,String d, String dt, String p, String img)
    {
        name = n;
        data = d;
        date = dt;
        path = p;
        image = img;

    }
    public String getName()
    {
        return name;
    }
    public String getData()
    {
        return data;
    }
    public String getDate()
    {
        return date;
    }
    public String getPath()
    {
        return path;
    }
    public String getImage() {
        return image;
    }

    public int compareTo(item o) {
        if(this.name != null)
            return this.name.toLowerCase().compareTo(o.getName().toLowerCase());
        else
            throw new IllegalArgumentException();
    }
}
