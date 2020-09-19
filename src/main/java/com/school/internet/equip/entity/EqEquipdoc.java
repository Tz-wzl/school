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
public class EqEquipdoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private String pkEquipdoc;

    private String equipName;

    private String equipCode;

    private String fkEquiptype;

    private BigDecimal state;

    private String location;

    private String imei;

    private String ip;

    private String vuserdef1;

    private String vuserdef2;

    private String vuserdef3;

    private String vuserdef4;

    private String vuserdef5;

    private BigDecimal dr;

    private String ts;


}
