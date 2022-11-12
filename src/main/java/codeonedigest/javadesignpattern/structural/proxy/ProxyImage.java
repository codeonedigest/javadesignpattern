package codeonedigest.javadesignpattern.structural.proxy;

public class ProxyImage implements Image {

    private String fileName;

    private Image image;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        image = new RealImage(fileName);
        image.displayImage();
    }
}
