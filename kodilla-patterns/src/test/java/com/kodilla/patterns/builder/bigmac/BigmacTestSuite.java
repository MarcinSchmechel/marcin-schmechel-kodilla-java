package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.patterns.builder.bigmac.Bigmac.*;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new BigmacBuilder()
                .bun("Sezam")
                .sauce("standard")
                .burgersQuantity(3)
                .ingredient("Cebula")
                .ingredient("Bekon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients =bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}
