package codeonedigest.javadesignpattern.behavioral.iterator;

public class IteratorPatternTest {

    public static void main(String args[]) {

        ClsIterator iterator = new ClsIterator();

        ClsCustomer customer1 = new ClsCustomer("Pawan", "1001");
        ClsCustomer customer2 = new ClsCustomer("Ravi", "1002");
        ClsCustomer customer3 = new ClsCustomer("Vijay", "1003");
        ClsCustomer customer4 = new ClsCustomer("Suresh", "1004");
        ClsCustomer customer5 = new ClsCustomer("Ramesh", "1005");


        iterator.addCustomer(customer1);
        iterator.addCustomer(customer2);

        int customerCount = iterator.getTotalCustomerCount();
        System.out.println("There are total " + customerCount + " customers in collection") ;

        iterator.addCustomer(customer3);
        iterator.addCustomer(customer4);

        int customerCount2 = iterator.getTotalCustomerCount();
        System.out.println("There are total " + customerCount2 + " customers in collection") ;

        iterator.getNext();
        iterator.getNext();

        iterator.addCustomer(customer5);

        int customerCount3 = iterator.getTotalCustomerCount();
        System.out.println("There are total " + customerCount3 + " customers in collection") ;

        iterator.getNext();
        iterator.getPrev();
        iterator.getFirst();
        iterator.getLast();

    }
}
