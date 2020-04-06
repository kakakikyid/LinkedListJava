public class Data {
    private String author;
    private int frek;
    private Linkedlist title = new Linkedlist();

    public Data(String author) {
        this.author = author;
        this.frek = 1;
    }

    public String Author() {
        return this.author;
    }

    public int getFreq() {
        return this.frek;
    }

    public void addFreq() {
        this.frek++;
    }

    public void addTitle(String artikel) {
        title.add(artikel);
    }

    public void getTitle() {
        Node current = title.getHead();
        int i = 1;
        while (current != null) {
            System.out.println(i + ". " + current.getData().Author());
            if (current.getNext() == null) {
                break;
            }
            current = current.getNext();
            i++;
        }
    }
}