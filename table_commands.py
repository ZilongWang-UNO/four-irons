import openpyxl

# if you do not have openpyxl package installed, install by entering 'pip install openpyxl' in terminal

# retrieve excel file 'Courses and Clubs' from same directory this file is in.
workbook = openpyxl.load_workbook(r"Courses and Clubs.xlsx")

# retrieve worksheet
worksheet = workbook["Sheet1"]

# retrieve the number of rows for golf course info
course_row_count = len(worksheet["A"])

# initialize lists to store field data
golf_course_list = []
difficulty_list = []
public_list = []
phone_list = []
address_list = []

# store each field's data into its own list; field name starts the list
for _ in range(1, course_row_count):

    for cell in worksheet["A"]:
        golf_course_list.append(cell.value)

    for cell in worksheet["B"]:
        difficulty_list.append(cell.value)

    for cell in worksheet["C"]:
        public_list.append(cell.value)

    for cell in worksheet["D"]:
        phone_list.append(cell.value)

    for cell in worksheet["E"]:
        address_list.append(cell.value)

# output command to create table
print("\nTo create the table CourseTable, enter the sql command:\n")
print("CREATE TABLE CourseTable(ID int NOT NULL AUTO_INCREMENT, Golf_Course varchar(255), Difficulty varchar(255), " +
      "Public varchar(255), Phone varchar(255), Address varchar(255), PRIMARY KEY(ID));")

print("\n")

# outputs commands to insert data
print("Enter the command(s) for inserting the data into mysql. You may copy and paste all of them at once:\n")
for i in range(1, course_row_count):
    print("INSERT INTO CourseTable (Golf_Course, Difficulty, Public, Phone, Address) VALUES ('" +
          golf_course_list[i] + "','" + difficulty_list[i] + "','" + public_list[i] + "','" + phone_list[i] + "','" +
          address_list[i] + "');")
          
print()
