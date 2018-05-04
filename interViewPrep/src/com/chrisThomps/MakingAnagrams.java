package com.chrisThomps;

public class MakingAnagrams {

    public int numberNeeded(String fString, String sString){
        int[] charCount1 = getCharCount(fString);
        int[] charCount2 = getCharCount(sString);
        return getDelta(charCount1, charCount2);

//      Alternative
        /*int[] letterCounts = new int[SIZE];
        for (char c : first.toCharArray()){
            letterCounts[c-'a']++;
        }

        for (char c : second.toCharArray()){
            letterCounts[c-'a']--;
        }

        int counter = 0;
        for(int i : letterCounts)
            counter += Math.abs(i);

        return counter;*/
    }

    public int[] getCharCount(String s){
        int[] charCount = new int[26];
        for(int i = 0; i < s.length(); i++){
            char letter = s.charAt(i);
            int code = letter - 'a';
            charCount[code]++;
        }

        return charCount;
    }

    public  int getDelta(int[] fArr, int[] sArr){
        if(fArr.length != sArr.length)
            return -1;

        int counter = 0;
        for(int i = 0; i < fArr.length; i++){
            int diff = Math.abs(fArr[i] - sArr[i]);
            counter += diff;
        }

        return counter;
    }
}
