<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title><spring:message code="systemName"></spring:message></title>
        <%@include file="./include/meta.inc" %>
        <%@include file="./include/css.inc" %>
        <%@include file="./include/js.inc" %>
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
                    <div class="control-label col-lg-2">姓名：</div>
                    <input type="text" class="form-control">
                    <div class="control-label col-lg-2">密码：</div>
                    <input type="text" class="form-control">
                </div>
            </form>
        </div>
    </body>
</html>
