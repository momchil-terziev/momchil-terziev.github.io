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

Once the line to calculate $$C_F$$ is chosen, the shear stress is predicted as $$\tau_w=C_f*\rho U^2/2$$

## Download and install
