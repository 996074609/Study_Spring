package com.yuejinfu.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DatasourceTest {




    @Test
    /**
     * 测试手动创建druid链接
     */
    public void datasourceTest2() throws PropertyVetoException, SQLException {
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
    }
    @Test
    /**
     * 测试手动创建c3p0链接
     */
    public void datasourceTest1() throws PropertyVetoException, SQLException {
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();

    }

    @Test
    /**
     * 测试手动创建c3p0链接（加载配置文件）
     */
    public void datasourceTest3() throws PropertyVetoException, SQLException {

        ResourceBundle resourceBundle=ResourceBundle.getBundle("jdbc");
        String driver=resourceBundle.getString("jdbc.driver");
        System.out.println(driver);
    }

    @Test
    /**
     * 测试spring容器创建数据源
     */
    public void datasourceTest4() throws PropertyVetoException, SQLException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource) app.getBean("dataSource");
        System.out.println(dataSource);


    }
}
