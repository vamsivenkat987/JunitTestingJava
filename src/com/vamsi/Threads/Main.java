package com.vamsi.Threads;

public class Main {

    public static void main(String[] args) {
        Utilities utilities = new Utilities();
        char[] result = {'h','e','l','l','o'};
        char[] rs=utilities.veryNthChar(result,2);
        for (int i=0;i<rs.length;i++){
            System.out.println(rs[i]);
        }
    }
}
