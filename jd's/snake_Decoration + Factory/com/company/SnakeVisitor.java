package com.company;

interface SnakeVisitor {
    Object forHead(String dir,Point h,Snake b);
    Object forTail();
}
class Print implements SnakeVisitor{
    public Object forHead(String dir,Point h,Snake b){
        System.out.println(h.x);
        System.out.println(h.y);
        return b.accept(this);
    }
    public Object forTail(){
        return new Object();
    }
}
class Move implements SnakeVisitor{
    public Object forHead(String dir,Point h,Snake b){
        return new Head(dir,
                    new MoveFactory(h).dxdy(dir),
                    (Snake)b.accept(this));
    }
    public Object forTail(){
        return new Tail();
    }
}
class MoveFactory{
    Point p;
    MoveFactory(Point _p){
        p = _p;
    }
    Point dxdy(String dir){
        if(dir.equals("up"))
            return p.add(new Point(0,-1));
        else if(dir.equals("down"))
            return p.add(new Point(0,1));
        else if(dir.equals("right"))
            return p.add(new Point(1,0));
        else
            return p.add(new Point(-1,0));
    }
}
