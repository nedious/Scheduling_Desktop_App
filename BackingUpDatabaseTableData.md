View the recording: 
[BackingUpDatabaseTableData.md](https://wgu.webex.com/webappng/sites/wgu/recording/bc314ed7f9f21039aabb0050568f95d3/playback)
5 Min

[google docs page](https://docs.google.com/document/d/1noZ1LN7LJr9e4c5zq_5sFnrM6uWup6N3idIH1w5_y28/edit)

1. Export table data to a CSV (Comma Separated Values) File
2. Start MySQL Workbench
3. Go to data, open tables. Move mouse over table name and 3 options will display, the far right one is the ‘select’ button, click that one (looks like a calendar)
4. The purpose of this is to show all the records for this table,
5. Now we export all the data into a CSV file
6. Click the button “export recordset to an external file”
7. Save to your preferred destination
8. Open Saved CSV file
* This will open in Microsoft Excel
* you can also open it in Notepad


9. Go to MySQL Workbench
10. To delete data from table type into the query:
11. `DELETE FROM databaseName.tableName WHERE columnName > 8`
12. 2- Import CSV File data into a table
13. To Import data from the CSV you saved:
14. Go to the table you want to import
15. Right click the tableName, and select “Table Data Import Wizard”
16. Browse to where you saved the CSV file
17. Then import to the ‘existing’ table (option to create new table) and select tableName you want to import to 
18. This imports the data. To confirm go to the tableName and click the ‘select’ button and your data will be displayed 
