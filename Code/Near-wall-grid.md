---
layout: archive
title: "Near-wall grid set-up for CFD"
---
---
A MATLAB app to calculat ethe near-wall grid distribution and thickness to achieve a desired y<sup>+</sup> value.

**On this page:**
* TOC
{:toc}

## Method
The app uses the method for setting a grid described in my [full-scale review paper](/publication/review-paper-scale-effects). The approach uses the fact that the frictional resistance coefficient ($$C_f$$) may be expressed by using the Reynolds number ($$Re$$). Here we do not make a distinction between the local frictional resistance coefficient $$C_f$$ and the integral frictional resistance coefficient $$C_F$$.

### Frictional resistance coefficient estimation methods
The following methods can be used at present:
| Line | Equation |
| ---- | -------- |
| ITTC | $$C_f=0.075/(log_{10}(Re)-2)^{2}$$ |
| Prandtl | $$C_f=0.074Re^{-1/5}$$ |
| Telfer | $$C_f=0.34Re^{-1/3}+0.0012$$ |
| Landweber | $$C_f=0.0816/(log_{10}(Re)-1.703)^2$$ |
| Hughes | $$C_f=0.067/(log_{10}(Re)-1.703)^2$$ |
| Gadd | $$C_f=0.0113/(log_{10}(Re)-3.7)^{1.15}$$ |
| Granville | $$C_f=0.0776/(log10(Re)-1.88)^2+60/Re |


Once the line to calculate $$C_F$$ is chosen, the shear stress is predicted as $$\tau_w=C_f\rho U^2/2$$. Then, the first layer thickness is predicted using the desired $$y^+$$ through $$dy=y^+\ni/sqrt(t_w/rho)$$, where $$\ni$$ is the kinematic viscosity. We then find $$n$$ layers

After $$dy$$ is known, we find how many layers we can fit in the fraction of the boundary layer $$\delta=

## Download and install
