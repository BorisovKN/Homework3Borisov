public class FreightTransport extends GroundTransport {
    private float loadCapacity;

    public FreightTransport(String brand, float maxSpeed, float weight, int numberOfWheels, float fuelConsumption,
                            float loadCapacity, float horsePower) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.numberOfWheels = (short) numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.loadCapacity = loadCapacity;
        this.horsePower = horsePower;
    }

    public float calculatePower() {
        return (float) (this.horsePower * 0.74);
    }

    public String getAllInfo() {
        return "Грузовик - " +
                " Марка: " + brand +
                ", скорость: " + maxSpeed +
                "(км/ч), масса: " + weight +
                "(т), количество колес: " + numberOfWheels +
                ", расход топлива: " + fuelConsumption + "(л/100км), " +
                "мощность: " + calculatePower() + ", " +
                "грузоподъемность: " + loadCapacity + "т";
    }

    public void isLoaded(double cargo) {
        if (cargo <= loadCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
