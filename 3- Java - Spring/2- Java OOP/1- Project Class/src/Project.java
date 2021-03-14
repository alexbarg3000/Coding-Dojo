public class Project {
    private String name;
    private String description;
    private double initialCost;
    private float cost;


    // Here are four different ways to overload the constructor method
    // The first just creates the project but does not define name or description
    public Project() {}

    // The second creates the project, taking in the name as a string, to set the name
    public Project(String name) {
        this.name = name;
    }

    // The third creates the project, taking in the name and description, and setting both
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }
    // The fourth creates the project, taking in name, description, and initial cost and setting them
    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
        this.cost = (float) initialCost;
    }

    // Below three pairings are getter and setter methods for
    // the project name:
    public String getProjectName() {
        return this.name;
    }
    public String setProjectName(String name) {
        return this.name = name;
    }
    //the project description:
    public String getProjectDescription() {
        return this.description;
    }
    public String setProjectDescription(String description) {
        return this.description = description;
    }
    //and the project cost:
    public float getProjectCost() {
        return this.cost;
    }
    public float setProjectCost(float cost) {
        return this.cost = cost;
    }

    // This method brings all three attributes and spits out an elevator pitch:
    public String elevatorPitch() {
        return this.name + " ($" + this.cost + "): " + this.description;
    }

}