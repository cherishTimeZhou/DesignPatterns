package Factory.SimpleFactory.Pizza;

public class CheesePizza extends Pizza {
    
    /**
     * Pizza准备
     *
     * @author Rider Zhou
     * @version v1.0.0 2020/12/1 18:48
     **/
    @Override
    public void prepare() {
        System.out.println(" 制作奶酪披萨，准备原材料！ ");
    }
}
