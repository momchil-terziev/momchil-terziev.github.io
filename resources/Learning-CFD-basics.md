---
layout: archive
title: "Learning CFD basics"
---

**On this page**
* TOC
{:toc}

If you are embarking on a CFD project and have little experience I would highly recommend the resources on this page. Alternatively, if you have some CFD experience, but need a refresher, then this page will also be useful. 

# Introduction to CFD

The content of this page is based on the Coursera module [Sports and Building Aerodynamics](https://www.coursera.org/learn/sports-building-aerodynamics) , and supplemented using resources found on this webpage. 
To get started, watch the first video of week 3 of the module on the Coursera webpage: 
- [What, why and how?](https://www.coursera.org/lecture/sports-building-aerodynamics/3-1-what-why-and-how-ibIXR)

# Turbulence 
Turbulence is fundamental in the study of external flow. There are a number of ways to re-create turbulence in CFD ranging from highly accurate and expensive to low fidelity relatively cheap approaches. 

- [Approximate forms of the Navier-Stokes equations](https://www.coursera.org/lecture/sports-building-aerodynamics/3-2-approximate-forms-of-the-navier-stokes-equations-kZOGb)

Supplement the above video with an introduction of some widely used eddy-viscosity turbulence models used for ship hydrodynamics:

- Eddy-viscosity paper.
- Examples of Detached Eddy Simulation for ship CFD.

## Boussinesq hypothesis

The Boussinesq hypothesis is a fundamental idea in turbulence models. The following video explains in detail Boussinesq hypothesis:

- [Turbulence modelling](https://www.coursera.org/lecture/sports-building-aerodynamics/3-3-turbulence-modeling-9awyB)

Note that the gradient diffusion assumption is only relevant where energy and temperature is modelled.

# Discretisation errors

Discretisation errors are one of the main sources or error in any CFD simulation. The following video explains the basics of estimating discretisation error estimation using Richardson extrapolation: 

- [Some aspects of discretization](https://www.coursera.org/lecture/sports-building-aerodynamics/3-4-some-aspects-of-discretization-nQ7Q9)


## Validation and verification

The following video gives a good overview of validation and verification practices. 

- [Errors and uncertainty, verification and validation](https://www.coursera.org/lecture/sports-building-aerodynamics/3-6-errors-and-uncertainty-verification-and-validation-Qf1lu)


Supplement this video with the following paper on uncertainty estimation for ship CFD:

- A posteriori paper

You can also play around with some values using the [Discretisation uncertainty app]() and use it predict the discretisation uncertainty of your simulation, whose documentation can be found [here]().

# Near wall flow

Near wall modelling is of critical importance to predict the flow around any structure. The following video explains the differences, advantages and disadvantages of different modelling principles:

- [Near-wall modelling](https://www.coursera.org/lecture/sports-building-aerodynamics/3-5-near-wall-modeling-mhtyh)

Supplement this video with the near wall modelling section of [this paper]. Your chosen methodology can be applied by using the [Near wall grid set up app]. That is to say, you do not need to work through the iterative process mentioned in the video above.






























