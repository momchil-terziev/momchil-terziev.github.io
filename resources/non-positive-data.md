---
layout: archive
title: "Working with ShipX:fixing non-positive data"
---
---

In some cases, ShipX reports negative values of physical quantities that cannot be negative. For example, the block coefficient, waterplane area coefficient and midsection coefficient are all negative in the example below. The beam of the ship is also zero. This might be caused by a variety of reasons.

![](https://momchil-terziev.github.io/files/clip_image041.png)

In some cases, the your .dxf file might import points that do not belong to a section. This is illustrated below:

![](https://momchil-terziev.github.io/files/clip_image043.png)  

The highlighted point is a section in on its own. This is inadmissible in ShipX, so you must delete this. Multiple points might be on top of each other, all of which should be removed for the data check to be successful. 

**Also attempt the following:**

Make sure that you click on Apply/Ok in the Loading condition window just in case it resets your input when you close the window.

When you go to the hull sections menu, think there is an option to look at the profile of the ship. It is possible there are lines there that are not reflected in the hull sections menu – if you see anything at all there I think you can just delete everything, and/or replace what you find with a line along the waterline height with a length equal to your ship length.

Look at the 3D view of the ship. It will not display perfectly, but if you don’t see anything at all then there might be an issue with the geometry. If this is the case, it might be that your coordinate system in the software used to create the geometry was off. I typically place the origin at the intersection of the baseline and aft perpendicular.
