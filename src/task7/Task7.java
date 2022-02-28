package task7;

public class Task7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int r = 200;
        int d = r + r;
        boolean b1 = d * d >= ((a * a) + (b * b));
        if (b1) {
            System.out.println("отверстие можно закрыть");
        } else
            System.out.println("отверстие  закрыть не получится");
    }
}
