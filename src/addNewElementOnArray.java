import java.util.Scanner;

public class addNewElementOnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] =  new int[10];
        array[0] = 10;
        array[1] = 4;
        array[2] = 6;
        array[3]  = 7;
        array [4] = 8;

        // In ra cac gia tri trong mang
        System.out.println("Elements on Array:");
        for(int i: array){
            System.out.print(i + "\t");
        }

        // Nhap gia tri moun add va vi tri muon add
        System.out.println("\n");
        System.out.println("Enter Value of elements that you want to add ");
        int addedElement = input.nextInt();
        int addedIndex;
        do {
            System.out.println("Enter the index of that element");
            addedIndex = input.nextInt();
            if(addedIndex <=1 || addedIndex >= array.length-1){
                System.out.println("Index is invalid!,");
            }
        }while(addedIndex <=1 || addedIndex>= array.length-1);

        //Add gia tri vao mang
        for (int j = array.length-1; j > addedIndex; j--){
            array[j] = array[j-1];
        }
        array[addedIndex] = addedElement;

        //In ra mang moi
        System.out.println("Elements on Array:");
        for(int i: array){
            System.out.print(i + "\t");
        }
    }
}
