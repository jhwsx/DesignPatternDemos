package com.wzc.p15_abstract_factory._5_simple_factory_improve_abstract_factory;

/**
 * @author wangzhichao
 * @date 2019/11/26
 */
public class DataAccess {
//    private static final String db = "Sqlserver";
    private static final String db = "Access";


    public static IUser createUser() {
        IUser result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverUser();
                break;
            case "Access":
                result = new AccessUser();
                break;
            default:
                throw new IllegalArgumentException("Unknown db");
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
            case "Sqlserver":
                result = new SqlserverDepartment();
                break;
            case "Access":
                result = new AccessDepartment();
                break;
            default:
                throw new IllegalArgumentException("Unknown db");
        }
        return result;
    }
}
