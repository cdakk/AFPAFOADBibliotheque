package les_bibliotheques.metier;

public class BibliothequesException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BibliothequesException()
	{
		super("Emprunt de livre impossible !!!");
	}
	
	public BibliothequesException(String message)
	{
		super(message);
	}
}
