package products;

public class Notebook extends Product{

    private int pageCount;
    private boolean isHardCover;
    private static int BASE = 20001;
    public Notebook(String title, Double price, int pages, boolean isHardCover) {
        super(title, price);
        this.isHardCover = isHardCover;
        setPageCount(pages);
    }
    public void setPageCount(int count) {
        if(count > 0) {
            this.pageCount = count;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", PageCount = '" + pageCount + '\'' +
                ", is Hard cove = '" + isHardCover + '\'' +' '
                ;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    protected String generateId() {
        int id = BASE + 1;
        BASE += 1;
        return  2 + String.valueOf(id);
    }



}