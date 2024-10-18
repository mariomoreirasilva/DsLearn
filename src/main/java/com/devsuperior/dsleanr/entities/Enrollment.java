//matricula da pessoa enrollment
package com.devsuperior.dsleanr.entities;

import java.time.Instant;

import com.devsuperior.dsleanr.entities.pk.EnrollmentPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {
	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();//chave da associação. Tem que ter a classe auxiliar pois a JPA não implementa associação. TEM QUE INSTANCIAR POIS É CLASSE MINHA, TIPO MEU
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refundMoment; //reembolso se pedir
	
	private boolean avaliable; //maticula esta válida?
	
	private boolean onlyUpdate; //matricula regular ou só de atualização
	
	public Enrollment() {
		
	}

	public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean avaliable,
			boolean onlyUpdate) {
		super();
		id.setUser(user); //no construtor apagar o id da classe e coloca os ids das classes associativas user e offer
		id.setOffer(offer);
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.avaliable = avaliable;
		this.onlyUpdate = onlyUpdate;
	}

//	public EnrollmentPK getId() {
//		return id;
//	}
//
//	public void setId(EnrollmentPK id) {
//		this.id = id;
//	}
	//pegar o get e set do usuário e da oferta e não da classe auxiliar 
	public User getStudent() {
		return id.getUser();
	}
	
	public void setStudent(User user) {
		id.setUser(user);
	}
	
	public Offer getOffer() {
		return id.getOffer();
	}
	
	public void setOffer(Offer offer) {
		id.setOffer(offer);
	}

	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefundMoment() {
		return refundMoment;
	}

	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}

	public boolean isAvaliable() {
		return avaliable;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}
	
	

}
