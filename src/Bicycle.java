public  class Bicycle extends Transport implements UpdateTyre {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTransport() {
        if (this != null) {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
        } else System.out.println("Проверьте правильность данных");
    }


    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


}
