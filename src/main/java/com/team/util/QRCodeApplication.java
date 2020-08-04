package com.team.util;

public class QRCodeApplication {
    public static void main(String[] args) throws Exception {
        // 存放在二维码中的内容
        // 二维码中的内容可以是文字，可以是链接等
        String text = "老张";
        // 嵌入二维码的图片路径
        //String imgPath = "D:\\picture\\pictures\\pictures\\ps处理\\张太阳3.png";
        // 生成的二维码的路径及名称
        String destPath = "D:\\img\\code" + System.currentTimeMillis() + ".jpg";
        //生成二维码
        QRCodeUtil.encode(text, null, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);
    }
}
