package codeonedigest.javadesignpattern.behavioral.iterator;

import codeonedigest.javadesignpattern.behavioral.interpreter.ClsDayExpression;

public class ClsCustomer {

    private String customerName;
    private String customerCode;

    public ClsCustomer(String customerName, String customerCode) {
        this.customerName = customerName;
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
}
