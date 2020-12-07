package Singleton.DoubleCheck;

public class DoubleCheck {
    
    public static void main(String[] args) {
        System.out.println("---------------单列模式-双重检查---------------");
        
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        
        System.out.println(instance1 == instance2);
        System.out.println("instance2.hashcode = " + instance1.hashCode());
        System.out.println("instance2.hashcode = " + instance2.hashCode());
    }
    
}

/**
 * 双重检查
 */
class Singleton{
    
    //构造器私有化
    private Singleton(){}
    
    //私有静态变量
    private static volatile Singleton instance;
    
    /**
     *  提供一个共有静态方法，返回静态常量instance
     *  加入双重检查，解决线程安全，同时解决懒加载
     * @return instance
     */
    public static synchronized Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}