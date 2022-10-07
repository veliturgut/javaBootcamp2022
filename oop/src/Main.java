public class Main {
    public static void main(String[] args) {

        /*int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;

        int[] numbers1 = new int[]{1,2,3};
        int[] numbers2 = new int[]{10 ,20 ,30 };
        numbers1 = numbers2;
        numbers2[0] = 1000;
        System.out.println(numbers1[0]);*/

       /* CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();*/


       /* Customer customer = new Customer();
        customer.Id = 1;
        customer.FirstName = "abc";
        customer.LastName = "def";
        customer.NationalIdentity = "12345";
        customer.City = "Ankara";
*/
        CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();








    }


}