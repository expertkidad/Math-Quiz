package com.tejas;
import java.util.Scanner;

public.class GameCode {
    int sleep_time = 2000;
    boolean 1stqws = false;
    boolean 2ndqws = false;
    boolean 3rdqws = false;
    boolean 4thqws = false;
    boolean 5thqws = false;
    Scanner scanner;
    public void OnStart() throws Exception {
        System.out.print("Welcome To Math Test");
        System.out.print("By Tejas K S");
        System.out.println("3*1:");
        int p = scanner.nextInt();
        if (p == 3){
        {SetPreference();}
        1stqwsanscorrect();
        } else {
            System.out.print("Wrong! Ans Is (3)");
            1stqwsanscorrect();
        }
    }
    private void Wait() throws Exception {
        Thread.sleep(sleep_time);
    }
    private void 1stqwsanscorrect() throws Exception {
        System.out.println("9*2");
        int value = scanner.nextInt();
        if (value == 18) {
            Wait();
            1stqws = true;
            System.out.print("Correct")
            {SetPreference();}
            2ndqwsanscorrect();
        } else {
            System.out.print("Incorrent Ans Is 18");
            Wait();
            2ndqwsanscorrect();
        }
    }
    private void 2ndqwsanscorrect() throws Exception {
        System.out.println("2+6");
        int value = scanner.nextInt();
        if (value == 8) {
            Wait();
            2ndqws = true;
            System.out.print("Corrent Ans");
            {SetPreference();}
            3rdqwsanscorrect();
        } else {
            System.out.print("Wrong! Ans Is (8)");
            Wait();
            3rdqwsanscorrect();
        }
    }
    private void 3rdqwsanscorrect() throws Exception {
        System.out.println("6+2+2+2");
        int value = scanner.nextInt();
        if (value == 12) {
            Wait();
            3rdqws = true;
            System.out.print("Correct!");
            {SetPreference();}
            4thqwsanscorrect();
        } else {
            System.out.print("Wrong Ans Is (12)");
            Wait();
            4thqwsanscorrect();
        }
    }
    private void 4thqwsanscorrect() throws Exception {
        System.out.println("9*5");
        int value = scanner.nextInt();
        if (value == 45) {
            Wait();
            4thqws = true;
            System.out.print("Corrent Ans!")
            {SetPreference();}
            5thqwsanscorrect();

        } else {
            System.out.print("Wrong! Ans Is (45)")
            Wait();
            5thqwsanscorrect();
        }
    }
    private void 5thqwsanscorrect() throws Exception {
        System.out.println("5*5")
        int value = scanner.nextInt();
        if (value == 25) {
            Wait();
            5thqws = true;
            System.out.print("Correct");
            {SetPreference();}
            checkMark();
        } else {
            System.out.print("Wrong! Ans Is (25)")
            Wait();
            checkMark();
        }
    }
    private void checkMark() throws Exception {
        if (1stqws == true) {
            if (2ndqws == true) {
                if (3rdqws == true) {
                    if (4thqws == true) {
                        if (5thqws == true) {
                            System.out.print("Good! Very Good")
                        };
                    };
                };
            };
        } else {
            System.out.print("Not Good!")
        };
    };
};