package Prac_1;
//above line not working on vscode !

class FirstProgram{
    String name,uniName,brnchName;
    int rollNo;

    void set()
        {
            name = "Arpit Pathak";
            uniName = "Graphic Era Hill University";
            brnchName = "Btech - CSE";
            rollNo = 12;
        }
    void show()
        {
            System.out.println("Name of the Student is "+name+" having roll number "+rollNo);
            System.out.println("He is currently persuing "+brnchName+" at "+uniName);
        }
    public static void main(String args[])
        {
            FirstProgram obj = new FirstProgram();
            obj.set();
            obj.show();
        }
}