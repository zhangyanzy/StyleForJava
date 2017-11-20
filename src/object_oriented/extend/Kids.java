package object_oriented.extend;

/**
 * Created by $zhanyan on 2017/11/2.
 */
public class Kids extends ManKind {

    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println(yearsOld);
    }

    public static void main(String[] args) {
        Kids somekid = new Kids(7);
        somekid.manOrWoman(0);
        somekid.getYearsOld();
        somekid.printAge();
    }
}
