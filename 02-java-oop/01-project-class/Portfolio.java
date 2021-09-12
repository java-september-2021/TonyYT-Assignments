import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Project> projects;
    private Double initialCost;

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
        for (Project p : projects) {
            total += p.getInitialCost();
        }
        return total;
    }

    public void showPortfolio() {
        System.out.println("All projects in the portfolio:");
        for (Project p : projects) {
            p.elevatorPitch();
        }
        System.out.println(String.format("Total cost: %f", this.getPortfolioCost()));
    }
}
