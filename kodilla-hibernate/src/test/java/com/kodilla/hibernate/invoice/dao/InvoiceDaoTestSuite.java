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

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Kapcie");
        Product product2 = new Product("Skarpety");
        Item item1 = new Item(product1,new BigDecimal(1150),3,new BigDecimal(3000));
        Item item2 = new Item(product2,new BigDecimal(150),2,new BigDecimal(2000));
        Item item3 = new Item(product1,new BigDecimal(100),4,new BigDecimal(1000));
        Invoice invoice = new Invoice("Faktura 1");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);


        //When
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        itemDao.save(item1);
        int item1Id = item1.getId();
        itemDao.save(item2);
        int item2Id = item2.getId();
        itemDao.save(item3);
        int item3Id = item3.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        try {
            itemDao.deleteById(item1Id);
            itemDao.deleteById(item2Id);
            itemDao.deleteById(item3Id);
            invoiceDao.deleteById(invoiceId);
            productDao.deleteById(product1Id);
            productDao.deleteById(product2Id);
        } catch (Exception e) {
            //do nothing
        }

    }
}
