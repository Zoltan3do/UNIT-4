package entities;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("Atletica")
@Table(name="atletica")

public class GaraDiAtletica extends Evento{ 
	
	public GaraDiAtletica() {}
	
	public GaraDiAtletica(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipoEvento,
			int maxPartecipanti) {
		super(titolo, dataEvento, descrizione, tipoEvento, maxPartecipanti);
	}

	@ManyToMany(mappedBy="gare")
	private Set<Persona> atleti;
	
	
    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

	@Override
	public String toString() {
		return "GaraDiAtletica [atleti=" + atleti + "]";
	}
	
    
   

}
