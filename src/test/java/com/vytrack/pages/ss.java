package com.vytrack.pages;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.w3c.dom.ls.LSOutput;

import java.io.FileNotFoundException;
import java.util.*;

public class ss {
    public static void main(String[] args) {

        String str = "Java is fun";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
            //reverseStr+=str.substring(i,i+1);

        }
        System.out.println(reverseStr);


        String str2 = "Java is fun";
        String reverse = "";
        String[] info = str2.split(" ");
        for (int i = info.length - 1; i >= 0; i--) {
            reverse += info[i] + " ";
        }
        System.out.println(reverse);


        String word = "AAAAAABBBBBBBCCCCCCCCCDDDDDDDEEF";
        String[] abc = word.split("");
        Set<String> list = new TreeSet<>(Arrays.asList(abc));
        System.out.println(list);


        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(word.substring(i, i + 1))) {
                result += word.substring(i, i + 1);
            }
        }
        System.out.println(result);


        String a = "AAAAAABBBBBCCCCDDDEE";
        String[] arr = a.split("");
        Map<String, Integer> map = new HashMap<>();
        for (String abcd : arr) {
            if (!map.containsKey(abcd)) {
                map.put(abcd, 1);
            } else {
                map.put(abcd, map.get(abcd) + 1);
            }
        }
        System.out.println(map);


        String k = "java";
        String l = new String("Python");
        System.out.println(k+" "+l);
        char[]data={'s','e','l'};
        String z=new String(data);
        System.out.println(z);

        try {
            System.out.println(9/0);
            System.out.println("try");
        }catch(Exception e){
            System.out.println("there is something wrong");
        }finally{
            System.out.println("something wrong");
        }
        try
        {
            System.out.println("try block");
        }
        catch (Exception e)
        {
            System.out.println("catch block");
        }
        System.exit(0);
            System.out.println("finally block");

    }

}


