---
layout: archive
title: "Working with ShipX: Passing a data check"
author_profile: false
---

**On this page:**
* TOC
{:toc}


<div class="text-right">
<input type="button" value="Print this page" onClick="window.print()">
</div>


---


## Data check: find potential issues
In ShipX, set your loading condition (draught is critical) and visualise your lines plan by clicking on the Hull sections menu. Set your radii of gyration and run a Data Check – this will tell you where the problem is. See for example:

![](https://momchil-terziev.github.io/files/clip_image006.png)

![](https://momchil-terziev.github.io/files/clip_image008.jpg)

### Common problems and how to fix them

#### Radii of gyration errors

There are two things that go wrong at this stage 99% of the time. The first is the radii of gyration. The data check will fail if the first 3 fields for radii of gyration not filled in. “R64” – the coupled radius of gyration in pitch-roll can be left as 0 usually. If the data check fails because of this, you can put a some number in – it won’t affect the results much regardless.

![](https://momchil-terziev.github.io/files/clip_image010.jpg)

#### Geometry definition errors

The second thing that tends to go wrong is with the order of points, making up each section or the presence of invalid sections. Sections must look as shown in this image: ![](https://momchil-terziev.github.io/files/clip_image029.jpg)

You can get an indication of which problem the data check runs into by:

![](https://momchil-terziev.github.io/files/clip_image012.png)

Then if you scroll up in the log you will see the issue as shown below:

![](https://momchil-terziev.github.io/files/clip_image014.jpg)

See the guides on [monohull vessels](https://momchil-terziev.github.io/resources/Monohulls) and [multihull vessels](https://momchil-terziev.github.io/resources/Multihulls) for type-specific problems and solutions.
