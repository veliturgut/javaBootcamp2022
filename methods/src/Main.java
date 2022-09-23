public class Main {
    public static void main(String[] args) {

         findNumbers();

    }


    public static void findNumbers(){

        int[] numbers = new int[]{1,2,5,7,9,0};

        int search = 6;
        boolean isThere = false;


        for (int number : numbers){
            if (number == search){
                isThere = true;
                break;
            }
        }

        String message = "";
        if (isThere){
            message = "number found " + search;
            sendMessage(message);
        }else {
            sendMessage("number not found " + search);
        }
    }

    public static void sendMessage(String message){
        System.out.println(message);
    }



}