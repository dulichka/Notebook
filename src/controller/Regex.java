package controller;

/**
 * This interface is a regex container.
 *
 * @author dulichka
 */

public interface Regex {

    String REGEX_NAME_UKR = "[[А-ЯҐЄІЇ]&&[^ЁЫЭЪ]][[а-яґєії\\']&&[^ёыэъ]]{1,20}[[а-яґєії]&&[^ёыэъ]]";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
}
