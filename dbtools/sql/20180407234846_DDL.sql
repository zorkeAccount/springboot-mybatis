DROP TABLE IF EXISTS `db_test`;
/
CREATE TABLE `db_test` (
  `db_test_id` VARCHAR(100) NOT NULL COMMENT '测试Id',
  `db_test_text` VARCHAR(255) NOT NULL COMMENT '测试文本',
  `status` VARCHAR(2) DEFAULT '1' COMMENT '状态，1启用(默认)，-1禁用',
  `update_time` datetime  DEFAULT NULL COMMENT '更新时间',
  `create_time` datetime  NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`db_test_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='测试表';
/