public class box {
    double width, height, depth;

    box() {
        width = height = depth = 0;
    }

    box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    box(double side) {
        width = height = depth = side;
    }

    double volume() {
        return width * height * depth;
    }

    public static void main(String args[]) {
        box b1 = new box();
        System.out.println(b1.volume());

        box b2 = new box(10, 20, 30);
        System.out.println(b2.volume());

        box b3 = new box(5);
        System.out.println(b3.volume());
    }
}