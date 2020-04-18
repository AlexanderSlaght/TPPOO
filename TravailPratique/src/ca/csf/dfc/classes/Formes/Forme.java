/**
 * 
 */
package ca.csf.dfc.classes.Formes;

import com.sun.prism.paint.Color;

/**
 * @author jfoue
 *
 */
public class Forme
{
	int m_HauteurDepart;
	int m_LargeurDepart;
	int m_HauteurFin;
	int m_LargeurFin;
	Color m_Couleur;
	Color m_CouleurRemplissage = Color.WHITE;
	
	/*
	 * Constructeur par defaut
	 */
	public Forme()
	{
		
	}
	
	/**
	 * Permet d'obtenir la hauteur de depart.
	 * @return la hauteur de depart
	 */
	public int getHauteurDepart()
	{
		return this.m_HauteurDepart;
	}
	
	/**
	 * Permet d'ajouter ou de modifier la hauteur de depart.
	 * @param p_HauteurDepart
	 */
	private void setHauteurDepart(int p_HauteurDepart)
	{
		this.m_HauteurDepart = p_HauteurDepart;
	}
	
	/**
	 * Permet d'obtenir la largeur de depart.
	 * @return la largeur de depart.
	 */
	public int getLargeurDepart()
	{
		return this.m_LargeurDepart;
	}
	
	/**
	 * Permet d'ajouter ou de modifier la largeur de depart.
	 * @param p_LargeurDepart
	 */
	private void setLargeurDepart(int p_LargeurDepart)
	{
		this.m_LargeurDepart = p_LargeurDepart;
	}
	
	/**
	 * Permet d'obtenir la hauteur finale.
	 * @return la hauteur finale.
	 */
	public int getHauteurFin()
	{
		return this.m_HauteurFin;
	}
	
	/**
	 * Permet d'ajouter ou de modifier la hauteur finale.
	 * @param p_HauteurFin
	 */
	private void setHauteurFin(int p_HauteurFin)
	{
		this.m_HauteurFin = p_HauteurFin;
	}
	
	/**
	 * Permet d'obtenir la largeur finale.
	 * @return la largeur finale.
	 */
	public int getLargeurFin()
	{
		return this.m_LargeurFin;
	}
	
	/**
	 * Permet d'ajouter ou de modifier la largeur finale.
	 * @param p_LargeurFin
	 */
	private void setLargeurFin(int p_LargeurFin)
	{
		this.m_LargeurFin = p_LargeurFin;
	}
	
	/**
	 * Permet d'obtenir la couleur des lignes de la formes.
	 * @return la couleur des lignes.
	 */
	public Color getCouleur()
	{
		return this.m_Couleur;
	}
	
	/**
	 * Permet d'ajouter ou de modifier la couleur de la forme.
	 * @param p_Couleur
	 */
	private void setCouleur(Color p_Couleur)
	{
		this.m_Couleur = p_Couleur;
	}
	
	/**
	 * Permet d'obtenir la couleur de remplissage de la forme.
	 * @return la couleur de remplissage de la forme.
	 */
	public Color getCouleurRemplissage()
	{
		return this.m_CouleurRemplissage;
	}
	
	/**
	 * Permet d'ajouter ou de modifier la couleur de remplissage de la forme.
	 * @param p_CouleurRemplissage
	 */
	private void setCouleurRemplissage(Color p_CouleurRemplissage)
	{
		this.m_CouleurRemplissage = p_CouleurRemplissage;
	}
		
}
