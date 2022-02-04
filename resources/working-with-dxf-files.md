---
layout: archive
title: "Working with ShipX: working with .dxf files"
---

**On this page:**
* TOC
{:toc}


---

# Monohulls
## Data check: find potential issues
In ShipX, set your loading condition (draught is critical) and visualise your lines plan by clicking on the Hull sections menu. Set your radii of gyration and run a Data Check – this will tell you where the problem is. See for example:

![](https://momchil-terziev.github.io/files/clip_image006.png)

![](https://momchil-terziev.github.io/files/clip_image008.jpg)

### Common problems and how to fix them

#### Radii of gyration errors

There are two things that go wrong at this stage 99% of the time. The first is the radii of gyration. The data check will fail if the first 3 fields for radii of gyration not filled in. “R64” – the coupled radius of gyration in pitch-roll can be left as 0 usually. If the data check fails because of this, you can put a some number in – it won’t affect the results much regardless.

![](https://momchil-terziev.github.io/files/clip_image010.jpg)

#### Geometry definition errors

The second thing that tends to go wrong is with the order of points, making up each section or the presence of  invalid sections. Sections must look as shown in this image: ![](https://momchil-terziev.github.io/files/clip_image029.jpg)

You can get an indication of which problem the data check runs into by:

![](https://momchil-terziev.github.io/files/clip_image012.png)

Then if you scroll up in the log you will see the issue as shown below:

![](https://momchil-terziev.github.io/files/clip_image014.jpg)

In this case, there is a completely submerged section. If you go to Edit Stations you can see that the 94th station is problematic. Remember that ShipX uses a linear frequency-domain theory which requires surface piercing geometries (that is, crossing the waterline). Stations that do not cross the waterline are not admissible and cannot be used to run a calculation. This applies to stations that are fully dry, or fully wet. In this case there are quite a lot of issues with the geometry:

![](https://momchil-terziev.github.io/files/clip_image016.jpg)

The circled point extends beyond the symmetry line and has to be removed. In some cases it might be easier to simply delete the section.

There are also some strange sections above that will cause errors after section 94 is fixed:

![](https://momchil-terziev.github.io/files/clip_image018.jpg)

Notice how the top of the section is connected to the bottom of the section – this is not a valid input because ShipX needs to calculate the underwater area of each section. If this section is left as it is at the moment, the area will be either invalid or negative. To fix this, expand the node of the section as shown in the figure above and scroll down until you find the culprit. This will be either the first or last point. You can also see in this figure that at the stern there are a few sections that are not crossing the waterline. This means that they will give a 0 or infinite area (depending on the numerical algorithm used for integration). I would try to leave as many of them in, but if the data check keeps coming back with errors, then you’ll have to delete them. By removing them, you’d have modified the ship geometry, so it is important to ensure that you length, beam, block coefficient, etc. match what Maxsurf/NAPA tells you. This is what the above section should look like when edited (I removed the last two points). However, there are other sections that will need to be edited in the same way.

![](https://momchil-terziev.github.io/files/clip_image020.jpg)

Repeat this process and run Data checks regularly. Make sure you save your progress in the above window by clicking on Apply/Ok frequently and always before closing the window.

Another potential problem comes about due to the ordering of points. The points must be arranged so that the point at _z_ = max is also the point with _y_ = max. An example of when this goes wrong is given below:

![](https://momchil-terziev.github.io/files/clip_image021.png)

This station satisfies the condition that it must cross the waterline, but the point with the highest _z_ coordinate does not have the highest _y_ coordinate. So ShipX is failing the data check. See the 3rd figure in the following section for a description of how points should be arranged to prevent the failed data check (page 9). To fix this, try creating a plane in Rhino/AutoCAD coincident with the waterline or ~1mm higher than the waterline and delete everything above this plane. Make sure any sinkage and trim effects you want to investigate, including effects of different draughts are modelled separately. 
#### Other errors

ShipX may refuse to accept a section that has too few points below the waterline. For example: 
![](https://momchil-terziev.github.io/files/im1.png)
And the related error output:
![](https://momchil-terziev.github.io/files/im2.png)

The solution in this case is to delete the highlighted section above. However, this reduces to overall length of the hull. To rectify this, the length of the hull must be manually adjusted by changing the loading condition.

# Catamarans

Firstly, ensure you have told ShipX it is looking at a catamaran:

![](https://momchil-terziev.github.io/files/clip_image023.jpg)

Otherwise, ShipX will refuse to process your hull correctly: 
            ![](https://momchil-terziev.github.io/files/clip_image025.png)

Remember the beam of a catamaran in ShipX is ![](https://momchil-terziev.github.io/files/clip_image027.png) the beam of a demihull.

Importing catamaran geometries is associated with many of the same problems explained above (R44 etc.). There are additional considerations one must take when dealing with catamarans. The same rule with regards to the ascending order of points making up each station apply. This is illustrated in the manual as shown in the following figure.

![](https://momchil-terziev.github.io/files/clip_image029.jpg)

**_Key points:_**

· The monohull station begins at the highest _y_ coordinate and terminates at _y_=0.

· The catamaran station begins at the highest _y_ coordinate and terminates at _y=0_, regardless of whether the final points are relevant for the geometry.

· The changes in the waterline due to waves are not accounted for, so even if your geometry is not defined above the waterline, you must _make something up_ to close the geometry. However, The contours must be specified sufficiently high up on the hull (the _z_ coordinate) so that interpolation can be performed with the specified waterline, **sinkage and trim** – **check your loading condition**.

When importing a geometry, you should make sure your catamaran design satisfies the criteria set out above _before_ you import the design. Otherwise, the software will misinterpret the geometry. Examples of this are given below:

**_Correct set up:_**

![](https://momchil-terziev.github.io/files/clip_image031.jpg)

The slope of the line connecting the station to the centreline is irrelevant because it is

above the waterline. The waterline crosses the highlighted station twice in this case.

**_Incorrect set up:_**

![](https://momchil-terziev.github.io/files/clip_image033.png) and the related error output:

![](https://momchil-terziev.github.io/files/clip_image035.png)

In the case above:

· The station probably does not cross the waterline.
· The station does not connect to the centreline

Other examples of software misinterpreting the information:

![](https://momchil-terziev.github.io/files/clip_image037.jpg)

![](https://momchil-terziev.github.io/files/clip_image039.jpg)

In the two examples above, the imported lines were not specified properly.
