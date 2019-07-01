package com.cdkj.dzt.callback;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdkj.dzt.ao.IOrderAO;
import com.cdkj.dzt.enums.EBizType;

/** 
 * @author: haiqingzheng 
 * @since: 2016年12月26日 下午1:44:16 
 * @history:
 */
@Controller
public class CallbackConroller {

    private static Logger logger = Logger.getLogger(CallbackConroller.class);

    @Autowired
    IOrderAO orderAO;

    @RequestMapping("/thirdPay/callback")
    public synchronized void doCallback(HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        boolean isSuccess = Boolean.valueOf(request.getParameter("isSuccess"));
        String payGroup = request.getParameter("payGroup");
        String payCode = request.getParameter("payCode");
        Long amount = Long.valueOf(request.getParameter("transAmount"));
        String bizType = request.getParameter("bizType");
        // 支付成功，商户处理后同步返回给微信参数
        if (!isSuccess) {
            logger.info("支付失败");
        } else {
            logger.info("===============付款成功==============");
            // ------------------------------
            // 处理业务开始
            // ------------------------------
            try {
                if (EBizType.AJ_GWFK.getCode().equals(bizType)) {
                    System.out.println("**** 进入商品购物，微信APP支付服务器回调 start****");
                    orderAO.paySuccess(payGroup, payCode, amount);
                    System.out.println("**** 进入商品购物，微信APP支付服务器回调 end****");
                }
            } catch (Exception e) {
                logger.info("支付回调异常");
            }
            // ------------------------------
            // 处理业务完毕
            // ------------------------------
        }
    }
}
