package com.cybertek.tests.day12_actions_upload_jsexecuter;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){
        if (word==null){
            System.out.println("first time call. word object is null." +
                    "assigning value to it now");
            word = "something";
        }else{
            System.out.println("word already has a value.");
        }
        return word;
    }
}
