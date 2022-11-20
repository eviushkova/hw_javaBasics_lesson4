package eviushkova;public class Main {
    public static void main(String[] args) {

//        1. Переполнение

        byte a = 127;
        System.out.println(++a);

        short b = 32767;
        System.out.println(++b);

        int c = 2_147_000_000;
        int d = c + 2000000;
        System.out.println(d);

        long e = c * c;
        System.out.println(e);

//        2. Математические операторы

        int f = 32767 / 127;
        System.out.println(f);

        int g = 32767 % 127;
        System.out.println(g);

//        3. Логические операторы

        boolean h = true || false;
        System.out.println(h);

        boolean i = true || true;
        System.out.println(i);

        boolean j = true && false;
        System.out.println(j);

        boolean k = !true || !false;
        System.out.println(k);

        boolean l = !(true || false);
        System.out.println(l);

        int m = 1;
        int n = 2;
        boolean o = m > n;
        System.out.println(o);

        boolean p = m != n;
        System.out.println(p);

        boolean q = m <= n;
        System.out.println(q);

//        3. Вычисления комбинации разных типов данных

        double r = 2.0;
        int s = 3;
        double t = r + s;
        System.out.println(t);

//        4. Приоритет операторов в Java

        int w = 2 + 2 * 2;
        System.out.println(w);
    }
}