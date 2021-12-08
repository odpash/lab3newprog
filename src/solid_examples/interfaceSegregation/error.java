package solid_examples.interfaceSegregation;

interface AutoPrice {
    void getVazPrice();

    void getBmwPrice();

    void getAudPrice();
}

class Vaz implements AutoPrice {

    @Override
    public void getVazPrice() {

    }

    @Override
    public void getBmwPrice() {

    }

    @Override
    public void getAudPrice() {

    }
}

class Bmw implements AutoPrice {

    @Override
    public void getVazPrice() {

    }

    @Override
    public void getBmwPrice() {

    }

    @Override
    public void getAudPrice() {

    }
}

class Audi implements AutoPrice {

    @Override
    public void getVazPrice() {

    }

    @Override
    public void getBmwPrice() {

    }

    @Override
    public void getAudPrice() {

    }
}