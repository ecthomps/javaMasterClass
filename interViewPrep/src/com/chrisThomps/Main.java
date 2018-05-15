package com.chrisThomps;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        RansomNote ransomNote = new RansomNote();

        Scanner in = new Scanner(System.in);
        String[] mn = in.nextLine().split(" ");

        int mCount = Integer.parseInt(mn[0]);
        int rCount = Integer.parseInt(mn[1]);

        Hashtable<String, Integer> mgznWords = new Hashtable<>();
        Hashtable<String, Integer> rnsmWords = new Hashtable<>();

        String[] magazineWords = new String[mCount];
        String[] magazineItems = in.nextLine().split("\\s+");
//        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 0; i < mCount; i++){
            String magazine = magazineItems[i];
            if(mgznWords.containsKey(magazine))
                mgznWords.put(magazine, mgznWords.get(magazine) + 1);
            else
                mgznWords.put(magazine, 1);
        }

        String[] ransomItems = in.nextLine().split("\\s+");
//        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 0; i < rCount; i++){
            String ransom = ransomItems[i];
            if(rnsmWords.containsKey(ransom))
                rnsmWords.put(ransom, rnsmWords.get(ransom) + 1);
            else
                rnsmWords.put(ransom, 1);
        }

        if(ransomNote.isWordsMatch(mgznWords, rnsmWords))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}