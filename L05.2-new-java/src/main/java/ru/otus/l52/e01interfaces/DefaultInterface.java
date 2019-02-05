package ru.otus.l52.e01interfaces;

@FunctionalInterface
public interface DefaultInterface { // @FunctionalInterface !
    String getState();

    default void printClass() {
        System.out.println(this.getClass());
    }

    default void printFullInfo() {
        System.out.println(this.getClass() + ": { " + getState() + " }");
    }
}
