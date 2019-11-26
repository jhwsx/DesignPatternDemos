package com.wzc.p15_abstract_factory._6_reflect_plus_abstract_factory;

/**
 * @author wangzhichao
 * @date 2019/11/26
 */
public class DataAccess {
    //    private static final String db = "Sqlserver";
    private static final String db = "Access";
    private static final String PACKAGE = "com.wzc.p15_abstract_factory._6_reflect_plus_abstract_factory";

    public static IUser createUser() {
        IUser result = null;
        try {
            String className = PACKAGE + "." + db + "User";
            Class<?> clazz = Class.forName(className);
            result = (IUser) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        try {
            String className = PACKAGE + "." + db + "Department";
            Class<?> clazz = Class.forName(className);
            result = (IDepartment) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return result;
    }
}
