package Factory.FactoryMethod.Pizza;

/**
 * <P><B> 简单抽象工厂设计模式 </B></P>
 * <P> Pizza抽象类 </P>
 *
 * Date 2020/12/1 14:38
 * @author Rider Zhou
 * @version 1.0
 **/
public abstract class Pizza {
    
    //pizza 名称
    protected String name;
    
    /**
     * Pizza准备
     * @author Rider Zhou
     * @version v1.0.0 2020/12/1 18:48
     **/
    public abstract void prepare();
    
    /**
     * Pizza烘培
     * @author Rider Zhou
     * @version v1.0.0 2020/12/1 18:48
     **/
    public void bake(){
        System.out.println(name + " pizza is  baking! ");
    }
    
    /**
     * Pizza切片
     * @author Rider Zhou
     * @version v1.0.0 2020/12/1 18:48
     **/
    public void cut(){
        System.out.println(name + " pizza is  cutting! ");
    }
    
    /**
     * Pizza打包
     * @author Rider Zhou
     * @version v1.0.0 2020/12/1 18:48
     **/
    public void box(){
        System.out.println(name + " pizza is  boxing! ");
    }
    
    /**
     * 设置Pizza名称
     * @param name Pizza名称
     * @author Rider Zhou
     * @version v1.0.0 2020/12/1 18:51
     * @return
     **/
    public void  setName(String name){
        this.name = name;
    }
}
