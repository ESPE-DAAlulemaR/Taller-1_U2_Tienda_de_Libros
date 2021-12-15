package entities.extension;

public class Comentario {
	private String comment;
	private int qualification;
	private Cliente client;
	
	public Comentario() {}
	
	public Comentario(String comment, int qualification, Cliente client)
	{
		this.comment = comment;
		this.qualification = qualification;
		this.client = client;
	}
	
	public String getComment() {
		return comment;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getQualification() {
		return qualification;
	}

	public void setQualification(int qualification) {
		this.qualification = qualification;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}
}
