package com.company.zaj3;               //nie skonczylam go (dokladnie jego glownej galezi czyli tego na lewo)

public class Zad3
{
    public static void main(String[] args)
    {

    }
}

////////////////////// classa TV

package com.company.zaj3;

public class TV
{
    private int channel;
    private  int volume;
    private String on;

    public TV (int channel, int volume, String on)
    {
        this.channel =channel;
        this.volume = volume;
        this.on = on;
    }

    public int kanal(int channel)
    {
        return  channel;
    }

}

///////////// classa Remote
package com.company.zaj3;

public class Remote
{
    private int max_channel = 70;
    private int min_channel = 1;
    private int max_volume = 100;
    private int min_volume = 1;
    private boolean power =false;

    int channel = min_channel;
    int volume = min_volume;

    public boolean prund()
    {
        return power;
    }


    public void kanal()
    {
        if (power)
        {
            if (channel < max_channel)
            {
                    channel++;
            }
        }
    }
    public void kanaldol()
    {
        if(power)
        {
            if (channel > min_channel)
            {
                channel--;
            }
        }
    }

    public  void glosgor()
    {
        if(power)
        {
            if(volume<max_volume)
            {
                volume++;
            }
        }
    }

    public void glosdol()
    {
        if(power)
        {
            if(volume>min_volume)
            {
                volume--;
            }
        }
    }

}
