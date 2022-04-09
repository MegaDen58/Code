package com.company;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] letters = alphabet.toCharArray();

        String[] code = new String[]
                { "AA", "AD", "AF", "AG", "AV", "AX",
                        "DA", "DD", "DF", "DG", "DV", "DX",
                        "FA", "FD", "FF", "FG", "FV", "FX",
                        "GA", "GD", "GF", "GG", "GV", "GX",
                        "VA", "VD", "VF", "VG", "VV", "VX",
                        "XA", "XD", "XF", "XG", "XV", "XX"
                };

        System.out.print("Введите слово: ");
        String word = in.nextLine();
        String down = word.toLowerCase();
        String result = "";
        String resultAll = "";
        for(int i = 0; i < down.length(); i++){
            char let = down.charAt(i);
            int idx = alphabet.indexOf(let);
            String one = code[idx];
            result += one;
        }
        System.out.println(result);

        for(int i = 0; i != result.length(); i += 2){
            char[] c = result.toCharArray();
            String two = Character.toString(c[i]) + Character.toString(c[i+1]);
            int idx = Arrays.asList(code).indexOf(two);
            char[] k = alphabet.toCharArray();
            char result2 = k[idx];
            resultAll += Character.toString(result2);
        }
        System.out.println(resultAll);
    }
}
