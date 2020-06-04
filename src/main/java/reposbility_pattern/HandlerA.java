package reposbility_pattern;

//具体处理者A
public class HandlerA extends Handler {
    @Override
    public boolean handleRequest(String request) {
        if("A".equals(request)) {
            System.out.println("HandlerA已经处理完成");
            return true ;
        }else if(getNext()!=null){
           return  getNext().handleRequest(request);
        }else{
            return false;
        }
    }
}
