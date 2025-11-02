package School_mgt_System;

public class Teacher {

    private  int Id;
    private  String Name;
    private  String Qualification;
    private int Salary;
    private int salaryEarned;

    public Teacher(int id,String name, int Salary){
        this.Id =Id;
        this.Name = Name;
        this.Salary =Salary;
        this.salaryEarned = 0;
        this.Qualification = Qualification;
    }
    public int getId() {

        return Id;
    }
    public  String getName(){

        return Name;
    }
    public String getQualification(){

        return Qualification;
    }
    public int getSalary(){

        return Salary;
    }

    public void setSalary(int salary){
        this.Salary = Salary;
    }
    public void setQualification(){
        this.Qualification = Qualification;
    }
    public void receiveSalary(int salary){
        salaryEarned +=Salary;
        School.updateTotalMoneySpent(salary);
    }

    public void add(Teacher teacher) {
    }
    @Override
    public String toString() {
        return ".. " + salaryEarned + ".." + Name + ".."+Qualification;
    }
}

















