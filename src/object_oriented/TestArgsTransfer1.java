package object_oriented;

/**
 * Created by $zhanyan on 2017/10/31.
 */
public class TestArgsTransfer1 {

    private void swap(DataSwap d) {
        int temp = d.i;
        d.i = d.j;
        d.j = temp;
    }

    public static void main(String[] args) {
        TestArgsTransfer1 tt = new TestArgsTransfer1();
        DataSwap ds = new DataSwap();
        System.out.println("ds.i: " + ds.i + "、" + "ds.j:" + ds.j);

        tt.swap(ds);
        System.out.println("ds.i: " + ds.i + "、" + "ds.j:" + ds.j);
    }
}

class DataSwap {
    int i = 10;
    int j = 5;
}
