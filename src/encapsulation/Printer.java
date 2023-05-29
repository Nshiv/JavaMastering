package encapsulation;

public class Printer
{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex) {
        if(tonerLevel<0)
        {
            this.tonerLevel=0;
        } else if (tonerLevel>100) {
            this.tonerLevel=100;
        }
        else
        {
            this.tonerLevel=tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted=0;
    }

    public int addToner(int tonerAmnount)
    {
        int tempAmount = tonerAmnount+tonerLevel;
        if(tempAmount>100 || tempAmount<0)
        {
            return -1;
        }
        return tonerLevel=tonerAmnount+tonerLevel;
    }
    public int printPages(int pages)
    {
        int jobPages = (duplex)? (pages/2)+(pages%2):pages;
        pagesPrinted+=jobPages;
        return jobPages;
    }
    public int getPagesPrinted()
    {
        return pagesPrinted;
    }

    public int getTonerLevel()
    {
        return tonerLevel;
    }
}
