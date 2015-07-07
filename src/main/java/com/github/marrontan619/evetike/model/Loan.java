package com.github.marrontan619.evetike.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(
       name = "loan",
       uniqueConstraints = @UniqueConstraint(columnNames = {"ticket_id", "lender_id", "borrower_id"})
)
public class Loan {

    @Id
    @Column(name = "loan_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int loanId;

    @Column(name = "ticket_id", nullable = false)
    private int ticketId;

    @Column(name = "lender_id", nullable = false)
    private String lenderId;

    @Column(name = "borrower_id", nullable = false)
    private String borrowerId;

    @Column(name = "cleared_flag", nullable = false)
    private boolean clearedFlag;

    @Column(name = "note")
    private String note;

    protected Loan() {};

    public Loan(int ticketId, String lenderId, String borrowerId, boolean cleardFlag) {
        this.ticketId = ticketId;
        this.lenderId = lenderId;
        this.borrowerId = borrowerId;
        this.clearedFlag = cleardFlag;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getLenderId() {
        return lenderId;
    }

    public void setLenderId(String lenderId) {
        this.lenderId = lenderId;
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId;
    }

    public boolean isClearedFlag() {
        return clearedFlag;
    }

    public void setClearedFlag(boolean clearedFlag) {
        this.clearedFlag = clearedFlag;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
