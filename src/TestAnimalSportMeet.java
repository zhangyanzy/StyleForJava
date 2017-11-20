/**
 * Created by $zhanyan on 2017/11/1.
 */
public class TestAnimalSportMeet {
    public static void main(String[] args) {
        Cat cat = new Cat("咪咪");
        System.out.println(cat.shout());
    }

}

class Cat {
    private String name;
    private int shoutNum;

    public Cat() {
//        this.name = "咪咪";
    }

    Cat(String name) {
        this.name = name;
    }

    public void setShoutNum(int num) {
        this.shoutNum = num;
    }

    public int getShoutNum() {
        return shoutNum;
    }


    String shout() {
//        this.name = name;
        return "我的名字叫" + name + "," + "喵";
    }
}
