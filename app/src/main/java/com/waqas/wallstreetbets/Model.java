package com.waqas.wallstreetbets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Model {

    @SerializedName("ID")
    private Integer ID;
    @SerializedName("Date_Inserted")
    @Expose
    private Date Date_Inserted;
    @SerializedName("Symbol")
    private String Symbol;
    @SerializedName("Price")
    private Double Price;
    @SerializedName("Type")
    private String Type;
    @SerializedName("Strike")
    private Double Strike;
    @SerializedName("Exp_Date")
    private Date Exp_Date;
    @SerializedName("DTE")
    private Integer DTE;
    @SerializedName("Bid")
    private Double Bid;
    @SerializedName("Midpoint")
    private Double Midpoint;
    @SerializedName("Ask")
    private Double Ask;
    @SerializedName("Last")
    private Double Last;
    @SerializedName("Volume")
    private Integer Volume;
    @SerializedName("Open_Int")
    private Integer Open_Int;
    @SerializedName("Vol_OI")
    private Double Vol_OI;
    @SerializedName("IV")
    private Double IV;
    @SerializedName("Time")
    private String Time;

    public void setType(String type) {
         Type = type;
    }

    public Integer getID() {
        return ID;
    }

    public String getDate_Inserted() {
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String date_inserted = sdf.format(Date_Inserted);
        return date_inserted;
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

    public String getExp_Date() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM YYYY");
        String expdate = sdf.format(Exp_Date);
        return expdate;
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