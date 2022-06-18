---
layout: archive
title: "Near-wall grid set-up for CFD"
---
---

**On this page:** 
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
| Granville |  $$C_f=0.0776/(log_{10}(Re)-1.88)^2+60/Re$$  |
| Schoenherr | $$0.242/\surd{C_f}=log_{10}(Re{\times}C_f)$$ |

### Calculation
Once the line to calculate $$C_f$$ is chosen, the shear stress is predicted as: 

$$\tau_w=C_f\rho U^2/2$$

Then, the first layer thickness is calculated using the desired $$y^+$$ through: 

$$dy=y^+\nu/\surd(t_w/\rho)$$

where $$\nu$$ is the kinematic viscosity. We must now distribute layers over a user-specified distance . We do this in one of three ways:

1. As a fraction of the boundary layer thickness $$\delta_x=x0.382L/Re^{1/5}$$ where $$L$$ is the ship length, and $$x%$$ is the % of the boundary layer we wish to distribute layers over. 
2. As a fraction of the ship length $$\delta_x=x{\times}L$$, where $$x$$ is a % of the ship length
3. As a total distance $$\delta_x=x$$, where $$x$$ is a distance in m.

There is no point on distrubuting layers of constant thickness equal to $$dy$$ over the entire selected distance because this would result in using unnecessarily many layers. Instead, it is possible (within Star-CCM+) to express the layer distribution as the geometric progression:

$$\delta_x=\underbrace{2dy+S{\times}2dy+S^2{\times}2dy+S^3{\times}2dy+...S^{n-1}{\times}2dy}_\text{n layers}$$

whose common ratio is $$S$$, a user-defined value between $$1$$ and $$\infty$$. The sum of all terms $\sum_{0}^{n} 2dyS^n$ is the thickness over which we wish to distribute cells. The number of cells we need is then 

$$n=log[-\delta(S-1)/(2dy)+1]/log(S)$$

Note that we use $$2dy$$ instead of $$dy$$ because the cell centre must be located at a distance of $$dy$$ from the wall.

The only drawback is that we need an integer number of layers and rounding up may cause some disagreement between the target $$y^+$$ and the desired $$y^+$$. In general, this discrepency can be expected to be in the region of up to 20% for low $$y^+$$ meshes and about $$\pm$$10% for high $$y^+$$ meshes.

## User interface
The app appears as follows when installed
![UI](https://momchil-terziev.github.io/files/screengrab.png)
 
- The Help button opens this page
- ✅ if the tickbox is ticked, the Run analysis button displays the results from all methods to predict $$C_f$$ in the command window.
- The 'Fill properties' button enters the fresh/salt water properties at 15 °C.

Properties according to the [ITTC](https://ittc.info/media/4048/75-02-01-03.pdf): 

| Property | Fresh water | Salt water | Air | Units |
| -------- |-------------| ---------- | --- | ----- |
| Density  | 997.561 | 1026.021 | 1.18415 | $$kg/m^3$$   |
| Dynamic viscosity | 0.00088871  | 0.00122 | 1.85508E-5 | $$Pa-s$$   |

### Changing the water temperature
The temperature may be set at any value between 0.1 °C and 50 °C at 0.1 °C increments to determine the density and viscosity of the [fresh water](https://momchil-terziev.github.io/files/Fresh water properties.txt) or [salt water](https://momchil-terziev.github.io/files/Salt water properties.txt). The menu can be accessed by right-clicking anywhere in the 'Auto-fill fluid properties' section. Full details can be found on the [ITTC webpage](https://ittc.info/media/4048/75-02-01-03.pdf). 

### Recording outputs
The 'File' menu can be used to trigger continous recording of all data of the command window. The same menu can be used to switch logging off, or using the Exit option under the 'File' menu. Closing the app otherwise will **not** disable logging.

### Visualising layer distribution
The placement of cell centers in and vertices in terms of their y+ allocation may be viewed by right-clicking the Run button. All fields in the inputs sections must be filled prior to triggering this setting. 

## Download and install
The app may be downloaded [here](https://momchil-terziev.github.io/Code/CFD yplus app.mlappinstall), and installed by navigating to the Apps ribbon.

It is possible to choose the desired $$y^+$$ or the number of layers if known in advance. In the latter case, the $$y^+$$ is computed in place of the number of layers. These settings may be changed through the dropdown menus in the Grid properties section. Similarly, when the first layer thickness is specified, the output field displaying the first layer thickness shows the achieved $$y^+$$ instead.

