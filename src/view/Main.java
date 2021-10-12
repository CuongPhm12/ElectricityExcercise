package view;

import controller.ElectricBillManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElectricBillManagement electricBillManagement = new ElectricBillManagement();

        int choice = -1;

        while (choice != 0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Create new Customer ");
            System.out.println("2. Create new Bill ");
            System.out.println("3. Show Customer List ");
            System.out.println("4. Show Bill List ");
            System.out.println("5. Show Customer Information ");
            System.out.println("6. Show Customer's Bill Information ");
            System.out.println("7. Delete Customer");
            System.out.println("7. Delete Bill");
            System.out.println("0. Exit");
            System.out.println("\n");
            System.out.println("Please choose your choice");

            choice = sc.nextInt();

            switch (choice){
                case 0:
                    System.exit(0);
                    break;

                case 1:
                    addNewCustomer();
                    System.out.println("Create new Customer successful");
                    break;

                case 2:
                  Scanner sc4 = new Scanner(System.in);
                  ElectricBillManagement.showCustomerList();
                  System.out.println("Enter the customer to create a new bill: ");

                case 3:
                    ElectricBillManagement.showCustomerList();
                    break;

                case 4:
                    ElectricBillManagement.showBillList();
                    break;

                case 5:
                    ElectricBillManagement.showCustomerList();
                    Scanner sc7 = new Scanner(System.in);

                    System.out.println("Enter the customer to show the infomation");

            }


        }
    }

    private static void addNewCustomer() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the name of Customer");
        String newName = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the address of Customer");
        String newAddress = sc2.nextLine();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the address of Customer");
        String newCode = sc3.nextLine();

        ElectricBillManagement.addCustomer(newName,newAddress,newCode);
    }
}
