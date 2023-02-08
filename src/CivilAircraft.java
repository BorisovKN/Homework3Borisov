public class CivilAircraft extends AirTransport {
    private int amountOfPassengers;
    private boolean isBClass;

    CivilAircraft(String brand, float maxSpeed, float weight, int amountOfPassengers, int horsePower, boolean isBClass,
                  float wingspan, float runway) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.amountOfPassengers = amountOfPassengers;
        this.horsePower = horsePower;
        this.runway = runway;
        this.wingspan = wingspan;
        this.isBClass = isBClass;
    }

    public float calculatePower() {
        return (float) (this.horsePower * 0.74);
    }

    public String getAllInfo() {
        String bClass = (this.isBClass) ? "есть" : "нет";
        return "Самолет - " +
                "Марка: " + brand + ", " +
                "скорость: " + maxSpeed + "(км/ч), " +
                "масса: " + weight + "(т), " +
                "количестов пассажтров: " + amountOfPassengers + "(чел), " +
                "бизнес класс: " + bClass + ", " +
                "размах крыльев: " + wingspan + "(м), " +
                "мощность: " + calculatePower() + "(кВ), " +
                "длина впп: " + runway + "(м)";
    }

    public void isLoaded(int people) {
        if (people <= amountOfPassengers) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
