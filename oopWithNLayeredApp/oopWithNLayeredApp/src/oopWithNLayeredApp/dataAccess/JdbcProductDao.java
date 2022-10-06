package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.business.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {

    public void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi");
    }


}
