<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

 <%  
     String path = request.getContextPath();  
     String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";  
 %>  
   
 <!DOCTYPE HTML>  
 <html>  
 <head>  
 <base href="<%=basePath%>">  

<body>
	<h2>Hello World!</h2>
	<a href="<%=basePath%>index.jhtml">DUBBO测试</a>
	${name},我爱你！
</body>
</html>
