import java.util.*;
public class Umatan extends Bet{
    Scanner sc=new Scanner(System.in);
    public Umatan(int[] selectedHorses,double betAmount){
        super(selectedHorses, betAmount);
    }
    @Override
    public String purchace(int[] selectedHorses,double betAmount){
        System.out.println("1着馬を選択してください");
        int number1=sc.nextInt();//馬番を入力
        System.out.println("2着馬を選択してください");
        int number2=sc.nextInt();
        return("あなたは"+selectedHorses[number1]+"番と"+selectedHorses[number2]+"番の馬単を"+betAmount+"円購入しました。");
}
}