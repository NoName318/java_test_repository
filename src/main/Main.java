import com.example.Generics;

public class Main {
    public static void main(String[] args){
        System.out.println("hello java");

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "World"};
        Double[] doubleArray = {1.1, 2.2, 3.3};

        System.out.println("Integer Array:");
        Generics.printArray(intArray);

        System.out.println("String Array:");
        Generics.printArray(strArray);

        System.out.println("Double Array:");
        Generics.printArray(doubleArray);

        // 测试 Generics 类
        Generics<String> gen1 = new Generics<>();
        Generics<String> gen2 = new Generics<>(gen1);
        System.out.println(gen1.toString());
        System.out.println(gen2.toString());
    }
}
