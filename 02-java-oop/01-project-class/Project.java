import java.util.HashMap;

public class Project {
    private String name;
    private String description;
    private Double initialCost;

    public Project(){
    }

    public Project (String name, String description){
        this.name = name;
        this.description = description; 
    }

    public Project (String name){
        this.name = name;
    }

    public void elevatorPitch(){
        HashMap<String, String> pitch = new HashMap<String,String>();
        pitch.put(this.name + "(" + this.initialCost +")", this.description);
        System.out.println(this.name + "(" + this.initialCost +")" + ": " + this.description);
    }

    //getter
    public String getProjectName(){
        return name;
    }
    public String getProjectDescription(){
        return description;
    }
    public Double getInitialCost(){
        return initialCost;
    }

    //setter
    public void setProjectdescription(String description){
        this.description = description;
    }
    public void setProjectName(String name){
        this.name = name;
    }
    public void setInitialCost(Double initialCost){
        this.initialCost = initialCost;
    }



}
