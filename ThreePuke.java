import java.util.*;
public class ThreePuke extends Bet{
    Scanner sc=new Scanner(System.in);
    public ThreePuke(int[] selectedHorses,double betAmount){
        super(selectedHorses, betAmount);
    }
    @Override
    public String purchace(int[] selectedHorses,double betAmount){
        System.out.println("3着以内に入る馬を選択してください: 1頭目");
        int number1=sc.nextInt();//馬番を入力
        System.out.println("3着以内に入る馬を選択してください: 2頭目");
        int number2=sc.nextInt();
        System.out.println("3着以内に入る馬を選択してください: 3頭目");
        int number3=sc.nextInt();
        return("あなたは"+selectedHorses[number1]+"番、"+selectedHorses[number2]+"番、"+selectedHorses[number3]+"番の三連複を"+betAmount+"円購入しました。");
}
}
