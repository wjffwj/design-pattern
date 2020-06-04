package template_method_pattern;

public class Bussnuess2Serviceflow extends TemplateServiceflow {
    @Override
    protected void beforeTran() {
        System.out.println("初始化对象2");
    }

    @Override
    protected void tran() {
        System.out.println("执行交易2");
    }

    @Override
    protected void afterTran() {
        System.out.println("交易处理完成2");
    }

    @Override
    protected void makeRetPackage() {
        System.out.println("交易2做返回包2");
    }
}
