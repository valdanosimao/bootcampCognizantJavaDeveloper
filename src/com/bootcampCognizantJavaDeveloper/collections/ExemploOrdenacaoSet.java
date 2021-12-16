package com.bootcampCognizantJavaDeveloper.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {

	 public static void main(String[] args) {

	        System.out.println("--\tOrdem aleat�ria\t--");
	        Set<Serie> minhasSeries = new HashSet<>(){{
	            add(new Serie("got", "fantasia", 60));
	            add(new Serie("dark", "drama", 60));
	            add(new Serie("that '70s show", "com�dia", 25));
	        }};
	        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - "
	                + serie.getGenero() + " - " + serie.getTempoEpisodio());

	        System.out.println("--\tOrdem inser��o\t--");
	        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
	            add(new Serie("got", "fantasia", 60));
	            add(new Serie("dark", "drama", 60));
	            add(new Serie("that '70s show", "com�dia", 25));
	        }};
	        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - "
	                + serie.getGenero() + " - " + serie.getTempoEpisodio());

	        System.out.println("--\tOrdem natural (TempoEpisodio)\t--");
	        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
	        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - "
	                + serie.getGenero() + " - " + serie.getTempoEpisodio());

	        System.out.println("--\tOrdem Nome/G�nero/TempoEpisodio\t--");
	        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
	        minhasSeries3.addAll(minhasSeries);
	        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - "
	                + serie.getGenero() + " - " + serie.getTempoEpisodio());

	//Pra voc�
	/*        System.out.println("--\tOrdem g�nero\t--");
	          System.out.println("--\tOrdem Tempo Epis�dio\t--");
	 */

	    }
	
}
