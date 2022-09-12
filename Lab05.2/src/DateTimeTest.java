/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.text.Format;
import java.time.*;
import java.time.format.*;
import java.util.Locale;

class DateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
         testNow();
         testCreate();
         testParse();
         testFormat();
    }

    /**
     * TASK: create current date, time, and date-time via now() and then print them.
     */
    public static void testNow() {
        // TODO
        LocalTime date = LocalTime.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testCreate() {
        LocalDate birthday = LocalDate.of(1994, 07, 19);
        System.out.println("I was born on a " +birthday.getDayOfWeek());
        LocalDateTime lunarLanding = LocalDateTime.of(1969, 7, 20, 15, 18);
        System.out.println(lunarLanding);
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testParse() {
        // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
        LocalDate birthday = LocalDate.parse("1994-07-19");
        System.out.println(birthday);

        // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate bday2 = LocalDate.parse("7/19/1994", formatter);
        System.out.println(bday2);
    }

    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    public static void testFormat() {
        LocalDate hastings = LocalDate.of(1066, 10, 14);
        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(usDateFormat.format(hastings));

        DateTimeFormatter intlFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(intlFormat.format(hastings));

        // OPTIONAL: October 14, 1066
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(longFormat.format(hastings));
    }
}