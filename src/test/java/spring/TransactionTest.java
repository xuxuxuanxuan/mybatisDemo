package spring;

import org.mybatis.spring.SqlSessionUtils;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Spting 事务
 * @Author: sean.xu
 * @Date: 2020/5/19
 */
public class TransactionTest {

    private PlatformTransactionManager platformTransactionManager;

    private TransactionTemplate transactionTemplate;

    @Transactional
    public void test(){
    }
}
