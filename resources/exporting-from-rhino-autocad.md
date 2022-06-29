---
layout: archive
title: "Working with ShipX: exporting from Rhino or AutoCAD"
author_profile: false
---
---


<script>var pfHeaderImgUrl = '';var pfHeaderTagline = '';var pfdisableClickToDel = 0;var pfHideImages = 0;var pfImageDisplayStyle = 'none';var pfDisablePDF = 0;var pfDisableEmail = 0;var pfDisablePrint = 0;var pfCustomCSS = '';var pfEncodeImages = 1;var pfShowHiddenContent = 0;var pfBtVersion='2';(function(){var js,pf;pf=document.createElement('script');pf.type='text/javascript';pf.src='//cdn.printfriendly.com/printfriendly.js';document.getElementsByTagName('head')[0].appendChild(pf)})();</script><a href="https://www.printfriendly.com" style="color:#6D9F00;text-decoration:none;" class="printfriendly" onclick="window.print();return false;" title="Printer Friendly and PDF"><img style="border:none;-webkit-box-shadow:none;box-shadow:none;" src="//cdn.printfriendly.com/buttons/printfriendly-pdf-email-button-notext.png" alt="Print Friendly and PDF"/></a>


A good example of what the geometry should look like when using a design from Rhino or AutoCAD is given below:

![](https://momchil-terziev.github.io/files/clip_image045.png)

**_Key points:_**

· The geometry is comprised of lines; there are no surfaces or rogue points.
· No point on the geometry is below _z_ = 0. If this is the case for your design, you must elevate the stations above _z_ = 0.
· The stations are not closed: there is no line connecting the tops of stations from port to starboard.
