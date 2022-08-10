public class Exceptions1 extends Exception{

}
class Banker {
    public String makeReport(int typeOfReport) throws Exceptions1{
        if ((typeOfReport<1) || (typeOfReport>5)) throw new Exceptions1();
        return "Report " + typeOfReport;
    }
}
class BankManager {
    Banker b = new Banker();
    public String submitReport(int typeOfReport){
        String report = null;
        try {
            report = b.makeReport(typeOfReport);
        }
        catch (Exceptions1 e) {
            e.printStackTrace();
            System.out.println("Exception happened " + e.getMessage());
        }
        return report;
    }

}
class Main{
    public static void main(String[] args) {
        BankManager bm = new BankManager();
        System.out.println(bm.submitReport(7));
    }
}
