package School_mgt_System;
/*
this class is responsible for keeping the
track of students fees name grade
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feePaid;
    private int feeTotal;

    public Student(int id,String name,int grade, int feePaid,int feeTotal){
        this.id=id;
        this.name= name;
        this.grade=grade;
        this.feePaid=0;
        this.feeTotal = 500000;
    }
    // not going to alter student's name ,student's id

    public void setGrade(int grade){
        this.grade=grade;
    }


    /** the school is going to receive the funds
     * add the fees to the fees paid
     * keep adding the fee to feePaid field
     */
    public void payFee(int fee){
        feePaid +=fee;
        School.updateTotalMoneyEarned(feePaid);


    }


    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }
    public int getFeePaid(){
        return feePaid;
    }
    public int getFeeTotal(){
        return feeTotal;
    }


    public int getRemainingFee(){
        return feeTotal-feePaid;
    }


    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object.
     * @apiNote In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * The string output is not necessarily stable over time or across
     * JVM invocations.
     * @implSpec The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     */
    @Override
    public String toString() {
        return id +" "+ " "+name + " "+ feePaid+" "+feeTotal+" "+grade;
    }

    public void add(Student student) {
    }
}















