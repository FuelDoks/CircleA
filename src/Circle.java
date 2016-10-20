public class Circle {
    float x;
    float y;
    float radius;

    static class CircleA {
        public static void main() {
            Circle circleA = new Circle();

            circleA.x = 124;
            circleA.y = 234;
            circleA.radius = 666;

            System.out.println(circleA.x);
            System.out.println(circleA.y);
            System.out.println(circleA.radius);


        }
    }
}