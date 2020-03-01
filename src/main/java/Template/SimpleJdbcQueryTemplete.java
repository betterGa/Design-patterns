package Template;

/*
public class SimpleJdbcQueryTemplete {

    //SimpleJdbcQueryTemplete的query()方法首先会获得一个数据库的连接，
    //然后创建PreparedStatement实例
    //再执行查询结果并返回
    //最后调用回调rsHandler的handle(ResultSet rs)方法来处理查询结果并返回
    public <T> T query(String queryString, ResultSetHandler<T> rsHandler) {
        //define variables...
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/first?useSSL=false", "root", "jdpy1229jiajia");
            connection.setAutoCommit(false);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            return rsHandler.handle(rs);
        } catch (SQLException e) {
            e.getErrorCode();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            //close the statement&connection
        }
 }
}*/