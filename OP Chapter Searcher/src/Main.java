import java.util.Scanner;


class Saga{
    int startingchapter;
    int endingchapter;
    String saganame;
    boolean isContinuing;

    Saga(int StartingChapter, int EndingChapter, String SagaName, boolean IsContinuing){
        this.startingchapter = StartingChapter;
        this.endingchapter = EndingChapter;
        this.saganame = SagaName;
        this.isContinuing = IsContinuing;
    }
/** 
    void CheckIfChapterIsSaga(int chapter_num){
        if (chapter_num > endingchapter && isContinuing) {
            System.out.println("TO BE CONTINUED");
        }
        else if (startingchapter <= chapter_num && chapter_num <= endingchapter){
            System.out.print(chapter_num + " is " + saganame);
        }
    }*/
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Saga[] sagalist = new Saga[] {
            new Saga(1, 61, "East Blue Saga",false), 
            new Saga(62, 135, "Arabasta Saga", false),
            new Saga(136, 206, "Sky Island Saga", false),
            new Saga(207, 325, "Water 7 Saga", false),
            new Saga(326, 384, "Thriller Bark Saga", false),
            new Saga(385, 516, "Summit War Saga", false),
            new Saga(517, 574, "Fishman Island Saga", false),
            new Saga(575, 746, "Dressrosa Saga", false),
            new Saga(747, 889, "Whole Cake Island Saga", false),
            new Saga(890, 1085, "Wano Country Saga", false),
            new Saga(1086, 1113, "Final Saga", true),
        };

        System.out.print("Enter the Chapter number that you want to Know : ");
        int chapter_num = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < sagalist.length; i++) {
            if (chapter_num > sagalist[i].endingchapter && sagalist[i].isContinuing) {
                System.out.println("TO BE CONTINUED");
                break;
            }

            else if (sagalist[i].startingchapter <= chapter_num && chapter_num <= sagalist[i].endingchapter){
                System.out.print(chapter_num + " is " + sagalist[i].saganame);
                break;
            }
        }
    }
}