package template_method_pattern;

public class TestMain {
    public static void main(String[] args) {
        TemplateServiceflow flow = new Bussuness1Serviceflow();
        TemplateServiceflow flow1 = new Bussnuess2Serviceflow();
        flow.processService();
        flow1.processService();

    }
}
