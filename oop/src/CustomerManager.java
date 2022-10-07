public class CustomerManager {

    private Customer customer;
    private ICreditManager creditManager;

    public CustomerManager(Customer customer,ICreditManager creditManager){

        this.customer = customer;
        this.creditManager = creditManager;


    }

    public void Save(Customer customer){

        System.out.println("Müşteri kaydedildi.");
    }

    public void Delete(){
        System.out.println("Müşteri silindi.");
    }

    public void GiveCredit() {

        creditManager.Calculate();
        System.out.println("Kredi verildi.");
    }
}
