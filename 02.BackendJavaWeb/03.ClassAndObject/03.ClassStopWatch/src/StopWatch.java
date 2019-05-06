import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return this.startTime = startTime;
    }

    public long getEndTime() {
        return this.endTime = endTime;
    }

//    public StopWatch() {
//
//        Date startTime = java.util.Calendar.getInstance().getTime();
//
//    }

    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
