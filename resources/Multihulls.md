---
layout: archive
title: "Working with ShipX: Multihulls"
author_profile: false
---

**On this page:**
* TOC
{:toc}

<div class="text-right">
<input type="button" value="Print this page" onClick="window.print()">
</div>


# Catamarans

Firstly, ensure you have told ShipX it is looking at a catamaran:

![](https://momchil-terziev.github.io/files/clip_image023.jpg)

Otherwise, ShipX will refuse to process your hull correctly: 
            ![](https://momchil-terziev.github.io/files/clip_image025.png)

Remember the beam of a catamaran in ShipX is $$\times 2$$ the beam of a demihull.

Importing catamaran geometries is associated with many of the same problems explained [here](https://momchil-terziev.github.io/resources/working-with-dxf-files/) (R44 etc.). There are additional considerations one must take when dealing with catamarans. The same rule with regards to the ascending order of points making up each station apply. This is illustrated in the manual as shown in the following figure.

![](https://momchil-terziev.github.io/files/Multihull1.png)

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


# SWATH vessels

SWATH vessels require the same input as catamarans. Here are some examples of an correct and incorrect setup.

**_Incorrect set up 1:_**

![](https://momchil-terziev.github.io/files/SWATH2.png) 

Error output:

![](https://momchil-terziev.github.io/files/SWATH1.png) 

Solution: 

Delete the point section 

**_Incorrect set up 2:_**

As designed in Rhino:

![](https://momchil-terziev.github.io/files/SWATH6.png) 

Representation in ShipX:

![](https://momchil-terziev.github.io/files/SWATH3.png) 

Solution:

![](https://momchil-terziev.github.io/files/SWATH4.png) 


**_Correct set up:_**

Implementation in Rhino:

![](https://momchil-terziev.github.io/files/SWATH5.png) 



