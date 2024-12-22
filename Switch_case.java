public class Switch_case {
    public static void main(String[] args) {
        boolean answer = true;
        Scanner scanner = new Scanner(System.in);
            while (answer) {
            System.out.println("1. Check if a number is positive or negative");
            System.out.println("2. Check if a number is even or odd");
            System.out.println("3. Display numbers from 1 to the given number");
            System.out.println("4. Display Fibonacci series to the given number");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int number = scanner.nextInt();
                    if (number > 0) {
                        System.out.println(number + " is positive.");
                    } else if (number < 0) {
                        System.out.println(number + " is negative.");
                    } else {
                        System.out.println(number + " is zero.");
                    }
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int num = scanner.nextInt();
                    if (num % 2 == 0) {
                        System.out.println(num + " is even.");
                    } else {
                        System.out.println(num + " is odd.");
                    }
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    int n = scanner.nextInt();
                    for (int i = 1; i <= n; i++) {
                        System.out.println(i);
                    }
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    int a = scanner.nextInt();
                    int b = 0, c = 1;
                    System.out.print(b + " " + c + " ");
                    for (int i = 2; i < a; i++) {
                        int d = b + c;
                        System.out.print(d + " ");
                        b = c;
                        c = d;
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    answer = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }

            if (answer) {  
                System.out.print("Do you want to continue? (Y/N): ");
                String c = scanner.next();
                if (c.equalsIgnoreCase("Y")) {
                    System.out.println("Continuing...");
                    
                } else {
                    System.out.println("Exiting...");
                    answer = false;  
                }
            }
        }

        scanner.close();  
    }
}
