package ru.ainurforex.seedwars.service;

import ru.ainurforex.seedwars.model.Solder;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SolderService {
    private static Random rand = new Random();

    public Solder creatRandomSolder() {
        Solder solder = new Solder(rndName(), rndFraction()
                , rndInt(100), 0, 0, 0, 0, 0, 0, 0, 0);
        initLevelScore(solder);
        return solder;
    }

    private void initLevelScore(Solder solder) {
        int level = solder.getLevel()+1;
        int health = 1;
        int armor = 1;
        int attack = 1;
        int speed = 1;
        int defence = 1;
        for (int i = 0; i < level; i++) {
            int random = rand.nextInt(5);
            switch (random) {
                case (0):
                    health++;
                    break;
                case (1):
                    armor++;
                    break;
                case (2):
                    attack++;
                    break;
                case (3):
                    speed++;
                    break;
                case (4):
                    defence++;
                    break;
            }
        }
        solder.setHealth(health);
        solder.setArmor(armor);
        solder.setAttack(attack);
        solder.setSpeed(speed);
        solder.setDefence(defence);
    }

    private String rndName() {
        String aLetter = "aeiouyaeio";
        String bLetter = "bcdfghklmnpqrstvwxz";
        int lenght = rand.nextInt(7) + 2;
        char randomChar = ' ';
        String randomString = (char) (rand.nextInt(25) + 65) + "";
        for (int i = 0; i <= lenght; i++) {

            if ((lenght + i) % 2 == 0) {
                randomChar = bLetter.charAt(rand.nextInt(bLetter.length()));
            } else randomChar = aLetter.charAt(rand.nextInt(aLetter.length()));
            randomString = randomString + randomChar;
        }
        return randomString;
    }

    private String rndFraction() {
        List<String> listColor = Arrays.asList("Black", "Red", "White", "Gold");
        List<String> listTotem = Arrays.asList("Wolf", "Dragon", "Shark", "Death");
        return listColor.get(rand.nextInt(listColor.size())) + " "
                + listTotem.get(rand.nextInt(listTotem.size()));
    }

    private int rndInt(int max) {
        return rand.nextInt(max) + 1;
    }
}
