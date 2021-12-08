package solid_examples.dependencyInvertion;

interface Product {
    void seeReviews();
    void getSample();

}


class Book implements Product {

    @Override
    public void seeReviews() {

    }

    @Override
    public void getSample() {

    }
}

class DVD implements Product {

    @Override
    public void seeReviews() {

    }

    @Override
    public void getSample() {

    }
}

class User {

    Product product;

    void addProduct(Product product) {

    }
    ;
}