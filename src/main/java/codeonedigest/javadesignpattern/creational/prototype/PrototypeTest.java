package codeonedigest.javadesignpattern.creational.prototype;

public class PrototypeTest {

    public static void main(String args[]) {
        Customer customer1 = new Customer();
        customer1.setName("customer1");
        customer1.setAge(30);


        Customer customer2 = (Customer) customer1.clone();

        //Printing values of both object before making changes to clonned object
        System.out.println("--- Before Updating Clonned Object -----");
        System.out.println("Customer1 - " + customer1.getName() + " " + customer1.getAge());
        System.out.println("Customer2 - " + customer2.getName() + " " + customer2.getAge());

        //Now updating clonned object and we will see it is not affecting original object.
        customer2.setName("customer2");
        customer2.setAge(40);

        //Now printing the values again to see that original object is not affected
        System.out.println("--- After Updating Clonned Object -----");
        System.out.println("Customer1 - " + customer1.getName() + " " + customer1.getAge());
        System.out.println("Customer2 - " + customer2.getName() + " " + customer2.getAge());



    }
}
