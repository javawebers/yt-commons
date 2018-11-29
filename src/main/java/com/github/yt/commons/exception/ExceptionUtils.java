package com.github.yt.commons.exception;

import java.text.MessageFormat;

/**
 * @author liujiasheng
 */
public class ExceptionUtils {

    /**
     * 获取异常消息.
     *
     * @param errorEnum errorEnum
     * @param params    params
     * @return String
     */
    static String getExceptionMessage(Enum errorEnum, Object... params) {
        String errorMessage = null;
        try {
            errorMessage = (String) errorEnum.getClass().getDeclaredField("message").get(errorEnum);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        return MessageFormat.format(errorMessage, params);
    }

    /**
     * 获取异常消息.
     *
     * @param errorCode errorCode
     * @param errorMsg  errorMsg
     * @param params    params
     * @return String
     */
    static String getExceptionMessage(Object errorCode, String errorMsg, Object... params) {
        return MessageFormat.format(errorMsg, params);
    }

}
