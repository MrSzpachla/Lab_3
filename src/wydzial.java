enum WydzialEnum {


        Rachunkowosci("Czerwony", "Stacjonarny",320),
        Inforamtyka("Niebieski", "Niestacjonarny", 110),
        Ekonmia("Zielony", "Stacjonarny",230);

        String s1;
        String s2;
        int d3;

    WydzialEnum(String s1, String s2,int d3) {
        this.s1 = s1;
        this.s2 = s2;
        this.d3 = d3;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }
}