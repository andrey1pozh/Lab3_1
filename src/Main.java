public class Main {

    public static void main(String[] args) {

        String timeName = Any.TIME.getName();
        //String inrName = Any.INR.getName();
        String controlName = Any.CONTROL.getName();
        String inAirName = Any.INAIR.getName();
        String steelName = Any.STEEL.getName();
        String feelName = Any.FEEL.getName();
        String pathName = Any.PATH.getName();
        String placeName = Any.PLACE.getName();

        Policeman policeman = new Policeman(" полицейский");
        policeman.setDescription("в ракету");
        Hit hit = new Hit();
        hit.setName("удар");
        Rocket rocket = new Rocket();
        rocket.setName("Ракета");
        Bullet bullet = new Bullet("Пуля");
        Cosmonaut cosmonaut = new Cosmonaut("космонавт");
        Confusion confusion = new Confusion("замешательство");


        System.out.print(timeName);
        System.out.println(policeman.getName() + " " + policeman.shoot());
        //System.out.println(inrName);

        Hit.isHeard(Math.random() * 100);
        System.out.println(hit.getName());

        System.out.println(rocket.getName() + " " + rocket.shake());
        System.out.print(rocket.getName()+ " " + rocket.loseControl());
        System.out.println(controlName);
        System.out.print(rocket.getName() + " " + rocket.rollOver());
        System.out.println(inAirName);

        System.out.print(bullet.getName());
        Rocket.hpBar("steal");
        //bullet.noPunch();
        System.out.println(steelName);

        System.out.println(rocket.getName() + " " + rocket.weightlessness());

        System.out.print(hit.getName() + " " + hit.was());
        System.out.println(feelName);

        System.out.print(pathName + ", " + cosmonaut.getName() + "ы ");
        Cosmonaut.fall(pathName);
        System.out.println(placeName);

        System.out.print(confusion.happen() + " " + confusion.getName());
    }
}
