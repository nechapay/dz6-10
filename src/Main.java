import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    /*
        Напишите перегруженный метод print для всех примитивных типов,
        который принимает строку и vararg и печатает его элементы. Если vararg пустой,
        то должна печататься строка. *
     */
    public static void main(String[] args) {
	// write your code here
        print("String");
        print("vararg of byte", new byte[]{1, 2, 3});
        print("vararg of short", new short[]{4, 5, 6});
        print("vararg of int", 7, 8, 9);
        print("vararg of long", new long[]{-44444, 55555, 66666});
        print("vararg of float", new float[]{-44444 / 22, 55555, 66666});
        print("vararg of double", new double[]{44444 / 3333, 55555, 66666});
        print("vararg of char", '1', 'a', 'c');
        print("vararg of boolean", 5 > 3, false, true);
    }

    public static void print(String str) {
        System.out.println(str);
    }

    public static void print(String str, byte... arr) {
        System.out.println(str + " " +  Arrays.toString(arr));
    }

    public static void print(String str, int... arr) {
        System.out.println(str + " " +  Arrays.toString(arr));
    }

    public static void print(String str, short... arr) {
        System.out.println(str + " " +  Arrays.toString(arr));
    }

    public static void print(String str, long... arr) {
        System.out.println(str + " " +  Arrays.toString(arr));
    }

    public static void print(String str, char... arr) {
        System.out.println(str + " " +  Arrays.toString(arr));
    }

    public static void print(String str, float... arr) {
        System.out.println(str + " " +  Arrays.toString(arr));
    }

    public static void print(String str, double... arr) {
        System.out.println(str + " " +  Arrays.toString(arr));
    }

    public static void print(String str, boolean... arr) {
        System.out.println(str + " " +  Arrays.toString(arr));
    }
}
