/**
 * This class is generated by jOOQ
 */
package br.unb.sma.database.tables.records;


import br.unb.sma.database.tables.TMotivoRedistribuicao;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * Relaciona os possiveis motivos para redistribuicao de um processo
 */
@Generated(
		value = {
				"http://www.jooq.org",
				"jOOQ version:3.7.3"
		},
		comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TMotivoRedistribuicaoRecord extends UpdatableRecordImpl<TMotivoRedistribuicaoRecord> implements Record2<Byte, String> {

	private static final long serialVersionUID = 2029906452;

	/**
	 * Create a detached TMotivoRedistribuicaoRecord
	 */
	public TMotivoRedistribuicaoRecord() {
		super(TMotivoRedistribuicao.T_MOTIVO_REDISTRIBUICAO);
	}

	/**
	 * Create a detached, initialised TMotivoRedistribuicaoRecord
	 */
	public TMotivoRedistribuicaoRecord(Byte codMotivoRedist, String desMotivoRedist) {
		super(TMotivoRedistribuicao.T_MOTIVO_REDISTRIBUICAO);

		setValue(0, codMotivoRedist);
		setValue(1, desMotivoRedist);
	}

	/**
	 * Getter for <code>procjud.t_motivo_redistribuicao.cod_motivo_redist</code>. Codigo do motivo da redistribuicao
	 */
	public Byte getCodMotivoRedist() {
		return (Byte) getValue(0);
	}

	/**
	 * Setter for <code>procjud.t_motivo_redistribuicao.cod_motivo_redist</code>. Codigo do motivo da redistribuicao
	 */
	public void setCodMotivoRedist(Byte value) {
		setValue(0, value);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * Getter for <code>procjud.t_motivo_redistribuicao.des_motivo_redist</code>. Relaciona os possiveis motivos para redistribuicao do processo
	 */
	public String getDesMotivoRedist() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * Setter for <code>procjud.t_motivo_redistribuicao.des_motivo_redist</code>. Relaciona os possiveis motivos para redistribuicao do processo
	 */
	public void setDesMotivoRedist(String value) {
		setValue(1, value);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Byte> key() {
		return (Record1) super.key();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Byte, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Byte, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Byte> field1() {
		return TMotivoRedistribuicao.T_MOTIVO_REDISTRIBUICAO.COD_MOTIVO_REDIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return TMotivoRedistribuicao.T_MOTIVO_REDISTRIBUICAO.DES_MOTIVO_REDIST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Byte value1() {
		return getCodMotivoRedist();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getDesMotivoRedist();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMotivoRedistribuicaoRecord value1(Byte value) {
		setCodMotivoRedist(value);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMotivoRedistribuicaoRecord value2(String value) {
		setDesMotivoRedist(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TMotivoRedistribuicaoRecord values(Byte value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}
}
