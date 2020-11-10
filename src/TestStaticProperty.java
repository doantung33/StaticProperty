public class TestStaticProperty {
    public static void main(String[]args){
        Car car1 =new Car("Madaz 2","Skyactiv 2");
        System.out.println(Car.numOfCars);
        Car car2 =new Car("Merceder 5","EQ Boost 5");
        System.out.println(Car.numOfCars);

    }
}
