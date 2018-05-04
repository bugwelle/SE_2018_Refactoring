package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void testAdd() throws Exception {
        Customer customer = new Customer("Customer");

        assertEquals("Customer", customer.getName());
    }
}
