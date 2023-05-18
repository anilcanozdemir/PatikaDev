import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> clubs = new ArrayList<>();
    static ArrayList<String> coupleTeams = new ArrayList<>();
    static int fixtureValue = 0;
    static Random random = new Random();
    public static void printFixtures() {
        for (int bringMeet = 0; bringMeet < coupleTeams.size(); bringMeet += 2) {

            fixtureValue++;
            System.out.println("--------Fixture " + fixtureValue + "--------");
            int fixtureCounter = 0;
            while (fixtureCounter < clubs.size() / 2) {

                System.out.println(coupleTeams.get(bringMeet));
                fixtureCounter++;
                bringMeet += 2;
                if (bringMeet >= coupleTeams.size())
                    break;
            }

            bringMeet -= 2;
        }


        for (int bringMeet = 1; bringMeet < coupleTeams.size(); bringMeet += 2) {

            fixtureValue++;
            System.out.println("--------Fixture " + fixtureValue + "--------");
            int fixtureCounter = 0;
            while (fixtureCounter < clubs.size() / 2) {
                System.out.println(coupleTeams.get(bringMeet));
                fixtureCounter++;
                bringMeet += 2;

                if (bringMeet >= coupleTeams.size()) {
                    break;
                }
            }
            bringMeet -= 2;
        }
    }

    public static void createFixture()
    {
        if (clubs.size()%2!=0)
            clubs.add("Bay");


        for (int i=0;i<clubs.size()-1;i++)
        {
            String away;
            String home;
            int matchQuality=0;
            String selectedTeams="";




            while (matchQuality<clubs.size()/2)
            {
                away=clubs.get(random.nextInt(clubs.size()));//random bir takım
                home=clubs.get(random.nextInt(clubs.size()));//random bir takım
                if (!away.equals(home))//Aynı takımın seçilmesi engellenmiştir
                {
                    if (!selectedTeams.contains(away) && !selectedTeams.contains(home))//O hafta maç yapan takımlar *o hafta* birdaha seçilmemelidir
                    {
                        String match1=(away+" vs "+home);//Hem rövanş hem normal maç eklenir böylece fixtürler sağlanmış olur
                        String match2=(home+" vs "+away);

                        if (!coupleTeams.contains(match1) && !coupleTeams.contains(match2))//müsabaka yapan takımlar birdaha karşılaşmamalıdır
                        {
                            coupleTeams.add(match1);//Maç yapan takımlar listeye eklenerek birdaha karşılaşmamaları sağlanmıştır
                            coupleTeams.add(match2);

                            selectedTeams+=home;//O hafta maç yapan takımlar birdaha seçilmemesi için bir stringe atanmıştır
                            selectedTeams+=away;

                            matchQuality++;//O haftada oynanması gereken maç miktarı şartlar sağlanırsa arttırılır
                        }
                    }
                }

            }
        }

        printFixtures();
    }
    public static void main(String[] args) {


        boolean status = true;
        while (status) {

            System.out.println("""
                    Lütfen yapmak istediğiniz işlemi seçiniz:\s
                    1-Takım ekleme
                    2-Fikstür oluşturma
                    0-Çıkış""");

            System.out.println("--------------------");
            int choose = input.nextInt();


            switch (choose) {
                case 1 -> {
                    System.out.print("Eklenecek olan takımın adını giriniz: ");
                    input.nextLine();
                    String clubName = input.nextLine();
                    clubs.add(clubName);
                    System.out.println("Takım eklendi: " + clubs.get(clubs.size() - 1));
                    System.out.println("--------------------");
                }
                case 2 -> createFixture();
                case 0 -> status = false;
                default -> System.out.println("Lütfen geçerli bir işlen giriniz..");
            }
        }
    }
}

