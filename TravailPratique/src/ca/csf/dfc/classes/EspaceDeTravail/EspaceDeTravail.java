/**
 * 
 */
package ca.csf.dfc.classes.EspaceDeTravail;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import ca.csf.dfc.classes.Formes.Forme;

/**
 * @author jfoue
 *
 */
public class EspaceDeTravail extends JFrame
{
	int m_Largeur;
	int m_Hauteur;
	List<Forme> m_ListFome = new ArrayList<Forme>();
	
	public EspaceDeTravail(int p_Largeur, int p_Hauteur)
	{
		super("");
		setLargeur(p_Largeur);
		setHauteur(p_Hauteur);
	}
	
	/**
	 * Permet d'obtenir la largeur de l'espace de travail. 
	 * @return la largeur.
	 */
	public int getLargeur()
	{
		return this.m_Largeur;
	}
	
	/**
	 * Permet d'ajouter ou de modifier la largeur de l'espace de travail.
	 * @param p_Largeur
	 */
	private void setLargeur(int p_Largeur)
	{
		this.m_Largeur = p_Largeur;
	}
	
	/**
	 * Permet d'obtenir la hauteur de l'espace de travail. 
	 * @return la hauteur.
	 */
	public int getHauteur()
	{
		return this.m_Hauteur;
	}
	
	/**
	 * Permet d'ajouter ou de modifier la hauteur de l'espace de travail.
	 * @param p_Hauteur
	 */
	private void setHauteur(int p_Hauteur)
	{
		this.m_Hauteur = p_Hauteur;
	}
	
	/**
	 * 
	 */
	public void ajouterForme()
	{
		//code
	}
	
	/**
	 * 
	 */
	public void modifierForme()
	{
		//code
	}
}
