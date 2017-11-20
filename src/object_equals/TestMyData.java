package object_equals;

/**
 * Created by $zhanyan on 2017/11/8.
 */
class TestMyDate {
    public static void main(String[] args) {

    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        MyDate myDate = (MyDate) o;

        if (day != myDate.day) return false;
        if (month != myDate.month) return false;
        return year == myDate.year;
    }


}
