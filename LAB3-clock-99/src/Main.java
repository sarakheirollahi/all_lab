import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    int second =  now.getSecond();
    int minute = now.getMinute();
    int hour = now.getHour();
    ClockDisplay myClock = new ClockDisplay(hour,minute,second);
        myClock.setTime(8,45,8);
        myClock.timeTick();
        myClock.print();
        myClock.timeTick();
        myClock.print();}

}
