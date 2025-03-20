import com.example.enumExample.COLOR;
import com.example.multiThreadingExample.CountTask;
import com.example.genericsExample.ReverseTree;
import com.example.multiThreadingExample.ShardCount;

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
        ReverseTree<String> x1 = new ReverseTree<>("1");//x1有值但无指向
        ReverseTree<String> x2 = new ReverseTree<>(x1);//x2无值但指向x1
        ReverseTree<String> x3 = new ReverseTree<>("3");//x3有值但无指向

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

        COLOR color=COLOR.RED;

        System.out.println(color);

        ShardCount shardCount=new ShardCount();
        int threadCount=5; //创建5个线程

        for (int i = 0; i <threadCount; i++) {
            Runnable task=new CountTask(shardCount,10);
            Thread thread=new Thread(task);
            thread.start(); //thread.start()启动CountTask的run方法，该方法接收ShardCount类的对象shardCount，用于执行该类的方法increment() times次。

        }

    }
}
