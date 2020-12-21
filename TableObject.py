# create new exception which inherits from main Exception class
class ValueNotFound(Exception):
    pass

# shell to convert a record into a excell-like table structure
# record is a 2d list with first row as headers
# first column is field name used to access each row
class Table:

    # recreate default constructor method to initialise all the
    # properties that can be associated with the table
    # self refers to the current instance of the object
    def __init__(self,record,title):
        self.title = title
        self.headers = record[0]
        self.record = record[1:]
        self.n_fields = len(self.record)
        self.n_cols = len(self.headers)

    # return a row from the table given a field name
    # raise an error if the field name is not found in the table
    def getRow(self,field_name):
        for row in self.record:
            if row[0] == field_name:
                return row
        raise ValueNotFound()

    # change the record property of the object to a new sorted
    # version of the record, sorted in ascending order by
    # a given header
    def sortByHeader(self,header):
        index = -1
        for val in range(self.n_cols):
            if self.headers[val] == header:
                index = val
        if index < 0:
            raise ValueNotFound()
        self.record = sorted(self.record,key=lambda x: x[index])

    # change the record to include a new row at the end 
    def addRow(self,row):
        self.record.append(row)

    # change the record property to have a different value at
    # the given row and header positions
    def setVal(self,field_name,header,new_val):
        for r in range(self.n_fields):
            if self.record[r][0] == field_name:
                for h in range(self.n_cols):
                    if self.headers[h] == header:
                        self.record[r][h] = new_val
                

record = [
    ["field_name","size","id"],
    ["A",7,10001],
    ["B",3,10002],
    ["C",13,10003],
    ["D",2,10004]
    ]
table = Table(record,"My Table")

table.title
table.record
table.n_fields

table.getRow("A")
try:
    table.getRow("E")
except:
    print("Value Not Found")

table.sortByHeader("size")

table.addRow(["E",14,10005])

table.setVal("E","size",5)

