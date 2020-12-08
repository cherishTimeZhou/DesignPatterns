package Bridge;

public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
        System.out.println("折叠样式手机");
    }
    
    @Override
    protected void open() {
        super.open();
        System.out.println("折叠样式手机");
    }
    
    @Override
    protected void close() {
        super.close();
        System.out.println("折叠样式手机");
    }
    
    @Override
    protected void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
