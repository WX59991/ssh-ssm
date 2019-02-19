package me.asherli.test.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import java.io.*;


/**
 * Created by Administrator on 2019/2/19.
 */
@Controller
public class FileAction extends ActionSupport {
	private String url = "./";
	//封装上传文件属性
	private File upload;

	//封装上传文件的类型
	private String uploadContentType;

	//封装上传文件名称
	private String uploadFileName;

	//封装文件上传的路径
	private String savePath;

	public String upload(){
		byte[] buffer=new byte[1024];
		try {
			FileInputStream fis=new FileInputStream(getUpload());
			FileOutputStream fos=new FileOutputStream(getSavePath()+"\\"+this.getUploadFileName());
			int length=fis.read(buffer);
			while(length>0){
				fos.write(buffer, 0, length);
				length=fis.read(buffer);
			}
			fos.flush();
			fos.close();
			fis.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("========================");
		this.setUrl("/index.jsp");
		return SUCCESS;
	}

	//读取下载文件的目录
	private String inputPath;

	//下载文件的文件名
	private String fileName;

	//读取下载文件的输入流
	private InputStream inputStream;

	//下载文件的类型
	private String conetntType;
	public  String inload() throws  Exception{
		return SUCCESS;
	}

	public String getInputPath() {
		return inputPath;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	//创建InputStream输入流
	public InputStream getInputStream() throws Exception {
		String path=ServletActionContext.getServletContext().getRealPath(inputPath);
		System.out.println(path+"\\"+fileName);
		BufferedInputStream stream = new BufferedInputStream(new FileInputStream(path+"\\"+fileName));
		return stream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getConetntType() {
		return conetntType;
	}

	public void setConetntType(String conetntType) {
		this.conetntType = conetntType;
	}


	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getSavePath() {
		return "D:\\workspace\\spider\\ssh";
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	private void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
}
