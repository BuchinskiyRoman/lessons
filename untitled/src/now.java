import java.awt.*;
import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class now {
        public static void main(String[] args) {
            SimpleDateFormat cdt = new SimpleDateFormat("dd MMMMMMMMMMM y 'года' HH:mm:ss.S ");
            cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT+3")));

            System.out.printf("\nNow: "+cdt.format(System.currentTimeMillis()));


        }
    }
