package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void test() {

        int expected = 3;
        Assert.assertEquals(expected, 1 + 2);
    }

    @Test
    public void testStatement(){

        Customer customer = new Customer("Bruce Wayne");
        customer.addRental(new Rental(new Movie("Spider-man: No way home", Movie.NEW_RELEASE), 4));
        customer.addRental(new Rental(new Movie("Spider-man: Homecoming", Movie.REGULAR), 4));
        customer.addRental(new Rental(new Movie("Spider-man: Animated", Movie.CHILDRENS), 4));

        String statement = customer.statement();

        Assert.assertEquals("Rental Record for Bruce Wayne\n" +
                "\tSpider-man: No way home\t12.0\n" +
                "\tSpider-man: Homecoming\t5.0\n" +
                "\tSpider-man: Animated\t3.0\n" +
                "Amount owed is 20.0\n" +
                "You earned 4 frequent renter points", statement);

        System.out.println(statement);



    }


}