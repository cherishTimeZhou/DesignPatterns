package Bridge;
/**
 * <P><B> 桥接模式-抽象类 </B></P>
 * <P> 手机抽象类 </P>
 *
 * Date 2020/12/8 13:49
 * @author Rider Zhou
 * @version 1.0
 **/
public abstract class Phone {

    //聚合品牌，通过品牌来做各自品牌的手机
    private Brand brand;
    
    //构造器
    public Phone(Brand brand) {
        super();
        this.brand = brand;
    }
    
    //通过该抽象类方法来桥接调用Brand的方法
    protected void open(){
        this.brand.open();
    }
    protected void close(){
        this.brand.close();
    }
    protected void call(){
        this.brand.call();
    }
}
