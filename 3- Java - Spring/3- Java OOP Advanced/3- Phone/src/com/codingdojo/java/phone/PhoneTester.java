package com.codingdojo.java.phone;

public class PhoneTester {
    public static void main(String[] args) {
        //Create new phones with it's values:
        Galaxy note9 = new Galaxy("Note 9", 100, "Mint", "Tooot-tooot!!");
        IPhone iphoneEleven = new IPhone("11 Pro", 96, "AT&T", "Xy-lo-phonnneee");

        //Details of Note 9:
        note9.displayInfo();
        System.out.println(note9.ring());
        System.out.println(note9.unlock());
        System.out.println();

        //Details of iPhone 11:
        iphoneEleven.displayInfo();
        System.out.println(iphoneEleven.ring());
        System.out.println(iphoneEleven.unlock());
    }
}
