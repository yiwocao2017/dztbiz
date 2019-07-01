/**
 * @Title IAccountBO.java 
 * @Package com.ibis.account.bo 
 * @Description 
 * @author miyb  
 * @date 2015-3-15 下午3:15:49 
 * @version V1.0   
 */
package com.cdkj.dzt.bo;

import com.cdkj.dzt.domain.Account;
import com.cdkj.dzt.dto.res.XN002500Res;
import com.cdkj.dzt.dto.res.XN002501Res;
import com.cdkj.dzt.dto.res.XN002510Res;
import com.cdkj.dzt.enums.EBizType;
import com.cdkj.dzt.enums.ECurrency;

/** 
 * @author: miyb 
 * @since: 2015-3-15 下午3:15:49 
 * @history:
 */
public interface IAccountBO {

    /**
    * 根据用户编号和币种获取账户
    * @param userId
    * @param currency
    * @return 
    * @create: 2017年3月23日 下午12:02:11 myb858
    * @history:
    */
    public Account getRemoteAccount(String userId, ECurrency currency);

    public void doTransferAmountRemote(String fromUserId,
            ECurrency fromCurrency, String toUserId, ECurrency toCurrency,
            Long amount, EBizType bizType, String fromBizNote,
            String toBizNote, String refNo);

    /**
     * 获取虚拟币的价值：1人民币等于多少虚拟币
     * @param currency
     * @return 
     * @create: 2017年4月4日 下午12:13:25 myb858
     * @history:
     */
    public Double getExchangeRateRemote(ECurrency currency);

    public XN002501Res doWeiXinH5PayRemote(String applyUser, String openId,
            String toUser, String payGroup, String refNo, String bizType,
            String bizNote, Long amount);

    public XN002500Res doWeiXinAppPayRemote(String fromUserId, String toUserId,
            Long amount, EBizType bizType, String fromBizNote,
            String toBizNote, String payGroup);

    public XN002510Res doAlipayRemote(String fromUserId, String toUserId,
            Long amount, EBizType bizType, String fromBizNote,
            String toBizNote, String payGroup);
}
