package DadosAlunos;

public class Aluno {

	private String nome;
	private String sobrenome;
	private String nomePai;
	private String nomeMae;
	private Double notaUni1;
	private Double notaUni2;
	private String media;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public Double getNotaUni1() {
		return notaUni1;
	}
	public void setNotaUni1(Double notaUni1) {
		this.notaUni1 = notaUni1;
	}
	public Double getNotaUni2() {
		return notaUni2;
	}
	public void setNotaUni2(Double notaUni2) {
		this.notaUni2 = notaUni2;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + ", nomePai=" + nomePai + ", nomeMae=" + nomeMae
				+ ", notaUni1=" + notaUni1 + ", notaUni2=" + notaUni2 + ", media=" + media + ", getNome()=" + getNome()
				+ ", getSobrenome()=" + getSobrenome() + ", getNomePai()=" + getNomePai() + ", getNomeMae()="
				+ getNomeMae() + ", getNotaUni1()=" + getNotaUni1() + ", getNotaUni2()=" + getNotaUni2()
				+ ", getMedia()=" + getMedia() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((media == null) ? 0 : media.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
		result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
		result = prime * result + ((notaUni1 == null) ? 0 : notaUni1.hashCode());
		result = prime * result + ((notaUni2 == null) ? 0 : notaUni2.hashCode());
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (media == null) {
			if (other.media != null)
				return false;
		} else if (!media.equals(other.media))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeMae == null) {
			if (other.nomeMae != null)
				return false;
		} else if (!nomeMae.equals(other.nomeMae))
			return false;
		if (nomePai == null) {
			if (other.nomePai != null)
				return false;
		} else if (!nomePai.equals(other.nomePai))
			return false;
		if (notaUni1 == null) {
			if (other.notaUni1 != null)
				return false;
		} else if (!notaUni1.equals(other.notaUni1))
			return false;
		if (notaUni2 == null) {
			if (other.notaUni2 != null)
				return false;
		} else if (!notaUni2.equals(other.notaUni2))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		return true;
	}
	
	
}
