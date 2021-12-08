package solid_examples.openClosed;



class errorItem {
    private String name;

    public errorItem(String name) {
        this.name = name;
    }

    public String getErrorItemName() {
        return this.name;
    }
}

public class error {
    public static void main(String[] args) {
        errorItem[] items = new errorItem[3];
        items[0] = new errorItem("Молоко");
        items[1] = new errorItem("Плюшка");
        items[2] = new errorItem("Шоколадка");
        System.out.println(getErrorItemsCost(items));
    }



    public static Double getErrorItemsCost(errorItem[] items) {
        Double cost = 0.0;
        for (errorItem item : items) {
            if (item.getErrorItemName().equals("Молоко")) {cost += 15.4;}
            if (item.getErrorItemName().equals("Плюшка")) {cost += 15.4;}
            if (item.getErrorItemName().equals("Шоколадка")) {cost += 15.4;}
            }
        return cost;
        }

    }