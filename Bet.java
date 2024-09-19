import java.util.*;
public abstract class Bet {//馬券クラス
    private int[] selectedHorses;//選んだ馬の番号
    private double betAmount;//購入した金額
    Scanner sc=new Scanner(System.in);
    //constructor
    public Bet(int[] selectedHorses,double betAmount){
        this.selectedHorses=selectedHorses;
        this.betAmount=betAmount;
    }

    public int[] getSelectedHorses(){
        return selectedHorses;
    }
    public double getBetAmount(){
        return betAmount;
    }

    public void setBetAmount(){
        this.betAmount=betAmount;
    }

    public void setSelectedHorses(){
        this.selectedHorses=selectedHorses;
    }
    public String purchace(int[] selectedHorses,double betAmount){
       
        System.out.println("金額を入力してください。");
        betAmount=sc.nextDouble();
        return(betAmount+"円");
    }
   //public abstract double calculatePayoff(double[] odds);
}
