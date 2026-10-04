public class Gym {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       FITNESS PLANNER");
        System.out.println("=================================");

        Profile profile = new Profile();

        WeeklyWorkoutPlan weeklyPlan =
                new WeeklyWorkoutPlan(profile);

        weeklyPlan.displayWeeklyPlan();

        weeklyPlan.simulateWeek();
    }
}