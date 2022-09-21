public class Main {
    public static void main(String[] args) {

        int number = 2 ;
        int remainder = number % 2;
        int a = 0;


        if (number == 1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        if (number < 1){
            System.out.println("Geçersiz sayı girdiniz.");
        }

        for (int i=2;i<number;i++){


            if (number % i == 0){
                a++;

            }
        }

        if (a == 0){
            System.out.println(number + " asal sayıdır ");
        }else {
            System.out.println(number + "asal sayı değildir ");
        }
    }
}