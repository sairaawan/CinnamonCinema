# CinnamonCinema

Assign 15 seats to users for a cinema in a sequence

Three Rows: A-C

Five columns: 1-5

3*5=15 seats total

Assignment=>{A1,A2,A3,…..,C4,C5}

User can only request 1-3 seats

As soon as all the seats are assigned, there are no more seats and new user cannot request further until we restart the program

The program should allocate random no of seats random amount of times to a user.

# Pseudocode:
1.	Make an immutable list containing 15 value each representing a seat.
2.	Check if there are enough seats available when user requests.
3.	Check if the user has asked for correct number of seats i.e between 1 and 3
4.	When all checks are passed the program should assign 1st value from the list as seat 1, second value as seat 2 and 3rd value as seat 3 and assign to the user if user requested 3 seat. 
5.	Resize the list
6.	Repeat step 4 for next user
