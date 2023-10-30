package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.awt.*;
import java.util.List;

public class ProductManager {
    private  ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception{
        if(product.getId()<1){
            throw new Exception("Id 1'den küçük olamaz");
        }

        if (product.getUnitPrice()<100000) {
            throw new Exception("Ürün fiyatı 100000'dan küçük olamaz.");
        }

        productDao.add(product);

        for (Logger logger : loggers){
            logger.log(product.getName());
        }
    }
}
