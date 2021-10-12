package model;
public class Customer {
    String nameCustomer;
    String addressCustomer;
    String codeCustomer;

    public Customer() {
    }

    public Customer(String nameCustomer, String addressCustomer, String codeCustomer) {
        this.nameCustomer = nameCustomer;
        this.addressCustomer = addressCustomer;
        this.codeCustomer = codeCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getCodeCustomer() {
        return codeCustomer;
    }

    public void setCodeCustomer(String codeCustomer) {
        this.codeCustomer = codeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nameCustomer='" + nameCustomer + '\'' +
                ", addressCustomer='" + addressCustomer + '\'' +
                ", codeCustomer='" + codeCustomer + '\'' +
                '}';
    }
}
