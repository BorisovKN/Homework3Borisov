public class PassengerTransport extends GroundTransport {
    private String bodyType;
    private int amountOfPassengers;

    PassengerTransport(String brand, String bodyType, float maxSpeed, float weight, int numberOfWheels,
                       float fuelConsumption, int amountOfPassengers, int horsePower, double time) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.numberOfWheels = (short) numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.bodyType = bodyType;
        this.amountOfPassengers = amountOfPassengers;
        this.horsePower = horsePower;
        avg(time);
    }

    public float calculatePower() {
        return (float) (this.horsePower * 0.74);
    }


    public String getAllInfo() {
        return "Легковой авто - " +
                "Марка: " + this.brand +
                ", тип кузова: " + this.bodyType + "," +
                " скорость: " + this.maxSpeed + "(км/ч)," +
                " масса: " + this.weight + "(кг)," +
                " количество колес - " + this.numberOfWheels +
                ", расход топлива - " + this.fuelConsumption +
                "(л/100км), пассажиры: " + this.amountOfPassengers +
                "(чел), мощность: " + this.calculatePower() + "(кВ)";
    }

    private void avg(double time) {
        System.out.println("За время " + time + " ч, автомобиль " + this.brand + " двигаясь с максимальной скоростью "
                + this.maxSpeed + " км/ч проедет " + this.maxSpeed * time + " км и израсходует "
                + this.maxSpeed * time * this.fuelConsumption / 100 + " литров топлива");
    }
}
