package model;

public class Bill {
    private String customer;
    private int newNum;
    private int oldNum;
    private int totalCharge;

    public Bill(String customer, int newNum, int oldNum, int totalCharge) {
        this.customer = customer;
        this.newNum = newNum;
        this.oldNum = oldNum;
        this.totalCharge = totalCharge;
    }

    public Bill() {
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNewNum() {
        return newNum;
    }

    public void setNewNum(int newNum) {
        this.newNum = newNum;
    }

    public int getOldNum() {
        return oldNum;
    }

    public void setOldNum(int oldNum) {
        this.oldNum = oldNum;
    }

    public int getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(int totalCharge) {
        this.totalCharge = totalCharge;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer='" + customer + '\'' +
                ", newNum=" + newNum +
                ", oldNum=" + oldNum +
                ", totalCharge=" + totalCharge +
                '}';
    }
}
