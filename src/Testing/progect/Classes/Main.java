package Testing.progect.Classes;

public class Main {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;
        mybox.depth = 10;
        mybox.heigt = 20;
        mybox.width = 30;

        vol = mybox.depth * mybox.heigt * mybox.heigt;
        System.out.println(vol);


    }

}
