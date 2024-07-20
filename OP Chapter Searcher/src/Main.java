import java.util.Scanner;


class DataOfChapter{
    int chapter;
    String name;

    DataOfChapter(int chapter){
        this.chapter = chapter;
    }

    void checkChapterSaga() {
        if (chapter >= 1 && chapter <= 61) {
            System.out.println(chapter + " is East Blue saga");
        } else if (chapter >= 62 && chapter <= 135) {
            System.out.println(chapter + " is Arabasta saga");
        } else if (chapter >= 135 && chapter <= 206) {
            System.out.println(chapter + " is Sky Island saga");
        } else if (chapter >= 206 && chapter <= 325) {
            System.out.println(chapter + " is Water 7 saga");
        } else if (chapter >= 325 && chapter <= 384) {
            System.out.println(chapter + " is Thriller Bark saga");
        } else if (chapter >= 384 && chapter <= 492) {
            System.out.println(chapter + " is Summit War saga");
        } else if (chapter >= 492 && chapter <= 542) {
            System.out.println(chapter + " is Fishman Island saga");
        }else if (chapter>=542 && chapter <= 746) {
            System.out.println(chapter + " is Dressrosa saga");
        }else if (chapter>=746 && chapter <= 889) {
            System.out.println(chapter + " is Whole cake Island saga");
        }else if (chapter>=889 && chapter <= 1030) {
            System.out.println(chapter + " is Wona Country saga");
        }else if (chapter>=1030 && chapter <= 1086) {
            System.out.println(chapter + " is Final saga");
        }else if (chapter >  1086) {
            System.out.println("TO BE CONTINUED");
        }
        else{
            System.out.println("ERROR:INVALID INPUT");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Chapter number that you want to Know : ");
        int chapter = scanner.nextInt();

        DataOfChapter chapter1 = new DataOfChapter(chapter);
        //DataOfChapter chapter2 = new DataOfChapter(5);

        chapter1.checkChapterSaga();

        scanner.close();
    }
}