package DAO;

public interface DAOInterfaces<T> {
    public int insertData(T t);
    public int updateData(T t);
    public int deleteData(T t);
    public int selectData(T t);

    
}
