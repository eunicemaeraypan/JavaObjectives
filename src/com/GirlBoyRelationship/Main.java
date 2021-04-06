package com.GirlBoyRelationship;

public class Main {

    public static void main(String[] args) {

        Boy ace = new Boy();
        Girl fel = new Girl();
        Relationship BoyGirl = new Relationship();

        System.out.println(fel.randomFemaleName()+ " " +BoyGirl.randomRelationship() + " " + ace.randomMaleName());


    }
}
