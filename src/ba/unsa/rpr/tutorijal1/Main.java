package ba.unsa.rpr.tutorijal1;


class Sat {
    private int sati;
    private int minute;
    private int sekunde;


    Sat(int sati, int minute, int sekunde) {
        postavi(sati,minute,sekunde);
    }
    public void postavi(int sati, int minute, int sekunde) {
        this.sati=sati;
        this.minute=minute;
        this.sekunde=sekunde;
    }
    public void sljedeci() {
        sekunde++;
        if (sekunde==60) {
            sekunde=0;
            minute++;
        }
        if (minute==60) {
            minute=0;
            sati++;
        }
        if (sati==24) sati=0;
    }
    public void prethodni() {
        sekunde--;
        if (sekunde==-1) {
            sekunde=59;
            minute--;
        }
        if (minute==-1) {
            minute=59;
            sati--;
        }
        if (sati==-1) sati=23;
    }
    void pomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) sljedeci();
        else for (int  i=0; i<-pomak; i++) prethodni();
    }
    public int getSati()  {
        return sati;
    }
    public int getMinute()  {
        return minute;
    }
    public int getSekunde()  {
        return sekunde;
    }
    public void Ispisi()  {
        System.out.println(sati+":"+minute+":"+sekunde);
    }
};

public class Main {

    public static void main(String[] args) {
       Sat s = new Sat(15,30,45);
        s.Ispisi();
        s.sljedeci();
        s.Ispisi();
        s.pomjeriZa(-48);
        s.Ispisi();
        s.postavi(0,0,0);
        s.Ispisi();
    }
}


