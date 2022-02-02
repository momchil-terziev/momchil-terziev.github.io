---
layout: archive
title: "Near-wall grid set-up for CFD"
---
---

**On this page:** 

A MATLAB app to calculat ethe near-wall grid distribution and thickness to achieve a desired y<sup>+</sup> value.

**Contents:**

* TOC
{:toc}

## Background
The app uses the method for setting a grid described in my [full-scale review paper](/publication/review-paper-scale-effects). The approach uses the fact that the frictional resistance coefficient ($$C_f$$) may be expressed by using the Reynolds number ($$Re$$). Here we do not make a distinction between the local frictional resistance coefficient $$C_f$$ and the integral frictional resistance coefficient $$C_F$$.

### Frictional resistance coefficient estimation methods
The following methods can be used at present:

| Identifier | Equation |
| ---- | -------- |
| ITTC |  $$C_f=0.075/(log_{10}(Re)-2)^{2}$$  |
| Prandtl |  $$C_f=0.074Re^{-1/5}$$  |
| Telfer |  $$C_f=0.34Re^{-1/3}+0.0012$$  |
| Landweber |  $$C_f=0.0816/(log_{10}(Re)-1.703)^2$$  |
| Hughes |  $$C_f=0.067/(log_{10}(Re)-1.703)^2$$  |
| Gadd |  $$C_f=0.0113/(log_{10}(Re)-3.7)^{1.15}$$  |
| Granville |  $$C_f=0.0776/(log10(Re)-1.88)^2+60/Re$$  |

### Calculation
Once the line to calculate $$C_f$$ is chosen, the shear stress is predicted as $$\tau_w=C_f\rho U^2/2$$. Then, the first layer thickness is calculated using the desired $$y^+$$ through $$dy=y^+\nu/\surd(t_w/rho)$$, where $$\nu$$ is the kinematic viscosity. We must now distribute layers over a user-specified distance. We do this through the boundary layer thickness $$\delta_x=x0.382L/Re^{1/5}$$, where $$L$$ is the ship length, and $$x%$$ is the % of the boundary layer we wish to distribute layers over. 

There is no point on distrubuting layers of constant thickness equal to $$dy$$ over the distance $$delta_x$$ because this would result in using unnecessarily many layers. Instead, it is possible (within Star-CCM+) to express the layer distribution as a geometric progression, whose common ratio is $$S$$, a user-defined value between $$1$$ and $$\infty$$, and whose sum is the thickness over which we wish to distribute cells. The number of cells we need is then $$n=log[\delta*(S-1)/(2dy)]/log(S)$$. Note that we use $$2dy$$ instead of $$dy$$ because the cell centre must be located at a distance of $$dy$$ from the wall.

The only drawback is that we need an integer number of layers and rounding up may cause some small disagreement between the target $$y^+$$ and the desired $$y^+$$. In general, this discrepency can be expected to be in the region of up to 20% for low $$y^+$$ meshes and about 5 $$y^+$$ units for high $$y^+$$ meshes.

## User interface
The app appears as follows when installed
![UI](https://momchil-terziev.github.io/files/wallapp.png)
 
* The Help button opens this page
* The tickbox displays the results from all methods to predict $$C_f$$ in the command window 

Properties of water to input into the app: 

| Property | Fresh water | Salt water | Units |
| -------- |-------------| ---------- | ----- |
| Density  | 997.561 | 1025 | $$kg/m^3$$ |
| Dynamic viscosity | 8.8871E-4  |  | $$Pa-s$$ |

## Download and install
The app may be downloaded [here](https://momchil-terziev.github.io/Code/CFDyplusapp.mlappinstall), and installed by navigating to the Apps ribbon.
