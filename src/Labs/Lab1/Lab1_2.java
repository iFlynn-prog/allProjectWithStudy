package Labs.Lab1;

public class Lab1_2 {

    public static void main(String[] args) {
        int year=2013;
        int dayNum =304;
        int [] daysInMonths={31,28,31,30,31,30,31,31,30,31,30,31};
        String []months={"январь","февраль","март","апрель","май","июнь","июль","август","сентябрь","октябрь","ноябрь","декабрь"};

        int monthNum=0;
        boolean isLeapYear=(year%4==0)&& (year%100!=0 || year%400==0);

        for(int days : daysInMonths){
            if (isLeapYear && days==28) ++days;
            if (dayNum<=days) break;

            dayNum -=   days;
            monthNum++;
        }
        System.out.printf("%d %s \n", dayNum, months[monthNum]);
    }
}
