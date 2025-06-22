package JavaAdv.Exercises.Generics;

public class Pair<T, U> {
    private T firstItem;
    private U secondItem;

    public Pair(T firstItem, U secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public T getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(T firstItem) {
        this.firstItem = firstItem;
    }

    public U getSecondItem() {
        return secondItem;
    }

    public void setSecondItem(U secondItem) {
        this.secondItem = secondItem;
    }
}
