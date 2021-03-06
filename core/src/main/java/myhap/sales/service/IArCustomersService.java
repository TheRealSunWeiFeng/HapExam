package myhap.sales.service;

import com.hand.hap.core.ProxySelf;
import com.hand.hap.system.service.IBaseService;
import myhap.sales.dto.ArCustomers;

public interface IArCustomersService extends IBaseService<ArCustomers>, ProxySelf<IArCustomersService>{
    ArCustomers selectCustomerWithOutRequestId(Long customerId);
}