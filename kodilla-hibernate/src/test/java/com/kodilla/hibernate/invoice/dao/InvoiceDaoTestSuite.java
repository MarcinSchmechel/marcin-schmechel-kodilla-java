package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Kapcie");
        Product product2 = new Product("Skarpety");
        Item item1 = new Item(product1,new BigDecimal(1150),3,new BigDecimal(3000));
        Item item2 = new Item(product2,new BigDecimal(150),2,new BigDecimal(2000));
        Item item3 = new Item(product1,new BigDecimal(100),4,new BigDecimal(1000));
        Invoice invoice = new Invoice("Faktura 1");
//        invoice.getItems().add(item1);
//        invoice.getItems().add(item2);
//        invoice.getItems().add(item3);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp


    }
}
