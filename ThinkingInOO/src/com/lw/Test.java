package com.lw;

public class Test {
    //老张开车去东北
    public static void main(String[] args) {
        Driver driver = new Driver("老张");
        driver.drive(new Car(),new Address("东北"));
    }
}
