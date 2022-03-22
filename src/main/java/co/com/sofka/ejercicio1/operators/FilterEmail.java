package co.com.sofka.ejercicio1.operators;

import co.com.sofka.ejercicio1.models.Email;

import java.util.ArrayList;
import java.util.List;

import reactor.core.publisher.Flux;

public class FilterEmail {
    ObtenerEmail obtenerEmail = new ObtenerEmail();
    List<Email> emails = obtenerEmail.obtnenerEmails();

    public void mensajesRepetidos() {
        Flux<Email> emailFlux = Flux.fromIterable(emails);

        emailFlux.distinct(email -> email.getMensaje())
                .subscribe(x -> System.out.println(x.toString()));
    }

    public void dominiosDelMail() {
        Flux<Email> emailFlux = Flux.fromIterable(emails);

        Flux.fromIterable(emails)
                .groupBy(Email::getTipoEmail)
                .flatMap(idFlux -> idFlux.collectList())
                .subscribe(x -> System.out.println(x.toString()));
//        Flux.fromIterable(emails)
//                .filter(e -> e.getTipoEmail().equals("@gmail.com"))
//                .subscribe(x -> System.out.println(x.toString()));
    }

    public void condicionesDelCorreo() {
        Flux<Email> emailFlux = Flux.fromIterable(emails);

        Flux.fromIterable(emails)
                .filter(e -> {
                    return e.getTipoEmail().isBlank() ||
                            e.getTipoEmail().equals("@gmail.com") ||
                            e.getTipoEmail().equals("@hotmail.com") ||
                            e.getTipoEmail().equals("@outlook.com");
                })
                .subscribe(x -> System.out.println(x.toString()));
    }

    public void cantidadDeCorreos() {
        Flux<Email> emailFlux = Flux.fromIterable(emails);

        Flux.fromIterable(emails)
                .count()
                .subscribe(x -> System.out.println("La cantidad de mails es: " + x));
    }

    public void cantidadDeTiposDeCorreos() {
        Flux<Email> emailFlux = Flux.fromIterable(emails);

        Flux.fromIterable(emails)
                .filter(e -> e.getTipoEmail().equals("@gmail.com"))
                .count()
                .subscribe(x -> System.out.println("Cantidad de @Gmails: " + x));

        Flux.fromIterable(emails)
                .filter(e -> e.getTipoEmail().equals("@hotmail.com"))
                .count()
                .subscribe(x -> System.out.println("Cantidad de @Hotmails: " + x));

        Flux.fromIterable(emails)
                .filter(e -> e.getTipoEmail().equals("@outlook.com"))
                .count()
                .subscribe(x -> System.out.println("Cantidad de @Outlook: " + x));
    }

    public void estadoDelMensaje() {
        Flux<Email> emailFlux = Flux.fromIterable(emails);

        emailFlux.map(e -> {
            if(!e.isEstado()){
                e.mensajeEnviado();
            }
            return e;
        }).subscribe(x -> System.out.println(x.toString()));
    }
}
