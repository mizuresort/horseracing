import java.util.*;
public class Tansyou extends Bet {
    Scanner sc=new Scanner(System.in);
    
    public Tansyou(int[] selectedHorses,double betAmount){
        super(selectedHorses,betAmount);
    }

    @Override
    public String purchace(int[] selectedHorses,double betAmount){
        System.out.println("購入する馬の番号を入力してください。");
        int number=sc.nextInt();//馬番を入力
        return("あなたは"+selectedHorses[number]+"番の単勝"+betAmount+"円購入しました。");
       
    }
}
   


    /*double calculatePayoff(double[] odds){
        System.out.println("単勝を選択しました。");
        System.out.println("投票する馬番号を選んでください。");
        int horse1=sc.nextInt();
        double payoff=odds[horse1];
        return payoff;
    }*/

