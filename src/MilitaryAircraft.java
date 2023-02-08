public class MilitaryAircraft extends AirTransport {
    private int amountOfMissiles;
    private boolean isEjectionSystems;

    public MilitaryAircraft(String brand, float maxSpeed, float weight, int horsePower, float wingspan, float runway,
                            boolean isEjectionSystems, int amountOfMissiles) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.horsePower = horsePower;
        this.runway = runway;
        this.wingspan = wingspan;
        this.amountOfMissiles = amountOfMissiles;
        this.isEjectionSystems = isEjectionSystems;
    }

    public float calculatePower() {
        return (float) (this.horsePower * 0.74);
    }

    public void shot() {
        while (this.amountOfMissiles > 0) {
                System.out.println("Ракета пошла");
                this.amountOfMissiles--;

                if (this.amountOfMissiles == 0) {
                    break;
                }
            }
        System.out.println("Боеприпасы отсутствуют");
    }


    public void getOut() {
        String str = (this.isEjectionSystems) ? "Катапультирование прошло успешно" : "У вас нет такой системы";
        System.out.println(str);
    }

    public String getAllInfo() {
        String ejectionSystems = (this.isEjectionSystems) ? "есть" : "нет";
        return "Самолет - " +
                "Марка: " + this.brand + ", " +
                "скорость: " + this.maxSpeed + "(км/ч), " +
                "масса: " + this.weight + "(т), " +
                "система катапультирования: " + ejectionSystems + ", " +
                "размах крыльев: " + this.wingspan + "(м), " +
                "длина впп: " + this.runway + "(м), " +
                "мощность: " + calculatePower() + "(кВ), " +
                "количество ракет: " + this.amountOfMissiles;
    }
}
