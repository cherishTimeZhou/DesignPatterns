package Decorator;

/**
 * <P><B> Espresso 咖啡 </B></P>
 * <P> 细节描述 </P>
 *
 * Date 2020/12/9 15:14
 * @author Rider Zhou
 * @version 1.0
 **/
public class Espresso extends Coffee {
    
    /**
     * 初始化每份Espresso相关信息
     * @author Rider Zhou
     * @version v1.0.0 2020/12/9 15:16
     **/
    public Espresso(){
        setDescription("意大利咖啡");
        setPrice(6.0f);
    }
    
}
