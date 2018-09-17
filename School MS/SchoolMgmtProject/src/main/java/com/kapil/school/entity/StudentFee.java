package com.kapil.school.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "fee")
public class StudentFee implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -1675331228092848572L;

	/**
	 *
	 */
	public StudentFee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param amount
	 * @param createDateTime
	 * @param updateDateTime
	 * @param student
	 */
	public StudentFee(int id, double amount, LocalDateTime createDateTime, LocalDateTime updateDateTime,
			Student student) {
		super();
		this.id = id;
		this.amount = amount;
		this.createDateTime = createDateTime;
		this.updateDateTime = updateDateTime;
		this.student = student;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "fee_id", updatable = false, nullable = false)
	private int id;

	@Column(name = "amountReceived")
	private double amount;

	@Column
	@CreationTimestamp
	private LocalDateTime createDateTime;

	@Column
	@UpdateTimestamp
	private LocalDateTime updateDateTime;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the createDateTime
	 */
	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	/**
	 * @param createDateTime the createDateTime to set
	 */
	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	/**
	 * @return the updateDateTime
	 */
	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	/**
	 * @param updateDateTime the updateDateTime to set
	 */
	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
}
