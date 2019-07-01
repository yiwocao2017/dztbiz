/**
 * @Title AccountUtil.java 
 * @Package com.ibis.account.core 
 * @Description 
 * @author miyb  
 * @date 2015-2-26 下午4:54:24 
 * @version V1.0   
 */
package com.cdkj.dzt.core;

import java.util.Random;

import com.cdkj.dzt.common.DateUtil;
import com.cdkj.dzt.common.MD5Util;

/** 
 * @author: miyb 
 * @since: 2015-2-26 下午4:54:24 
 * @history:
 */
public class AccountUtil {
    /*
     * @Value("${account.md5.key}") private String key;
     */
    private static String key = "123";

    public static String md5(Long amount) {
        StringBuffer bf = new StringBuffer(key);
        bf.append(amount);
        return MD5Util.md5(bf.toString());
    }

    public static String generateAccountNumber() {
        int random = Math.abs(new Random().nextInt()) % 10;
        String today = DateUtil.getToday(DateUtil.DATA_TIME_PATTERN_3);
        return today + String.valueOf(random);
    }

}
