package com.chrisThomps;

import java.util.HashMap;

public class AreFollowingPattern {


//    String[] strings = new String[]{"cat", "dog", "dog"};
//    String[] patterns = new String[]{"a", "b", "b"};
//    AreFollowingPattern areFollowingPattern = new AreFollowingPattern();
//
//    boolean isPattern = areFollowingPattern.areFollowingPatterns(strings, patterns);
//
//        System.out.println(isPattern);

    public boolean areFollowingPatterns(String[] strings, String[] patterns) {

        HashMap<String, String> strPat = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (strPat.containsKey(patterns[i])) {
                if (!strPat.get(patterns[i]).equals(strings[i]))
                    return false;
            } else if (strPat.containsValue(strings[i])) {
                return false;
            }
            strPat.put(patterns[i], strings[i]);
        }
        return true;
    }
}
