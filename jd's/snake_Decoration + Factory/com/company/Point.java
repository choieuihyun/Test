package com.company;

class Point {
    int x;
    int y;
    Point(int _x,int _y){
        x = _x;
        y = _y;
    }
    Point add(Point dxdy){
        return new Point(x+dxdy.x,y+dxdy.y);
    }
}

