package image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("image.jpg");
        ProxyImage proxyImage = new ProxyImage("proxy_image.jpg", realImage);

        proxyImage.display();
    }
}
