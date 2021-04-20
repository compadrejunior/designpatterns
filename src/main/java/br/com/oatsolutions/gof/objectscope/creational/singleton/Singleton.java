package br.com.oatsolutions.gof.objectscope.creational.singleton;

public final class Singleton {
    /**
     * The uniqueInstance private member grants control over the class
     */
    private static Singleton instance;

    public String value;

    /**
     * The private constructor prevents the object being instantiated from
     * another object
     */
    private Singleton(String value){
        this.value = value;
    }

    /**
     * The getInstance method is the pattern you will see in every Singleton
     * pattern classes
     * @return an unique instance of this class no matter how many time it
     * is called
     */
    public static Singleton getInstance(String value) {
        if (instance == null) instance = new Singleton(value);
        return  instance;
    }
}

