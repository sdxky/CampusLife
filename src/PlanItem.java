public abstract class PlanItem {

    protected String title;
    protected int estimatedHours;
    protected int daysUntil;
    protected boolean completed;

    public PlanItem(String title, int estimatedHours, int daysUntil) {
        this.title = title;
        this.estimatedHours = estimatedHours;
        this.daysUntil = daysUntil;
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public int getEstimatedHours() {
        return estimatedHours;
    }

    public int getDaysUntil() {
        return daysUntil;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    public abstract boolean isUrgent();

    public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() +
                "{title='" + title +
                "', estHours=" + estimatedHours +
                ", dueIn=" + daysUntil +
                ", completed=" + completed + "}";
    }
}