public class ClubEvent extends PlanItem {

    private String clubName;

    public ClubEvent(String title, String clubName, int estimatedHours, int daysUntil) {
        super(title, estimatedHours, daysUntil);
        this.clubName = clubName;
    }

    @Override
    public boolean isUrgent() {
        return daysUntil == 0 && !completed;
    }

    @Override
    public String getCategory() {
        return "ClubEvent (" + clubName + ")";
    }
}