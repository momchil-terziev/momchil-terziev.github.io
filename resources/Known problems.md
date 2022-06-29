---
layout: archive
title: "Known problems with ShipX"
author_profile: false
---


**On this page**
* TOC
{:toc}


<script>var pfHeaderImgUrl = '';var pfHeaderTagline = '';var pfdisableClickToDel = 0;var pfHideImages = 0;var pfImageDisplayStyle = 'none';var pfDisablePDF = 0;var pfDisableEmail = 0;var pfDisablePrint = 0;var pfCustomCSS = '';var pfEncodeImages = 1;var pfShowHiddenContent = 0;var pfBtVersion='2';(function(){var js,pf;pf=document.createElement('script');pf.type='text/javascript';pf.src='//cdn.printfriendly.com/printfriendly.js';document.getElementsByTagName('head')[0].appendChild(pf)})();</script><a href="https://www.printfriendly.com" style="color:#6D9F00;text-decoration:none;" class="printfriendly" onclick="window.print();return false;" title="Printer Friendly and PDF"><img style="border:none;-webkit-box-shadow:none;box-shadow:none;" src="//cdn.printfriendly.com/buttons/printfriendly-pdf-email-button-notext.png" alt="Print Friendly and PDF"/></a>


# Issue 1: Plotting short-term statistics against peak period

Short term statistics display data in terms of the peak period shown below:

![Short term statistics: Heave std against Tp](https://momchil-terziev.github.io/files/Pasted image 20220127194638.png)

However, this is only when the significant wave height is kept constant for a varying peak period:
![Spectrum selection panel](https://momchil-terziev.github.io/files/Pasted image 20220127194814.png)

If combinations of significant wave height and peak period are chosen instead, the x-axis becomes Hs, and it is currently not possible to switch to peak period:
![Short term statistics: Heave std vs Hs](https://momchil-terziev.github.io/files/Pasted image 20220127194954.png)

# Issue 2:
- Know of an issue with ShipX? [Email me](mailto:momchil.terziev@strath.ac.uk), and I will add it to this list!
