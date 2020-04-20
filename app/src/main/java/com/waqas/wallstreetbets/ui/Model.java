package com.waqas.wallstreetbets.ui;

import java.util.Date;

public class Model {

    private Integer ID;
    private Date Date_Inserted;
    private String Symbol;
    private Double Price;
    private String Type;
    private Double Strike;
    private Date Exp_Date;
    private Integer DTE;
    private Double Bid;
    private Double Midpoint;
    private Double Ask;
    private Double Last;
    private Integer Volume;
    private Integer Open_Int;
    private Double Vol_OI;
    private Double IV;
    private String Time;


    public Integer getID() {
        return ID;
    }

    public Date getDate_Inserted() {
        return Date_Inserted;
    }

    public String getSymbol() {
        return Symbol;
    }

    public Double getPrice() {
        return Price;
    }

    public String getType() {
        return Type;
    }

    public Double getStrike() {
        return Strike;
    }

    public Date getExp_Date() {
        return Exp_Date;
    }

    public Integer getDTE() {
        return DTE;
    }

    public Double getBid() {
        return Bid;
    }

    public Double getMidpoint() {
        return Midpoint;
    }

    public Double getAsk() {
        return Ask;
    }

    public Double getLast() {
        return Last;
    }

    public Integer getVolume() {
        return Volume;
    }

    public Integer getOpen_Int() {
        return Open_Int;
    }

    public Double getVol_OI() {
        return Vol_OI;
    }

    public Double getIV() {
        return IV;
    }

    public String getTime() {
        return Time;
    }

}


//            ID = db.Column(db.Integer, primary_key=True)
//            Date_Inserted = db.Column('Date Inserted', db.Date, nullable=False)
//            Symbol = db.Column(db.Text, nullable=False)
//            Price = db.Column(db.DECIMAL(10, 2), nullable=False)
//            Type = db.Column(db.Text, nullable=False)

//            Strike = db.Column(db.DECIMAL(10, 2), nullable=False)
//            Exp_Date = db.Column('Exp Date', db.Date, nullable=False)
//            DTE = db.Column(db.Integer, nullable=False)
//            Bid = db.Column(db.DECIMAL(10, 2), nullable=False)
//            Midpoint = db.Column(db.DECIMAL(10, 2), nullable=False)
//            Ask = db.Column(db.DECIMAL(10, 2), nullable=False)
//            Last = db.Column(db.DECIMAL(10, 2), nullable=False)
//            Volume = db.Column(db.Integer, nullable=False)
//            Open_Int = db.Column('Open Int', db.Integer, nullable=False)
//            Vol_OI = db.Column('Vol/OI', db.DECIMAL(10, 2), nullable=False)
//            IV = db.Column(db.DECIMAL(5, 2), nullable=False)
//            Time = db.Column(db.Time, nullable=False)