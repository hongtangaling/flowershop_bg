package com.chen.flowershop.controller;

import com.chen.flowershop.config.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/flowerShop/upload")
public class UplodeFileController {
    @Autowired                  //使用自动装配将所有的数据封装到一个enviroment中
    private Environment env;
    @PostMapping
    public String uplode(MultipartFile file) throws IOException {
        String realPath = System.getProperty("user.dir") + "/src/main/resources/static/";
        String fileName = file.getOriginalFilename();//原来文件名
        String newFileName = UUID.randomUUID()
                + fileName.substring(fileName.lastIndexOf("."));//日期随机数.png 重命名后文件名
        File dir = new File(realPath,newFileName);  //文件对象，保存文件夹，新的文件名
        file.transferTo(dir);//执行文件上传
        return newFileName;
    }
}
