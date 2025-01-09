package model;

import java.util.Date;

public class ShipmentDetails {
	private int id;
	private int transaction_id;
	private Status status;
	private String current_position;
	private String evidence;
	private Date date;
	private String update_by;

	public ShipmentDetails(int id, int transaction_id, Status status, String current_position, String evidence, Date date, String update_by) {
		this.id = id;
		this.transaction_id = transaction_id;
		this.status = status;
		this.current_position = current_position;
		this.evidence = evidence;
		this.date = date;
		this.update_by = update_by;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getCurrent_position() {
		return current_position;
	}

	public void setCurrent_position(String current_position) {
		this.current_position = current_position;
	}

	public String getEvidence() {
		return evidence;
	}

	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getUpdate_by() {
		return update_by;
	}

	public void setUpdate_by(String update_by) {
		this.update_by = update_by;
	}
}