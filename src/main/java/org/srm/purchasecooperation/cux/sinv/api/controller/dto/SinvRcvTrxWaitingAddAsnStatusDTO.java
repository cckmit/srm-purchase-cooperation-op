package org.srm.purchasecooperation.cux.sinv.api.controller.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.srm.purchasecooperation.sinv.api.dto.SinvRcvTrxWaitingDTO;

/**
 * description
 *
 * @author Penguin 2021/04/30 18:29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SinvRcvTrxWaitingAddAsnStatusDTO extends SinvRcvTrxWaitingDTO {

    @ApiModelProperty("送货单头状态 SINV.ASN_HEADERS_STATUS")
    private String asnStatus;

}