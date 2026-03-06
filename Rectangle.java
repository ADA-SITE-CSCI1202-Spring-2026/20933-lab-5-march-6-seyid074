public class Rectangle {
    protected double width;
    protected double height;

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Rectangle)) return false;

        Rectangle r = (Rectangle) obj;
        return width == r.width && height == r.height;
    }

    public String toString() {
        return "Rectangle: width=" + width + ", height=" + height;
    }
}
