package solid_examples.liskovSubstitution;


interface Figure { // пример про фигуры
    void setWidth();
    void setHeight();
    int s();
}


class Rectange implements Figure {

    @Override
    public void setWidth() {

    }

    @Override
    public void setHeight() {

    }

    @Override
    public int s() {
        return 0;
    }
}

class Square implements Figure {

    @Override
    public void setWidth() {

    }

    @Override
    public void setHeight() {

    }

    @Override
    public int s() {
        return 0;
    }
}


