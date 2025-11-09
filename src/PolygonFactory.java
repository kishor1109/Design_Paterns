public class PolygonFactory {

    public Polygon getPolygon(int numOfSides) {
        if (numOfSides == 3)
            return new Triangle();
        if (numOfSides == 4)
            return new Square();
        if (numOfSides == 5)
            return new Pentagon();
        if (numOfSides == 8)
            return new Octagon();

        return null;
    }
}



