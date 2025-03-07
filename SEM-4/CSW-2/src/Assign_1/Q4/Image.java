package Assign_1.Q4;

public class Image {
    private double imageWidth;
    private double imageHeight;
    private String colorCode;

    public Image() {}

    public Image(double imageHeight, double imageWidth, String colorCode) {
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
        this.colorCode = colorCode;
    }

    public void setImageWidth(double width) {
        this.imageWidth = width;
    }

    public void setImageHeight(double height) {
        this.imageHeight = height;
    }

    public void setColorCode(String code) {
        this.colorCode = code;
    }

    public double getImageHeight() {
        return imageHeight;
    }

    public double getImageWidth() {
        return imageWidth;
    }

    public String getColorCode() {
        return colorCode;
    }

    public String toString() {
        return "[ImageWidth = "+imageWidth+", ImageHeight = "+imageHeight+", ColorCode = "+colorCode+"]";
    }

    public static void main(String[] args) {
        Image img1 = new Image();
        img1.setImageWidth(22.1);
        img1.setImageHeight(51.2);
        img1.setColorCode("###ADSGSJ");
        Image img2 = new Image(12.3,52.6,"#JDJDT");
        System.out.println("Image Details of obj1--> "+img1);
        System.out.println("Image Details  of obj2--> "+img2);
    }
}
