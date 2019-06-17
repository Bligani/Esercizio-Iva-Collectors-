package esercizioIva.collection.interfaces;

import java.util.Collection;

import esercizioIva.collection.classes.Prodotto;

public interface OrderCollection {
	void ordNome (Collection<Prodotto> lista);
	void ordIva (Collection<Prodotto> lista);
}
