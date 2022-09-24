package com.JavaAdvanced.sda;

public class RoomImplementation {
    public static void main(String[] args) {
        Room dhoma1 = new Room(new Bed("Shtrat", "Square"), new TV("LG", 32));
        Room dhoma2 = new Room(new Bed("Dormeo", "Straight"), new TV("Apple", 50));

        System.out.println (dhoma1.getTv());
        System.out.println (dhoma2.getTv());
        System.out.println (dhoma1.getBed());
        System.out.println (dhoma2.getBed());

    }
}
