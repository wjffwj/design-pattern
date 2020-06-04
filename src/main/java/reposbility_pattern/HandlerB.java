package reposbility_pattern;
//具体处理者B
public class HandlerB extends Handler {
    @Override
    public boolean handleRequest(String request) {
        if ("b".equals(request)) {
            System.out.println("Handler B将请求处理完成...");
            return true;
        } else if (getNext() != null) {
            return getNext().handleRequest(request);
        }

        return false;
    }
}
