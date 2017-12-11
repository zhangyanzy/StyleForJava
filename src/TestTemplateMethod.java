/**
 * Created by $zhanyan on 2017/11/29.
 */
public class TestTemplateMethod {
    public static void main(String[] args) {
        new SubTemplate().spendTime();

    }

}

abstract class Template {
    public abstract void code();

    public void spendTime() {
        long start = System.currentTimeMillis();

        code();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class SubTemplate extends Template {

    @Override
    public void code() {
        boolean flag = false;
    }
}
