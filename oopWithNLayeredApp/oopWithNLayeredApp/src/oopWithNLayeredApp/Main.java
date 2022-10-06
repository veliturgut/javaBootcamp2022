package oopWithNLayeredApp;

import oopWithNLayeredApp.business.HibernateProductDao;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.DatabaseLogger;
import oopWithNLayeredApp.core.FileLogger;
import oopWithNLayeredApp.core.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


        Product product1 = new Product(1,"Iphone xr",10000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}