package Models;

import java.util.Date;

public class Borrow {

	private int stdID;
	private int bookId;
	private Date borrowDate;
	private Date deadLine;

	public Borrow(int stdID, int bookId, Date borrowDate, Date deadLine) {
		this.stdID = stdID;
		this.bookId = bookId;
		this.borrowDate = borrowDate;
		this.deadLine = deadLine;
	}

	public int getStdID() {
		return this.stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public Date getBorrowDate() {
		return this.borrowDate;
	}

	public void setBorrowDate(Date borrowDate) {
		this.borrowDate = borrowDate;
	}

	public Date getDeadLine() {
		return this.deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

}
