import java.util.*;
public class Wide extends Bet {
    Scanner sc=new Scanner(System.in);
    public Wide(int[] selectedHorses,double betAmount){
        super(selectedHorses, betAmount);
    }
    @Override
    public String purchace(int[] selectedHorses,double betAmount){
        System.out.println("3着以内に入る馬を選択してください:1頭目 ");
        int number1=sc.nextInt();//馬番を入力
        System.out.println("3着以内に入る馬を選択してください:2頭目");
        int number2=sc.nextInt();
        return("あなたは"+selectedHorses[number1]+"番と"+selectedHorses[number2]+"番のワイドを"+betAmount+"円購入しました。");
        
       
    }
}


