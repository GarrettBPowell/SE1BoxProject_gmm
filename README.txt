Garrett Powell, Marlon Miller Matute, Michael Thorson

Box-Making Program

Inception Deck:
1. Why we are here.
    Our goal is to allow our users to make a box.
2. Elevator pitch.
   We designed the newest and coolest box making software. Simply input your preferences and have an svg file ready to print at the ACU Maker Lab.

4. Create a NOT list.
    Custom shape maker
    Round boxes
    Gears or anything mechanical
    Buying the user a computer
    Doing any sort of authentication
  
7. Ask what keeps us up at night.
    What is a box?
    How does scaling work for SVG files
  
8. Size it up.
    It will take about a semester
    8-12 weeks
    
9. Be clear on what’s going to give.
    Customization beyond cubes and rectangular prisims
    
10. Show what it’s going to take.
     A lot of bug fixing and changing layouts and design.


Complexity: 13

Glossary:

Laser Cutter - a machine that cuts and engraves shapes into a variety of materials, like wood, fiberglass, foam core, and many more
	Cut - to fully cut through a material, separating it from other parts
	Engrave - to partially cut into the surface of the material, not separating it from other parts (usually for decals, images, or monograms)
SVG (Scalable Vector Graphics) - an xml-based vector image format that supports two-dimensional graphics
Path - a continuous line or single object in an SVG file, for example, one square
Adobe Illustrator - a software that can handle, interact with, or create SVG files; this is what the Maker Lab uses to print with the laser cutters
Teeth - the small notches in each side of the box that allows the sides to fit together (always 1 cm wide in the boxes this program creates)

Length is the dimension stretching from left to right
Width is from front to back
Height is from bottom to top

The maximum dimensions for the box in this program is calibrated for the normal Epilog Laser, which is 24 x 18 inches, or roughly 60 x 45 cm

Usage:

The program, when run, will output a string(s) of SVG, forming the walls of a box.

Upon running the program, the user will be prompted for the desired length, width, and height of the box (between minimum and maximum values) in centimeters, as well as the thickness of the material.
1. Run the program
2. You will be prompted for the desired Length, Width, and Height of your box, as well as the thickness of the material.
	(These dimensions are in centimeters and must be in whole numbers, while material thickness can be a decimal between .5 and 1.5 cm)
3. You will be asked whether you would like to engrave a letter onto the box, and if so, which letter and what side you would like it on.
4. The program will produce an SVG file for the sides of the box, which you will need to bring into Adobe Illustrator to print on the laser cutter, using the recommended settings for your chosen material.

Expected Output:

The strings of SVG will appear similar to the following
<path d="M 45.0 45.0 v -9.0 h -9.0 v 9.0 h 9.0" stroke="rgb(255,0,0)" stroke-width="0.20" />

These will each form a wall of the box.

Assembly:

The program will output an SVG file containing six shapes. From top to bottom and left to right, these sides are:

A	A	B
B	Top	Bottom

The pairs of sides should be placed opposite each other in the box, with the top and bottom oriented correctly.
The teeth fit together in a way that their ends should be flush with the surface of the box.
The sides facing up are the outward facing sides of the box.
