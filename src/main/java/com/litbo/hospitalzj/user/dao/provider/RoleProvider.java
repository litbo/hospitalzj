package com.litbo.hospitalzj.user.dao.provider;


import com.litbo.hospitalzj.user.vo.SelectUserVo;

public class RoleProvider {

    public String listUserByRId(String roleId){
       String sql =  "SELECT\n" +
               "e.user_id AS userId,\n" +
               "e.user_xm AS name,\n" +
               "r.role_name AS roleName\n" +
               "\n" +
               "FROM\n" +
               " s_emp AS e\n" +
               "INNER JOIN  s_user_role AS ur ON e.user_id= ur.user_id\n" +
               "INNER JOIN  s_role AS r ON r.role_id= ur.role_id\n" +
               "WHERE ur.role_id = #{roleId}";
       return sql;
    }
    public String listUser(){
        String sql = "SELECT\n" +
                "                e.user_id AS userId,\n" +
                "                e.user_xm AS name,\n" +
                "                r.role_name AS roleName  \n" +
                "                FROM\n" +
                "                s_user u\n" +
                "               LEFT JOIN s_user_role AS ur ON u.user_id =ur.user_id\n" +
                "               LEFT JOIN s_role AS r on ur.role_id = r.role_id\n" +
                "               LEFT JOIN s_emp  AS e on u.user_id = e.user_id";
        return sql;
    }
    public String listUserByX(SelectUserVo selectUserVo){
        StringBuffer sql =new StringBuffer("SELECT\n" +
                "\tu.user_id AS userId,\n" +
                "\te.user_xm AS name,\n" +
                "\tr.role_name AS roleName \n" +
                "FROM\n" +
                "\t s_user as u\n" +
                "\tLEFT JOIN  s_emp AS e ON u.user_id = e.user_id\n" +
                "\tLEFT JOIN  s_user_role AS ur ON u.user_id = ur.user_id\n" +
                "\tLEFT JOIN  s_role AS r ON r.role_id= ur.role_id" +
                "  WHERE 1 = 1");
        if(selectUserVo.getRoleId()!=null) sql.append("and r.role_id Like #{roleId}");
        if(selectUserVo.getUserId()!=null) sql.append("and u.user_id Like #{userId}");
        if(selectUserVo.getStatus()!=null) sql.append("and u.status Like #{status}");
        return sql.toString();
    }
}
