public class TimeTest {
    
    // public은 하나만, 파일명으로

    public static void main(String[] args) {
        
        Time t = new Time(25, 60, 60);

        // Time t5 = new Time(24, 0, 0);
        // Time t6 = new Time(12, 60, 0);
        // Time t7 = new Time(12, 30, 60);
        // ^ 위에 값들은 정상적으로 저장되지 않음

        System.out.println(t);
        // t.hour = 13;

        t.setHour(t.getHour()+1);
        // 현재 시간보다 1시간 후로 변경

        System.out.println("한 시간 이후의 시간");
        System.out.println(t.toString());
        System.out.println(t);
        //System.out.println(t.toString()); 과 같음

        
    }
}


class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){

        setHour(hour);
        setMinute(minute);
        setSecond(second);

    }

    public int getHour(){
        return hour;
    }
    public void setHour(int hour){
        if(hour < 0 || hour > 23) return;
        this.hour = hour;
    }


    public int getMinute(){
        return minute;
    }
    public void setMinute(int minute){
        if(minute < 0 || minute > 59) return;
        this.minute = minute;
    }


    public int getSecond(){
        return second;
    }
    public void setSecond(int second){
        if(second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString(){
        return hour + ":" + minute + ":" + second;
    }
    
}
