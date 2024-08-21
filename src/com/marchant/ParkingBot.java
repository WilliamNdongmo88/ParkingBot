package com.marchant;

import java.security.SecureRandom;
import java.util.Objects;

public class ParkingBot {
    static String[] customers = {"Gloria","Tsia","Julie","Rostand","Arnold","Ben","Will","Audrey","Cindy","Carla","Sandra"};
    static int parkingSize = new SecureRandom().nextInt(10);

    public static void main(String[] args) {
        /*for (String customer : customers) {
            sayHello(customer);
        }*/
        System.out.println("Nous avons " + parkingSize + " places restantes");
        int customerNumber = 0;
        while (parkingSize > 0){
            parkingSize --;
            if ("Julie".equals(customers[customerNumber])){
                customerNumber ++;
                parkingSize ++;
                continue;
            }
            sayHello(customers[customerNumber]);
            customerNumber ++;
        }
    }

    private static void sayHello(String customer) {
        String welcomeMessage = "Hello " + customer;
        System.out.println(welcomeMessage);
    }
}