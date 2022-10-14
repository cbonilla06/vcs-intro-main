package com.java.peeps.vcsintro.entity;

import javax.persistence.Entity;
import java.util.Date;

public class ApplicationForm {

    private long id;
    private int stateId;
    private String txnId;
    private String createdBy;
    private Date createdAt;
    private Date updatedAt;

    public ApplicationForm() {
    }

    public ApplicationForm(long id, int stateId, String txnId, String createdBy, Date createdAt, Date updatedAt) {
        this.id = id;
        this.stateId = stateId;
        this.txnId = txnId;
        this.createdBy = createdBy;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getTxnId() {
        return txnId;
    }

    public void setTxnId(String txnId) {
        this.txnId = txnId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
