package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(4685699);
        cellPhone1.setModel("iPhone 13");
        cellPhone1.setCarrier("AT&T");
        cellPhone1.setPhoneNumber("854-555-4555");
        cellPhone1.setOwner("Glorilla Wyatt");

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(4211222);
        cellPhone2.setModel("Samsung Galaxy");
        cellPhone2.setCarrier("Verizon");
        cellPhone2.setPhoneNumber("708-542-6685");
        cellPhone2.setOwner("Beyonce Smith");

        CellPhone cellPhone3 = new CellPhone(45622555, "Moto Razr", "T-Mobile", "456-785-3333", "Chris Hemsworth");

        display(cellPhone1);
        display(cellPhone2);
        display(cellPhone3);

        // PHONES CALLING EACH OTHER
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        cellPhone1.dial(cellPhone3.getPhoneNumber());
        cellPhone3.dial(cellPhone1.getPhoneNumber());
    }

    // DISPLAY
    public static void display(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println();
    }
}



