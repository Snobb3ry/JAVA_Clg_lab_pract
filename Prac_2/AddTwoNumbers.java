package Prac_2;
//above line not working on vscode !

class Add
{
    // Enter the values in command line
    public static void main(String arg[])
    {
        int num1 = Integer.parseInt(arg[0]);
        int num2 = Integer.parseInt(arg[1]);

        int sum =0;
        sum = num1+num2;

        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);

    }
}