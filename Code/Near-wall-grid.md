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
| Granville |  $$C_f=0.0776/(log10(Re)-1.88)^2+60/Re$$  |

### Calculation
Once the line to calculate $$C_f$$ is chosen, the shear stress is predicted as: 

$$\tau_w=C_f\rho U^2/2$$

Then, the first layer thickness is calculated using the desired $$y^+$$ through: 

$$dy=y^+\nu/\surd(t_w/\rho)$$

where $$\nu$$ is the kinematic viscosity. We must now distribute layers over a user-specified distance. We do this through the boundary layer thickness 

$$\delta_x=x0.382L/Re^{1/5}$$

where $$L$$ is the ship length, and $$x%$$ is the % of the boundary layer we wish to distribute layers over. 

There is no point on distrubuting layers of constant thickness equal to $$dy$$ over the distance $$\delta_x$$ because this would result in using unnecessarily many layers. Instead, it is possible (within Star-CCM+) to express the layer distribution as a geometric progression, whose common ratio is $$S$$, a user-defined value between $$1$$ and $$\infty$$, and whose sum is the thickness over which we wish to distribute cells. The number of cells we need is then 

$$n=log[\delta(S-1)/(2dy)]/log(S)$$

Note that we use $$2dy$$ instead of $$dy$$ because the cell centre must be located at a distance of $$dy$$ from the wall.

The only drawback is that we need an integer number of layers and rounding up may cause some small disagreement between the target $$y^+$$ and the desired $$y^+$$. In general, this discrepency can be expected to be in the region of up to 20% for low $$y^+$$ meshes and about 5 $$y^+$$ units for high $$y^+$$ meshes.

## User interface
The app appears as follows when installed
![UI](https://momchil-terziev.github.io/files/wallapp.png)
 
- The Help button opens this page
- ✅ if the tickbox is ticked, the Run analysis button displays the results from all methods to predict $$C_f$$ in the command window 

Properties of water to input into the app: 

| Property | Fresh water | Salt water | Units |
| -------- |-------------| ---------- | ----- |
| Density  | 997.561 | 1025 |   $$kg/m^3$$   |
| Dynamic viscosity | 8.8871E-4  |  |   $$Pa-s$$   |

## Download and install
The app may be downloaded [here](https://momchil-terziev.github.io/Code/CFDyplusapp.mlappinstall), and installed by navigating to the Apps ribbon.

## Example application
#### KCS hull in deep water

Take as an example the KCS hull:

| Property | Symbol | Value | Units |
| -------- | ------ | ----- | ----- |
| Scale factor | $$\lamda$$ | 31.599 | - |
| Length | $$L$$ | 7.2787 | m |
| Froude number | $$F_n$$ |0.26 | - |
| Number of layers | $$n$$ | 3 | - |
| Prism layer thickness | $$\delta$$ | 0.0636 | m |
| Stretch factor | $$S$$ | 1.3 | - |
| Desired $$y^+$$ | $$y^+_d$$ |  50 | - |
| Achieved $$y^+$$ | $$y^+_a$$ | ~54 | - |

![](/files/img_ref.png)

Output from all friction lines
```
Friction line       Cf        Shear stress    First layer thickness    Number of layers
    _____________    _________    ____________    _____________________    ________________

    {'ITTC'     }    0.0027171       6.5355            0.00055033                 3        
    {'Prandtl'  }    0.0026209       6.3042            0.00056033                 3        
    {'Telfer'   }    0.0024987       6.0103            0.00057387                 2        
    {'Landweber'}    0.0026483       6.3701            0.00055743                 3        
    {'Hughes'   }    0.0024273       5.8384            0.00058226                 2        
    {'Gadd'     }    0.0026289       6.3233            0.00055948                 3        
    {'Granville'}    0.0026905       6.4715            0.00055304                 3        
 ```

