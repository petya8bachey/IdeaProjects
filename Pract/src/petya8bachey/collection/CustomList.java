package petya8bachey.collection;

public class CustomList<Type> {
    protected Item first = null;
    protected Item last = null;
    public void add(Type number){
        Item<Type> item = new Item<Type>(number);
        if (first == null){last = first = item;}
        else {
            last.link = item;
            last = item;
        }
    }
    public void printAll(){
        Item printItem = first;
        while (printItem != null) {
            System.out.println(printItem.value);
            printItem = printItem.link;
        }
    }
}
