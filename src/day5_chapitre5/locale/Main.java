package day5_chapitre5.locale;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		/*
		// 1-Pick a Locale, celle par défaut
		Locale locale = Locale.getDefault();
		System.out.println(locale); 
		//2-Locales prédéfinies
		System.out.println(Locale.GERMAN); // de
		System.out.println(Locale.GERMANY); // de_DE 
		//3-via le constructeurs
		Locale localeHi = new Locale("hi", "IN");
		System.out.println(localeHi); 
		//4-via le Builder
		Locale localeUs = new Locale.Builder().setLanguage("en").setRegion("US").build();
		System.out.println(localeUs);*/
		/*
		System.out.println(Locale.getDefault()); 
		Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
		//System.out.println(locale);
		
		
		Locale.setDefault(locale); // change the default
		System.out.println(Locale.getDefault()); */
		
		//Récupération de la ressource Bundle Zoo selon la locale
		Locale locale = new Locale("fr","FR");
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
		
		/*String valueHello = rb.getString("hello");
		String valueOpen = rb.getString("open");
		
		System.out.println(valueHello + " "+valueOpen);*/
		
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		String msg = props.getProperty("hello");
		System.out.println(MessageFormat.format(msg, "Amine"));
		//System.out.println(props.getProperty("hello")); //null
		//System.out.println(props.getProperty("open"));
		//System.out.println(props.getProperty("hello2", "valeur introuvable"));
		
		int attendeesPerYear = 3_200_000;
		int attendeesPerMonth = attendeesPerYear / 12;
		NumberFormat ar = NumberFormat.getInstance(new Locale("ar", "BH"));
		System.out.println(ar.format(attendeesPerMonth));
		
		double price = 48;
		//NumberFormat us = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		NumberFormat us = NumberFormat.getCurrencyInstance();
		System.out.println(us.format(price));
		
		LocalDateTime  ldt = LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(ldt.format(shortDateTime));
		System.out.println(shortDateTime.format(ldt));

	}

}
