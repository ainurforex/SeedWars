package ru.ainurforex.seedwars;

import ru.ainurforex.seedwars.service.SolderService;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        SolderService solderService=new SolderService();
        for (int i = 0; i < 100; i++) {
            System.out.println(solderService.creatRandomSolder().toString());
        }

    }
}