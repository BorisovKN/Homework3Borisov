public class Main {
    public static void main(String[] args) {
        PassengerTransport car = new PassengerTransport("Audi", "Sedan", 250.5f, 2100.5f,
                4, 12.5f, 5, 250,5.9);
        System.out.println(car.getAllInfo());
        PassengerTransport car2 = new PassengerTransport("Renault", "Minivan", 180f, 2100.5f,
                4, 4.5f, 5, 110,7);
        System.out.println(car2.getAllInfo());
        FreightTransport truck = new FreightTransport("Scania", 130.5f, 10.5f, 10, 20.5f,
                12.5f, 225f);
        System.out.println(truck.getAllInfo());
        truck.isLoaded(10.5);
        FreightTransport truck2 = new FreightTransport("Maz", 120.5f, 12.5f, 10, 20.5f,
                9.5f, 205f);
        System.out.println(truck2.getAllInfo());
        truck2.isLoaded(10.5);
        CivilAircraft air = new CivilAircraft("Boeing", 896.6f, 162.4f, 452,
                1000, true, 59.6f, 550);
        System.out.println(air.getAllInfo());
        air.isLoaded(451);
        CivilAircraft air2 = new CivilAircraft("Airbus", 952.6f, 185.4f, 352,
                1000, false, 65.6f, 850);
        System.out.println(air2.getAllInfo());
        air2.isLoaded(451);
        MilitaryAircraft warAir = new MilitaryAircraft("Mig", 900f, 45.5f, 1000,
                25.5f, 325.5f, true, 5);
        System.out.println(warAir.getAllInfo());
        warAir.shot();
        warAir.getOut();
        MilitaryAircraft warAir2 = new MilitaryAircraft("Su", 952.6f, 33.3f, 555,
                23.5f, 290.2f, false, 0);
        System.out.println(warAir2.getAllInfo());
        warAir2.shot();
        warAir2.getOut();
    }
}