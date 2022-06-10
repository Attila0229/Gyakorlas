package com.company;

import java.util.Arrays;

public class Main {

    public static String teglalap(int szelesseg, int magassag) {
        String tegla = "";
        for (int sor = 0; sor < magassag; sor++) {
            for (int oszlop = 0; oszlop < szelesseg; oszlop++) {
                tegla += "*";
            }
            tegla += "\n";
        }
        return tegla;
    }

    public static String szorzok(int szorzo) {
        String szorzas = "";
        for (int sor = 1; sor <= szorzo; sor++) {
            for (int oszlop = 1; oszlop <= szorzo; oszlop++) {
                szorzas += sor + "x" + oszlop + " ";
            }
            szorzas = szorzas.trim();
            szorzas += "\n";
        }
        return szorzas;
    }

    public static boolean SzokoEvProba(int i) {
        if (i % 100 == 0 && i % 400 != 0) {
            return false;
        }
        if (i > 1582) {
            if (i % 400 == 0 || i % 4 == 0) {
                return true;
            }
        }
        return false;
    }

    public static int keres(int[] tomb, int keresSzamot) {
        int index = 0;
        while (tomb.length > index) {
            if (keresSzamot == tomb[index]) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int negativKereses(int[] tomb) {
        int keres = 0;
        for (int j = 0; j < tomb.length; j++) {
            if (tomb[j] < 0) {
                keres = tomb[j];
            }
        }
        return keres;
    }

    public static int[][] ketdimennziosTomb(int[][] tomb) {
        int[][] ujtomb = new int[5][5];
        int szam = 1;
        for (int belsoindex = 0; belsoindex < ujtomb.length; belsoindex++) {
            for (int kulsoindex = 0; kulsoindex < ujtomb.length; kulsoindex++) {
                ujtomb[kulsoindex][belsoindex] = szam++;
            }
        }
        return ujtomb;
    }


}

