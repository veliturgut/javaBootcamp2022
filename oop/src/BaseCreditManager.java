abstract class BaseCreditManager extends ICreditManager {

    public abstract void Calculate();

    public void Save(){

        System.out.println("Müşteri kaydedildi.");
    }


}
