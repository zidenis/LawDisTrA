/**
 * This class is generated by jOOQ
 */
package br.unb.sma.entities;


import javax.annotation.Generated;
import java.io.Serializable;
import java.sql.Date;


/**
 * Processos Judiciais Autuados. Os processos possuem uma identificacao interna
 * COD_PROCESSO utilizada no banco de dados e uma identificacao padrao (numeracao
 * unica) utilizada em todos os ramos do Poder Judiciario. A identificacao
 * padrao e utilizada desde jan/2010 no TST e possui o formato numerico de
 * 20 digitos NNNNNNN-DD.AAAA.J.TR.OOOO
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.7.3"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Processo implements Serializable {

    private static final long serialVersionUID = 395667578;

    private Long codProcesso;
    private Integer numProcesso;
    private Byte numDigito;
    private Short anoProcesso;
    private Byte numSegmento;
    private Byte numTribunal;
    private Short numOrigem;
    private Date dtaAutuacao;

    public Processo() {
    }

    public Processo(Processo value) {
        this.codProcesso = value.codProcesso;
        this.numProcesso = value.numProcesso;
        this.numDigito = value.numDigito;
        this.anoProcesso = value.anoProcesso;
        this.numSegmento = value.numSegmento;
        this.numTribunal = value.numTribunal;
        this.numOrigem = value.numOrigem;
        this.dtaAutuacao = value.dtaAutuacao;
    }

    public Processo(
            Long codProcesso,
            Integer numProcesso,
            Byte numDigito,
            Short anoProcesso,
            Byte numSegmento,
            Byte numTribunal,
            Short numOrigem,
            Date dtaAutuacao
    ) {
        this.codProcesso = codProcesso;
        this.numProcesso = numProcesso;
        this.numDigito = numDigito;
        this.anoProcesso = anoProcesso;
        this.numSegmento = numSegmento;
        this.numTribunal = numTribunal;
        this.numOrigem = numOrigem;
        this.dtaAutuacao = dtaAutuacao;
    }

    public Long getCodProcesso() {
        return this.codProcesso;
    }

    public void setCodProcesso(Long codProcesso) {
        this.codProcesso = codProcesso;
    }

    public Integer getNumProcesso() {
        return this.numProcesso;
    }

    public void setNumProcesso(Integer numProcesso) {
        this.numProcesso = numProcesso;
    }

    public Byte getNumDigito() {
        return this.numDigito;
    }

    public void setNumDigito(Byte numDigito) {
        this.numDigito = numDigito;
    }

    public Short getAnoProcesso() {
        return this.anoProcesso;
    }

    public void setAnoProcesso(Short anoProcesso) {
        this.anoProcesso = anoProcesso;
    }

    public Byte getNumSegmento() {
        return this.numSegmento;
    }

    public void setNumSegmento(Byte numSegmento) {
        this.numSegmento = numSegmento;
    }

    public Byte getNumTribunal() {
        return this.numTribunal;
    }

    public void setNumTribunal(Byte numTribunal) {
        this.numTribunal = numTribunal;
    }

    public Short getNumOrigem() {
        return this.numOrigem;
    }

    public void setNumOrigem(Short numOrigem) {
        this.numOrigem = numOrigem;
    }

    public Date getDtaAutuacao() {
        return this.dtaAutuacao;
    }

    public void setDtaAutuacao(Date dtaAutuacao) {
        this.dtaAutuacao = dtaAutuacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%07d", numProcesso));
        sb.append("-").append(String.format("%02d", numDigito));
        sb.append(".").append(anoProcesso);
        sb.append(".").append(numSegmento);
        sb.append(".").append(String.format("%02d", numTribunal));
        sb.append(".").append(String.format("%04d", numOrigem));
        return sb.toString();
    }
}
