// The Pentagon class implements the Polygon interface
// This means that Pentagon must define all methods declared in the Polygon interface.
public class Pentagon implements Polygon {

    // This method overrides (implements) a method from the Polygon interface.
    // It prints a message indicating that a Pentagon is being drawn.
    // Then, it returns an empty string (though returning the shape name would be more useful).
    @Override
    public String getType() {
        System.out.println("Draw a Pentagon");
        return "Pentagon";
    }
}
