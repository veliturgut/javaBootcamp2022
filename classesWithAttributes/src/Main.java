public class Main {
    public static void main(String[] args) {



        Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");

        /*Product product = new Product();
        product.set_name("Laptop");
        product.set_id(1);
        product.set_description("Asus Laptop");
        product.set_stockAmount(3);
        product.set_price(5000);*/


        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.get_code());

    }
}