package com.crossoft.domain;

import java.math.BigDecimal;

/**
 * Created by Snow on 8/7/2017.
 */
public class BomComponentBean {
    private String id;
    private String bomFk;
    private String materialFk;
    private BigDecimal sequence;
    private String enabled;
    private String validStart;
    private String validEnd;
    private String useItemDefaults;
    private String preAssembled;
    private Double qty;
    private String testPart;
    private String bomTemplate;
    private String disassembleOperationFk;
    private String createTrackableSfc;
    private Double maximumUsage;
    private Double maximumNc;
    private String assembleAsReq;
    private String dateCreate;
    private String dateUpdate;
    private BigDecimal parentSequence;
    private String orderItemNumber;
    private String erpChangeNumber;
    private BigDecimal erpSequence;
    private String bomComponentType;
    private String assembleOperationFk;
    private String assyDataTypeFk;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBomFk() {
        return bomFk;
    }

    public void setBomFk(String bomFk) {
        this.bomFk = bomFk;
    }

    public String getMaterialFk() {
        return materialFk;
    }

    public void setMaterialFk(String materialFk) {
        this.materialFk = materialFk;
    }

    public BigDecimal getSequence() {
        return sequence;
    }

    public void setSequence(BigDecimal sequence) {
        this.sequence = sequence;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getValidStart() {
        return validStart;
    }

    public void setValidStart(String validStart) {
        this.validStart = validStart;
    }

    public String getValidEnd() {
        return validEnd;
    }

    public void setValidEnd(String validEnd) {
        this.validEnd = validEnd;
    }

    public String getUseItemDefaults() {
        return useItemDefaults;
    }

    public void setUseItemDefaults(String useItemDefaults) {
        this.useItemDefaults = useItemDefaults;
    }

    public String getPreAssembled() {
        return preAssembled;
    }

    public void setPreAssembled(String preAssembled) {
        this.preAssembled = preAssembled;
    }

    public String getAssembleAsReq() {
        return assembleAsReq;
    }

    public void setAssembleAsReq(String assembleAsReq) {
        this.assembleAsReq = assembleAsReq;
    }

    public String getTestPart() {
        return testPart;
    }

    public void setTestPart(String testPart) {
        this.testPart = testPart;
    }

    public String getBomTemplate() {
        return bomTemplate;
    }

    public void setBomTemplate(String bomTemplate) {
        this.bomTemplate = bomTemplate;
    }

    public String getDisassembleOperationFk() {
        return disassembleOperationFk;
    }

    public void setDisassembleOperationFk(String disassembleOperationFk) {
        this.disassembleOperationFk = disassembleOperationFk;
    }

    public String getCreateTrackableSfc() {
        return createTrackableSfc;
    }

    public void setCreateTrackableSfc(String createTrackableSfc) {
        this.createTrackableSfc = createTrackableSfc;
    }

    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public BigDecimal getParentSequence() {
        return parentSequence;
    }

    public void setParentSequence(BigDecimal parentSequence) {
        this.parentSequence = parentSequence;
    }

    public String getOrderItemNumber() {
        return orderItemNumber;
    }

    public void setOrderItemNumber(String orderItemNumber) {
        this.orderItemNumber = orderItemNumber;
    }

    public String getErpChangeNumber() {
        return erpChangeNumber;
    }

    public void setErpChangeNumber(String erpChangeNumber) {
        this.erpChangeNumber = erpChangeNumber;
    }

    public BigDecimal getErpSequence() {
        return erpSequence;
    }

    public void setErpSequence(BigDecimal erpSequence) {
        this.erpSequence = erpSequence;
    }

    public String getBomComponentType() {
        return bomComponentType;
    }

    public void setBomComponentType(String bomComponentType) {
        this.bomComponentType = bomComponentType;
    }

    public String getAssembleOperationFk() {
        return assembleOperationFk;
    }

    public void setAssembleOperationFk(String assembleOperationFk) {
        this.assembleOperationFk = assembleOperationFk;
    }

    public String getAssyDataTypeFk() {
        return assyDataTypeFk;
    }

    public void setAssyDataTypeFk(String assyDataTypeFk) {
        this.assyDataTypeFk = assyDataTypeFk;
    }

    public Double getQty() {
        return qty;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getMaximumUsage() {
        return maximumUsage;
    }

    public void setMaximumUsage(Double maximumUsage) {
        this.maximumUsage = maximumUsage;
    }

    public Double getMaximumNc() {
        return maximumNc;
    }

    public void setMaximumNc(Double maximumNc) {
        this.maximumNc = maximumNc;
    }
}
