package callback;

/**
 * Created by $zhanyan on 2017/12/4.
 */
public class Caller {
    private MyCallInterFace mMyCallInterFace;

    public Caller() {
    }

    public void setCallFunc(MyCallInterFace callInterFace) {
        this.mMyCallInterFace = callInterFace;

    }

    public void call() {
        mMyCallInterFace.printName();
    }
}

interface MyCallInterFace {
    void printName();

}
class Demo implements MyCallInterFace{
    public static void main(String[] args){

    }

    @Override
    public void printName() {

    }
}

