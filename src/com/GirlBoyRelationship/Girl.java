package com.GirlBoyRelationship;
import java.util.Random;

public class Girl {

    public static String randomFemaleName(){
        String names[] = { "Olivia", "Emma", "Ava", "Sophia", "Isabelle", "Charlotte" };
        Random Dice = new Random();
        int n = Dice.nextInt(6);

        return names[n];




    }


}
