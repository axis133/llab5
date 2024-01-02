interface Mobile {
    void call(String number);
    void sendMessage(String message);
}

abstract class SiemensMobile implements Mobile {
    private String model;

    public SiemensMobile(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Model extends SiemensMobile {
    public Model(String model) {
        super(model);
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " from " + getModel());
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
    }
}