
package worker;


public class WorkerTester {


    public static void main(String[] args) {
        HourWorker b = new HourWorker("mario",120,20);
        System.out.print("Code of "+b.getName()+" "+b.getClass().getSimpleName()+" is ");
        System.out.println(b.code());
  
        SalaryWorker c = new SalaryWorker("mario",200,50);
        System.out.print("Code of "+c.getName()+" "+c.getClass().getSimpleName()+" is ");
        System.out.println(c.code());
        
        SaleWorker d = new SaleWorker("mario",120,30000);
        System.out.print("Code of "+d.getName()+" "+d.getClass().getSimpleName()+" is ");
        System.out.println(d.code());

//        System.out.println("Normal "+worker[1].getName()+" is "+worker[1].getClass().getSimpleName()+" salary is "+worker[1].weeklyPay(40));
//        System.out.println("Diligent "+worker[1].getName()+" is "+worker[1].getClass().getSimpleName()+" salary is "+worker[1].weeklyPay(45));
//        System.out.println();
//        
//        worker[2] = new HourWorkerSpecial("pitchayes", 500, 500, 3);
//        System.out.println("Normal 3 years of "+worker[2].getName()+" is "+worker[2].getClass().getSimpleName()+" salary is "+worker[2].weeklyPay(40));
//        System.out.println("Diligent 3 years of "+worker[2].getName()+" is "+worker[2].getClass().getSimpleName()+" salary is "+worker[2].weeklyPay(45));
//        System.out.println();
//        
//        worker[3] = new HourWorkerSpecial("kantapong", 500, 500,5);
//        System.out.println("Normal 5 years of "+worker[3].getName()+" is "+worker[3].getClass().getSimpleName()+" salary is "+worker[3].weeklyPay(40));
//        System.out.println("Diligent 5 years of "+worker[3].getName()+" is "+worker[3].getClass().getSimpleName()+" salary is "+worker[3].weeklyPay(45));
//        System.out.println();
//        
//        worker[4] = new HourWorkerSpecial("teeratat", 500, 500,8);
//        System.out.println("Normal 8 years of "+worker[4].getName()+" is "+worker[4].getClass().getSimpleName()+" salary is "+worker[4].weeklyPay(40));
//        System.out.println("Diligent 8 years of "+worker[4].getName()+" is "+worker[4].getClass().getSimpleName()+" salary is "+worker[4].weeklyPay(45));
//        System.out.println();
//        
//        worker[5] = new SalaryWorker("nutthapan", 600, 500);
//        System.out.println("Lazy "+worker[5].getName()+" is "+worker[5].getClass().getSimpleName()+" salary is "+worker[5].weeklyPay(35));
//        System.out.println("Normal "+worker[5].getName()+" is "+worker[5].getClass().getSimpleName()+" salary is "+worker[5].weeklyPay(40));
//        System.out.println("Diligent "+worker[5].getName()+" is "+worker[5].getClass().getSimpleName()+" salary is "+worker[5].weeklyPay(45));
//        System.out.println();
//        
//        worker[6] = new SalaryWorkerManager("apisit", 700, 500, true);
//        System.out.println("Lazy and Master degree "+worker[6].getName()+" is "+worker[6].getClass().getSimpleName()+" salary is "+worker[6].weeklyPay(35));
//        System.out.println("Normal and Master degree "+worker[6].getName()+" is "+worker[6].getClass().getSimpleName()+" salary is "+worker[6].weeklyPay(40));
//        System.out.println("Diligent and Master degree "+worker[6].getName()+" is "+worker[6].getClass().getSimpleName()+" salary is "+worker[6].weeklyPay(45));
//        System.out.println();
//        
//        worker[7] = new SalaryWorkerManager("taksin", 700, 500, false);
//        System.out.println("Lazy "+worker[7].getName()+" is "+worker[7].getClass().getSimpleName()+" salary is "+worker[7].weeklyPay(35));
//        System.out.println("Normal "+worker[7].getName()+" is "+worker[7].getClass().getSimpleName()+" salary is "+worker[7].weeklyPay(40));
//        System.out.println("Diligent "+worker[7].getName()+" is "+worker[7].getClass().getSimpleName()+" salary is "+worker[7].weeklyPay(45));
//        System.out.println();
//        
//        worker[8] = new SaleWorker("phatcharat", 800, 1000);
//        System.out.println("Inactive "+worker[8].getName()+" is "+worker[8].getClass().getSimpleName()+" salary is "+worker[8].weeklyPay(10));
//        System.out.println("Normal "+worker[8].getName()+" is "+worker[8].getClass().getSimpleName()+" salary is "+worker[8].weeklyPay(1000));
//        System.out.println("Active "+worker[8].getName()+" is "+worker[8].getClass().getSimpleName()+" salary is "+worker[8].weeklyPay(5000));
//        System.out.println();
//        
//        worker[9] = new SaleWorkerManager("nutthachai", 1000, 2000);
//        SaleWorkerManager workercasting = (SaleWorkerManager)worker[9];  // down-casting
//        System.out.println("Inactive "+workercasting.getName()+" is "+workercasting.getClass().getSimpleName()+" salary is "+workercasting.weeklyPay(1000,0));
//        System.out.println("Normal "+workercasting.getName()+" is "+workercasting.getClass().getSimpleName()+" salary is "+workercasting.weeklyPay(2000,0));
//        System.out.println("Active "+workercasting.getName()+" is "+workercasting.getClass().getSimpleName()+" salary is "+workercasting.weeklyPay(5000,0));
//        System.out.println();
//        
//        worker[10] = new SaleWorkerManager("prayuth", 1000, 2000);
//        SaleWorkerManager workercasting2 = (SaleWorkerManager)worker[10];
//        System.out.println("Inactive with special sale of "+workercasting2.getName()+" is "+workercasting2.getClass().getSimpleName()+" salary is "+workercasting2.weeklyPay(1000,1));
//        System.out.println("Normal with special sale of "+workercasting2.getName()+" is "+workercasting2.getClass().getSimpleName()+" salary is "+workercasting2.weeklyPay(2000,1));
//        System.out.println("Active with special sale of "+workercasting2.getName()+" is "+workercasting2.getClass().getSimpleName()+" salary is "+workercasting2.weeklyPay(5000,1));
    }
}
