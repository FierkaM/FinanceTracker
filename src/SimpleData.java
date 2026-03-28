public class SimpleData {
    private int day;
    private int month;
    private int year;

    public SimpleData(int day, int month, int year){
        if(day<=31&&day>0) {
            this.day = day;
        } else{
            System.out.println("Error in the day of the date");
            return;
        }
        if(month>0&&month<=12) {
            this.month = month;
        } else{
            System.out.println("Error in the month of the date");
            return;
        }
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    @Override
    public String toString(){
        return year+"-"+month+"-"+day;
    }
}
