package ru.gb.jt.chat.client;

import ru.gb.jt.chat.library.Library;

public class Extract {
    public static String extractMsg(String msg){
        if (msg.contains(Library.AUTH_ACCEPT)) {
            return "В чат вошел " + msg.substring(Library.AUTH_ACCEPT.length() + Library.DELIMITER.length());
        } else if (msg.contains(Library.TYPE_BROADCAST)) {
            return "СЕРВЕР ИНФО: " + msg.substring(Library.TYPE_BROADCAST.length() + Library.DELIMITER.length());
        } else return msg;
    }
}
