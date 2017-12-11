/**
 * Created by $zhanyan on 2017/12/4.
 */
public class TestProduct {
    public static void main(String[] args) {
        TestProduct t = new TestProduct();
        NoteBook n = new NoteBook();
        t.show(n);
        t.show(new Product() {
            @Override
            public void getName() {

            }

            @Override
            public void getPrice() {

            }
        });

    }

    public void show(Product P) {
        P.getName();
        P.getPrice();
    }
}

interface Product {

    void getName();

    void getPrice();

}

class NoteBook implements Product {

    @Override
    public void getName() {
        System.out.println("HP笔记本");
    }

    @Override
    public void getPrice() {
        System.out.println("5000");
    }
}
