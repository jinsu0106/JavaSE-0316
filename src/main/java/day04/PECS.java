package day04;

public class PECS<N extends Number> {

    private void print(N n1, N n2) {
        System.out.println(n1);
        System.out.println(n2);
    }

    public static void main(String[] args) {
        PECS<Integer> p1 = new PECS<>();
        p1.print(1, 2);

        PECS<Double> p2 = new PECS<>();
        p2.print(1.1, 2.2);

//        PECS<String> p3 = new PECS<>();
    }
}
