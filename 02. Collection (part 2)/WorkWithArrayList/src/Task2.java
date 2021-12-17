import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Task2<E> extends ArrayList<E> {

    @Override
    public E remove(int index) {
        System.out.println("You can`t remove");
        return null;
    }

    @Override
    public void clear() {
        System.out.println("You can`t remove");
    }


    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        System.out.println("You can`t remove");
    }


    @Override
    public boolean remove(Object o) {
        System.out.println("You can`t remove");
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        System.out.println("You can`t remove");
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        System.out.println("You can`t remove");
        return false;
    }
}