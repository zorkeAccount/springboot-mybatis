功能：<br/>
1、dbdeploy - 自动创建和更新数据库表结构以及数据的CRUD等
（1）必须在sql目录下（该目录配置在<scriptdirectory>./sql</scriptdirectory>）创建*DDL\*DML的sql文件，实现表结构的创建更新，基础数据的添加、修改、删除
（2）执行resetDB.bat批处理文件可以创建数据库springboot-mybatis以及changelog表（sql目录必须存在！）
（3）执行createNewDDLChangeFile.bat批处理文件可以创建新的*DDL.sql以实现创建和更新表结构等（createNewDDLChangeFile.bat : *DML.sql->表数据记录等）

2、【推荐使用】CodeGenerator - 根据表结构自动生成Controller、Service、Mapper、XML等代码，注：该CodeGenerator工具改造自于[lihengming/spring-boot-api-project-seed](https://github.com/lihengming/spring-boot-api-project-seed)，
并且已经将dbtools工具项目在公司内部推广使用，在此十分感谢Alibaba大牛的开源分享给日常工作开发过程中带来的效率，现也希望以回馈社区的姿态将自己封装的其他相关工具一并开源！

3、【建议使用2】Mybatis-generator - 根据表结构自动生成持久化层一些基础的代码
   IDEA-右侧Maven Project,dbutils -> Plugins -> mybatis-generator:generate，双击，即可以逆向工程生成已经存在的一些表对应的持久化层代码