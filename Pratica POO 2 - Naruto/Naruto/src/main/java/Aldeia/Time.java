package Aldeia;

import java.util.ArrayList;

public class Time {
    private String nomeDoTime;
    private ArrayList<Ninja> time;

    public Time(String nomeDoTime){
        this.nomeDoTime = nomeDoTime;
        this.time = new ArrayList<>();
    }

    public void addMembros(Ninja ninja) {
        time.add(ninja);

    }

    public void setNomeDoTime(String nomeDoTime) {
        this.nomeDoTime = nomeDoTime;
    }

    public String getNomeDoTime() {
        return nomeDoTime;
    }
}
