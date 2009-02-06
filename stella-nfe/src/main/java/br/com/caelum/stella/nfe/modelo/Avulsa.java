/**
 * 
 */
package br.com.caelum.stella.nfe.modelo;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Avulsa ", propOrder = { "cnpj", "xOrgao", "matr", "xAgente", "fone", "uf", "ndar", "dEmi", "vdar",
        "repEmi", "dPag" })
public class Avulsa {

    @XmlElement(name = "CNPJ", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cnpj;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xOrgao;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String matr;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xAgente;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String fone;

    @XmlElement(name = "UF", required = true)
    protected TUf uf;

    @XmlElement(name = "nDAR", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ndar;

    @XmlElement(required = true)
    protected String dEmi;

    @XmlElement(name = "vDAR", required = true)
    protected String vdar;

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String repEmi;

    protected String dPag;

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(final String value) {
        cnpj = value;
    }

    public String getXOrgao() {
        return xOrgao;
    }

    public void setXOrgao(final String value) {
        xOrgao = value;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(final String value) {
        matr = value;
    }

    public String getXAgente() {
        return xAgente;
    }

    public void setXAgente(final String value) {
        xAgente = value;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(final String value) {
        fone = value;
    }

    public TUf getUF() {
        return uf;
    }

    public void setUF(final TUf value) {
        uf = value;
    }

    public String getNDAR() {
        return ndar;
    }

    public void setNDAR(final String value) {
        ndar = value;
    }

    public String getDEmi() {
        return dEmi;
    }

    public void setDEmi(final Calendar calendar) {
        dEmi = calendar.toString(); // TODO formatar isso
    }

    public String getVDAR() {
        return vdar;
    }

    public void setVDAR(final String value) {
        vdar = value;
    }

    public String getRepEmi() {
        return repEmi;
    }

    public void setRepEmi(final String value) {
        repEmi = value;
    }

    public String getDPag() {
        return dPag;
    }

    public void setDPag(final Calendar calendar) {
        dPag = calendar.toString(); // TODO formatar isso
    }

}