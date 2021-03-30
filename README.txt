Garrett Powell, Marlon Miller Matute, Michael Thorson

Box-Making Program

Inception Deck:
1. Why we are here.
    Our goal is to allow our users to make a box.
2. Elevator pitch.
    
3. Design a product box.
  
4. Create a NOT list.
    Custom shape maker
    Round boxes
    Gears or anything mechanical
    Buying the user a computer
    Doing any sort of authentication
  
6. Show the solution.
  
7. Ask what keeps us up at night.
  
8. Size it up.
  
9. Be clear on what’s going to give.
    Customization beyond cubes and rectangular prisims
    
10. Show what it’s going to take.

User Stories:

1: A home designer wants to make boxes for decoration around a house. In doing so, the user would like to use materials of different type and thicknesses so that they fit the other decorations in the house.

2: A teacher would like to make boxes without tops to hold pencils, pens, and other school supplies in her classroom. So she would like to be able to make a box without a top.

Complexity: 13

Glossary:

SVG (Scalable Vector Graphics) - an xml-based vector image format that supports two-dimensional graphics
Teeth - the small notches in each side of the box that allows the sides to fit together (always 1 cm wide in the boxes this program creates)

Usage:

The program, when run, will output a string(s) of SVG, forming the walls of a box.

Upon running the program, the user will be prompted for the desired length, width, and height of the box (between minimum and maximum values) in centimeters, as well as the thickness of the material.
1. Run the program
2. You will be prompted for the desired Length, Width, and Height of your box, as well as the thickness of the material and whether you want your box to have an open or closed top.
	(These dimensions are in centimeters and must be in whole numbers, while material thickness can be a decimal between .5 and 1.5 cm)
3. The program will produce an SVG file for the sides of the box, which you will need to bring into Adobe Illustrator to print on the laser cutter, using the recommended settings for your chosen material.

Expected Output:

The strings of SVG will appear similar to the following
<path d="M 45.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0" stroke="rgb(255,0,0)" stroke-width="0.20" />

These will each form a wall of the box.
