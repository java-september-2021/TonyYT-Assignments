public class ProjectTest {
    public static void main(String[] args) {
        Project tester1 = new Project();
        Project tester2 = new Project("Project 2");
        Project tester3 = new Project("Project 3", "This is the description");
        System.out.println(tester1.getProjectName());
        System.out.println(tester2.getProjectName());
        System.out.println(tester3.getProjectName());

        tester2.setProjectdescription("This is the Description of Project 2");
        System.out.println(tester2.getProjectDescription());
        
        tester3.setInitialCost(5000.0);
        tester3.elevatorPitch();
    }
}
