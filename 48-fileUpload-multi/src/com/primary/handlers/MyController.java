/**
 * 作者：樊钰丰
 * 时间：2017.9.21
 * 功能：单个文件上传,上传到服务器的项目路径,设置文件大小限制
 */

package com.primary.handlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

@Controller //表示当前类是一个处理器
@RequestMapping(value = {"/test"}) //命名空间
public class MyController {

	@RequestMapping(value = {"/upload.do"})
	//需要在这校正参数,把三个文件名变成数组
	public String doFileUpload(@RequestParam MultipartFile[] imgs, HttpSession session) throws Exception {
		
		//这里的path是指上传后的文件存放在服务器端的路径
		String path=session.getServletContext().getRealPath("/images");
		System.out.println(path);
		for(MultipartFile img : imgs) {
			if(img.getSize()>0) {
				String fileName=img.getOriginalFilename();
				System.out.println(fileName);
				File file=new File(path, fileName);
				img.transferTo(file);
			}
		}
		return "/success.jsp";
	}
}
