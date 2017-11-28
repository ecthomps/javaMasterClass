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

        for (int i = 0; i < c.length; i++){
            if(s.indexOf(c[i]) == s.lastIndexOf(c[i])){
                return c[i];
            }
        }
        return '_';
    }
}
