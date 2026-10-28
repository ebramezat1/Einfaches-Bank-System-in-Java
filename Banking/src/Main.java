import java.util.Scanner;
public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        String name = "";
        double Balance = 1000;
        double Deposit = 0;
        double Withdraw = 0;
        int Choise;
        boolean Is_The_Pragram_Running=true ;
        System.out.print(" Enter Your name Please : " + name);
        name = scanner.nextLine();
        System.out.printf("Hello %s !\n", name );
        while (Is_The_Pragram_Running) {
            System.out.println("                                                 ");
            System.out.println("                                                 ");
            System.out.println("@@@@@@@@@@@@@@@@");
            System.out.println("             Banking System            ");
            System.out.println("@@@@@@@@@@@@@@@@");
            System.out.println("                                                 ");
            System.out.println("                                                 ");
            System.out.println("Which Option will you choose? ");
            System.out.println("      1 - Balance         ");
            System.out.println("      2 - Deposit        ");
            System.out.println("      3 - Withdraw     ");
            System.out.println("      4 - Exit Program");
            Choise= scanner.nextInt();
            System.out.println();
            switch (Choise) {
                case 1 -> Balance(Balance);
                case 2 -> Balance+=Deposit();
                case 3 -> Balance-=Withdraw(Balance);
                case 4 -> Is_The_Pragram_Running=false;
                default -> System.out.println(" Invalid Choice !");
            }
            if (Choise==1||Choise==2||Choise==3){
                System.out.printf("Your Balance now is: %.2f\n",Balance);
            }

            System.out.println("Complete Transaction ! ");
        }
    }

    static double Balance(double Balance) {
        System.out.printf("$ %.1f \n",Balance);
        return 0;
    }

    static double Deposit() {
        double amount;
        System.out.print("Enter Your amount");
        amount = scanner.nextDouble();
        if (amount<0){
            System.out.println("You can not add Negative value");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double Withdraw(double Balance) {
        double amount;
        System.out.print("Enter An Amount : ");
        amount= scanner.nextDouble();
        if(amount>Balance){
            System.out.println("The Amount is more than Balance !!!");
            return 0;
        } else if (amount<0) {
            System.out.println("You can not type a Negative number !!!! ");
            return 0;
        }
        else {
            return amount;
        }
    }
}