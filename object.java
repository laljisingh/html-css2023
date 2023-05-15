class movies{
private int Rating;
private int Money_Collection;
private int Profit;
private String Lead_Actor;
private String Lead_Actress;

public movies(int rating, int money_Collection, int profit, String lead_Actor, String lead_Actress) {
    Rating = rating;
    Money_Collection = money_Collection;
    Profit = profit;
    Lead_Actor = lead_Actor;
    Lead_Actress = lead_Actress;
}

    public void print(){
        System.out.println(this.Rating);
        System.out.println(this.Money_Collection);
        System.out.println(this.Profit);
        System.out.println(this.Lead_Actor);
        System.out.println(this.Lead_Actress);
    }
}




class object{
    public static void main(String[] args) {
        movies m1=new movies(8,200000,5000,"Rachel Gupta & Nikhil Chinapa", "Disha");
        m1.print();

        movies m2=new movies(9,500000,8000,"Rannvijay Singha & Prince Narula", "Neha Dhupia");
        m2.print();

        movies m3 = new movies(10,700000,6000,"Rachel Gupta & Prince Narula", "Neha Dhupia");
        m3.print();

    }
}