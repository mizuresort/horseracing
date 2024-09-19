import java.util.*;
public class Hukusyou extends Bet {
    Scanner sc=new Scanner(System.in);
    public Hukusyou(int[] selectedHorses,double betAmount){
        super(selectedHorses, betAmount);
    }
    @Override
    public String purchace(int[] selectedHorses,double betAmount){
        System.out.println("購入する馬の番号を入力してください。");
        int number=sc.nextInt();//馬番を入力
        return("あなたは"+selectedHorses[number]+"番の複勝"+betAmount+"円購入しました。");
       
    }
}
