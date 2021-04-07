package com.pazzo;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Book a = new Book(
                "The Lord of the Rings",
                "J.R.R. Tolkein",
                "George Allen and Unwin",
                "Fantasy"
        );


        Poem b = new Poem(
                "The Iliad",
                "Homer",
                "Dactlyic Haxemeter"
        );

        Literature[] literature = new Literature[5];

        literature[0]=a;
        literature[1]=b;
        literature[2]=a;
        literature[3]=b;
        literature[4]=a;


        for (int i=0;i< literature.length;i++){

            literature[i].Print();
        }

    }

}
