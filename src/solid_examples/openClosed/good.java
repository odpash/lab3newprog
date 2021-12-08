package solid_examples.openClosed;

abstract class goodItem {
    abstract Double getPrice();
}

class milk extends goodItem {
    @Override
    Double getPrice() {
        return 15.4;
    }
}


class loaf extends goodItem {
    @Override
    Double getPrice() {
        return 35.4;
    }
}

class chocolate extends goodItem {
    @Override
    Double getPrice() {
        return 55.2;
    }
}



public class good {
    public static void main(String[] args) {
        goodItem[] items = new goodItem[3];
        items[0] = new milk();
        items[1] = new loaf();
        items[2] = new chocolate();
        System.out.println(getGoodItemsCost(items));
    }



    public static Double getGoodItemsCost(goodItem[] items) {
        Double cost = 0.0;
        for (goodItem item : items) {
            cost += item.getPrice();
        }
        return cost;
    }

}