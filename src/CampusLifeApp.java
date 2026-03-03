import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CampusLifeApp {
    public static void main(String[] args) {

       /* Course oop = new Course("OOP", "Dr. Lee", 6);
        Course discrete = new Course("Discrete Math", "Dr. Smith", 5);
        Course english = new Course("English", "Prof. Brown", 3);

        List<Course> courses = Arrays.asList(oop, discrete, english);

        List<AssignmentTask> tasks = new ArrayList<>();
        tasks.add(new AssignmentTask("Lab 2", oop, 3, 1));
        tasks.add(new AssignmentTask("Project Proposal", oop, 5, 5));
        tasks.add(new AssignmentTask("Homework 4", discrete, 4, 2));
        tasks.add(new AssignmentTask("Essay Draft", english, 2, 0));
        tasks.add(new AssignmentTask("Reading Notes", english, 1, 4));

        List<StudySession> sessions = new ArrayList<>();
        sessions.add(new StudySession(oop, 90));
        sessions.add(new StudySession(discrete, 120));
        sessions.add(new StudySession(oop, 60));
        sessions.add(new StudySession(english, 45));

        System.out.println("=== COURSES ===");
        for (Course c : courses) {
            System.out.println(c);
        }

        System.out.println("\n=== ASSIGNMENTS ===");
        for (AssignmentTask task : tasks) {
            if (task.isUrgent()) {
                System.out.println(task + "  <-- URGENT!");
            } else {
                System.out.println(task);
            }
        }

        int totalRemaining = 0;
        for (AssignmentTask task : tasks) {
            if (!task.isCompleted()) {
                totalRemaining += task.getEstimatedHours();
            }
        }
        System.out.println("\nTotal estimated hours remaining: " + totalRemaining);

        System.out.println("\n=== STUDY TIME PER COURSE ===");
        for (Course c : courses) {
            double totalHours = 0;
            for (StudySession s : sessions) {
                if (s.getCourse() == c) {
                    totalHours += s.hours();
                }
            }
            System.out.println(c.getName() + ": " + totalHours + " hours");
        }

        AssignmentTask completedTask = tasks.get(0);
        completedTask.markCompleted();

        System.out.println("\nMarked as completed:");
        System.out.println(completedTask);

        totalRemaining = 0;
        for (AssignmentTask task : tasks) {
            if (!task.isCompleted()) {
                totalRemaining += task.getEstimatedHours();
            }
        }
        System.out.println("New total estimated hours remaining: " + totalRemaining);*/

        Course oop = new Course("OOP", "Dr. Lee", 6);
        Course discrete = new Course("Discrete Math", "Dr. Smith", 5);

        List<PlanItem> planItems = new ArrayList<>();

        planItems.add(new Assignment("Lab 4", oop, 3, 1));
        planItems.add(new Assignment("Homework 6", discrete, 4, 4));
        planItems.add(new ExamPreparation("OOP Midterm Study", oop, 6, 2));
        planItems.add(new ClubEvent("Robotics Club Meeting", "Robotics Club", 2, 0));

        System.out.println("=== ALL PLAN ITEMS ===");

        for (PlanItem item : planItems) {
            if (item.isUrgent()) {
                System.out.println(item + "  <-- URGENT");
            } else {
                System.out.println(item);
            }
        }

        int totalRemainingHours = 0;

        for (PlanItem item : planItems) {
            if (!item.isCompleted()) {
                totalRemainingHours += item.getEstimatedHours();
            }
        }

        System.out.println("\nTotal remaining hours: " + totalRemainingHours);

        PlanItem mostUrgent = null;

        for (PlanItem item : planItems) {
            if (!item.isCompleted()) {
                if (mostUrgent == null ||
                        item.getDaysUntil() < mostUrgent.getDaysUntil()) {
                    mostUrgent = item;
                }
            }
        }

        System.out.println("\nMost urgent activity:");
        System.out.println(mostUrgent);

        PlanItem completedItem = planItems.get(0);
        completedItem.markCompleted();

        System.out.println("\nMarked as completed:");
        System.out.println(completedItem);

        System.out.println("\n=== UPDATED PLAN ITEMS ===");

        for (PlanItem item : planItems) {
            if (item.isUrgent()) {
                System.out.println(item + "  <-- URGENT");
            } else {
                System.out.println(item);
            }
        }

        totalRemainingHours = 0;

        for (PlanItem item : planItems) {
            if (!item.isCompleted()) {
                totalRemainingHours += item.getEstimatedHours();
            }
        }

        System.out.println("\nUpdated total remaining hours: " + totalRemainingHours);
    }
}
