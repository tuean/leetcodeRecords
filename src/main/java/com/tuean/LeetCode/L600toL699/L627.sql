
-- 1
update salary set sex = CHAR(ASCII('f') ^ ASCII('m') ^ ASCII(sex));

-- 2
UPDATE salary
    SET sex  = (CASE WHEN sex = 'm'
        THEN  'f'
        ELSE 'm'
        END)