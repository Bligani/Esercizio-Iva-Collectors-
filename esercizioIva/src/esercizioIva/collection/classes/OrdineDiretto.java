package esercizioIva.collection.classes;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import esercizioIva.collection.interfaces.OrderCollection;

public class OrdineDiretto implements OrderCollection{

		/*Creo un metodo che riordina il listino mettendo i prodotti in ordine alfabetico in base al nome.
		 * In input prende una Collection e in output ne restituisce una nuova. 
		 * Quindi esiste ancora l'oggetto vecchio non ordinato.*/
	public void ordNome(Collection<Prodotto> lista) {
		/*Faccio uno stream sull'argomento lista.
		 * sorted() contiene le istruzioni per confrontare una coppia di oggetti. 
		 * Lo stream ordina tutta la lista ripetendo il confronto pi� volte.
		 * A.compareTo(b) � negativo se A � minore di B, 0 se sono uguali, positivo se A � maggiore di B.
		 * sorted(...).collect(COLLETTORE) serve per rimettere i prodotti in collettore di tipo lista.*/
		// lista.stream().sorted(    (a,b)    ->    a.getNomeProdotto().compareTo(b.getNomeProdotto())  ).collect(Collectors.toList());
		Comparator<Prodotto> compareName = new Comparator<Prodotto>() {
				public int compare (Prodotto a,Prodotto b) {
				return a.getNomeProdotto().compareTo(b.getNomeProdotto());
			}
		};
		Collections.sort((List<Prodotto>)lista, compareName);	
	}

	/*Creo un metodo che riordina il listino mettendo i prodotti in ordine di Iva crescente*/
	public void ordIva(Collection<Prodotto> lista) {
		//lista.stream().sorted(    (a,b)    ->    a.getIvaProdotto() - b.getIvaProdotto()  ).collect(Collectors.toList());
		Comparator<Prodotto> compareIva = new Comparator<Prodotto>() {
			public int compare (Prodotto a,Prodotto b) {
				return a.getIvaProdotto() - b.getIvaProdotto();
			}
		};
		Collections.sort((List<Prodotto>)lista, compareIva);
	}

}
