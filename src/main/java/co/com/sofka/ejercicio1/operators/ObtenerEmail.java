package co.com.sofka.ejercicio1.operators;

import co.com.sofka.ejercicio1.models.Email;

import java.util.ArrayList;
import java.util.List;

public class ObtenerEmail {
    public List<Email> obtnenerEmails() {
        List<Email> emails = new ArrayList<>();

        emails.add(new Email(1, "personaGmail_" + 1, "@gmail.com", "Hola Mundo " + 1));
        emails.add(new Email(2, "personaGmail_" + 2, "@gmail.com", "Hola Mundo " + 2));
        emails.add(new Email(3, "personaGmail_" + 3, "@gmail.com", "Hola Mundo " + 3));
        emails.add(new Email(4, "personaGmail_" + 4, "@gmail.com", "Hola Mundo " + 4));
        emails.add(new Email(5, "personaGmail_" + 5, "@gmail.com", "Hola Mundo " + 5));
        emails.add(new Email(6, "personaGmail_" + 6, "@gmail.com", "Hola Mundo " + 6));
        emails.add(new Email(7, "personaGmail_" + 7, "@gmail.com", "Hola Mundo " + 7));
        emails.add(new Email(8, "personaGmail_" + 8, "@gmail.com", "Hola Mundo " + 8));
        emails.add(new Email(9, "personaGmail_" + 9, "@gmail.com", "Hola Mundo " + 9));
        emails.add(new Email(10, "personaGmail_" + 10, "@gmail.com", "Hola Mundo " + 10));

        emails.add(new Email(1, "personaHotmail_" + 1, "@hotmail.com", "Hola Mundo " + 1));
        emails.add(new Email(2, "personaHotmail_" + 2, "@hotmail.com", "Hola Mundo " + 2));
        emails.add(new Email(3, "personaHotmail_" + 3, "@hotmail.com", "Hola Mundo " + 3));
        emails.add(new Email(4, "personaHotmail_" + 4, "@hotmail.com", "Hola Mundo " + 4));
        emails.add(new Email(5, "personaHotmail_" + 5, "@hotmail.com", "Hola Mundo " + 5));
        emails.add(new Email(6, "personaHotmail_" + 6, "@hotmail.com", "Hola Mundo " + 6));
        emails.add(new Email(7, "personaHotmail_" + 7, "@hotmail.com", "Hola Mundo " + 7));
        emails.add(new Email(8, "personaHotmail_" + 8, "@hotmail.com", "Hola Mundo " + 8));
        emails.add(new Email(9, "personaHotmail_" + 9, "@hotmail.com", "Hola Mundo " + 9));
        emails.add(new Email(10, "personaHotmail_" + 10, "@hotmail.com", "Hola Mundo " + 10));

        emails.add(new Email(1, "personaOutlook_" + 1, "@outlook.com", "Hola Mundo " + 1));
        emails.add(new Email(2, "personaOutlook_" + 2, "@outlook.com", "Hola Mundo " + 2));
        emails.add(new Email(3, "personaOutlook_" + 3, "@outlook.com", "Hola Mundo " + 3));
        emails.add(new Email(4, "personaOutlook_" + 4, "@outlook.com", "Hola Mundo " + 4));
        emails.add(new Email(5, "personaOutlook_" + 5, "@outlook.com", "Hola Mundo " + 5));
        emails.add(new Email(6, "personaOutlook_" + 6, "@outlook.com", "Hola Mundo " + 6));
        emails.add(new Email(7, "personaOutlook_" + 7, "@outlook.com", "Hola Mundo " + 7));
        emails.add(new Email(8, "personaOutlook_" + 8, "@outlook.com", "Hola Mundo " + 8));
        emails.add(new Email(9, "personaOutlook_" + 9, "@outlook.com", "Hola Mundo " + 9));
        emails.add(new Email(10, "personaOutlook_" + 10, "@outlook.com", "Hola Mundo " + 10));

        return emails;
    }
}
