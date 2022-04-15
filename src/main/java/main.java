public class main {
    public static void main(String[] args) {
        Factory factory1 = new Factory("Romania", "Mioveni");
        ParentOrganization parentOrganization1 = new ParentOrganization("Renault", 365, factory1);
        Car car1 = new Car("Dacia", "Sandero", 2008);

        System.out.println(car1);
        System.out.println(parentOrganization1);

        ParentOrganization parentOrganization2 = new ParentOrganization();
        Car car2 = new Car();

        System.out.println(car2);
        System.out.println(parentOrganization2);

    }
}
