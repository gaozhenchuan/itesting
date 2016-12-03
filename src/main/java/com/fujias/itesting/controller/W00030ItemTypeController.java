/**Copyright＠QINGDAO FUBO SYSTEM ENGINEERING CO.,LTD 2016
 *-------------------------------------------------------------------------------------------------------------------- 
 *
 *  系统名          ：品类一览
 *  工程ＩＤ      ：W00030ItemType
 *  工程名          ：品类一览
 *  处理概要      ：品类一览
 *
 *  历史记录
 *      NO  日期                                    Ver     更新者          内容
 *      1   2016/11/09         V1.0    张豫             新建
 *
 *--------------------------------------------------------------------------------------------------------------------
 **/
package com.fujias.itesting.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/W00030")
public class W00030ItemTypeController  {

	@RequestMapping("/login")
	@ResponseBody
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {


		System.out.println("11111111111111111111111111111111");
	}
}
