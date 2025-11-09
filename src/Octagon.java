// The Octagon class implements the Polygon interface
// This means Octagon must provide (implement) all methods defined in Polygon
public class Octagon implements Polygon {

    // This method is an implementation of a method declared in the Polygon interface
    // It prints a message saying "Draw an Octagon" when called
    // and returns an empty string (since the return type is String)
    @Override
    public String getType() {
        System.out.println("Draw a Octagon");
        return "Octagon";
    }
}
