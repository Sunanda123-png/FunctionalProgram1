package com.sunanda;

public class Distance {
    public static void main(String arg[])
    {
        int x1,x2,y1,y2;
        double dis;
        x1=0;y1=0;x2=8;y2=12;
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
    }
}
