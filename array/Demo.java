 // List implementation using array
 package array;
 import java.util.Scanner;

 public class Demo {

    public static void main(String[] args) {
        int value,position;
        DynamicArray list = new DynamicArray();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n----------------List menu----------------\n");
            System.out.println("1. Insert at end\n");
            System.out.println("2. Display the list\n");
            System.out.println("3. Insert at specified position \n");
            System.out.println("4. Delete at Specific position\n");
            System.out.println("5. Insert at beginging position \n");
            System.out.println("6. Delete at beginging position\n");
            System.out.println("7. Delete at end\n");
            System.out.println("8. Search element\n");
            System.out.println("9. Get the element by index\n");
            System.out.println("10. check the elment is contain or not\n");
            System.out.println("11. Exit\n");
            System.out.println("\n-----------------------------------------\n");
            System.out.println("Enter your choice: \t");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nEnter a value to insert: ");
                    value = scanner.nextInt();
                    list.add(value);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("\nEnter a position  (start at 0):");
                    position = scanner.nextInt();
                    if(position<0)
                    {
                        System.out.println("Invalid Position!");
                        break;
                    }
                    System.out.println("\nEnter a value to insert: ");
                    value = scanner.nextInt();
                    list.insertAtPosition(position,value);
                    break;
                case 4:
                    System.out.println("\nEnter a position (start at 0):");
                    position = scanner.nextInt();
                    if(position<0)
                    {
                        System.out.println("\nInvalid Position!");
                        break;
                    }
                    list.deleteAtPosition(position);
                case 11:
                    System.exit(0);
                    
                default:
                    System.out.println("\nInvalid choice!");
                    break;
            }
        }
        
    }
}
