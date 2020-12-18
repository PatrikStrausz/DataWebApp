package sk.itsovy.strausz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sk.itsovy.strausz.dao.CustomerDao;
import sk.itsovy.strausz.entity.Customer;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        customerDao.saveCustomer(customer);
    }

    @Override
    public Customer getCustomer(int id) {
        return customerDao.getCustomer(id);
    }

    @Override
    public void deleteCustomer(int id) {
        customerDao.deleteCustomer(id);

    }
}
