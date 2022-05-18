package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static int countPlayers;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;

    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(MAX_STAMINA - 90) + 90;

        if (countPlayers < 6)
            countPlayers++;
    }

    public void run() {
        if (stamina == MIN_STAMINA)
            return;

        stamina--;
        System.out.println("Player has " + stamina + " stamina");

        if (stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("This player need rest");
        }
    }

    public static void info() {
        if (countPlayers < 6)
            System.out.println("Commands are incomplete. There are still " + (6 - countPlayers) + " free places");
        else
            System.out.println("There are no empty places on the field");
    }

    public int getStamina() {
        return stamina;
    }
}
