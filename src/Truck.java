public class Truck extends Car implements CheckTrailer {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkTransport() {
        if (this != null) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
        }
    }
}
