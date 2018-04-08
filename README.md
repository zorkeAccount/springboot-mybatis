# springboot-mybatis
spring boot &amp;&amp; mybatis with mysql,redis,activemq and etc.

## dbtools工具的使用
1. 基本环境及工具：jdk8 + maven + mysql + Intellij IDEA + git
2. IDEA导入springboot-mybatis项目工程及模块dbtools
3. 建立自己的项目数据库名如springboot-mybatis(utf8,utf8_general_ci)，并更改pom.xml和ConfigConstant.java中的数据库连接地址
、数据库名、数据库登录用户名及密码
4. 通过脚本createNewDDLChangeFile或createNewDMLChangeFile，生成*.sql文件并在其中添加表创建SQL或数据初始化的SQL语句，格式如
.dbtools/sql/20180407234846_DDL.sql文件
5. 执行resetDb脚本文件，初始化数据库（注意：尤其是创建了changelog表，该表主要是dbdeploy用以记录DDL或DML文件的执行历史） -> resetDB
脚本只在数据库初始化的时候执行一次，后续继续有新的DDL或DML文件生成之后，均通过updateDb脚本文件进行对数据库表结构及数据的维护操作（也可以
直接使用脚本中的mvn命令在dbtools工程目录下进行操作）
6. 使用mybatis-generator 插件自动创建代码entity及mapper代码：首先配置pom.xml中的<target.package.name>，作为该表业务所处的包名；然后
IDEA -> Maven Projects -> dbtools -> Plugins -> mybatis-generator即可创建代码；到相应的包下即可以查看生成的代码；然后，在service层
即可对生成的代码进行调用，以实现基本的增删改查操作
7. 较6而言推荐使用7，使用CodeGenerator工具自动创建controller、service、mapper、entity代码：首先配置ConfigConstant中的数据库连接信息
和包名，以及中的一些路径信息；然后在CodeGenerator的main中输入相应的表名，运行main方法即可生成代码；然后，生成的代码放在相应的springboot
或者springMVC项目(记得需要配置相关的依赖并且把common下的文件拷到相应的工程目录中)下，即可可以执行运行使用如项目kf中就是通过该通过直接生成的!
