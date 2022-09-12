package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

  public static void main(String[] args) {
//    com.entertainment.Television tv = new com.entertainment.Television();
//    tv.setVolume(0);                  // should stick
//    System.out.println(tv);           // volume should 0
//
//    tv.setVolume(100);                // should stick
//    System.out.println(tv);           // volume should be 100
//
//    tv.setVolume(-1);                 // error message, volume not set
//    tv.setVolume(101);                // error message, volume not set
//    System.out.println(tv);           // should still have volume 100, from there

    Television tv = new Television();

    tv.setBrand("Samsung");           // should stick
    System.out.println(tv);           // brand should be Samsung

    tv.setBrand("LG");                // should stick
    System.out.println(tv);           // brand should be LG

    tv.setBrand("Toshiba");           // should stick
    System.out.println(tv);           // brand should be Toshiba

    tv.setBrand("INVALID");           // error message, brand not set
    System.out.println(tv);           // brand should still be Toshiba, from before

  }

}
