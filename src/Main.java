class Множество {
}

class Кольцо extends Множество {
    public static int сложение(int a, int b) {
        return a + b;
    }
    public static int умножение(int a, int b) {
        return a * b;
    }
    public static boolean коммутативностьСложения(int a, int b) {
        return сложение(a, b) == сложение(b, a);
    }
    public static boolean коммутативностьУмножения(int a, int b) {
        return умножение(a, b) == умножение(b, a);
    }
    public static boolean ассоциативностьСложения(int a, int b, int c) {
        return сложение(сложение(a, b), c) == сложение(a, сложение(b, c));
    }
    public static boolean ассоциативностьУмножения(int a, int b, int c) {
        return умножение(умножение(a, b), c) == умножение(a, умножение(b, c));
    }
    public static boolean дистрибутивность(int a, int b, int c) {
        return умножение(a, сложение(b, c)) == сложение(умножение(a, b), умножение(a, c));
    }
}

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        System.out.println("Сложение: " + Кольцо.сложение(a, b)); // 5
        System.out.println("Умножение: " + Кольцо.умножение(a, b)); // 6

        System.out.println("Коммутативность сложения: " + Кольцо.коммутативностьСложения(a, b));
        System.out.println("Коммутативность умножения: " + Кольцо.коммутативностьУмножения(a, b));

        System.out.println("Ассоциативность сложения: " + Кольцо.ассоциативностьСложения(a, b, c));
        System.out.println("Ассоциативность умножения: " + Кольцо.ассоциативностьУмножения(a, b, c));

        System.out.println("Закон дистрибутивности: " + Кольцо.дистрибутивность(a, b, c));
    }
}
