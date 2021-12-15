package entities;

import java.util.ArrayList;

import entities.extension.*;

public class Libreria {
	private ArrayList<Cliente> clients = new ArrayList<Cliente>();
	private ArrayList<Libro> books = new ArrayList<Libro>();
	private double cashRegister;
	
	// Constructor
	public Libreria()
	{
		this.cashRegister = 1000000;
	}
	
	// Getters y Setters
	public double getCashRegister() {
		return cashRegister;
	}

	public void setCashRegister(double cashRegister) {
		this.cashRegister = cashRegister;
	}

	public ArrayList<Cliente> getClients() {
		return clients;
	}

	public ArrayList<Libro> getBooks() {
		return books;
	}
	
	// Metodos Funcionales
	public Libro findBookByIsbn(String isbn)
	{
		Libro result = null;
		
		for (Libro book: this.books)
			if (book.getIsbn() == isbn)
				result = book;
		
		return result;
	}
	
	public Libro findBookByTitle(String title)
	{
		Libro result = null;
		
		for (Libro book: this.books)
			if (book.getTitle() == title)
				result = book;
		
		return result;
	}
	
	public boolean newBook(String isbn, String title, float priceV, float priceC, int amount)
	{
		boolean result = false;
		Libro book = this.findBookByIsbn(isbn);
		
		if (book == null)
		{
			this.books.add(new Libro(isbn, title, priceV, priceC, amount));
			result = true;
		}
		
		return result;
	}
	
	public boolean removeBook(String isbn)
	{
		boolean result = false;
		Libro book = this.findBookByIsbn(isbn);
		
		if (book != null)
		{
			this.books.remove(book);
			result = true;
		}
		
		return result;
	}
	
	public void newClient(int ci, String names, String lastnames)
	{
		this.clients.add(new Cliente(ci, names, lastnames));
	}
	
	public Cliente findClient(int ci)
	{
		Cliente result = null;
		
		for (Cliente client: this.clients)
			if (client.getCi() == ci)
				result = client;
		
		return result;
	}
	
	public float promQualificationBook(String isbn)
	{
		float result = 0;
		int counter = 0;
		
		Libro book = this.findBookByIsbn(isbn);
		
		if (book != null)
			for (Comentario comment: book.getComentaries())
			{
				counter++;
				result += comment.getQualification();
			}
		
		if (result != 0 && counter !=0)
			result /= counter;
		
		return result;
	}
	
	public int booksWhithComments()
	{
		int result = 0;
		
		for (Libro book: this.books)
			if (book.getComentaries().size() != 0)
				result++;
		
		return result;
	}
	
	public void addCommentToBook(String isbn, int ci, String comment, int qualification)
	{
		Cliente client = this.findClient(ci);
		
		if (client != null)
			for (Libro book: this.books)
				if (book.getIsbn() == isbn)
					book.addComentary(comment, qualification, client);
	}
}
