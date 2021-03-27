package fun;

public class School {
    private   IHumanBeing teacher;
    private IHumanBeing   student;

    public School(IHumanBeing tch, IHumanBeing std){
        this.teacher = tch;
        this.student = std;
    }
    protected void lunchTime(){
        this.teacher.eat("eba", "90");
    }
}
