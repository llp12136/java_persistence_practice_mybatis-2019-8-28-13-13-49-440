package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import tws.Entity.Employees;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    public List<Employees> selecetAll();

}
