package br.com.bnback.pessoa.pessoafisica;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_pessoa")
@Entity
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String trabalho;

	public Pessoa() {
	}

	public Product(String name, Double trabalho) {
		super();
		this.name = name;
		this.trabalho = trabalho;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.description = name;
	}

	public Double gettrabalho() {
		return trabalho;
	}

	public void settrabalho(Double price) {
		this.trabalho = trabalho;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

}
