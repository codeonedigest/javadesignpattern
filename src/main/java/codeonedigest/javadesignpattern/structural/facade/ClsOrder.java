package codeonedigest.javadesignpattern.structural.facade;

public class ClsOrder {

    public void placeOrderFacadeMethod() {
        ClsProduct product = new ClsProduct();
        ClsPayment payment = new ClsPayment();
        ClsInvoice invoice = new ClsInvoice();

        product.getDetails();
        payment.payOnline();
        invoice.printInvoice();
    }
}
