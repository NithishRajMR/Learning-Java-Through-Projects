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

        System.out.print("Enter the Chapter number that you want to Know : ");
        int chapter_num = scanner.nextInt();
        
        Saga[] sagalist = new Saga[] {
            new Saga(1, 61, "East Blue Saga"), 
            new Saga(62, 135, "Arabasta Saga"),
            new Saga(136, 206, "Sky Island Saga"),
            new Saga(207, 135, "Water 7 Saga"),
            new Saga(62, 135, "Thriller Bark Saga"),
            new Saga(62, 135, "Summit War Saga"),
        };
        //DataOfChapter chapter1 = new DataOfChapter(chapter);

        scanner.close();
    }
}