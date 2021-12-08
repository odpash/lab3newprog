package solid_examples.interfaceSegregation;

interface VazSet {
    void getVazPrice();
}

interface AudiSet {
    void getAudiPrice();
}

interface BmwSet {
    void getBmwPrice();
}

class VazGood implements VazSet {

    @Override
    public void getVazPrice() {

    }
}

class AudiGood implements AudiSet {

    @Override
    public void getAudiPrice() {

    }
}

class BmwGood implements BmwSet {

    @Override
    public void getBmwPrice() {

    }
}