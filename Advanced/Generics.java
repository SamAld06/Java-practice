package Advanced;

public class Generics<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Generics<String> stringExample = new Generics<>();
        stringExample.setValue("This is a generics example");
        System.out.println(stringExample.getValue());
        Generics<Integer> intExample = new Generics<>();
        intExample.setValue(42);
        System.out.println(intExample.getValue());
    }

}
