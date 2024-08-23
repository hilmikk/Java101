public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmet Kaya", 888 , 34, 2012);
        Employee e2 = new Employee("Ali Şengül", 1000, 15, 2019);
        Employee e3 = new Employee("Ayşe Tatil", 1200,60,1999);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
    }
}