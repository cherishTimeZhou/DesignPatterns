package Singleton.StaticInnerClass;

public class StaticInnerClass {
    
    public static void main(String[] args) {
        System.out.println("---------------单列模式-静态内部类---------------");
        
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        
        System.out.println(instance1 == instance2);
        System.out.println("instance2.hashcode = " + instance1.hashCode());
        System.out.println("instance2.hashcode = " + instance2.hashCode());
    }
    
}

/**
 * 静态内部类
 */
class Singleton{
    
    //构造器私有化
    private Singleton(){}
    
    //私有静态变量
    private static volatile Singleton instance;
    
    //静态内部类，该类中实例化一个静态属性instance
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    
    /**
     *  提供一个共有静态方法，返回静态常量instance
     *
     * @return instance
     */
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}