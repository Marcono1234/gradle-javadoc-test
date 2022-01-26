package demo;

import demo.internal.Implementation;

/**
 * Some class.
 */
public class Public {
    private Public() {
    }

    /**
     * Does something.
     */
    public void doSomething() {
        Implementation.doSomething();
    }
}
