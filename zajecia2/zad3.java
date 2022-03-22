package com.company.zaj2;
public class zad3
{
    public static void main(String[] args) {
        punkt punkt = new punkt(2,2);
        punkt zerowy = new punkt();
        punkt inny = new punkt(3,5);
        punkt.wyswietl();
        zerowy.wyswietl();
        System.out.println(punkt.hioh(4,4));
        System.out.println(punkt.hioh(inny));

    }
}
package com.company.zaj2;
public class zad3
{
    public static void main(String[] args) {
        punkt punkt = new punkt(2,2);
        punkt zerowy = new punkt();
        punkt inny = new punkt(3,5);
        punkt.wyswietl();
        zerowy.wyswietl();
        System.out.println(punkt.hioh(4,4));
        System.out.println(punkt.hioh(inny));
    }
}

/////////////////

package com.company.zaj2;
public class punkt
{
    int x;
    int y;
    public punkt(){}
    public punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void wyswietl()
    {
        System.out.printf("(%d, %d)", x, y);
        System.out.println(" ");
    }
    public double hioh(int x, int y)
    {
        int a = Math.abs(this.x-x);
        int b = Math.abs(this.y-y);
        return Math.sqrt(a*a+b*b);
    }
    public double hioh(punkt inny)
    {
        int a = Math.abs(this.x-inny.x);
        int b = Math.abs(this.y-inny.y);
        return Math.sqrt(a*a+b*b);
    }
}
