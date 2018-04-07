@echo 删除数据库
mysql -uroot -proot123 -e "drop database if exists springboot-mybatis"

@echo 新建数据库
mysql -uroot -proot123 -e "create database springboot-mybatis DEFAULT CHARACTER SET utf8"

@echo 创建changelog
call mvn package

@echo 执行数据库更新
call mvn dbdeploy:update
pause