package Task_2;

public class TestAddress {
    public static void main(String[] args) {
        Address address = new Address();
        address.setAddress1("Russia,Moscow region,Moscow,Tverskaya street,5,1,12");
        System.out.println(address);
        address.setAddress2("Russia.Moscow region,Moscow;Tverskaya street,5,1.12");
        System.out.println(address);
    }
}
