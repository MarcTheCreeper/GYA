
import java.util.Arrays;
public class Testklass {
    //aceleration1Till2 måste vara propotinell till avståndet enligt gravitionens lagar
    static int aceleration1Till2 = 10;

    private static int[] acceleration(int acc) {
        int deltaX = possition2[0] - possition1[0];
        int deltaY = possition2[1] - possition1[1];
        int[] bxby = {(int) Math.pow(((Math.pow(deltaX, 2) / Math.pow(deltaY, 2)) * Math.pow(acc, 2)) / ((Math.pow(deltaX, 2) / Math.pow(deltaY, 2)) + 1), 0.5), (int) Math.pow(Math.pow(acc, 2) / ((Math.pow(deltaX, 2) / Math.pow(deltaY, 2)) + 1) , 0.5)};
        if (deltaX < 0) bxby[0] = bxby[0] * -1;
        if (deltaY < 0) bxby[1] = bxby[1] * -1;
        return bxby;
    }

    static int[] fart = {-190, -190};
    static int[] possition1 = {1000, 1000};
    static int[] possition2 = {800, 800};
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) System.out.println(Arrays.toString(obiekt1()));
    }


    private static int[] obiekt1() {
        fart = new int[] {fart[0] + acceleration(aceleration1Till2)[0], fart[1] + acceleration(aceleration1Till2)[1]};
        possition1 = new int[] {possition1[0] + fart[0], possition1[1] + fart[1]};
        return possition1;
    }



}

