# Interface

In order to practice creating and implementing an interface, first do a Fork of the following repository then clone it locally.

Don't forget to Fork, otherwise you won't be able to push anything! Don't know how to Fork a repository ? Look at this GitHub documentation.

1. Go through the repo and take a look at its content:

•
Bird, an abstract class

•
Eagle, a class inherited from Bird   

•
Swim, an interface    

•
Penguin, a class inherited from Bird which implements Swim   

•
Nature, which you will compile and run to see how everything works

2. Create a Fly interface

3. Add the following methods to the Fly interface:

•
takeOff with no arguments, and returns nothing    

•
ascend which takes an integer meters as an argument, and returns an integer    

•
descend which takes an integer meters as an argument, and returns an integer    

•
land with no arguments, which returns nothing    

•
glide, with no arguments, which returns nothing and has a default behaviour: displaying the text "glides into the air."

4. Make it so that the Fly interface is implemented by the Eagle class

•
You will be able to determine the behaviour of the methods, but each method must display text in the console.    

•
If you need a little inspiration, feel free to check out the implementation of Swim in Penguin.

5. Undo the commenting out of the Eagle methods being called in `Nature`.

6. Compile and test Nature. Once everything works, create a git repository and save it all to GitHub

7. Share the link of your GitHub repository as your solution

Example results for running Nature:

Hawkeye takes off in the sky.
Hawkeye flies upward, altitude: 120
Hawkeye flies upward, altitude: 150
glides into the air.
Hawkeye flies downward, altitude: 10
Hawkeye is too high, it can't land.
Hawkeye flies downward, altitude: 1
Hawkeye lands on the ground.
Shell
Validation criteria :
•
The GitHub repository contains the file Fly.java

•
Classes and interfaces are named according to OOP conventions including: private attributes, the this keyword, and getters and setters

•
The Eagle class implements the Fly interface

•
The Nature class calls the same methods as an instance of Eagle.

•
The Nature class compiles with no errors and displays in the terminal a result similar to the one given above