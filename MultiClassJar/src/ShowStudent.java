public class ShowStudent {
    public static void main(String[] args) {
        Student Alen = new Student("Alen", args[0]);
        Student Gates = new Student("Gates", args[1]);
        System.out.println(Alen.getName() + "'s hobby is: " + Alen.getHobby());
        System.out.println(Gates.getName() + "'s hobby is: " + Gates.getHobby());
    }
}
