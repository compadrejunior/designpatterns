package br.com.oatsolutions.gof.objectscope.creational;

public class Singleton {
    /**
     * The uniqueInstance private member grants control over the class
     */
    private static Singleton uniqueInstance;

    /**
     * The private constructor prevents the object being instantiated from
     * another object
     */
    private Singleton(){}

    /**
     * The getInstance method is the pattern you will see in every Singleton
     * pattern classes
     * @return an unique instance of this class no matter how many time it
     * is called
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return  uniqueInstance;
    }
}

