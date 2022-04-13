package base;

public class Plant {
    boolean needsWatering;
    String plantFamily;
    String name;


    public Plant(boolean needsWatering, String plantFamily, String name){
        this.needsWatering = true;
        this.plantFamily = plantFamily;
        this.name = name;
        wateringInstructions();
        sunlightRequirements();
    }

    public void wateringInstructions(){
        if (plantFamily.equals("Legume")){
            System.out.println("Drown me in water daily.");
        }
        else if (plantFamily.equals("Grass")){
            System.out.println("Water me until my soil can't absorb no more. But don't over do it!");
        }
        else if (plantFamily.equals("Lily")){
            System.out.println("Just keep my soil moist.");
        }
        else if (plantFamily.equals("Composite")){
            System.out.println("Water me daily, but I can survive drought in case you forget.");
        }
        
        else if (plantFamily.equals("Gourd")){
            System.out.println("Water me heavily in the summer, but leave me be once I mature on my vines.");
        }
        else{
            System.out.println("Drown my soil, then drain. Keeping me moist is essential.");
        }    
    }

    public void sunlightRequirements(){
        if (plantFamily.equals("Nightshade")){
            System.out.println("Partial-shade will do, but would love full sun so I can continue to bloom at night.");
        }
        else{
            System.out.println("Full sun only!");
        }    
    }
    
}
