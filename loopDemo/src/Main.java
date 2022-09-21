public class Main {
    public static void main(String[] args) {

        //for
        for (int i = 2; i<10;i+= 2 ){

            System.out.println(i);
        }

        System.out.println("For Döngüsü bitti");


        int i=2;
        //while
        while (i<10){
            System.out.println(i);
            i+=2;
        }
        System.out.println("while Döngüsü bitti");



        //do-while
        int j = 100;

        do {
            System.out.println("Loglandı");
            System.out.println(j);
        }while (j<10);
        System.out.println("Do-While Döngüsü bitti.");

    }
}