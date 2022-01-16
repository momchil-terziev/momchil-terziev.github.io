            

**Announcement:**

At present, I generate a temporary link for each student when sharing this document. To avoid having to do this in the future and give unlimited access to anyone who needs access, **I am migrating the content of this document to a** webpage. When I have completed this, you will find the link to the new version of this guide <here>.

# Purpose of this document

This document is prepared Dr Momchil Terziev to help students working with ShipX. The content of this document is updated based on the problems students identify, specifically with importing geometries and removing errors from hull sections. With time, students have also contributed to this document by identifying problems and solutions, for which they have my thanks.

The purpose of this document is to facilitate working with ShipX and allow students more time to work on critical interpretation and evaluation of results rather than on debugging. If you have any questions, require further help, or have identified a mistake/discontinued software version etc., please contact me using the details below.

If you are learning how to use ShipX’s motions and added resistance features, you can watch the step-by-step video tutorials I prepared for 5th year students:

· Added resistance: [https://web.microsoftstream.com/video/ec0c487c-2a98-4d09-84a9-19b51ece039f](https://web.microsoftstream.com/video/ec0c487c-2a98-4d09-84a9-19b51ece039f)

· Motions: [https://web.microsoftstream.com/video/507c67ab-6e16-4269-86e4-af7c3d235354](https://web.microsoftstream.com/video/507c67ab-6e16-4269-86e4-af7c3d235354)

Dr Momchil Terziev

[momchil.terziev@strath.ac.uk](mailto:momchil.terziev@strath.ac.uk)

Postdoctoral researcher at the Faculty of Engineering

**Last update**: 16/01/22

**Contents**

[1. Exporting geometries from Maxsurf 2](#_Toc88664729)

[2. Working with .dxf files in ShipX.. 3](#_Toc88664730)

[2.1 Monohulls. 3](#_Toc88664731)

[2.2 Catamarans. 8](#_Toc88664732)

[2.3 Non-positive coefficients, lengths, and volumes. 12](#_Toc88664733)

[3. Importing from Rhino and AutoCAD.. 14](#_Toc88664734)

  

## 1. Exporting geometries from Maxsurf

Create new sections from the Data menu – the number and distribution should be enough to describe your geometry accurately, but not too many to overload ShipX. I would avoid using more than 100.

Using the display settings, remove as much of the geometry, axes, annotations, etc. Your goal is to have solely the sections visible. Anything that cannot be removed at this stage will have to be deleted manually in ShipX.

![](https://momchil-terziev.github.io/files/clip_image002.jpg)

Click on the isometric view window and export your geometry as a .dxf (AutoCAD file) in 3D without scaling (1:1). You can import this directly into ShipX.

 ![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image004.jpg)

## 2. Working with .dxf files in ShipX

### 2.1 Monohulls

In ShipX, set your loading condition (draught is critical) and visualise your lines plan by clicking on the Hull sections menu. Set your radii of gyration and run a Data Check – this will tell you where the problem is. See for example:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image006.png)

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image008.jpg)

There are two things that go wrong at this stage 99% of the time. The first is the radii of gyration. The data check will fail if the first 3 fields for radii of gyration not filled in. “R64” – the coupled radius of gyration in pitch-roll can be left as 0 usually. If the data check fails because of this, you can put a some number in – it won’t affect the results much regardless.

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image010.jpg)

The second thing that tends to go wrong is with the order of points, making up each section or the presence of  invalid sections. You can get an indication of which problem the data check runs into by:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image012.png)

Then if you scroll up in the log you will see the issue as shown below:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image014.jpg)

In this case, there is a completely submerged section. If you go to Edit Stations you can see that the 94th station is problematic. Remember that ShipX uses a linear frequency-domain theory which requires surface piercing geometries (that is, crossing the waterline). Stations that do not cross the waterline are not admissible and cannot be used to run a calculation. This applies to stations that are fully dry, or fully wet. In this case there are quite a lot of issues with the geometry:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image016.jpg)

The circled point extends beyond the symmetry line and has to be removed. In some cases it might be easier to simply delete the section.

There are also some strange sections above that will cause errors after section 94 is fixed:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image018.jpg)

Notice how the top of the section is connected to the bottom of the section – this is not a valid input because ShipX needs to calculate the underwater area of each section. If this section is left as it is at the moment, the area will be either invalid or negative. To fix this, expand the node of the section as shown in the figure above and scroll down until you find the culprit. This will be either the first or last point. You can also see in this figure that at the stern there are a few sections that are not crossing the waterline. This means that they will give a 0 or infinite area (depending on the numerical algorithm used for integration). I would try to leave as many of them in, but if the data check keeps coming back with errors, then you’ll have to delete them. By removing them, you’d have modified the ship geometry, so it is important to ensure that you length, beam, block coefficient, etc. match what Maxsurf/NAPA tells you. This is what the above section should look like when edited (I removed the last two points). However, there are other sections that will need to be edited in the same way.

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image020.jpg)

Repeat this process and run Data checks regularly. Make sure you save your progress in the above window by clicking on Apply/Ok frequently and always before closing the window.

Another potential problem comes about due to the ordering of points. The points must be arranged so that the point at _z_ = max is also the point with _y_ = max. An example of when this goes wrong is given below:

![Chart
Description automatically generated with medium confidence](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image021.png)

This station satisfies the condition that it must cross the waterline, but the point with the highest _z_ coordinate does not have the highest _y_ coordinate. So ShipX is failing the data check. See the 3rd figure in the following section for a description of how points should be arranged to prevent the failed data check (page 9). To fix this, try creating a plane in Rhino/AutoCAD coincident with the waterline or ~1mm higher than the waterline and delete everything above this plane. Make sure any sinkage and trim effects you want to investigate, including effects of different draughts are modelled separately. 

### 2.2 Catamarans

Firstly, ensure you have told ShipX it is looking at a catamaran:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image023.jpg)

Otherwise, ShipX will refuse to process your hull correctly: ![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image025.png)

Remember the beam of a catamaran in ShipX is ![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image027.png) the beam of a demihull.

Importing catamaran geometries is associated with many of the same problems explained above (R44 etc.). There are additional considerations one must take when dealing with catamarans. The same rule with regards to the ascending order of points making up each station apply. This is illustrated in the manual as shown in the following figure.

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image029.jpg)

**_Key points:_**

· The monohull station begins at the highest _y_ coordinate and terminates at _y_=0.

· The catamaran station begins at the highest _y_ coordinate and terminates at _y=0_, regardless of whether the final points are relevant for the geometry.

· The changes in the waterline due to waves are not accounted for, so even if your geometry is not defined above the waterline, you must _make something up_ to close the geometry. However, The contours must be specified sufficiently high up on the hull (the _z_ coordinate) so that interpolation can be performed with the specified waterline, **sinkage and trim** – **check your loading condition**.

When importing a geometry, you should make sure your catamaran design satisfies the criteria set out above _before_ you import the design. Otherwise, the software will misinterpret the geometry. Examples of this are given below:

**_Correct set up:_**

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image031.jpg)

The slope of the line connecting the station to the centreline is irrelevant because it is

above the waterline. The waterline crosses the highlighted station twice in this case.

**_Incorrect set up:_**

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image033.png) and the related error output:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image035.png)

In the case above:

· The station probably does not cross the waterline.
· The station does not connect to the centreline

Other examples of software misinterpreting the information:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image037.jpg)

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image039.jpg)

In the two examples above, the imported lines were not specified properly.

  

### 2.3 Non-positive coefficients, lengths, and volumes

In some cases, ShipX reports negative values of physical quantities that cannot be negative. For example, the block coefficient, waterplane area coefficient and midsection coefficient are all negative in the example below. The beam of the ship is also zero. This might be caused by a variety of reasons.

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image041.png)

In some cases, the your .dxf file might import points that do not belong to a section. This is illustrated below:

![](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image043.png)  

The highlighted point is a section in on its own. This is inadmissible in ShipX, so you must delete this. Multiple points might be on top of each other, all of which should be removed for the data check to be successful. 

**Also attempt the following:**

Make sure that you click on Apply/Ok in the Loading condition window just in case it resets your input when you close the window.

When you go to the hull sections menu, think there is an option to look at the profile of the ship. It is possible there are lines there that are not reflected in the hull sections menu – if you see anything at all there I think you can just delete everything, and/or replace what you find with a line along the waterline height with a length equal to your ship length.

Look at the 3D view of the ship. It will not display perfectly, but if you don’t see anything at all then there might be an issue with the geometry. If this is the case, it might be that your coordinate system in the software used to create the geometry was off. I typically place the origin at the intersection of the baseline and aft perpendicular.

## 3. Importing from Rhino and AutoCAD

A good example of what the geometry should look like when using a design from Rhino or AutoCAD is given below:

![Graphical user interface, chart
Description automatically generated](file:///C:/Users/mterz/AppData/Local/Temp/msohtmlclip1/01/clip_image045.png)

**_Key points:_**

· The geometry is comprised of lines; there are no surfaces or rogue points.
· No point on the geometry is below _z_ = 0. If this is the case for your design, you must elevate the stations above _z_ = 0.
· The stations are not closed: there is no line connecting the tops of stations from port to starboard.
