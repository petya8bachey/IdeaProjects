package petya8bachey.collection;

public class Item<Type> {
    protected Type value;
    protected Item link = null;
    public Item(Type value){
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
