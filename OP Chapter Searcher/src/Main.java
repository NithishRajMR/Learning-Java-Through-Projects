import java.util.Scanner;


class Saga{
    int startingchapter;
    int endingchapter;
    String saganame;

    Saga(int StartingChapter, int EndingChapter, String SagaName){
        this.startingchapter = StartingChapter;
        this.endingchapter = EndingChapter;
        this.saganame = SagaName;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Saga[] sagalist = new Saga[] {
            new Saga(1, 61, "East Blue Saga"), 
            new Saga(62, 135, "Arabasta Saga"),
            new Saga(136, 206, "Sky Island Saga"),
            new Saga(207, 325, "Water 7 Saga"),
            new Saga(326, 384, "Thriller Bark Saga"),
            new Saga(385, 516, "Summit War Saga"),
            new Saga(517, 574, "Fishman Island Saga"),
            new Saga(575, 746, "Dressrosa Saga"),
            new Saga(747, 889, "Whole Cake Island Saga"),
            new Saga(890, 1085, "Wano Country Saga"),
            new Saga(1086, -1, "Final Saga"),
        };

        System.out.print("Enter the Chapter number that you want to Know : ");
        int chapter_num = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < sagalist.length; i++) {
            if (sagalist[i].startingchapter <= chapter_num && chapter_num <= sagalist[i].endingchapter){
                System.out.print(chapter_num + " is in " + sagalist[i].saganame);
                break;
            }
        }
    }
}