package com.example.androidbackend.Utils;

public class UsuallyUtil {

    public static String ImageDir = "F:/upload/";

    public static String DOMAIN = "http://127.0.0.1:8080/";

    public static String[] FileExt = new String[] {"png", "bmp", "jpg", "jpeg"};


    //判断上传的图片的后缀名是否合法
    public static boolean isFileAllowed(String fileExt)
    {
        for(String ext:FileExt)
        {
            if (ext.equals(fileExt))
                return true;
        }
        return false;
    }

}
