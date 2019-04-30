package metier;

import dao.IEleveDAO;
import entities.Eleve;
import entities.Epreuve;


public interface IEleveService extends IEleveDAO {


	public String ImprimerConvocation(Eleve eleve, Epreuve epreuve);
}
