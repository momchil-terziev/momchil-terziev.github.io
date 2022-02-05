---
layout: archive
title: "Discretisation uncertainty estimator"
---
**On this page**
* TOC
{:toc}


# Introduction
---
This webpage contains documentation and set up instructions for a MATLAB app used to estimate discretisation uncertainty. The app is built to include the most common techniques  for numerical uncertainty. If an experimental datapoint is provided and its uncertainty are provided, the app will run a validation check. The following table summarises the methods included.

| Method | Included? | 
| ------ | -------- |
| Grid Convergence Index |  Yes |
| Correction factor method | No|
| Factors of Safety for Richardson Extrapolation | No |
| Gradient method | No |

# Download and installation
---
The app can be downloaded [here](). To install the app, you must have a MATLAB license. The app is installed by opening it through the Install app button in the App ribbon of MATLAB.
# Background
---
## Richardson extrapolation
---
All uncertainty estimators are based on Richardson extrapolation. This begins by defining changes between the medium-fine and coarse-medium solutions:
$$e_{21}=S_2-S_1$$
$$e_{32}=S_3-S_2$$

Using $$e_{21}$$ and $$e_{32}$$, we the convergence ratio ($$R$$) can be predicted:

$$R=e_{21}/e_{32}$$

There are three possibilities depending on the value of $$ R $$:
- Monotonic convergence : $$ 0<R<1 $$
- Oscillatory convergence : $$ -1<R<0 $$
- Divergence : $$ |R|>1 $$ 

Although CFD codes have a theoretical order of accuracy $$p_t=2$$, we frequently find the observed order of accuracy deviates from $$p_t$$ considerably. The observed order of accuracy is estimated by: 

$$p=ln(|e_{32}/e_{21}|)/ln(r)$$

where $$r$$ is the refinement ratio. By default, the refinement ratio is set as $$r=\surd2$$. With this information, it is possible to predict the error:

$$\delta=e_{21}/(r^p-1)$$

These results are calculated and displayed in the Richardson Extrapolation panel. 

## Uncertainty
---
The error computed as part of Richardson extrapolation provides an 50% uncertainty estimate, which is insufficient. The vast majority of methods make use of $$\delta$$ to produce an improved estimate, the aim of which is to provide a 95% coverage. 
### Grid Convergence Index
---
The best known and most widely used approach is the Grid Convergence Index (GCI) method, introduced by Roache. The basic approach, upon which other methods are built involves multiplying the error computed through Richardson extrapolation by a factor, known as the Factor of Safety (FS), which equals 1.25 when a grid triplet is used. The uncertainty is then:
$$U=FS|\delta|$$
### ~~Correction factor method~~
---
### ~~Factors of Safety for Richardson Extrapolation method~~ 
---
## Validation
---
Validation requires an numerical uncertainty estimate, an experimental result, and the experimental uncertainty. The first step is to compute the validation uncertainty:

$$U_V=(U_{grid}^2+U_{time}^2+U_{EFD}^2)^{1/2}$$

The equation above is only used when both time and grid data are provided, that is, a URANS solution has been assessed for uncertainty separately in time and space. If the assessment has been conducted simultaneously for time and space, that is, by maintaining a constant Courant number, then only grid data should be entered. In this case, as well as in steady-state solutions (RANS), 

$$U_V=(U_{c}^2+U_{EFD}^2)^{1/2}$$ where $$U_{c}$$ is the uncertainty computed wither in combination of time (URANS) and space or in space only (RANS).

The final step is to check if the error, 

$$E=100\times(S_1-R_{EFD})/R_{EFD}$$

is smaller than the validation uncertainty, where $$R_{EFD}$$ is the experimental result. If $$R_{EFD}<U_V$$ , the solution is validated; otherwise, it is not.

The validation exercise is conducted with the uncertainty estimate provided by each methodology.
