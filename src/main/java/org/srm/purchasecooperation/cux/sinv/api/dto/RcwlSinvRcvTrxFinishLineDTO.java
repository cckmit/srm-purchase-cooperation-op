package org.srm.purchasecooperation.cux.sinv.api.dto;

import io.swagger.annotations.ApiModelProperty;
import org.srm.purchasecooperation.sinv.api.dto.SinvRcvTrxFinishLineDTO;

/**
 * @description:
 * @author: bin.zhang
 * @createDate: 2021/4/22 21:04
 */
public class RcwlSinvRcvTrxFinishLineDTO extends SinvRcvTrxFinishLineDTO {
    @ApiModelProperty(value = "资产单据号")
    private String assetsbillNum;
    @ApiModelProperty(value = "入库数量")
    private Long warehouseQuantity;

    public String getAssetsbillNum() {
        return assetsbillNum;
    }

    public void setAssetsbillNum(String assetsbillNum) {
        this.assetsbillNum = assetsbillNum;
    }

    public Long getWarehouseQuantity() {
        return warehouseQuantity;
    }

    public void setWarehouseQuantity(Long warehouseQuantity) {
        this.warehouseQuantity = warehouseQuantity;
    }
}