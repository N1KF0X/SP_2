public class RabbitAndTurtle {
    String name1;
    String name2;
    int priority;
    public RabbitAndTurtle(String name1, String name2, int priority){
        this.name1 = name1;
        this.name2 = name2;
        this.priority = priority;
    }
    public void start(){
        AnimalThread turtle = new AnimalThread(name1,3);
        AnimalThread rabbit = new AnimalThread(name2,priority);
        turtle.start();
        rabbit.start();
    }
}
