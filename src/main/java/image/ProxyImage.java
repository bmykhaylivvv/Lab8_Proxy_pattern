package image;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String proxyImageFilename, RealImage realImageInstance) {
        fileName = proxyImageFilename;
        realImage = realImageInstance;
    }

    public void display() {
        System.out.println("Some proxy operations!");
        realImage.display();
    }

}
