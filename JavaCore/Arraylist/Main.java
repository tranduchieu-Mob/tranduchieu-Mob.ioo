import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhap so nha: ");
        // String soNha = scanner.nextLine();
        // System.out.println("So thanh vien: ");
        // int familyNumber = scanner.nextInt();

        // Person person = new Person("Hieu", "27-07-1999", "coder");
        // Person person2 = new Person("Tung", "20-12-2002", "Sinh vien");
        // ArrayList<Person> people = new ArrayList<>();
        // people.add(person);
        // people.add(person2);

        // Hodan hodan = new Hodan();
        // hodan.setHouseNumber(soNha);
        // hodan.setNumberOfMembers(familyNumber);
        // hodan.setPeople(people);

        // System.out.println(hodan.toString());
        
        // Follower follower = new Follower("Hieu", "1", "dhieu270799@gmail.com", 1000);
        // Follower follower2 = new Follower("Tuan anh", "2", "Tuananh@gmail.com", 100);
        // Follower follower3 = new Follower("Tung", "3", "tung@gmail.com", 10000);
        // Follower follower4 = new Follower("Cong", "4", "Cong@gmail.com", 2000);
        // ArrayList<Follower> followers = new ArrayList<>();
        // followers.add(follower);
        // followers.add(follower2);
        // followers.add(follower3);
        // followers.add(follower4);
        

        // Song song = new Song("1", "Hay trao cho anh", "Son tung");
        // Song song2 = new Song("2", "Tet dong day", "Kay tran");
        // ArrayList<Song> songs = new ArrayList<>();
        // songs.add(song);
        // songs.add(song2);

        // Idol idol = new Idol("Son Tung-MTP", "1", "Sontung@gmail.com", followers, "Sky");
        // Idol idol2 = new Idol("Kay Tran", "2", "Kaytran@gmail.com", followers, "Kaytran");
        // ArrayList<Idol> idols = new ArrayList<>();
        // idols.add(idol);
        // idols.add(idol2);
        // Tiktok tiktok = new Tiktok(idols, songs);
        
        // System.out.println(tiktok.toString());
        // System.out.println(idol.toString());
        // System.out.println(idol2.toString());
        // System.out.println(follower.toString());
        // System.out.println(follower2.toString());
        // System.out.println(follower3.toString());
        // System.out.println(follower4.toString());
        // System.out.println(song.toString());
        // System.out.println(song2.toString());
        System.out.println("Nhap thoi gian bat dau: ");
        String time = scanner.nextLine();
        
        Genenal genenal = new Genenal("Yasuo", "Mid");
        Genenal genenal2 = new Genenal("olaf", "Top");
        Genenal genenal3 = new Genenal("jinx", "ad");
        Genenal genenal4 = new Genenal("leesin", "Jungle");
        Genenal genenal5 = new Genenal("lulu", "Sp");
        Genenal genenal6 = new Genenal("akali", "Mid");
        Genenal genenal7 = new Genenal("Darius", "top");
        Genenal genenal8 = new Genenal("jhin", "ad");
        Genenal genenal9 = new Genenal("zed", "Jungle");
        Genenal genenal10 = new Genenal("rakan", "SP");
        ArrayList<Genenal> team1 = new ArrayList<>();
        team1.add(genenal);
        team1.add(genenal2);
        team1.add(genenal3);
        team1.add(genenal4);
        team1.add(genenal5);
        System.out.println("Team1");
        System.out.println(team1.toString());
        ArrayList<Genenal> team2 = new ArrayList<>();

        team2.add(genenal6);
        team2.add(genenal7);
        team2.add(genenal8);
        team2.add(genenal9);
        team2.add(genenal10);
        System.out.println("Team2");
        System.out.println(team2.toString());

    }
}