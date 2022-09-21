public class Main {
    public static void main(String[] args) {

        char grade = 'C';


        switch (grade){
            case  'A' :
                System.out.println("Mükemmel : geçtiniz");
                break;
            case  'B' :
            case  'C' :
                System.out.println("İyi : geçtiniz");
                break;
            case  'D' :
                System.out.println("Fena Değil : geçtiniz");
                break;
            case  'F' :
                System.out.println("Maalesef kaldınız");
                break;


        }
    }
}