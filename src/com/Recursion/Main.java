package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "nitinSingh";
        System.out.println(uppercase(str));
    }
    public static char uppercase(String str){
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        }
        return 'c';
    }
}
