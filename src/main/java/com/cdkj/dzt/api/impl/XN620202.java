/**
 * @Title XN620202.java 
 * @Package com.cdkj.dzt.api.impl 
 * @Description 
 * @author leo(haiqing)  
 * @date 2017年4月14日 下午1:45:44 
 * @version V1.0   
 */
package com.cdkj.dzt.api.impl;

import com.cdkj.dzt.ao.IOrderAO;
import com.cdkj.dzt.api.AProcessor;
import com.cdkj.dzt.common.JsonUtil;
import com.cdkj.dzt.core.StringValidater;
import com.cdkj.dzt.dto.req.XN620202Req;
import com.cdkj.dzt.dto.res.BooleanRes;
import com.cdkj.dzt.exception.BizException;
import com.cdkj.dzt.exception.ParaException;
import com.cdkj.dzt.spring.SpringContextHolder;

/** 
 * 分配订单给量体师
 * @author: haiqingzheng 
 * @since: 2017年4月14日 下午1:45:44 
 * @history:
 */
public class XN620202 extends AProcessor {
    private IOrderAO orderAO = SpringContextHolder.getBean(IOrderAO.class);

    private XN620202Req req = null;

    /** 
     * @see com.cdkj.dzt.api.IProcessor#doBusiness()
     */
    @Override
    public Object doBusiness() throws BizException {
        orderAO.distributeOrder(req.getOrderCode(), req.getLtUser(),
            req.getUpdater(), req.getRemark());
        return new BooleanRes(true);
    }

    /** 
     * @see com.cdkj.dzt.api.IProcessor#doCheck(java.lang.String)
     */
    @Override
    public void doCheck(String inputparams) throws ParaException {
        req = JsonUtil.json2Bean(inputparams, XN620202Req.class);
        StringValidater.validateBlank(req.getOrderCode(), req.getLtUser(),
            req.getUpdater());
    }

}
