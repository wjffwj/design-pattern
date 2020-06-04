package reposbility_pattern;

//抽象的处理者
public abstract class Handler {
    private Handler next;//指向下一个处理者
    //获取下一个处理者
    public Handler getNext() {
        return next;
    }
    //设置下一个处理者
    public void setNext(Handler next) {
        this.next = next;
    }
    //钩子方法由子类负责具体实现
    public abstract boolean handleRequest(String request);
}
