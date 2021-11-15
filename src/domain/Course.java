package domain;

public class Course extends Content {
    private int workload;

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", Workload=" + getWorkload() +
                '}';
    }

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
