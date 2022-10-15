package review1;

public class Clock {
    int hour;
    int minutes;
    int seconds;

    Clock() {
        this.hour = 12;
        this.minutes = 0;
        this.seconds = 0;
        System.out.println(hour+":"+minutes+":"+seconds);
    }
    Clock(int hour,int minutes,int seconds){
        this.hour=hour;
        this.minutes=minutes;
        this.seconds=seconds;
        if(hour>12){
            this.hour-=12;
        }
        if(minutes>59){
            this.minutes-=59;
            this.hour+=1;
        }
        if(seconds>59){
            this.seconds-=59;
            this.minutes+=1;
        }
        System.out.println(this.hour+":"+this.minutes+":"+this.seconds);
    }
    Clock(int seconds){
        this.seconds=seconds;
        if(seconds>59){
            this.seconds-=59;
            this.minutes+=1;
        }
        if(minutes>59){
            this.minutes-=59;
            this.hour+=1;
        }
        if(hour>12){
            this.hour-=12;
        }
        System.out.println(this.hour+":"+this.minutes+":"+this.seconds);
    }


}
class ClockTester{
    public static void main(String[] args) {
        Clock clock=new Clock(42,73,120);
    }
}
