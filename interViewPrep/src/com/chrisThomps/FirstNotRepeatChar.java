package com.chrisThomps;

public class FirstNotRepeatChar {

    public char printFirstNotReapetChar(String s){

        //For s = "abacabad", the output should be
        //firstNotRepeatingCharacter(s) = 'c'.

//        FirstNotRepeatChar firstNotRepeatChar = new FirstNotRepeatChar();
//        String s = "bccab";
//        char charVal = firstNotRepeatChar.printFirstNotReapetChar(s);
//        System.out.print(charVal);

        //        HashMap<Character, Integer> charStr = new HashMap<>();
//        char c;
//
//        for(int i = 0; i < s.length(); i++){
//            c = s.charAt(i);
//            if(charStr.containsKey(s.charAt(i)))
//                charStr.put(c, charStr.get(c)+1);
//            else
//                charStr.put(c, 1);
//        }
//
//        for(int i = 0; i < s.length(); i++) {
//            c = s.charAt(i);
//            if (charStr.get(c) <= 1){
//                return c;
//            }
//        }
//        return '_';

        char[] c = s.toCharArray();

        for (char aC : c) {
            if (s.indexOf(aC) == s.lastIndexOf(aC)) {
                return aC;
            }
        }
        return '_';
    }
}
