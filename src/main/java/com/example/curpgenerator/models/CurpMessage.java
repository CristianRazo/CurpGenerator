package com.example.curpgenerator.models;

public class CurpMessage extends Message {
    private String curp;

    public CurpMessage(String curpMessage) {
        super(curpMessage);
        this.setInfoMessage("Curp Generada");
        this.curp = curpMessage;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
}
