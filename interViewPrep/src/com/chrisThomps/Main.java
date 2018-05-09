package com.chrisThomps;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static final String ADD = "add";
    private static final String FIND = "find";

    public static void main(String[] args) throws IOException {
        // write your code here
        /*ArrayList<String> contactBook = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            doOps(op, contact, contactBook);
        }*/

        TriesContact triesContact = new TriesContact();

        Scanner in = new Scanner(System.in);
        Integer n = Integer.parseInt(in.nextLine());
        for (int i = 0; i < n; i++){
            String[] opData = in.nextLine().split("\\s+");

            if(opData[0].equalsIgnoreCase(ADD))
                triesContact.addNameToContact(opData[1]);
            if(opData[0].equalsIgnoreCase(FIND))
                System.out.println(triesContact.numOfFounds(opData[1]));
        }
    }
}