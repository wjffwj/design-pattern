package template_method_pattern;

//step1.不变部分的算法封装到父类中实现
public abstract class TemplateServiceflow {

    //执行服务调用方法
    public final void processService() {
        beforeTran();
        tran();
        afterTran();
        makeRetPackage();
    }
    //模板方法交易前处理
    protected abstract void beforeTran() ;
    //交易具体处理
    protected abstract void tran() ;

    //交易完成后处理
    protected abstract void afterTran();
    //交易完成，返回打包
    protected abstract void makeRetPackage();
}
