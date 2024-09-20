package entities;


import java.util.Date;


public class Pessoa {
	
	public int pes_id;
	public String pes_nome;
	public Date pes_data_nascimento;
	private String pes_sexo;
	private String pes_mae;
	private String pes_pai;
	public String enereco_completo;
	private String email;
	private String telefone;
	public String foto;
	
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Pessoa(int pes_id, String pes_nome, Date pes_data_nascimento, String pes_sexo, String pes_mae,
			String pes_pai, String enereco_completo, String email, String telefone, String foto) {
		super();
		this.pes_id = pes_id;
		this.pes_nome = pes_nome;
		this.pes_data_nascimento = pes_data_nascimento;
		this.pes_sexo = pes_sexo;
		this.pes_mae = pes_mae;
		this.pes_pai = pes_pai;
		this.enereco_completo = enereco_completo;
		this.email = email;
		this.telefone = telefone;
		this.foto = foto;
	}



	public String getPes_sexo() {
		return pes_sexo;
	}



	public void setPes_sexo(String pes_sexo) {
		this.pes_sexo = pes_sexo;
	}



	public String getPes_mae() {
		return pes_mae;
	}



	public void setPes_mae(String pes_mae) {
		this.pes_mae = pes_mae;
	}



	public String getPes_pai() {
		return pes_pai;
	}



	public void setPes_pai(String pes_pai) {
		this.pes_pai = pes_pai;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	



	
	
	
	
	
	

}
