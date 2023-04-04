public class Car extends Bicycle implements CheckEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTransport() {
        if (this != null) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
        }else System.out.println("Проверьте правильность данных");
    }
}