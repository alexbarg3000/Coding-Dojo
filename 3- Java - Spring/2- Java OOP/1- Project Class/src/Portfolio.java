
import java.util.*;

public class Portfolio {
    private ArrayList<Project> projects = new ArrayList<>();
    // Each portfolio will have this attribute: an array list filled with
    // projects for the portfolio

    public Portfolio() {
    }

    ;

    // Adds a project to the projects array list in the Portfolio:
    public void addProject(Project project) {
        this.projects.add(project);
    }


    // Gets all the projects, just as the method name suggests:
    public ArrayList<Project> getProjects() {
        return this.projects;
    }

    // Returns the portfolio's total cost by running through the
    // projects array and adding each project's cost (which we obtain
    // by running the getProjectCost() method on each project) to the sum
    public float getPortfolioCost() {
        float sum = 0.0f;
        for (int i = 0; i < this.projects.size(); i++) {
            sum += this.projects.get(i).getProjectCost();
        }
        return sum;
    }

    // Prints each project's elevator pitch and then the portfolio's total cost:
    public void showPortfolio() {
        System.out.println("PORTFOLIO CONTENTS");
        for (int i = 0; i < this.projects.size(); i++) {
            System.out.println(this.projects.get(i).elevatorPitch());
        }
        System.out.println("Total Portfolio Cost: $" + this.getPortfolioCost());
    }
}