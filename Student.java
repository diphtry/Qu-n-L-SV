package main;

public class Student implements IStudent {
    private String FullName;
    private int ID;
    private String DayBirth;
    private String Native;
    private String aClass;
    private int Mobile;

    public Student() {
    }

    public Student(String FullName, int ID, String DayBirth, String Native, String aClass, int Mobile) {
        this.FullName = FullName;
        this.ID = ID;
        this.DayBirth = DayBirth;
        this.Native = Native;
        this.aClass = aClass;
        this.Mobile = Mobile;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDayBirth() {
        return DayBirth;
    }

    public void setDayBirth(String dayBirth) {
        DayBirth = dayBirth;
    }

    public String getNative() {
        return Native;
    }

    public void setNative(String Native) {
        this.Native = Native;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public int getMobile() {
        return Mobile;
    }

    public void setMobile(int mobile) {
        Mobile = mobile;
    }

    @Override
    public void Display() {
        System.out.println("Full Name: " + FullName);
        System.out.println("ID: " + ID);
        System.out.println("DateofBirth: " + DayBirth);
        System.out.println("Native: " + Native);
        System.out.println("Class: " + aClass);
        System.out.println("Mobile: " + Mobile);
    }
}

