import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Документ ");
        System.out.println( "Введите свой ключ");
        Scanner read = new Scanner(System.in);
        String product_key=read.next();

        //по сути это 1 документ
        ExpertDocumentWorker expertdocument = new ExpertDocumentWorker();
        ProDocumentWorker prodocument=expertdocument;
        DocumentWorker document=prodocument;

        switch (product_key)
        {
            case "expertkey":
                ExpertDocumentWorker doc1= expertdocument;
                expertdocument.EditDocument();
                System.out.println("Expert");
                break;
            case  "prokey":
                ProDocumentWorker doc2 = prodocument;
                doc2.EditDocument();
                System.out.println("Pro");
                break;
            default:
                document.EditDocument();
                System.out.println("Free");
                break;
        }



    }
}
