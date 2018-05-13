package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
    private final Customer customer = new Customer("Andre");

    private final Movie movieRegular = new Movie("Herr der Ringe", Movie.REGULAR);
    private final Movie movieNew = new Movie("Deadpool 2", Movie.NEW_RELEASE);
    private final Movie movieChildren = new Movie("Die Unglaublichen 2", Movie.CHILDRENS);

    private final Rental rentalRegular = new Rental(movieRegular, 10);
    private final Rental rentalNew = new Rental(movieNew, 5);
    private final Rental rentalChildren = new Rental(movieChildren, 7);

    @Test
    public void getName() {
        assertEquals("Andre", customer.getName());
    }

    @Test
    public void statementTest() {
        String string = "Rental Record for " + customer.getName() + "\n" +
            "\tTitle\t\tDays\tAmount\n" +
            "Amount owed is 0.0\n" +
            "You earned 0 frequent renter points";

        assertEquals(string, customer.statement());
    }

    @Test
    public void addRentalTest() {
        String string = "Rental Record for " + customer.getName() + "\n" +
            "\tTitle\t\tDays\tAmount\n" +
            "\tHerr der Ringe\t\t10\t12.0\n" +
            "\tDeadpool 2\t\t5\t15.0\n" +
            "\tDie Unglaublichen 2\t\t7\t9.5\n" +
            "Amount owed is 36.5\n" +
            "You earned 4 frequent renter points";

        customer.addRental(rentalRegular);
        customer.addRental(rentalNew);
        customer.addRental(rentalChildren);

        assertEquals(string, customer.statement());
    }

}
