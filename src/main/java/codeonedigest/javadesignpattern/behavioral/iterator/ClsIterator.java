package codeonedigest.javadesignpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ClsIterator {

    private int currentIndex = 0;
    private List<ClsCustomer> customerList = new ArrayList<>();

    public void addCustomer(ClsCustomer clsCustomer) {
        if (clsCustomer != null) {
            customerList.add(clsCustomer);
            System.out.println(clsCustomer.getCustomerName() + " - Customer added to collection successfully");
        }
    }

    public int getTotalCount() {
        System.out.println("Getting the count of customers in collection") ;
        return customerList.size();
    }

    public ClsCustomer getByIndex(int index) throws Exception {
        if (index > customerList.size() || index < 0) {
            throw new Exception("Invalid Index");
        }

        currentIndex = index;
        return customerList.get(index);
    }

    public ClsCustomer getPrev() {
        int tempIndex = currentIndex;
        currentIndex = --tempIndex;
        if (currentIndex < 0 ) {
            currentIndex = 0;
        }
        System.out.println("Getting Previous Customer at Index " + currentIndex);
        return customerList.get(currentIndex);
    }

    public ClsCustomer getNext() {
        int tempIndex = currentIndex;
        currentIndex = ++tempIndex;
        if (currentIndex > customerList.size()) {
            currentIndex = customerList.size() - 1;
        }
        System.out.println("Getting Next Customer at Index " + currentIndex);
        return customerList.get(currentIndex);
    }

    public ClsCustomer getFirst() {
        System.out.println("Getting first Customer ");
        return customerList.get(0);
    }

    public ClsCustomer getLast() {
        System.out.println("Getting last Customer ");
        return customerList.get(customerList.size() -1);
    }

    public List<ClsCustomer> getAll() {
        return customerList;
    }
}
