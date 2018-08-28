package com.example.androidbackend.Service;

import com.example.androidbackend.Utils.UsuallyUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.UUID;

@Service
public class ImgService {

    public String saveImage(MultipartFile file)throws IOException
    {
        //得到上传的文件名找到图片后缀名点的位置
        int dotpos = file.getOriginalFilename().lastIndexOf(".");
        if (dotpos<0)
            return null;
        //得到后缀名并将大写转换为小写
        String fileext = file.getOriginalFilename().substring(dotpos+1).toLowerCase();
        //判断文件类型是否合法
        if (!UsuallyUtil.isFileAllowed(fileext))
            return null;
        //生成一个唯一的文件名
        String filename = UUID.randomUUID().toString().replaceAll("-","")+"."+fileext;
        System.out.println(filename);
        //保存图片到本地
        Files.copy(file.getInputStream(),new File(UsuallyUtil.ImageDir+filename).toPath(),StandardCopyOption.REPLACE_EXISTING);
        return UsuallyUtil.DOMAIN+"image?name="+filename;
    }

}
