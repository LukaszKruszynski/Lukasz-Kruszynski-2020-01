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

import javax.transaction.Transactional;
import java.math.BigDecimal;
@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product iron = new Product("Bosh1212");
        Invoice invoiceIron = new Invoice("fv123/2020");
        Item item = new Item(iron, new BigDecimal("199.99"), 1, new BigDecimal("199.99"));
        iron.getItemList().add(item);
        invoiceIron.getItems().add(item);
        item.setInvoice(invoiceIron);

        //When
        productDao.save(iron);
        invoiceDao.save(invoiceIron);
        itemDao.save(item);

        //Then
        int idItem = item.getId();

        //CleanUp
        itemDao.delete(item);
        invoiceDao.delete(invoiceIron);
        productDao.delete(iron);
        Assert.assertNotEquals(0,idItem);

    }
}
