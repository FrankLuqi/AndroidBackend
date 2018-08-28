package com.example.androidbackend.Controller;

import com.example.androidbackend.Service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    ImgService imgService;

    @RequestMapping(path = {"/Finance/Home"})
    @ResponseBody
    public String Home_Finance()
    {
        return "image";
    }

    @RequestMapping(path = {"/imageManager"},method = {RequestMethod.GET,RequestMethod.POST})
    public String ImageManager()
    {
        return "image";
    }

    @RequestMapping(path = {"/uploadImg"},method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String uploadImg(HttpServletRequest request,@RequestParam("file") MultipartFile file)
    {
        String imgUrl = null;
        try {
            imgUrl = imgService.saveImage(file);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return imgUrl;


    }

}
