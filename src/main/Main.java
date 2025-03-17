import com.example.Generics;

public class Main {
    public static void main(String[] args){
//        System.out.println("hello java");
//
//        Integer[] intArray = {1, 2, 3, 4, 5};
//        String[] strArray = {"Hello", "World"};
//        Double[] doubleArray = {1.1, 2.2, 3.3};

//        System.out.println("Integer Array:");
//        Generics.printArray(intArray);
//
//        System.out.println("String Array:");
//        Generics.printArray(strArray);
//
//        System.out.println("Double Array:");
//        Generics.printArray(doubleArray);

        // 测试 Generics 类
        Generics<String> x1 = new Generics<>("1");//x1有值但无指向
        Generics<String> x2 = new Generics<>(x1);//x2无值但指向x1
        Generics<String> x3 = new Generics<>("3");//x3有值但无指向

        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

        System.out.println();

        x2.setValue("2");  //设置x2的值
        x3.setPoint(x1);//设置x3的指向
        //至此x1，x2，x3形成了一个反向树的结构
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);

    }
}
