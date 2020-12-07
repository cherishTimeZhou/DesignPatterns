package Singleton.ThreadUnSafeLazyMan;

public class ThreadUnSafeLazyMan {
    
    public static void main(String[] args) {
        System.out.println("---------------单列模式-线程不安全懒汉式---------------");
        
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        
        System.out.println(instance1 == instance2);
        System.out.println("instance2.hashcode = " + instance1.hashCode());
        System.out.println("instance2.hashcode = " + instance2.hashCode());
    }
    
}

/**
 * 线程不安全懒汉式
 */
class Singleton{
    
    //构造器私有化
    private Singleton(){}
    
    //私有静态变量
    private static Singleton instance;
    
    /**
     *  提供一个共有静态方法，返回静态常量instance
     * @return instance
     */
    public static Singleton getInstance(){
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}