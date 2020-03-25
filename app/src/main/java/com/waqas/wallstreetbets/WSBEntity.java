package com.waqas.wallstreetbets;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.sql.Date;
import java.sql.Time;

@Entity
public class WSBEntity {
    @PrimaryKey
    private final Integer id;

    private String name;

    @ColumnInfo(name = "Symbol")
    private String symbol;

    @ColumnInfo(name = "Price")
    private Float price;

    @ColumnInfo(name = "Type")
    private String type;

    @ColumnInfo(name = "Strike")
    private Integer strike;

    @ColumnInfo(name = "Exp Date")
    private Date expDate;

    @ColumnInfo(name = "DTE")
    private Integer DTE;

    @ColumnInfo(name = "Bid")
    private Integer bid;

    @ColumnInfo(name = "Midpoint")
    private Integer midpoint;

    @ColumnInfo(name = "Ask")
    private Integer ask;

    @ColumnInfo(name = "Last")
    private Integer last;

    @ColumnInfo(name = "Volume")
    private Integer volume;

    @ColumnInfo(name = "Open Int")
    private Integer openInterest;

    @ColumnInfo(name = "IV")
    private String IV;

    @ColumnInfo(name = "Time")
    private Time time;

    public WSBEntity(Integer uid, Integer id, String name, String symbol, Float price, String type, Integer strike, Date expDate, Integer dte, Integer bid, Integer midpoint, Integer ask, Integer last, Integer volume, Integer openInterest, String iv, Time time) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.price = price;
        this.type = type;
        this.strike = strike;
        this.expDate = expDate;
        DTE = dte;
        this.bid = bid;
        this.midpoint = midpoint;
        this.ask = ask;
        this.last = last;
        this.volume = volume;
        this.openInterest = openInterest;
        IV = iv;
        this.time = time;
    }

    public WSBEntity(Integer id) {
        this.id = id;
    }
}
