package reposbility_pattern;

public class Client {
    public static void main(String[] args) {
        //组装责任链
        Handler a= new HandlerA();
        Handler b = new HandlerB();
        a.setNext(b);
        a.handleRequest("b");

    }
}
