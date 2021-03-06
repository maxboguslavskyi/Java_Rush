package com.javarush.test.level19.lesson03.task03;

/* Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static class IncomeDataAdapter implements Customer, Contact {

        IncomeData incomeData;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.incomeData = incomeData;
        }

        @Override
        public String getName() {
            return String.format("%s, %s", incomeData.getContactLastName(), incomeData.getContactFirstName());
        }

        @Override
        public String getPhoneNumber() {

            String text = String.format("+%d(%2$s)%3$s-%4$s-%5$s", incomeData.getCountryPhoneCode(),
                    String.format("%010d", incomeData.getPhoneNumber()).substring(0, 3),
                    String.format("%010d", incomeData.getPhoneNumber()).substring(3, 6),
                    String.format("%010d", incomeData.getPhoneNumber()).substring(6, 8),
                    String.format("%010d", incomeData.getPhoneNumber()).substring(8));

            return text;
        }

        @Override
        public String getCompanyName() {
            return incomeData.getCompany();
        }

        @Override
        public String getCountryName() {

            return countries.get(incomeData.getCountryCode());
        }
    }

    public interface IncomeData {
        String getCountryCode();

        String getCompany();

        String getContactFirstName();

        String getContactLastName();

        int getCountryPhoneCode();

        int getPhoneNumber();
    }

    public interface Customer {
        String getCompanyName();

        String getCountryName();
    }

    public interface Contact {
        String getName();

        String getPhoneNumber();
    }
}