package petya8bachey.collection;

public class Stack<Type> {
    protected Item start = null;
    protected Item end = null;

    public void push(Type value) {
        Item<Type> item = new Item<Type>(value);
        if (start == null) {
            start = end = item;
        } else {
            item.link = end;
            end = item;
        }
    }

    public Type pop() {
        if (end == null) {
            return null;
        } else {
            Type value = (Type) end.value;
            end = end.link;
            return value;
        }
    }

    public Item search(Type value) {
        Item iterItem = end;
        while (iterItem != null) {
            if (value.equals(iterItem.value)) {
                return iterItem;
            }
            iterItem = iterItem.link;
        }
        return null;
    }

    public void printAll() {
        Item printItem = end;
        while (printItem != null) {
            System.out.println(printItem.value);
            printItem = printItem.link;
        }
    }
}