package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone myPhone;
        myPhone = new CellPhone();
        myPhone.setModel("iPhone 17");
        myPhone.setPhoneNumber("902-565-5566");

        System.out.println(myPhone.getModel() + "\n" + myPhone.getPhoneNumber());
    }

    }

