
# PHONE BOOK COMMAND LINE APPLICATION

## 1. INSTALLATION REQUIREMENTS
=============================
1. java 8 installation
2. Postgresql Or MySql database installation
3. Maven installation

## 2. PROJECT INSTALLATION CHECKING
=========================

```
echo %JAVA_HOME%
echo %MAVEN_HOME%
echo %M2_HOME%
echo %CLASSPATH%

```

## 3. PROCEDURE AND COMMANDS TO EXECUTE BUILD
============================================

Update USERNAME/PASSWORD for the database table\
Contacts database seting is found in folder main/java/dbase/dbConfig.java
Logs database seting is found in folder main/resources/log4j.properties


```
mvn clean install -X
mvn test

```


## 4. COMMANDS TO RUN IN PROMPT AFTER RUNNING A SUCCESSFUL BUILT
=================================================================

java -cp target/focusphone-1.0-SNAPSHOT.jar com.setUp


## 5. SERVICEES AVAILABLE ON PHONE BOOK
========================================


Available options to manipulate phonebook using console application.

"HELP   - to lists all valid commands available in this application "

"ADD    - to saves a new contact entry into the phone book" \
"LIST   - to lists all saved contacts sorted by date of entry"\
"DELETE - to erase a contact from the phone book\n"

"NAME   - to search for a contact by the contact name"\
"NUMBER   - to search for a contact by the contact number"\
"UPDATE - to edit the phone number of  existing contact"

"RESET1   - Deletes all contacts records and restores factory defaults"\
"RESET2   - Deletes all logs datails & records and restores factory defaults"

"LOGS - to view past log data manipulations of contacts"\
"EXIT   - STOP using the Phone Book application console" 

"--------------------------------------------------------------"

" To continue, please enter an action command here >>>  ";
    
# 6. CONTACTS BOOK APPLICATION CONSOLE- INTERFACE UX 
=====================================================

Here are screen-shots from the output of compututation console

![ Muntu App SMS # 1 ](https://github.com/LINOSNCHENA/PhoneBookApp/blob/master/ux/page%20(1).png)
![ Muntu App SMS # 2 ](https://github.com/LINOSNCHENA/PhoneBookApp/blob/master/ux/page%20(2).png)

![ Muntu App SMS # 3 ](https://github.com/LINOSNCHENA/PhoneBookApp/blob/master/ux/page%20(3).png)
![ Muntu App SMS # 4 ](https://github.com/LINOSNCHENA/PhoneBookApp/blob/master/ux/page%20(4).png)
