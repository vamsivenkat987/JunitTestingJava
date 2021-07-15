package com.vamsi.Threads;

public class Utilities {
    public char[] veryNthChar(char[] source, int n){
        if (source == null || source.length< n){
            return source;
        }
        int returnedLength = source.length/n;
        char[] result = new char[returnedLength];
        int index =0;

        for(int i =n-1;i<source.length;i+=n){
            result[index++] =source[i];
        }
        return result;
    }
    public String removePair(String source){
        if (source==null || source.length()<2){
            return source;
        }
        StringBuilder stringBuilder = new StringBuilder();
        char[] result = source.toCharArray();
        for (int i=0;i<result.length-1;i++){
            if (result[i] != result[i+1]){
                stringBuilder.append(result[i]);
            }
        }
        stringBuilder.append(result[result.length-1]);
        return stringBuilder.toString();
    }
    public int converter(int a, int b){
        return (a/b)+(a*30) -2;
    }
    public String nullIfOddLength(String source){
        if (source.length() %2 ==0){
            return source;
        }
        return null;
    }
}
