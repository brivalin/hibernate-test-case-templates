package org.hibernate.bugs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class LobModel {

    @Id
    @GeneratedValue
    protected int id;
    
    @Lob
    protected String clob;
    
    @Lob
    protected byte[] blob;
    
    public LobModel() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClob() {
        return clob;
    }

    public void setClob(String clob) {
        this.clob = clob;
    }

    public byte[] getBlob() {
        return blob;
    }

    public void setBlob(byte[] blob) {
        this.blob = blob;
    }
}
