package esercizioIva.collection.classes;

import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import esercizioIva.collection.interfaces.OrderCollection;

public class OrdineInverso implements OrderCollection{

	
	public void ordNome(Collection<Prodotto> lista) {
		Comparator<Prodotto> compareNome = new Comparator<Prodotto>() {
				public int compare (Prodotto a,Prodotto b) {
					return b.getNomeProdotto().compareTo(a.getNomeProdotto());
				}
			};
			Collections.sort((List<Prodotto>)lista, compareNome);
		}

	public void ordIva(Collection<Prodotto> lista) {
		//lista.stream().sorted(    (a,b)    ->    b.getIvaProdotto() - a.getIvaProdotto()  ).collect(Collectors.toList());
		Comparator<Prodotto> compareIva = new Comparator<Prodotto>() {
			public int compare (Prodotto a,Prodotto b) {
				return b.getIvaProdotto() - a.getIvaProdotto();
			}
		};
		Collections.sort((List<Prodotto>)lista, compareIva);
	}

}
