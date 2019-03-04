package com.litbo.hospitalzj.checklist.utils;

public class ToSelect {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		String test = "dcid, jcyq_id, eq_id, tester, auditor, test_time, jcjl, jcsm, xl_test1, xl_test2," 
    +"xl_test3, xl_test4, xl_test5, xl_value1, xl_value2, xl_value3, xl_value4, xl_value5,"
    +"xl_wc, xl_result, hxl_test1, hxl_test2, hxl_test3, hxl_test4, hxl_test5, hxl_value1,"
    +"hxl_value2, hxl_value3, hxl_value4, hxl_value5, hxl_wc, hxl_result, xybhd_test1,"
    +"xybhd_test2, xybhd_test3, xybhd_test4, xybhd_test5, xybhd_value1, xybhd_value2, xybhd_value3,"
    +"xybhd_value4, xybhd_value5, xybhd_wc, xybhd_result, wcxy_h_test1, wcxy_m_test1, wcxy_l_test1,"
    +"wcxy_h_test2, wcxy_m_test2, wcxy_l_test2, wcxy_h_test3, wcxy_m_test3, wcxy_l_test3,"
    +"wcxy_h_test4, wcxy_m_test4, wcxy_l_test4, wcxy_h_test5, wcxy_m_test5, wcxy_l_test5,"
    +"wcxy_h_value11, wcxy_m_value11, wcxy_l_value11, wcxy_h_value12, wcxy_m_value12, wcxy_l_value12,"
    +"wcxy_h_value13, wcxy_m_value13, wcxy_l_value13, wcxy_h_value14, wcxy_m_value14, wcxy_l_value14,"
    +"wcxy_h_value15, wcxy_m_value15, wcxy_l_value15, wcxy_h_value21, wcxy_m_value21, wcxy_l_value21,"
    +"wcxy_h_value22, wcxy_m_value22, wcxy_l_value22, wcxy_h_value23, wcxy_m_value23, wcxy_l_value23,"
    +"wcxy_h_value24, wcxy_m_value24, wcxy_l_value24, wcxy_h_value25, wcxy_m_value25, wcxy_l_value25,"
    +"wcxy_h_value31, wcxy_m_value31, wcxy_l_value31, wcxy_h_value32, wcxy_m_value32, wcxy_l_value32,"
    +"wcxy_h_value33, wcxy_m_value33, wcxy_l_value33, wcxy_h_value34, wcxy_m_value34, wcxy_l_value34,"
    +"wcxy_h_value35, wcxy_m_value35, wcxy_l_value35, wcxy_wc, wcxy_result, wcxyjt_sd,"
    +"wcxyjt_mnq, wcxyjt_jhy, wcxyjt_wc, wcxyjt_result, wcxyqm_sd, wcxyqm_xll, wcxyqm_wc,"
    +"wcxyqm_result, sgbj_result, bjxjc_result, jyjc_result, spare1, spare2, spare3";             
		String[] dq = test.split(",");
		String result = upperTable(test);
		String[] re = result.split(",");
		for(int i = 0; i<dq.length; i++){
			if(i< dq.length -1){
				sb.append(dq[i]).append(" as ").append(re[i]).append(",");
			}else{
				sb.append(dq[i]).append(" as ").append(re[i]);
			}
		}
		
		System.out.println(sb);
	}
	
	
	
	public static String upperTable(String str)
	{
		String list = str.replace(",", " ");
		// 字符串缓冲区
		StringBuffer sbf = new StringBuffer();
		// 如果字符串包含 下划线
		if (str.contains("_"))
		{
			// 按下划线来切割字符串为数组
			String[] split = str.split("_");
			// 循环数组操作其中的字符串
			for (int i = 0, index = split.length; i < index; i++)
			{
				// 递归调用本方法
				String upperTable = upperTable(split[i]);
				// 添加到字符串缓冲区
				sbf.append(upperTable);
			}
		} else
		{// 字符串不包含下划线
			// 转换成字符数组
			char[] ch = str.toCharArray();
			// 判断首字母是否是字母
			if (ch[0] >= 'a' && ch[0] <= 'z')
			{
				// 利用ASCII码实现大写
				ch[0] = (char) (ch[0] - 32);
			}
			// 添加进字符串缓存区
			sbf.append(ch);
		}
		// 返回
		return sbf.toString();
	}

}
