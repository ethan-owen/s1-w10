public class StudentMain{
    public static void main(String[] args) {
        Student orin = new Student("orin", "mathletes");
        Student andy = new Student("andy", "mountain biking");
        Student dash = new Student("dash", "mountain biking");

        System.out.println(orin.isSameClub(andy));
        System.out.println(dash.isSameClub(andy));
    }
}