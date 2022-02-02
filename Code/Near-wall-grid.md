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
* ITTC line: $$C_f=0.075/(log_10(Re)-2)^{-2}$$
* Prandtl's line: $$C_f=0.074Re^{-1/5}$$

Once the line to calculate $$C_F$$ is chosen, the shear stress is predicted as $$\tau_w=C_f\rho U^2/2$$. Then, the first layer thickness is predicted using the desired $$y^+$$ through $$dy=y^+\ni/sqrt(t_w/rho)$$, where $$\ni$$ is the kinematic viscosity. We then find $$n$$ layers

After $$dy$$ is known, we find how many layers we can fit in the fraction of the boundary layer $$\delta=

## Download and install
