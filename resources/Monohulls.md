---
layout: archive
title: "Working with ShipX: monohulls"
author_profile: false
---

**On this page:**
* TOC
{:toc}

<script>var pfHeaderImgUrl = '';var pfHeaderTagline = '';var pfdisableClickToDel = 0;var pfHideImages = 0;var pfImageDisplayStyle = 'none';var pfDisablePDF = 0;var pfDisableEmail = 0;var pfDisablePrint = 0;var pfCustomCSS = '';var pfEncodeImages = 1;var pfShowHiddenContent = 0;var pfBtVersion='2';(function(){var js,pf;pf=document.createElement('script');pf.type='text/javascript';pf.src='//cdn.printfriendly.com/printfriendly.js';document.getElementsByTagName('head')[0].appendChild(pf)})();</script><a href="https://www.printfriendly.com" style="color:#6D9F00;text-decoration:none;" class="printfriendly" onclick="window.print();return false;" title="Printer Friendly and PDF"><img style="border:none;-webkit-box-shadow:none;box-shadow:none;" src="//cdn.printfriendly.com/buttons/printfriendly-pdf-email-button-notext.png" alt="Print Friendly and PDF"/></a>


# Monohulls

## General


#### Geometry definition errors

One of the most frequent types of error is the order of points making up each section or the presence of invalid sections. Sections must look as shown in this image: 

![](https://momchil-terziev.github.io/files/monohull1.png)

**_Key points:_**
1. The station crosses the waterline. Stations that are completely above or below the waterline are inadmisible.
2. The station is defined so that the z and y coordinates descend in value. Any other arrangement is inadmisible.

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
