package com.bridgelabzHotel;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
//* For junit testing */
public class JunitTestcase {
    Hotel obj= new Hotel();

    @Test
    public void testFirstName1() {
        Assert.assertTrue(obj.isFirstName("Lakewood"));
        Assert.assertTrue(obj.isFirstName("Bridgewood"));
        Assert.assertTrue(obj.isFirstName("Ridgewood"));
    }


}


