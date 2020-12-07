package com.kharitonov.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class Country extends ProjectEntity {
    private String code;
    private String name;
    private String continent;
    private String region;
    private Float surfaceArea;
    private Short indepYear;
    private Integer population;
    private Float lifeExpectancy;
    private Float gnp;
    private Float gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;

    public Country() {
    }

    public Country(String code) {
        this.code = code;
    }

    @Id
    @Column(name = "Code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Continent")
    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Column(name = "Region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Column(name = "SurfaceArea")
    public Float getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    @Column(name = "IndepYear")
    public Short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
    }

    @Column(name = "Population")
    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Column(name = "LifeExpectancy")
    public Float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    @Column(name = "GNP")
    public Float getGnp() {
        return gnp;
    }

    public void setGnp(Float gnp) {
        this.gnp = gnp;
    }

    @Column(name = "GNPOld")
    public Float getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(Float gnpOld) {
        this.gnpOld = gnpOld;
    }

    @Column(name = "LocalName")
    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    @Column(name = "GovernmentForm")
    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentFrom) {
        this.governmentForm = governmentFrom;
    }

    @Column(name = "HeadOfState")
    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    @Column(name = "Capital")
    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    @Column(name = "Code2")
    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("code='").append(code).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", continent='").append(continent).append('\'');
        sb.append(", region='").append(region).append('\'');
        sb.append(", surfaceArea=").append(surfaceArea);
        sb.append(", indepYear=").append(indepYear);
        sb.append(", population=").append(population);
        sb.append(", lifeExpectancy=").append(lifeExpectancy);
        sb.append(", gnp=").append(gnp);
        sb.append(", gnpOld=").append(gnpOld);
        sb.append(", localName='").append(localName).append('\'');
        sb.append(", governmentFrom='").append(governmentForm).append('\'');
        sb.append(", headOfState='").append(headOfState).append('\'');
        sb.append(", capital=").append(capital);
        sb.append(", code2='").append(code2).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
