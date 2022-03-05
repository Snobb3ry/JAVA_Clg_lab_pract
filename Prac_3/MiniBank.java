package Prac_3;
//above line not working on vscode !

class MiniBank{
    String AccHldrName;
    int AccNo;
    int Amnt;

    void insert(String acc_name, int acc_no, int amnt) {
        AccHldrName = acc_name;
        AccNo = acc_no;
        Amnt = amnt;
    }
    
    void deposit(int dep) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("Account Number : " + AccNo + "\tAccount Holder Name : " + AccHldrName);
        System.out.println("");
        System.out.println("");
        Amnt += dep;
        System.out.println("The amount of $" + dep + " is deposited in your account successfully !");
        System.out.println("");
        System.out.println("");
        System.out.println("Your Avialable balance is $" + Amnt);
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    void withrawl(int with) {
        System.out.println("Account Number : " + AccNo + "\tAccount Holder Name : " + AccHldrName);
        System.out.println("");
        System.out.println("");
        if (with <= Amnt) {
            System.out.println("The amount of $" + with + " has been withdrawl from your account successfully !");
            Amnt -= with;
        } else {
            System.out.println("You do not have sufficient balance to withdraw !");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Your Avialable balance is $" + Amnt);
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    void check_balance() {
        System.out.println("Account Number : " + AccNo + "\tAccount Holder Name : " + AccHldrName);
        System.out.println("");
        System.out.println("");
        System.out.println("Your Avialable balance is $" + Amnt);
        System.out.println("-------------------------------------------------------------------------------------------");
    }

    public static void main(String arg[]) {
        MiniBank obj = new MiniBank();
        int acc_no = Integer.parseInt(arg[1]);
        int amnt = Integer.parseInt(arg[2]);
        obj.insert(arg[0], acc_no, amnt);
        int dep = Integer.parseInt(arg[3]);
        obj.deposit(dep);
        int with1 = Integer.parseInt(arg[4]);
        obj.withrawl(with1);
        int with2 = Integer.parseInt(arg[5]);
        obj.withrawl(with2);
        obj.check_balance();
    }
}
