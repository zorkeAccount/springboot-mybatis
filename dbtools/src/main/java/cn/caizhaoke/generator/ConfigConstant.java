package cn.caizhaoke.generator;

/**
 * 代码生成器中的一些常量配置
 *
 * @author zhaoke
 *         Created on 2018/2/9.
 */
public class ConfigConstant {
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/springboot-mybatis";
    public static final String JDBC_USERNAME = "root";
    public static final String JDBC_PASSWORD = "root123";
    public static final String JDBC_DIVER_CLASS_NAME = "com.mysql.jdbc.Driver";

    public static final String PARENT_PACKAGE = "cn.caizhaoke";//整个工程的基础包名称，根据自己公司修改
    public static final String BASE_PACKAGE = PARENT_PACKAGE + ".second";//业务模块项目基础包名称，根据业务进行修改

    public static final String MODEL_PACKAGE = BASE_PACKAGE + ".entity";//Model所在包
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".mapper";//Mapper所在包
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";//Service所在包
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";//ServiceImpl所在包
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".web";//Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = PARENT_PACKAGE + ".common.Mapper";//Mapper插件基础接口的完全限定名
}
