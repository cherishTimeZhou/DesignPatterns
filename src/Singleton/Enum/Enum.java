package Singleton.Enum;

public class Enum {
    
    public static void main(String[] args) {
        System.out.println("---------------单列模式-枚举---------------");
        
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        
        System.out.println(instance1 == instance2);
        System.out.println("instance2.hashcode = " + instance1.hashCode());
        System.out.println("instance2.hashcode = " + instance2.hashCode());
        
        instance1.SayOk();
        instance1.SayOk();
    }
    
}

/**
 * 枚举实现
 */
enum Singleton{
    INSTANCE;
    
    public void SayOk() {
        System.out.println("ok!");
    }
}