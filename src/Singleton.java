public class Singleton {

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Inner static class responsible for holding the Singleton instance
    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    // Global access point to get the instance
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}




