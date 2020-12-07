package Singleton.StaticConstantHungryMan;

public class StaticConstantHungryMan {
    
    public static void main(String[] args) {
        System.out.println("---------------单列模式-静态常量饿汉式---------------");
        
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        
        System.out.println(instance1 == instance2);
        System.out.println("instance2.hashcode = " + instance1.hashCode());
        System.out.println("instance2.hashcode = " + instance2.hashCode());
    }
    
}

/**
 * 静态常量饿汉式
 */
class Singleton{
    
    //构造器私有化
    private Singleton(){}
    
    //本类内部创建实例对象
    private final static Singleton instance = new Singleton();
    
    /**
     *  提供一个共有静态方法，返回静态常量instance
     * @return instance
     */
    public static Singleton getInstance(){
        return instance;
    }
}