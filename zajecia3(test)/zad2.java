package com.company.zaj3;

public class zad2 {

    public static void main(String[] args)
    {
        dog pjes = new dog("Husky", 23, "white" );

        pjes.bark();
        pjes.sleep();
    }

}

//////////////        na dole oddzielny plik dog

package com.company.zaj3;

public class dog {

    private String breed;
    private  int age;
    private String color;

    public dog ( String breed, int age,  String color )
    {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

 /*   public String rodzajpsa( String breed)
    {
        this.breed = breed;
        return breed;
    }

    public int dlugosczycia( int age)             zakodowalam bo idk po co to wgl napisalam, kod dziala bez tego ¯\_(ツ)_/¯
    {
        return age;
    }

    public String kolorowanka(String color)
    {
        return color;
    }
*/
    public void bark()
    {
        System.out.println(" woof ");
    }

    public void sleep()
    {
        System.out.println( " *pies śpi ");
    }


}
