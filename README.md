***

### PAPER 1
SET A

Q1) Write a method validate(int age) that throws an IllegalArgumentException if the age is less than 10, ArithmeticException if age is between 10 and 15, and ParseException if age is more than 60. In the main method, accept user’s age (call validate(age)) and print appropriate error message for each exception (using separate catch blocks for each). Also, print "Validation complete." regardless of the exception's occurrence.

Q2) Create an abstract class MediaFile with an abstract method play() and a concrete method info(). Define an interface Downloadable with method download(), and create 2 sub-interfaces Sharable and Streamable that extend Downloadable. Create 2 classes AudioFile and VideoFile that uses both MediaFile and Sharable. Ask user whether he wants to create an AudioFile or VideoFile, and call methods of appropriate class by clearly showcasing the use of runtime polymorphism.

Q3) Create an array of 3 Student objects (accept data from the user) where each student has a name and rollNumber. Traverse over the array and update name of each student in the database after matching their rollNumber.

***


### PAPER 2
**SET B**

**Q1)** WAP that accepts 5 email addresses from user and store them in a HashSet. Ensure no duplicate emails are added, and display a message if a duplicate is attempted. Use an iterator to traverse the set and print alternate email address. Using for loop, print count of all email addresses from the HashSet containing less than 5 characters.

**Q2)** Create an abstract class `Document` with an abstract method `open()` and a concrete method `getType()`. Define an interface `Sharable` with method `share()`, and extend it with `CloudSharable` adding method `uploadToCloud()`. Create two classes `PDFDocument` and `WordDocument` that use `Document` and `CloudSharable`. Demonstrate runtime polymorphism to invoke implemented methods on both classes.

**Q3)** WAP to accept user's name and age. Throw an exception and terminate the program with appropriate message if user’s age is less than 18 or more than 60. Otherwise insert name and age into the database, and print how many rows are affected – assuming that a table `User` exists in database with columns `Name` and `Age`.

***


### PAPER 3

1. **Create the given application using AWT/Swing.** When the convert button would be pressed then the entered temperature would be converted from Celsius to Fahrenheit.
   Assume 0 C = 32 F. (1C → {(1C \* 9/5) + 32}F).

2. **Create a Java program using file handling** in which you write a logic to identify how many are prime numbers. You must read the data from a file.
   (File contains at least two numbers separated by `;`, `,` or ` `).

   **File:** `2,7`
   **Output:** `2`

3. **Write a Java program** that stores the integers `{10, 20, 30, 40, 50}` in an array.
   Ask the user to enter an index to access an element from the array.

   * If the user enters a non-integer, handle the `InputMismatchException`.
   * If the index is invalid (e.g., out of bounds), handle the `ArrayIndexOutOfBoundsException`.
   * Always print **"Program terminated."** at the end using a `finally` block.

***

