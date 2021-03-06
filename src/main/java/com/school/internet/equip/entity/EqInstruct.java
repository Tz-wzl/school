package com.school.internet.equip.entity;

import java.math.BigDecimal;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jobob
 * @since 2020-09-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class EqInstruct implements Serializable {

    private static final long serialVersionUID = 1L;

    private String pkInstruct;

    private String instructName;

    private String instructValue;

    private String fkEquiptype;

    private String fkEquipdoc;

    private BigDecimal dr;

    private String ts;


}
