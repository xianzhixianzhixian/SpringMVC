/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：单个文件上传,上传到服务器的项目路径,设置文件大小限制
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/upload.do"})
	public String doFileUpload(MultipartFile img, HttpSession session) throws Exception {
		
		//这里的path是指上传后的文件存放在服务器端的路径
		String path=session.getServletContext().getRealPath("/images");
		if(img.getSize()>0) {
			
			System.out.println(path);
			String fileName=img.getOriginalFilename();
			
			//限制文件上传类型
			if(fileName.endsWith("jpg") || fileName.endsWith("png") || fileName.endsWith("bmp")) {
				File file=new File(path, fileName);
				img.transferTo(file);
			}else {
				return "error.jsp";
			}
		}else {
			return "error.jsp";
		}
		
		return "/success.jsp";
	}
}
