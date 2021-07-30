package com.company;

// Adapter Pattern
// 특정 객체만 호환하는 로직이 있을떄 호환이 안되는 객체도 로직을 쓸 수 있게 끔 아답타 객체를 생성하는 방식

import java.util.ArrayList;

abstract class Player{
    int hp;
    abstract void attack();
}
class warrior extends Player{
    warrior(){
        hp = 30;
    }
    void attack(){

    }
}

abstract class PoseTime{
    String p;
    abstract void q();
    abstract void w();
}
class Cucu extends PoseTime{
    String p;
    void q(){
        p = "q";
    }
    void w(){
        p = "w";
    }
    void pose(){
        q();
    }
}
class Pd extends PoseTime{
    Player k;
    Pd(Player k){
        this.k = k;
    }
    String p;
    void q(){
        p = "q";
    }
    void w(){
        p = "w";
    }
    void fail(){
        k.hp -= 10;
    }
}
public class Main{

    public static void main(String[] args) {
        warrior p = new warrior();


    }

    public void pose(Player p){
        Pd k = new Pd(p);
        Cucu c = new Cucu();

    }
}
