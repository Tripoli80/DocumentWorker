public class ProDocumentWorker extends DocumentWorker {

    protected void EditDocument(){
        System.out.println("Документ отредактирован");
    }
    protected void SaveDocument(){
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
