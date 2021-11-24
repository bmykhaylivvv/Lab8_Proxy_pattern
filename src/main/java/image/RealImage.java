package image;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String imageFilename) {
        fileName = imageFilename;
    }

    public void display() {
        System.out.println("IMAGE | Display!");
    }

    public void loadFromDisk() {
        System.out.println("IMAGE | Loading from the disk!");
    }
}
