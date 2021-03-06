/**
 * This class is generated by jOOQ
 */
package br.unb.sma.database.tables;


import br.unb.sma.database.Keys;
import br.unb.sma.database.Procjud;
import br.unb.sma.database.tables.records.TParteRecord;
import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * Partes do Processo Judicial
 */
@Generated(
		value = {
				"http://www.jooq.org",
				"jOOQ version:3.7.3"
		},
		comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TParte extends TableImpl<TParteRecord> {

	/**
	 * The reference instance of <code>procjud.t_parte</code>
	 */
	public static final TParte T_PARTE = new TParte();
	private static final long serialVersionUID = -1767320921;
	/**
	 * The column <code>procjud.t_parte.cod_parte</code>. Codigo identificador da parte
	 */
	public final TableField<TParteRecord, Long> COD_PARTE = createField("cod_parte", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "Codigo identificador da parte");
	/**
	 * The column <code>procjud.t_parte.nom_parte</code>. Nome completo da parte
	 */
	public final TableField<TParteRecord, String> NOM_PARTE = createField("nom_parte", org.jooq.impl.SQLDataType.VARCHAR.length(512).nullable(false), this, "Nome completo da parte");
	/**
	 * The column <code>procjud.t_parte.tip_parte</code>. Tipo da Parte: F - pessoa Fisica, J - pessoa Juridica
	 */
	public final TableField<TParteRecord, String> TIP_PARTE = createField("tip_parte", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "Tipo da Parte: F - pessoa Fisica, J - pessoa Juridica");
	/**
	 * The column <code>procjud.t_parte.num_cnpj</code>. Numero do CNPJ se pessoa juridica
	 */
	public final TableField<TParteRecord, Long> NUM_CNPJ = createField("num_cnpj", org.jooq.impl.SQLDataType.BIGINT, this, "Numero do CNPJ se pessoa juridica");
	/**
	 * The column <code>procjud.t_parte.num_cpf</code>. Numero do CPF se pessoa fisica
	 */
	public final TableField<TParteRecord, Long> NUM_CPF = createField("num_cpf", org.jooq.impl.SQLDataType.BIGINT, this, "Numero do CPF se pessoa fisica");

	/**
	 * Create a <code>procjud.t_parte</code> table reference
	 */
	public TParte() {
		this("t_parte", null);
	}

	/**
	 * Create an aliased <code>procjud.t_parte</code> table reference
	 */
	public TParte(String alias) {
		this(alias, T_PARTE);
	}

	private TParte(String alias, Table<TParteRecord> aliased) {
		this(alias, aliased, null);
	}

	private TParte(String alias, Table<TParteRecord> aliased, Field<?>[] parameters) {
		super(alias, Procjud.PROCJUD, aliased, parameters, "Partes do Processo Judicial");
	}

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TParteRecord> getRecordType() {
		return TParteRecord.class;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TParteRecord> getPrimaryKey() {
		return Keys.PARTE_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TParteRecord>> getKeys() {
		return Arrays.<UniqueKey<TParteRecord>>asList(Keys.PARTE_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TParte as(String alias) {
		return new TParte(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TParte rename(String name) {
		return new TParte(name, null);
	}
}
