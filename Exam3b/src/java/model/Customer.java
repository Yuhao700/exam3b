

package model;

public class Customer {
  
    private int custID;
    private String firstName;
    private String lastName;
    private String addr1;
    private String addr2;
    private String city;
    private String state;
    private String zip;
    private String emailAddr;
    private int age;

    public Customer() {
        this.custID = 0;
        this.firstName = "";
        this.lastName = "";
        this.addr1 = "";
        this.addr2 = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.emailAddr = "";
        this.age = 0;
    }
    
    public Customer(int custID, String firstName, String lastName, String addr1, String addr2, String city, String state, String zip, String emailAddr, int age) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.emailAddr = emailAddr;
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getcustID() {
        return custID;
    }

    public void setcustID(int custID) {
        this.custID = custID;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getaddr1() {
        return addr1;
    }

    public void setaddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getaddr2() {
        return addr2;
    }

    public void setaddr2(String addr2) {
        this.addr2 = addr2;
    }

    @Override
    public String toString() {
        return "Customer{" + "custID=" + custID + ", firstName=" + firstName + ", lastName=" + lastName + ", addr1=" + addr1 + ", addr2=" + addr2 + ", city=" + city + ", state=" + state + ", zip=" + zip + ", emailAddr=" + emailAddr + ", age=" + age + '}';
    }
    
    
}
