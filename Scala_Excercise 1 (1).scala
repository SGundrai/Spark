// Databricks notebook source
//1. program to convert kg to g
val input_kg=56
println("In Grams:", input_kg * 1000)

//2.program to covert temperature from degree C to F
val temp_in_centigrade = 80
val fheit= ( temp_in_centigrade * 9/5) + 32
println("Temperature in F:", fheit)



// COMMAND ----------

//3. Biggest of 3 Numbers
val number1 = 50
val number2 = 90
val number3 = 30
println("Checking the biggest of the 3 numbers")
if ( number1 > number2 && number1 > number3)
{
  println("Biggest Number is:", number1)
}
else if(number2 > number1 && number2 > number3)
{
     println("Biggest Number is:", number2)
}
else
{
  println("Biggest Number is", number3)
}

// COMMAND ----------

val variable = 13
if (variable >100 && variable <1000)
{
  println("Wrong Number")
}
else if( variable % 2 == 0 )
{
    println("Its an Even Number")
    println("Reminder is:", variable % 3)
}
else if( variable % 2 !=0 )
{
    println("Its an ODD Number")
    println("Reminder Is:", variable % 2)
}

// COMMAND ----------

/*5. Declare & initialize a number. Check whether the number is in range 0-100
or not. If not in range print invalid input. Else – if the number is in range 90-
100 then print Super Smart, 80-90 print Smart,70-80 print smart enough,
60-70 print just smart, 35-60 print no smart, 0-35 print dump */

val number=93
if (number >=0 && number <=100)
{
if ( number >=90 && number <100)
{
  println("Super Smart")
}
else if(number>=80 && number<90)
{
  println("Smart")
}
else if(number >=70 && number <80)
{
  println("Smart Enough")
}
else if( number >=60 && number<70)
{
  println("Smart")
}
else if(number >=35 && number < 60)
{
  println("No Smart")
}
else if( number>=35 && number <35)
{
  println("Dump")
}
else
{
  println("Invalid Input")
}
}


// COMMAND ----------

/* 6. Write a program to perform simple math based on the user inputs by using
Switch condition.(+ , - , * , /) */
val user_input="/+"
print(user_input)
user_input match
{
case "+" => println("Addition of 2 Numbers:", 10 + 20)
case "-" => println("Subtraction of 2 Numbers:", 5 -2 )
case "*" => println("Multiplication of 2 Numbers:", 2 * 50)
case _ => println("Invalid Operator:", user_input)
}

// COMMAND ----------

/* 7. Print the string 60 Times */
val user_string="Scala Learning"
for (n <- 1 to 60)
{
println(user_string)
}


// COMMAND ----------

/* 8.program to print all numbers which are divisible by 11 from 250 to 550*/
for ( i <- 250 to 550)
{
  if(i%11 == 0)
  {
    print(i)
  }
}


// COMMAND ----------

/* 9.program to sum all the numbers from 56 to 153. */
var total_sum=0
for (natural_numbers <- 56 to 153 )
{
  total_sum = total_sum + natural_numbers
}
println("Sum of Numbers from 56 to 153:", total_sum)

// COMMAND ----------

/* 10. program to print all even numbers in range 700 to 900 */
for ( even <- 700 to 900 )
{
  if ( even%2 == 0)
  {
    println(even)
  }
}

// COMMAND ----------

/* 11.  program to print all odd numbers from 251 to 51 */
var i=251
for (n <- 251 to 51 by -1)
{
  if (n % 2 != 0)
  {
    println(n)
  }
  
}

// COMMAND ----------

/* 12. Program to print the count of the even numbers between the given range */
val range_start=1
val range_stop=19
var count=0
for ( numbers <- range_start to range_stop)
{
  if ( numbers %2 == 0)
  {
    count=count + 1
  }
  }
  println("Count of Even Numbers in the range of[", range_start,range_stop,"]:", count)

// COMMAND ----------

/* 13. program to print alternate even numbers from 20 to 140. Like (20,24,28...) */
for ( even_numbers <- 20 to 140 by 4)
{
  println(even_numbers)
}


// COMMAND ----------

for ( i <- 1 to 5)
{
  print(i,"*",i+1)
}

// COMMAND ----------

/* 16. program to sum all even numbers between 382 and 582 */
var sum_of_even_numbers=0
for ( numbers <- 382 to 582 )
{
  if ( numbers % 2 == 0)
    {
      sum_of_even_numbers  = sum_of_even_numbers + numbers
    }
}
println("Sum of All Even Numbers:", sum_of_even_numbers)

// COMMAND ----------

/* 17.     */

// COMMAND ----------

/* 18.  program to find the average of 24,26,28,.....100. */
var sum=0
var count=0
for (num <- 24 to 100 by 2)
{
  sum = sum + num
  count = count + 1
}
println("Average of numbers:", sum / count)

// COMMAND ----------

/* 19. program to sum of the following Series. 5^2 + 6^2.........+10^2 */
var total_sum=0
for (n <- 5 to 100)
{
  total_sum = total_sum + ( n * n)
}
println("Total Sum:" +total_sum)

// COMMAND ----------

/* 20.  Print A, B alternatively as A,B,A,B,A,B...100 times */
for (n <- 2 to 100)
{
  if(n%2==0)
  {
    print("A,")
  }
  else
  {
    print("B,")
  }
}

// COMMAND ----------

/* 21.program to print the following series. 100,200,300........10000 */
for (i <- 100 to 10000 by 100)
{
  print(i+",")
}

// COMMAND ----------

/* 22. Program to print the series 10@9,9@8,8@7,... */
for( i<- 10 to -5 by -1)
{
  var n=i-1
  print(i+"@"+n+",")
}

// COMMAND ----------

/* 23.  to print the following series. 5^2, 7^2,9^2.....25^2 */
for ( i <- 5 to 25 by 2)
{
  print(i+"^2,")
}

// COMMAND ----------

/* 24.print the following series. 5,10,5,10,5,10,5 for 7 times */
for (n<- 5 to 10 by 5)
{
 }

// COMMAND ----------

/* 25. print the series 5*4,5*3,5*2,......5*(-12) */
val x=5
for ( n <- 5 to -11 by -1)
{
  var i=n-1
  print(x+"*"+i+",")
  
}
println("")
for ( n <- 5 to -11 by -1)
{
  var i=n-1
print(x*i+",")
}


// COMMAND ----------

/* 26. programs to print the following series.
1,even,3,even,5,even,.......35,even */
for (n <- 1 to 35 by 2)
{
  print(n+",even,")
}

// COMMAND ----------

/* Write a code to print the triangle pattern with the numbers */
for ( i<- 1 to 10)
{
  for( j<-1 to i)
  {
    print(i+" ")
        
  }
  println()
}
