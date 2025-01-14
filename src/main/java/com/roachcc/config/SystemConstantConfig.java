package com.roachcc.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 系统参数配置
 */

@Configuration
@Data
public class SystemConstantConfig {

    @Value("${data-archiving.maxBatchSize}")
    private  int MAX_BATCH_SIZE;//每批次处理的订单数量

    @Value("${data-archiving.archiveTablePrefix}")
    private  String ARCHIVE_TABLE_PREFIX;//归档表前缀

    @Value("${data-archiving.oldTableName}")
    private  String OLD_TABLE_NAME;//被切分的表名

    @Value("${data-archiving.lastProcessedId}")
    private  long LAST_PROCESSED_ID;//切表的起始位置

    @Value("${data-archiving.archiveOldSchemaName}")
    private  String ARCHIVE_OLD_SCHEMA_NAME;//归档旧表的schema名称

    @Value("${data-archiving.archiveNewSchemaName}")
    private  String ARCHIVE_NEW_SCHEMA_NAME;//归档新表的schema名称

}
