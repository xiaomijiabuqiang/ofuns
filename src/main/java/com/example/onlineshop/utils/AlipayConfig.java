package com.example.onlineshop.utils;
/**
 * 支付宝接口参数
 * @author HUAWEI
 *
 */
import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102200738500";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCEhX9A1nc5dMKutR+f76XQpOcexe28P6OSC+6+/38B5lOcYxNzdgD7JiuOCaZpf/1rbkSvVVYAZVNiGyf2DuSxqQqsSxMZWP/UeumDuez6uYYwY2gmlm/ZngiTVUi7RJHrfTFuuQ+vz2b5a5Y91xMhsJ/LdiHplVJdP9coZ1puCrVaStGj5FD4LLDdEkr9QF9nbDOrelBwZmc5HQqfoMakO24w/4MtzydiHwvkJhFZLUyW9StR3VvAjTzGICpncz+v7dnS02e1xrPZtFdbA0zc+L0gFdQucYJrvMqj+nQn/sr4P4Mg+eSPnyQ/RWvrVFiozY8S+ab/tFqdy8A196wxAgMBAAECggEAKoQx+XlVMufU9fxCMyvNxQzC4cqapUS9k8OkSz7pXpCozomy2d5IHkt2udE6xKo9gdQU0TPNrb7Ua6tOvNC2apFTTUegzwcQvPjaJlrmPuJ6vNeHuKmXJPhgw/Qeq4YqUqUN0PoqoDsoTGlKAHkaODrUaZBy/N/dVvF+dAYEqzzqC+my8x/6tJ/T/XDG/vSNMCgcfvhrWBj6uBFDYy4nA7wRrAL4CdQzPtKBADnbpjDIZbHJjyckMWtSG2o7k19uEossuz/aF12i9RbSmzpaKUaoklBqiDXGAeawbPL+FSJVNsrTTLaW9T97WllWgW30ARLjexsC4kJzcpIMEsuR4QKBgQC9DtHohR7ef/WL/OukM+0hXrZdDaPncSKE9fzY13kH0i/jXfbI7e60izKZGq0absM03XjI9tiI5vPa2MBkIcDJm9OGp6+vnsNdA5EEDD4PFv0+2tuJTUydphcoJQ+kBgIZZfEzJTHKq2Eqk4Ue7cQDTE/VOXJvK+gkvZsdbSzJ3QKBgQCzceziDGZDDR0z9SgIwMJacVqvcoGd57bJC9++mN8hARocfWirSdVU4CfXlyc+pw4KG00Bshz2lxQkBL8rPEkT5Xru73kTolPKUtEYsdeb94B/yu0KnC3NqseTZxW7HdFrA3avWM2Vhcer+DRMLXTMsSweo0TDzfxnfYCYmG+oZQKBgF4NMFnHV9sCt0oD8cpHVtGCB6D1NzPdMXoJ0daiIwDEDLTEuw+sZlME6JAIGFONBKmZAAyh2IkKtAeMSvHFZN4nGizj4N+yUKhGLO9hk8H4AtYxFIQSo2nOBbkf7s7/ei3ebAawmzui1HzU1KXVTO0DGrgNkyNBKYSVmsQh2uU1AoGACHrUv+XoGzkObTsjli5NwOpkZ7AYkfa2O4/1FdOxj6S2sCv4+0c07prdJyH8d8h7MF0T6YWaOsju6bjTs95YcblBcvMcHKJqJUB+oxUcZEFw8BkN1JeGzpZIch3H+ByzncP/ItAmfu9gfS7wgb0QLPAebqA2iq48REO5BP0HIcUCgYAleeOik2CgaK03mMxUcsKulmfZX117AdE//kbyOYWWy7Snpoh/HSR42gbFZtSsWADf+dblnNHw+WCz5BcRRlEwYB2muZjRk90On+6sdJL1+qQ/Tuq0QWW8Iwjy7Jp+Z+wGbFGNtFutxLzaNThPLdJoNwr37NdZsSXVzInjMseSlg==";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmICJKNxwwskbVSx/A7WdOHYxSNVslemgTV0yvaiRVGkni/ISXeSTlyXUNMLq2JSbn2pD41R5YtomBFnrJsfmkta37szL+0gFt5erIylfrsvFjjwQ3igMB+talknSR7EEuegVPeQ393nlkykcIvKRXynDYcJyqZmkQVj6Dl5k1DyvPFDEB/lxXw5/JbNJA3y6lTV8ugpbrW8B2cPczkn7w+MQ4Cmh/Ue/W9vZCLXcncEqnnS66lxChcbXgjzjbM6UM0U+wL7gU5yLt0eTKZF7+cg2nPqlwt7A7V32TlVmyV2kx5GKefQgbFSxF6lYlZwufSEsPLlcLqQ0QQSz3Me/dwIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8021/pay/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8088/#/PaySuccess";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}