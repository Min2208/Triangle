public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(5,10,7,"red",false);

        System.out.println(triangle.toString());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        triangle.setSide1(6);
        triangle.setSide2(16);
        triangle.setSide3(12);
        triangle.setColor("blue");
        triangle.setFilled(true);
        System.out.println(triangle.toString());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }

}
