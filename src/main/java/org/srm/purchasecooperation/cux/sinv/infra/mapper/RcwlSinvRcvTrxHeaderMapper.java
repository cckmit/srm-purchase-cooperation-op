package org.srm.purchasecooperation.cux.sinv.infra.mapper;

import io.choerodon.core.oauth.CustomUserDetails;
import org.apache.ibatis.annotations.Param;
import org.srm.purchasecooperation.sinv.api.dto.SinvRcvTrxFinishLineDTO;
import org.srm.purchasecooperation.sinv.api.dto.SinvRcvTrxQueryDTO;
import org.srm.purchasecooperation.sinv.domain.entity.SinvRcvTrxHeader;
import org.srm.purchasecooperation.sinv.infra.mapper.SinvRcvTrxHeaderMapper;
import org.srm.web.annotation.Tenant;
import org.srm.web.dynamic.ExtendMapper;

import java.util.List;

/**
 * @description:
 * @author: bin.zhang
 * @createDate: 2021/4/22 21:07
 */
@Tenant("SRM-RCWL")
public interface RcwlSinvRcvTrxHeaderMapper extends SinvRcvTrxHeaderMapper, ExtendMapper<SinvRcvTrxHeader> {
    @Override
    List<SinvRcvTrxFinishLineDTO> selectSinvRcvTrxFinishLine(@Param("sinvRcvTrxQueryDTO") SinvRcvTrxQueryDTO sinvRcvTrxQueryDTO, @Param("customUserDetails") CustomUserDetails customUserDetails);

}
