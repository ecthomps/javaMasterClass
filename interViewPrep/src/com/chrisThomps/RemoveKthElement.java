package com.chrisThomps;

public class RemoveKthElement {

    public static class ListNode<T> {

        ListNode(T x){
            value = x;
        }

        T value;
        ListNode<T> next;
    }
}

//    public static List<Integer> newList (List<Integer> l, int k){
//
//        for(int i = 0; i < l.size(); i++){
//            if(l.get(i) == k){
//                l.remove(i);
//            }
//        }
//
//        return l;
//    }