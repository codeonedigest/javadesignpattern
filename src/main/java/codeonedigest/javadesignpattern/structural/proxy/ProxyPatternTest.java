package codeonedigest.javadesignpattern.structural.proxy;

public class ProxyPatternTest {

    public static void main(String args[]) {
        Image image1 = new ProxyImage("WIN10_10MB_Photo1");
        Image image2 = new ProxyImage("WIN10_10MB_Photo2");

        image1.displayImage();

        image2.displayImage();
    }
}
