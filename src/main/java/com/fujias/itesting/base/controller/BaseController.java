package com.fujias.itesting.base.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.Locale;

import javax.mail.Message;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.fujias.itesting.base.common.util.PropertiesUtil;

@Controller
public abstract class BaseController {

    protected final static Log log = LogFactory.getLog(BaseController.class);
    
    @Autowired
    protected MessageSource messageSource;
    
    @Autowired
    private HttpServletRequest request;
    
    // 信息key
    private static final String MSG_FBSE = "MSGFBSE";
    
    // 信息
    //private JSONArray message=new JSONArray(
    protected void addMessage(String msg){
        JSONArray message=null;
        Object obj = request.getSession().getAttribute(MSG_FBSE);
        if(obj !=null && obj instanceof JSONArray){
            message = (JSONArray)obj;
        }else{
            message =new JSONArray();
        }
        //message.add(msg);
        request.getSession().setAttribute(MSG_FBSE, message);
        
    }
    protected void clearMessage(){
        request.getSession().setAttribute(MSG_FBSE, new JSONArray());
    }
    protected String getMessage(){
        JSONArray message=null;
        Object obj = request.getSession().getAttribute(MSG_FBSE);
        if(obj !=null && obj instanceof JSONArray){
            message = (JSONArray)obj;
        }else{
            message =new JSONArray();
        }
        return message.toString();     
    }
    
//    protected void addPopMessage(Message msg){
//        JSONArray message=null;
//        JSONObject json = JSONObject.fromObject(msg);
//        Object obj = request.getSession().getAttribute(MSG_FBSE);
//        if(obj !=null && obj instanceof JSONArray){
//            message = (JSONArray)obj;
//        }else{
//            message =new JSONArray();
//        }
//        message.add(json);
//        
//    }

    /**
     * 初始化分页相关信息
     */
//    protected void initPage(ModelAndView mav, BaseEntity entity,Integer listSize) {
//        
//        // 当前页与每页件数取得
//        Integer pageNum = entity.getPageNum();
//        Integer pageSize = entity.getPageSize();
//        listSize = listSize==null?0:listSize;
//        Integer totalPage = (listSize + pageSize - 1) / pageSize;
//        if (null == pageNum) {
//            pageNum = Constant.PAGENUM;
//        } else if (pageNum > totalPage) {
//            pageNum = totalPage;
//        }
//        // 首页
//        String topPage  = messageSource.getMessage("Header0002",null, getLocale(request));
//        // 上一页
//        String prevPage = messageSource.getMessage("Paging0002",null, getLocale(request));
//        // 下一页
//        String nextPage = messageSource.getMessage("Paging0003",null, getLocale(request));
//        // 尾页
//        String lastPage = messageSource.getMessage("Paging0004",null, getLocale(request));
//        String all = messageSource.getMessage("Paging0005",null, getLocale(request));
//        String page = messageSource.getMessage("Paging0006",null, getLocale(request));
//        String strip = messageSource.getMessage("Paging0007",null, getLocale(request));
//        mav.addObject("startIndex", Pager.getStartIndex(pageNum, pageSize));
//        Pager.vx(topPage,prevPage,nextPage,lastPage,all,page,strip);
//        
//        mav.addObject("pageNum", pageNum);
//        mav.addObject("totalPage", totalPage);
//        mav.addObject("pageSize", pageSize);
//        mav.addObject("totalCount", listSize);
//
//    }

    /**
     * 获取当前国际化语言
     */
    protected Locale getLocale(HttpServletRequest request) {
        Locale locale = RequestContextUtils.getLocaleResolver(request).resolveLocale(request);
        return locale;
    }
    
    /**
     * 获取当前国际化语言
     */
    protected Locale getLocale() {
        String language = PropertiesUtil.getPropertyValue("language");
        if(language.equals("japan")){
            return Locale.JAPAN;
        }else{
            return Locale.CHINA;
        }
    }

    /**
     * 全局异常处理
     */
    @ExceptionHandler
    public ModelAndView exception(HttpServletRequest request, HttpServletResponse response, Exception e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw, true));
        log.error(sw.toString());

        // 如果是json格式的ajax请求
        if (request.getHeader("accept").indexOf("application/json") > -1
                || (request.getHeader("X-Requested-With") != null && request.getHeader("X-Requested-With").indexOf(
                        "XMLHttpRequest") > -1)) {
            response.setStatus(500);
            response.setContentType("application/json;charset=utf-8");
            try {
                PrintWriter writer = response.getWriter();
                writer.write(e.getMessage());
                writer.flush();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            return null;
        } else {// 如果是普通请求
            ModelAndView mav = new ModelAndView("common/exception");
            request.setAttribute("exceptionMessage", e.getMessage());
            // 根据不同的异常类型可以返回不同界面
            return mav;
        }
    }

    /**
     * 设定系统日期格式化
     * @param entity
     */
//    protected void setDateFormate(BaseEntity entity){
//        entity.setViewDateFormateYM(this.messageSource.getMessage("ViewDateFormateYM", null, Locale.CHINA));
//        entity.setViewDateFormateYMD(this.messageSource.getMessage("ViewDateFormateYMD", null, Locale.CHINA));
//        entity.setJavaDateFormateYM(this.messageSource.getMessage("JavaDateFormateYM", null, Locale.CHINA));
//        entity.setJavaDateFormateYMD(this.messageSource.getMessage("JavaDateFormateYMD", null, Locale.CHINA));
//    }
}