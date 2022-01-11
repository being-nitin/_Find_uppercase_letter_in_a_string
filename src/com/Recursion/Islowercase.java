package com.Recursion;
import java.util.*;
public class Islowercase {
    public static void main(String[] args) {
        String str = "GEEKSFoRGEEKS";
        System.out.println(lower(str));
    }
    public static char lower(String str){
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return 'c';
    }
}
