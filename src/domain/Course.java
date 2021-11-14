package domain;

public class Course extends Content {
    private int workload;

    @Override
    public double calcXp() {
        return XP_STANDARD * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
