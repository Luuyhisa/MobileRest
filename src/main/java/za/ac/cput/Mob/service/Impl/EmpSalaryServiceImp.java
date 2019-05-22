package za.ac.cput.Mob.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.ac.cput.Mob.domain.EmpSalary;
import za.ac.cput.Mob.repository.EmpSalaryRepository;
import za.ac.cput.Mob.repository.Impl.EmpSalaryRepositoryImp;
import za.ac.cput.Mob.service.EmpSalaryService;

import java.util.Set;
@Service("EmpSalaryServiceImp")

public class  EmpSalaryServiceImp implements EmpSalaryService {

    @Autowired
    @Qualifier("InMemory")
        private static EmpSalaryServiceImp service = null;
        private EmpSalaryRepository repository;

        private EmpSalaryServiceImp(){
            this.repository = EmpSalaryRepositoryImp.getRepository();

        }

        public static EmpSalaryServiceImp getService(){
            if (service==null) service = new EmpSalaryServiceImp();
            return service;
        }

        @Override
        public Set<EmpSalary> getAll() {
            return repository.getAll();
        }

        @Override
        public EmpSalary create(EmpSalary empSalary) {
            return repository.create(empSalary);
        }

        @Override
        public EmpSalary update(EmpSalary empSalary) {
            return repository.update(empSalary);
        }

        @Override
        public void delete(String s) {
            repository.delete(s);
        }

        @Override
        public EmpSalary read(String s) {
            return repository.read(s);
        }
}
