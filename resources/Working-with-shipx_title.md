            

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

[1. Exporting geometries from Maxsurf 2](https://momchil-terziev.github.io/resources/exporting-geometries-from-maxsurf)

[2. Working with .dxf files in ShipX.. 3](#_Toc88664730)

[2.1 Monohulls. 3](#_Toc88664731)

[2.2 Catamarans. 8](#_Toc88664732)

[2.3 Non-positive coefficients, lengths, and volumes. 12](#_Toc88664733)

[3. Importing from Rhino and AutoCAD.. 14](#_Toc88664734)

  


## 3. Importing from Rhino and AutoCAD

A good example of what the geometry should look like when using a design from Rhino or AutoCAD is given below:

![](https://momchil-terziev.github.io/files/clip_image045.png)

**_Key points:_**

· The geometry is comprised of lines; there are no surfaces or rogue points.
· No point on the geometry is below _z_ = 0. If this is the case for your design, you must elevate the stations above _z_ = 0.
· The stations are not closed: there is no line connecting the tops of stations from port to starboard.
