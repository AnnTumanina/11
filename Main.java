package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();
        String[] m = ip.split(" ");

        for (String w : m) {

            boolean r = w.matches("(((25[0-5]\\.)|(2[0-4]\\d\\.)|(1[0-9]{2}\\.)|([1-9][0-9]\\.)|([0-9]\\.)){3})((25[0-5])|(2[0-4]\\d)|(1[0-9]{2})|([1-9][0-9])|([0-9]))");
            if (r) {
                System.out.println(w);
            }
        }
    }
}


