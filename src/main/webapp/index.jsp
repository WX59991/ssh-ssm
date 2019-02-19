<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>首页</h2>
<a href="/test/main/login">登录</a>
<a href="/test/main/register">注册</a><br>
信息 : ${tipMessage eq null ? "无" : tipMessage}
<h3>文件上传</h3>
<form action="/test/File/upload"enctype="multipart/form-data"  method="post">
    <input type="file" name="upload" lable="选择文件">
    <input type="submit" value="上传文件">
</form>
<a href="inload.action?fileName=2.jpg">文件下载</a>
<a href="file.html">文件下载2</a>
<a href="/test">test</a>
</body>
</html>
