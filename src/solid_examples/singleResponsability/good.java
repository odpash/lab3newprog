package solid_examples.singleResponsability;

class Shop {
    public Shop(String street) {}
    void getShopPlace() {}
    void setShopPlace() {}
}

class Order {
    void saveOrder() {}
    void getOrder() {}
}


class ShopDB {
    void updateShopItems(String items) {}
}