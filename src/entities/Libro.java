package entities;

import java.util.*;

import entities.extension.Cliente;
import entities.extension.Comentario;

public class Libro
{
	private String isbn, title;
	private float priceV, priceC;
	private int amount;
	private ArrayList<Comentario> comentaries = new ArrayList<Comentario>();
	
	public Libro() {}
	
	public Libro(String isbn, String title, float priceV, float priceC, int amount)
	{
		this.isbn = isbn;
		this.title = title;
		this.priceV = priceV;
		this.priceC = priceC;
		this.amount = amount;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public float getPriceC() {
		return priceC;
	}
	
	public void setPriceC(float priceC) {
		this.priceC = priceC;
	}
	
	public float getPriceV() {
		return priceV;
	}
	
	public void setPriceV(float priceV) {
		this.priceV = priceV;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	public ArrayList<Comentario> getComentaries() {
		return this.comentaries;
	}

	public void addComentary(String comment, int qualification, Cliente client) {
		this.comentaries.add(new Comentario(comment, qualification, client));
	}
}
