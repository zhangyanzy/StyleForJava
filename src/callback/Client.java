package callback;


/**
 * Created by $zhanyan on 2017/12/4.
 * 客户端
 */

public class Client {
    private Server mServer;



    public Client(Server server) {
        this.mServer = server;
    }
    public void sendMsg(final String msg){
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }
}

class Server{


}
