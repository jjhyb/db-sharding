package com.yibo.dbsharding.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.shardingsphere.api.config.sharding.KeyGeneratorConfiguration;
import org.apache.shardingsphere.api.config.sharding.ShardingRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.TableRuleConfiguration;
import org.apache.shardingsphere.api.config.sharding.strategy.InlineShardingStrategyConfiguration;
import org.apache.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * sharding-jdbc java代码配置方式
 */

//@Configuration
public class ShardingJDBCConfig {

    /**
     * 定义数据源
     * @return
     */
    public Map<String, DataSource> createDataSourceMap(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/sharding-orderdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("yibo");
        Map<String,DataSource> result = new HashMap<>();
        result.put("master1",druidDataSource);
        return result;
    }

    /**
     * 定义主键生成策略
     * @return
     */
    public static KeyGeneratorConfiguration getKeyGeneratorConfiguration(){
        KeyGeneratorConfiguration result = new KeyGeneratorConfiguration("SNOWFLAKE","order_id");
        return result;
    }

    /**
     * 定义trade_Order表的分片策略
     * @return
     */
    public TableRuleConfiguration getOrderTableRuleConfiguration(){
        TableRuleConfiguration result = new TableRuleConfiguration("trade_Order","master1.trade_order_$->{1..2}");
        result.setTableShardingStrategyConfig(new InlineShardingStrategyConfiguration("order_id","trade_order_$->{order_id % 2 + 1}"));
        result.setKeyGeneratorConfig(getKeyGeneratorConfiguration());
        return result;
    }

    /**
     * 定义sharding-jdbc数据源
     * @return
     */
    @Bean
    public DataSource getShardingDataSource() throws SQLException {
        ShardingRuleConfiguration shardingRuleConfig = new ShardingRuleConfiguration();
        shardingRuleConfig.getTableRuleConfigs().add(this.getOrderTableRuleConfiguration());
        //spring.shardingsphere.props.sql.show=true
        Properties properties = new Properties();
        properties.put("sql.show","true");
        return ShardingDataSourceFactory.createDataSource(this.createDataSourceMap(),shardingRuleConfig,properties);
    }
}
