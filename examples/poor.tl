-- minimum characteristics!

type table Table {
   n1: real;
   n2: real;
   average: real := (n1+n2)/2; -- defined as a formula!
};

t: Table;
t := new; -- new empty table


c: real;
c := 1.0;

[1.0, c] >> t; -- add line at the end of the table
[] >> t; -- add empty (undefined) line at the end of the table
c := c+1;
[2.0, c] >> t;
[] >> t; -- add empty (undefined) line at the end of the table
c := c+1;
[3.0, c] >> t;
[] >> t; -- add empty (undefined) line at the end of the table

println t;

