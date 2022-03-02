package com.company;

public class Main {

    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};

        for (Animal i : animals) {
            if (i instanceof Shark) {
                ((Shark) i).attack();
            }

            if (i.getClass().getName().equals("com.company.Shark")) {
                ((Shark) i).attack();
            }

            if (i instanceof Turtle) {
                ((Turtle) i).swim();
            }

            if (i.getClass().getName().equals("com.company.Turtle")) {
                ((Turtle) i).swim();
            }

            if (i instanceof Eagle) {
                ((Eagle) i).fly();
            }

            if (i.getClass().getName().equals("com.company.Eagle")) {
                ((Eagle) i).fly();
            }
            System.out.println(" ");
        }


        Shark[] sharks = new Shark[animals.length];
        Eagle[] eagles = new Eagle[animals.length];
        Turtle[] turtles = new Turtle[animals.length];

        int sharkCounter = 0;
        int eagleCounter = 0;
        int turtleCounter = 0;
        for (Animal counter : animals) {
            if (counter instanceof Eagle) {
                eagles[eagleCounter] = new Eagle();
                eagleCounter++;
            }
            if (counter instanceof Shark) {
                sharks[sharkCounter] = new Shark();
                sharkCounter++;
            }
            if (counter instanceof Turtle) {
                turtles[turtleCounter] = new Turtle();
                turtleCounter++;
            }
        }
    }
}
