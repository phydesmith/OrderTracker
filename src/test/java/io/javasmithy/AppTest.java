package io.javasmithy;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.javasmithy.order.Order;


public class AppTest {

    @Test
    public void testOrderBuilder(){
        Order order = new Order.OrderBuilder()
                .withFirstName("Bob")
                .withLastName("Harrison")
                .withCemeteryName("Rosewood")
                .withDealerName("Acme Monuments")
                .withDateEntered("1/1/2020")
                .withDateCut("2/1/2020")
                .addNotes("no death date")
                .setStencilCut(true)
                .build();

        assertTrue(order.getName().equals("Bob"));
    }


}
