package pl.sda.structure.tasks.model;

public enum TaskPriority {
    LOW(1), MEDIUM(2), HIGH(3);

    private int level;

    TaskPriority(int level){
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

}
