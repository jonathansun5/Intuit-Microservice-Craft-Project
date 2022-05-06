package com.demo.intuitcraftexercise.player;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Player {

    @Id
//    @Column(name = "PR_KEY", unique = true)
    private String playerid;

    private String birthyear;

    private String birthmonth;

    private String birthday;

    private String birthcountry;

    private String birthstate;

    private String birthcity;

    private String deathyear;

    private String deathmonth;

    private String deathday;

    private String deathcountry;

    private String deathstate;

    private String deathcity;

    private String namefirst;

    public Player() {
    }

    public Player(String playerid, String birthyear, String birthmonth, String birthday, String birthcountry, String birthstate, String birthcity, String deathyear, String deathmonth, String deathday, String deathcountry, String deathstate, String deathcity, String namefirst) {
        this.playerid = playerid;
        this.birthyear = birthyear;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthcountry = birthcountry;
        this.birthstate = birthstate;
        this.birthcity = birthcity;
        this.deathyear = deathyear;
        this.deathmonth = deathmonth;
        this.deathday = deathday;
        this.deathcountry = deathcountry;
        this.deathstate = deathstate;
        this.deathcity = deathcity;
        this.namefirst = namefirst;
    }

    public String getPlayerid() {
        return playerid;
    }

    public void setPlayerid(String playerid) {
        this.playerid = playerid;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(String birthmonth) {
        this.birthmonth = birthmonth;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBirthcountry() {
        return birthcountry;
    }

    public void setBirthcountry(String birthcountry) {
        this.birthcountry = birthcountry;
    }

    public String getBirthstate() {
        return birthstate;
    }

    public void setBirthstate(String birthstate) {
        this.birthstate = birthstate;
    }

    public String getBirthcity() {
        return birthcity;
    }

    public void setBirthcity(String birthcity) {
        this.birthcity = birthcity;
    }

    public String getDeathyear() {
        return deathyear;
    }

    public void setDeathyear(String deathyear) {
        this.deathyear = deathyear;
    }

    public String getDeathmonth() {
        return deathmonth;
    }

    public void setDeathmonth(String deathmonth) {
        this.deathmonth = deathmonth;
    }

    public String getDeathday() {
        return deathday;
    }

    public void setDeathday(String deathday) {
        this.deathday = deathday;
    }

    public String getDeathcountry() {
        return deathcountry;
    }

    public void setDeathcountry(String deathcountry) {
        this.deathcountry = deathcountry;
    }

    public String getDeathstate() {
        return deathstate;
    }

    public void setDeathstate(String deathstate) {
        this.deathstate = deathstate;
    }

    public String getDeathcity() {
        return deathcity;
    }

    public void setDeathcity(String deathcity) {
        this.deathcity = deathcity;
    }

    public String getNamefirst() {
        return namefirst;
    }

    public void setNamefirst(String namefirst) {
        this.namefirst = namefirst;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerid='" + playerid + '\'' +
                ", birthyear='" + birthyear + '\'' +
                ", birthmonth='" + birthmonth + '\'' +
                ", birthday='" + birthday + '\'' +
                ", birthcountry='" + birthcountry + '\'' +
                ", birthstate='" + birthstate + '\'' +
                ", birthcity='" + birthcity + '\'' +
                ", deathyear='" + deathyear + '\'' +
                ", deathmonth='" + deathmonth + '\'' +
                ", deathday='" + deathday + '\'' +
                ", deathcountry='" + deathcountry + '\'' +
                ", deathstate='" + deathstate + '\'' +
                ", deathcity='" + deathcity + '\'' +
                ", namefirst='" + namefirst + '\'' +
                '}';
    }
}
