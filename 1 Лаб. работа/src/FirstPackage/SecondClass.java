package FirstPackage;

public class SecondClass {

    private int a;
    private int b;

    public SecondClass() {

    }

    private SecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void aSetter(int value) {
        this.a = value;
    }

    public void bSetter(int value) {
        this.b = value;
    }

    public int aGetter() {
        return a;
    }

    public int bGetter() {
        return b;
    }

    public int multiplication() {
        return this.a * this.b;
    }

}
