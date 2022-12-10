package yan;

public abstract class Abs {
    private String name;

    public Abs(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("Tugas PBO"+this.name);
    }
}
