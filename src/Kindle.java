//=============================================================================
public class Kindle {
    //-----------------------------------------------------------------------------
    private int currentPage;
    private int totalPages;

    public Kindle(int numOfPages) {

        currentPage = 1;
        totalPages = numOfPages;

    }
    //-----------------------------------------------------------------------------
    public void turnPages() {

        currentPage = currentPage + 1;

    }
    //-----------------------------------------------------------------------------
    public void turnPages(int num) {


        if(currentPage + num > totalPages){
            currentPage = totalPages;
            System.out.println(" Turning" + num + "pages would take you past the last page.");
        }else{
            currentPage = currentPage + num;
        }

    }
    //-----------------------------------------------------------------------------
    public String toString() {


        return("Page " + currentPage + " of "+ totalPages+".");
    }
//-----------------------------------------------------------------------------
}
//=====