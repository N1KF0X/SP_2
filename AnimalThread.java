public class AnimalThread extends Thread{

    public AnimalThread(String name, int priority) {
        setName(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        int priority = getPriority();
        for (int i = 0; i < 1000; i+=100){
            System.out.printf(getName() + "прошёл(а) %d метров \n", i);
            if(getPriority()>6 && i == 500){
                setPriority(1);
            }
            if(getPriority()==1 && i == 800){
                setPriority(priority);
            }
        }
        System.out.println(getName() + " у финиша");
    }
}
