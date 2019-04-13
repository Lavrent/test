package com.aca.gameengine;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int num;

    public  Game(){
        Random rand  = new Random();
        num = rand.nextInt(2000);
    }

     Operands guess(int guess_num){
        Operands op;
        if (num<guess_num)
            op = Operands.LESS;
        else if (num==guess_num)
            op = Operands.EQUAL;
        else
            op = Operands.MORE;

        return op;
    }

    public static void main(String[] args) {
        Game gm = new Game();
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
            while (gm.guess(num)!=Operands.EQUAL) {
                System.out.println(gm.guess(num));
                num = in.nextInt();
            }
        System.out.println("That's right");
    }

}
