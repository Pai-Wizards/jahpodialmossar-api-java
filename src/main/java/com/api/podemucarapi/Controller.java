package com.api.podemucarapi;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class Controller {

    @GetMapping
    public Message get() {
        if (isLaunchTime()) {
            return Message.positive();
        } else {
            return Message.negative();
        }
    }

    private boolean isLaunchTime() {
        final LocalDateTime now = LocalDateTime.now();

        return now.getHour() >= 11 && now.getHour() < 14;
    }
}

record Message(String message, LocalDateTime time) {

    private static final String[] negativeMessages = {
            "Infelizmente não da pra mossar, tome um toddy.",
            "Aguarde a hora certa linda",
            "da nao muleke"
    };

    private static final String[] positiveMessages = {
            "A. Ross 👨‍🍳, Fae John 👩‍🍳, Fran Goo 👩‍🍳, A. Milanesa 👩‍🍳, Salah Da 👨‍🍳, I. Pim 👨‍🍳, Far-oh Far 👩‍🍳, Koo Ka Kola 👩‍🍳, Osuko 👨‍🍳, Guarana 👨‍🍳, Le Fan Ta Uva. Reservas: Lan Shin Datard 👩‍🍳, Paul Jim 👨‍🍳, Le Pavet o Pa Comer 👩‍🍳, Fei Joo Ada 👨‍🍳, Guaravic.",
            "Tá liberado! ✅",
            "É oficial. Já pode almoçar. 🍽️",
            "Não sei. Fui ao mercado, deixe seu recado! 🛒",
            "Pelo que eu sei, já pode almoçar. 🍽️",
            "Pode almoçar. 🍽️"
    };


    public static Message negative() {
        return new Message(negativeMessages[(int) (Math.random() * negativeMessages.length)], LocalDateTime.now());
    }

    public static Message positive() {
        return new Message(positiveMessages[(int) (Math.random() * positiveMessages.length)], LocalDateTime.now());
    }
}