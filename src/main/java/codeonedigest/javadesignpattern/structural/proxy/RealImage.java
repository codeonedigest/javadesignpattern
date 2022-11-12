package codeonedigest.javadesignpattern.structural.proxy;

public class RealImage implements Image {

    private String fileName;

    public void loadingImageFromDisk() {
        System.out.println("Loading Image....");
    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadingImageFromDisk();
    }

    @Override
    public void displayImage() {
        System.out.println("Display Image File " + fileName);
    }
}
