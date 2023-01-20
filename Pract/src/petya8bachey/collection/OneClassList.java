package petya8bachey.collection;

public class OneClassList {
    protected Container first = null;
    protected Container last = null;
    public void add(Integer number){
        Container item = new Container(number);
        if (first == null){last = first = item;}
        else {
            last.link = item;
            last = item;
        }
    }
    public void printAll(){
        Container printItem = first;
        while (printItem != null) {
            System.out.println(printItem.number);
            printItem = printItem.link;
        }
    }

    class Container {
        protected Integer number;
        protected Container link = null;
        public Container(Integer number){
            this.number = number;
        }
    }
}
