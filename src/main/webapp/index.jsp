<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <!-- 使用最新的引擎渲染网页，chrome=1则可以激活Chrome Frame -->
        <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1"/>
        <meta name="description" content=淘宝网(Taobao.com)作为专业的购物网站拥有全球时尚前沿的消费者购物集市,100%认证网上商城及超值二手商品区，同时购物安全，产品丰富，应有尽有,任你选购,让你尽享网上在线购物乐趣！>
        <meta name="keywords" content="淘宝,掏宝,网上购物,C2C,在线交易,交易市场,网上交易,交易市场,网上买"/>
        <title><spring:message code="systemName"></spring:message></title>
        <link href="${pageContext.request.contextPath}/js/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="${pageContext.request.contextPath}/js/jquery-ui-1.12.1/jquery-ui.min.css" rel="stylesheet" type="text/css">
        <script src="${pageContext.request.contextPath}/js/jquery-ui-1.12.1/external/jquery/jquery.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/jquery-ui-1.12.1/jquery-ui.min.js" type="text/javascript"></script>
        <script src="${pageContext.request.contextPath}/js/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                //alert($.fn.jquery);
            });
        </script>
    </head>
    <body>
        <div class="header" style="background:#467AA7;">
            index
        </div>
        <div class="content" style="background:#467AA7;">
        </div>
        <div class="footer" style="background:#467AA7;">
            index
        </div>
        <div class="container" style="width: 300px;margin-top: 20px">
            <form action="#">
                <div class="input-group form-group">
                    <lable class="control-label col-lg-2">姓名：</lable>
                    <input type="text" class="form-control">
                    <lable class="control-label col-lg-2">密码：</lable>
                    <input type="text" class="form-control">
                </div>
            </form>
        </div>
    </body>
</html>
