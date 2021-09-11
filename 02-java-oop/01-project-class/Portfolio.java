import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;

    public Portfolio() {
        this.projects = new ArrayList<Project>();
    }

    public void addToPortfolio(Project p) {
        projects.add(p);
    }

    public String getPortfolio() {
        return projects.toString();
    }

    public double getPortfolioCost() {
        double total = 0;
        for (project p : projects) {
            total = total + p.getInitialCost;
        }
        return total;
    }

    public void showPortfolio() {
        System.out.println("All projects in the portfolio:");
        for (project p : projects) {
            System.out.println(p.elevatorPitch());
        }
        System.out.println(String.format("Total cost: %f", this.getPortfolioCost()));
    }
}
