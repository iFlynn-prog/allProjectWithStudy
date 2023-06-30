package Lessons.Day5.monitor;

class Client implements IMonitor{

    @Override
    public void fileAdded(String name) {
        System.out.println("Added");
    }
}


public class Day5_3 {
    public static void main(String[] args) {
        Monitor mon = new Monitor("C:/Intel");
        Client cl = new Client();
        mon.add(cl); // для создания клиента чтобы получал инфу о событиях необходимо создать объект
        mon.add(x-> System.out.println(x));  //лямбда выражения для клиента и удалить нельзя такого клиента

        mon.start();
    }
}
