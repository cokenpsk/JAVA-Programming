
package javaapplication1;

public class AirTicket {
    public final int ROW = 7;
    public final int COL = 4; 
    private int available = 28; 
    private String[][] seat = new String[ROW][COL]; 

    public AirTicket() 
    {
        setSeat();
    }
    
    public void setSeat(){
        for (int i = 0; i < ROW; i++) {
            seat[i][0]="a";
            seat[i][1]="b";
            seat[i][2]="c";
            seat[i][3]="d";
        }
       
    }
    public int colNo(char a){
        if(a=='a')
            return 0;
        else if(a=='b')
            return 1;
        else if(a=='c')
            return 2;
        else if(a=='d')
            return 3;
        else
            return -1;
    }
    public boolean bookSeat(String seatNo){
        int rown = Integer.parseInt(seatNo.charAt(0)+"")-1;
        int coln = colNo(seatNo.charAt(1));
        if(coln==-1&&rown>-1&&rown<7){
            System.out.println("Please enter a valid seat: ");
            return false;
        }
        if(!seat[rown][coln].equals("x")){
            seat[rown][coln]="x";
            available--;
            System.out.println("You have successfully booked a seat");
            return true;
        }else
        {
            System.out.println("Sorry that seat is full. Please try again.");
            System.out.println("Please select a seat:");
            return false;
        }
    }
    public void showSeat() {
        int i=0;
        for(i=0;i<ROW;i++){
            System.out.println((i+1)+"\t"+seat[i][0]+"\t"+seat[i][1]+"\t"+seat[i][2]+"\t"+seat[i][3]);
        }
     System.out.println("["+ available+"]"+"available");
    }
}
