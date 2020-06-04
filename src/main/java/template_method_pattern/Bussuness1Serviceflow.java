package template_method_pattern;
//step2子类中无需关注具体实现步骤只需关注需要完成哪些功能的具体实现
public class Bussuness1Serviceflow extends TemplateServiceflow {
    @Override
    protected void beforeTran() {
        System.out.println("初始化对象1");
    }

    @Override
    protected void tran() {
        System.out.println("执行交易1");
    }

    @Override
    protected void afterTran() {
        System.out.println("交易完成记录1");
    }

    @Override
    protected void makeRetPackage() {
        System.out.println("封装返回包1");
    }
}
