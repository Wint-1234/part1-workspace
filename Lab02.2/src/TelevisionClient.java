public class TelevisionClient {

  public static void main(String[] args) {

    Television tv1 = new Television("Samsung", 125);
    //tv1.setBrand("Samsung");
    //tv1.setVolume(32);

    tv1.turnOn();
    tv1.turnOff();
    System.out.println(tv1);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 56);
    //tv2.setBrand("Sony");
    //tv2.setVolume(56);

    tv2.turnOn();
    tv2.turnOff();
    System.out.println(tv2);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());


    Television tv3 = new Television("LG");

    tv3.turnOn();
    tv3.turnOff();
    System.out.println(tv3);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

  }
}
