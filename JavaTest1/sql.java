2.
b)EMPLOYEENUMBER EMPLOYEENAME                                       DEPARTMENTID
-------------- -------------------------------------------------- ------------
    SALARY
----------
            11 manikanta                                                    15
      1234
c)DEPARTMENTID DEPARTMENT PLACENAME
------------ ---------- ----------
          10 civil      hampinagar
a)insert into department values(10,'civil','hampinagar')
*
ERROR at line 1:
ORA-00001: unique constraint (SYSTEM.DEPARTMENTPK) violated.

insert into employee values(11,'manikanta',15,1234)
*
ERROR at line 1:
ORA-00001: unique constraint (SYSTEM.EMPLOYEEPK) violated.
g)                                 *
ERROR at line 1:
ORA-02293: cannot validate (SYSTEM.EMPLOYEECHECK) - check constraint violated
                                    *
ERROR at line 1:
ORA-02293: cannot validate (SYSTEM.DEPARTMENTCHECK) - check constraint violated
i)
                                                        *
ERROR at line 1:
ORA-02261: such unique or primary key already exists in the table

                                                    *
ERROR at line 1:
ORA-02261: such unique or primary key already exists in the table


Table dropped.

Table dropped.
3
a) update customers set city='up' where cid=12;
     select * from  customers;

       CID CNAME      CITY                 STATE         PINCODE
---------- ---------- -------------------- ---------- ----------
        11 devika     timmanahalli         karnataka      123456
        12 priyanka   up                   tamilnadu      122345
        13 ramya      kadapa               ap             123354
b)update customers set state='telangana' where cid=13;
    select * from  customers;

       CID CNAME      CITY                 STATE         PINCODE
---------- ---------- -------------------- ---------- ----------
        11 devika     timmanahalli         karnataka      123456
        12 priyanka   up                   tamilnadu      122345
        13 ramya      kadapa               telangana      123354
c) delete customers details where cid=13;
     select * from  customers;

       CID CNAME      CITY                 STATE         PINCODE
---------- ---------- -------------------- ---------- ----------
        11 devika     timmanahalli         karnataka      123456
        12 priyanka   up                   tamilnadu      122345
d)savepoint.
e)alter table customer delete pincode


    


