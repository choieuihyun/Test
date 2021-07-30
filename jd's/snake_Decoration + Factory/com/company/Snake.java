package com.company;

abstract class Snake {
    abstract Object accept(SnakeVisitor ask);
}
class Head extends Snake{
    String dir;
    Point s;
    Snake b;
    Head(String _dir,Point _s,Snake _b){
        dir = _dir;
        s = _s;
        b = _b;
    }
    Object accept(SnakeVisitor ask){
        return ask.forHead(dir,s,b);
    }
}
class Tail extends Snake{
    Object accept(SnakeVisitor ask){
        return ask.forTail();
    }
}