/*
 * allinone.groovy
 *
 * Copyright 2015 Ajay Bhatia <ajay@arch>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 *
 *
 */


//Single line comments start with two forward slashes
/*
Multi line comments look like this.
*/

//Hello World
println "Hello world!"

/**
 * Variables:
 *
 * You can assign values to variables for later use
 */

def x = 1
println x

x = new java.util.Date()
println x

x = -3.1499392
println x

x = false
println x

x = "Groovy!"
println x

/**
 * Collections and maps
 */

//Creating an empty list
def technologies = []

/**
 * Adding elemets to the list
 */

//As with Java
technologies.add("Grails")
println technologies

//Left shift adds, and returns the list
technologies << "Groovy"
println technologies

//Add multiple elements
technologies.addAll(["Gradle", "Griffon"])
println technologies

/**
 * Removing elements from the list
 */

//As with Java
technologies.remove("Griffon")
println technologies

// Subtraction works also
technologies = technologies - 'Grails'
println technologies

/**
 * Iterating Lists
 */

technologies.each { println "Technology: $it" }
technologies.eachWithIndex { it, i -> println "$i: $it" }

/**
 * Checking list contents
 */

//Evaluate if a list contains element(s) (boolean)
contained = technologies.contains("Groovy")
println contained

//Or
contained = 'Groovy' in technologies
println contained

//Check for multiple contents
println technologies.containsAll(['Groovy', 'Grails'])

/**
 * Sorting lists
 */

//Sort a list (mutates original list)
technologies.sort()
println technologies

// To sort without mutating original, you can do:
sortedTechnologies = technologies.sort( false )
println sortedTechnologies

/**
 * Manipulating lists
 */

//Replace all elements in a list
Collections.replaceAll(technologies, 'G(radle', 'gradle')
println technologies

//Shuffle a list
Collections.shuffle(technologies)
println technologies

numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Collections.shuffle(numbers)
println numbers

//Clear a list
technologies.clear()
println technologies

//Creating empty map
def devMap = [:]

//Add values
devMap = ['name' : 'Ajay', 'framework' : 'Grails', 'language' : 'Groovy']
println devMap

devMap.put('lastname', 'Bhatia')

//Iterate over elements of a map
devMap.each { println "$it.key : $it.value" }

//Iterate over elements of a map
devMap.eachWithIndex { it, i -> println "$i : $it" }

/**
 * Groovy Beans
 */

class Foo {
  final String name = "Ajay";

  String language
  protected void setLanguage(String language) {
    this.language = language
  }

  def lastName
}

/*
 * Logical Branching and Looping
 */

//Groovy supports the usual if - else syntax
def x = 3

if(x == 1) {
  println "One"
} else if(x == 2) {
  println "Two"
} else {
  println "X greater than Two"
}

//Groovy also supports the ternary operator:
def y = 10
def x = (y > 1) ? "worked" : "failed"
assert x == "worked"

//For loop
//Iterate over a range
def x = 0
for (i in 1..100)
  x += i
