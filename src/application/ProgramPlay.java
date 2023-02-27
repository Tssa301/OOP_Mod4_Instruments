package application;

import entities.*;

public class ProgramPlay {

    public static void main(String[] args) {

        Instrument[] instruments = {
                new Tuba(),
                new Saxophone(),
                new Violin(),
                new Xylophone()
        };

        Orchestra orchestra = new Orchestra(instruments);
        System.out.println("Orchestra:");
        System.out.println(orchestra.play("Do note"));

    }
}
