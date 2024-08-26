import java.util.Date;
import java.util.concurrent.TimeUnit;

class DateDifferenceCalculator {

    public static void main(String[] args) {
        // Date actuelle
        Date now = new Date();
        System.out.println("Date actuelle: " + now);

        // Générer une date future (ajout de x heures à la date actuelle)
        long millisInHours = TimeUnit.HOURS.toMillis(1);
        Date futureDate = new Date(now.getTime() + millisInHours);
        System.out.println("Date future après x heures: " + futureDate);

        // Calculer la différence en millisecondes
        long differenceInMillis = futureDate.getTime() - now.getTime();

        // Convertir la différence en minutes
        long differenceInMinutes = TimeUnit.MILLISECONDS.toMinutes(differenceInMillis);
        System.out.println("Différence en minutes: " + differenceInMinutes);
    }
}
