package sample.democafekiosk.unit;

import sample.democafekiosk.unit.beverage.Americano;
import sample.democafekiosk.unit.beverage.Latte;

import java.time.LocalDateTime;

public class CafeKiosRunner {

    public static void main(String[] args) {
        CafeKiosk cafeKiosk = new CafeKiosk();

        cafeKiosk.add(new Americano());
        cafeKiosk.add(new Latte());

        int totalPrice = cafeKiosk.calculateTotalPrice();
        System.out.println("totalPrice = " + totalPrice);

        cafeKiosk.createOrder(LocalDateTime.now());
    }

}
