import java.util.Date;
import java.util.Timer;
public class Stopwatch_9_6 {
    public static void main(String[] args) {
        StopWatch a = new StopWatch();
        long x = 0;
        for(int i = 0; i < 1000;++ i){
            for(int j = 0;j < 1000;++ j){
                x ++;
            }
        }
        a.stop();
        System.out.println(a.getElapsedTime()+"ms");
    }
}
class StopWatch{
    private Date startTime;
    private Date endTime;
    public StopWatch(){
        startTime = new Date();
    }
    public void start(){
        startTime = new Date();
    }
    public void stop(){
        endTime = new Date();
    }
    public long getElapsedTime(){
        return endTime.getTime() - startTime.getTime();
    }
}
