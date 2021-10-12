package controller;

import model.Bill;
import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class ElectricBillManagement {
    private static List<Customer> customerList = new ArrayList<>();
    private static List<Bill> billList = new ArrayList<>();

    public ElectricBillManagement() {
    }
    public ElectricBillManagement(List<Customer> customerList, List<Bill> billList) {
        this.customerList = customerList;
        this.billList = billList;
    }


    public List<Customer> getCustomerList() {
        return customerList;
    }


    public List<Bill> getBillList() {
        return billList;
    }

    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

    @Override
    public String toString() {
        return "ElectricBillManagement{" +
                "customerList=" + customerList +
                ", billList=" + billList +
                '}';
    }



    public static void addCustomer(String nameCustomer, String addressCustomer, String codeCustomer){
        Customer customer = new Customer(nameCustomer, addressCustomer, codeCustomer);
        customerList.add(customer);
    }

        public void addBill(String customer, int newNum, int oldNum, int totalCharge){
        Bill bill = new Bill(customer,newNum,oldNum,totalCharge);
        billList.add(bill);
        }

        public void deleteCustomer(Customer customer){
        customerList.remove(customer);
        }

        public void deleteBill(Bill bill){
        billList.remove(bill);
        }

        public String getCustomerBillInfo(Customer customer){
        int sum = 0;
            for (int i = 0; i < billList.size(); i++) {
               if( billList.get(i).getCustomer().equals(customer.getNameCustomer())){
                   sum+=billList.get(i).getTotalCharge();
                }
        }
            System.out.println("Total charge = " + sum);
            return customer.toString();
    }

    public String getBillInfo(Bill bill){
        return bill.toString();
    }

    public static void showCustomerList(){
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(i+1 + "." + customerList.get(i).toString() + "\n");
        }
    }

    public static void showBillList(){
        for (int i = 0; i < billList.size(); i++) {
            System.out.println(i+1 + "." + billList.get(i).toString() + "\n");
        }
    }

    public void showBillListOfCustomer(Customer customer,List<Bill> billList ){
        for (int i = 0; i < billList.size(); i++) {
            if(billList.get(i).getCustomer().equals(customer.getNameCustomer())){
                System.out.println(billList.get(i).toString());
            }
        }
    }




}

