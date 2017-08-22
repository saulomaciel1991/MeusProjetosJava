/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Textee {
    	public static void main(String[] args) {
		try {
			Date agora = new Date();
			DateFormat f24h = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			DateFormat f12h = new SimpleDateFormat("dd/MM/yyyy hh:mm");
			Date dt24 = f24h.parse("21/05/2010 15:30");
			Date dt12 = f12h.parse("21/05/2010 15:30");
			System.out.println("\n formato de 24 horas");
			System.out.println(f24h.format(dt12));
			System.out.println(f24h.format(dt24));
			System.out.println(f24h.format(agora));
			System.out.println("\n hh:mm formato de 12 horas am/pm");
			System.out.println(f12h.format(dt12));
			System.out.println(f12h.format(dt24));
			System.out.println(f12h.format(agora));			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

