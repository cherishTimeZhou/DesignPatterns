package Bridge;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
        System.out.println("直立样式手机");
    }
    
    @Override
    protected void open() {
        super.open();
        System.out.println("直立样式手机");
    }
    
    @Override
    protected void close() {
        super.close();
        System.out.println("直立样式手机");
    }
    
    @Override
    protected void call() {
        super.call();
        System.out.println("直立样式手机");
    }
}
