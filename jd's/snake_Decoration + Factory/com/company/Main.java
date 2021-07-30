package com.company;

import javax.swing.*; //JTable


public class Main{

    public static void main(String[] args) {
        Snake s = new Head("up",new Point(0,0),
                        new Head("up",new Point(0,1),
                            new Head("up",new Point(0,2), new Tail())));
        Object k = s.accept(new Move());
        k = (Snake)k;
        ((Snake) k).accept(new Print());
    }
}
