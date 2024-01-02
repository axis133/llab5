interface Mobile {
}

abstract class SiemensMobile implements Mobile {
    private String model;

    public SiemensMobile(String model) {
        this.model = model;
    }
}

class Model extends SiemensMobile {
    public Model(String model) {
        super(model);
    }
}
