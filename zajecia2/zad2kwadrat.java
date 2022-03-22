package com.company.zaj2;
public class zad2 {
    public static void main(String[] args) {
        kwadrat kwadrat = new kwadrat( 5);
        System.out.println(kwadrat.pole());
        System.out.println(kwadrat.obwod());
    }
}

/////////////

package com.company.zaj2;
public class kwadrat {
    int bok;
    public kwadrat(int bok)
    {
        this.bok = bok;
    }
    public int pole()
    {
        return bok*bok;
    }
    public int obwod()
    {
        return bok*4;
    }
}
