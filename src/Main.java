public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Print the numbers from 0 to 9*/
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //new array with 20 elements
        int[] arr = new int[20];
        int arrIndex = 0;

        //Filling arr with the first 20 odd numbers starting from 2
        for (int i = 3; i < 60; i+=2){
            arr[arrIndex] = i;
            if (arrIndex < 19){
                arrIndex++;
            } else break;
        }

        //printing the array
        System.out.println("The first 20 odd numbers, starting from 2 are:");
        for (int i :
                arr) {
            System.out.print(i + " ");
        }



    }
}