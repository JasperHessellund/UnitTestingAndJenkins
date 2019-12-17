public class CircleArea {

    public double computeCircleArea(double radius) {
        double result = Math.round(Math.PI * (radius * radius) * 100.0) / 100.0;
        return result;
    }

}
