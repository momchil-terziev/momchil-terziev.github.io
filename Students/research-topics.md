---
layout: archive
title: "Research topics"
permalink: /research-topics
---

**On this page:** 

A collection of research topics for 4th or 5th year students with interests in Computational Fluid Dynamics. If you have any questions or would like to discuss any of these topics further, please [email me](mailto:momchil.terziev@strath.ac.uk).

**Contents:**

* TOC
{:toc}


------

### 1. The fully non-linear viscous resistance of an accelerating ship in deep/shallow waters

Several potential flow methods [^1] [^2] [^3] have been devised to predict the resistance of a vessel when accelerating. However, these methods ignore the action of viscosity, meaning that acceleration effects on the viscous pressure resistance and friction resistance are not accounted for. Moreover, boundary layer interactions with the wave system cannot be modelled using potential flow approaches. Within this project, an approach will be used to accurately model the flow around an accelerating ship in deep and/or shallow waters.

### 2. ~~The effect of flow stratification on ship performance~~ [_taken up_]

When ships operate in certain areas, the sea or ocean may stratify into distinct layers of fresh and salt water. This is sometimes described as the [dead water](https://en.wikipedia.org/wiki/Dead_water) phenomenon [^4] [^5]  and is most frequently observed as a result of glacial melting. When a ship passes through such an area, waves are created not only at the air-water interface, but also at the fresh-salt water interface, modifying ship resistance and wavemaking. This area has been examined in depth by a large number of studies using potential or approximate theories, but very few studies use CFD. Therefore, the effects of a second interface (air/water and fresh water/salt water) is yet unknown. Within this project, the location of the interface will be varied along with the ship speed to predict its effect on wavemaking, resistance, and turbulent wake.

### 3. _A posteriori_ discretisation uncertainty estimation in CFD

When we model flow using CFD, the continuous governing equations (Navier-Stokes) are discretised in space (and sometimes in time). This creates errors in our solutions when compared to the exact (analytical) solution of the governing equations that can be difficult to quantify. The order of discretisation of the CFD solver is predicted to govern how this error is reduced according to the [Lax equivalence theorem](https://en.wikipedia.org/wiki/Lax_equivalence_theorem) . This is known as the order of accuracy[^6]. If the order of accuracy is 2 (as is usually the case), halving the mesh size must reduce the error by a factor of 4, if we reduce the grid size by a factor of 3, the error should reduce by a factor of 9, etc. However, it is frequently observed in practical applications that the so-called *observed* order of accuracy (i.e. what the simulation tells us) is far from the theoretical value. Recently, approaches have emerged that do not use the order of accuracy. Some methods impose a penalty for deviations from the formal order of accuracy, while others are able to predict the relative impact of deviating from the theoretical value. Within this project, simple steady-state (i.e. non-time dependent) simulations in Star-CCM+ of a flat plate and a ship will be used as benchmarks. Local ($C_f$) and global data ($C_F$ or $C_T$) from these simulations will be fed into new approaches to study the effect of a variable and fixed order of accuracy on the uncertainty estimate. *Some rudimentary programming background is desirable for this project in MATLAB ideally. This will be necessary in processing and visualising the data.*

### 4. Viscous scale effects on a propeller operating in open water

Scale effects arise due to inconsistencies in the Reynolds numbers of model and full-scale structures. Propellers rely heavily on  accurate modelling to predict performance, but operating entirely within a ship's boundary layer, where viscous effects dominate, mean they suffer scale effects. Modelling propeller performance at full-scale is not always feasible due to the large cell and time-step requirements, frequently limiting numerical models to model-scale. The induced scale effects as a result of this induce very large uncertainties in the operational profile and performance of energy saving devices such as propeller shrouds. It is therefore desirable to devise a method to investigate full-scale performance accurately without the need for excessive computational power. Within this project, a propeller will not be scaled using traditional linear scaling (i.e. magnifying its dimension, although this can be done if time allows). Rather, the Reynolds number will be varied by changing the viscosity of water. This 'viscous scaling' approach has been demonstrated in deep [^7] [^8] and shallow water[^9] ship performance, but its applicability is unknown for propellers. 

### 5. Towards accurate virtual Prohaska tests

When predicting the resistance of a full-scale ship, one must have an estimate of the so-called form factor [^10] (1+k). The form factor is used to determine the full-scale resistance of a ship in conjunction with the wave resistance coefficient and frictional resistance coefficient. The latter two are determined at model-scale. Recent studies[^11] have shown that experimentally determined form factors by towing a ship at very low speeds (the Prohaska test) can suffer considerable uncertainty. Unfortunately, similar problems plague CFD predictions of the form factor at low speeds. While the sources of uncertainty in experiment (instrument resolution) and CFD are different, the net result is the same - inaccuracy in resistance extrapolation. Within this project, the hypothesis that turbulent-laminar boundary layer transition is the governing factor in numerical form factor prediction at low speeds will be tested. This is likely to be the case because turbulent CFD simulations assume the fluid is turbulent *everywhere*, whereas in reality, a significant proportion of the hull will be covered by a laminar boundary layer.

### 6. Application of hybrid scale resolved turbulence to ship aerodynamics

A recently developed approach allows the hybrid modelling of turbulence in a highly flexible and robust manner. This includes the application of a two-equation eddy-viscosity turbulence model[^12] to model the boundary layer while a Large Eddy approach is automatically triggered depending on the grid and time step properties. In contrast to Detached Eddy Simulation, there are no interfaces between the two solution regions. Within this project, *k-ε* and *k-ω* models will be applied to a ship airwake case to investigate their performance. 

### 7. Predicting inland waterway erosion by vessels in the UK using CFD

Inland waterways, such as rivers and canals, require expensive maintenance due to sedimentation and erosion caused by the operation of vessels[^13]. The mechanism by which waterways are eroded due to vessel operation is thought to consist of three main aspects: 1. ship-generated wave-induced erosion (due to the flow velocity caused at the canal bottom and due to wave breaking); 2.  propeller scour; 3. return flow generated at the bottom and sides between a hull and canal[^14]. This project will examine the impact of return flow on the erosive potential of vessel operation. Firstly, the relative importance of free surface effects will be evaluated at representative speeds. Following this, simulations will be run to determine the effect of hull shape (simple rectangular cross-section vs. rounded shape). The erosive potential will be determined using the shear stress[^15] exerted on the canal bottom, velocity, or dynamic pressure signature. 

### 8. Development of a wave verification tool for CFD predictions

Linear wave theory can be used to confirm the accuracy of wave predictions from CFD. This approach relies on sampling wave fields in CFD and comparing the produced wave number distributions. The output form this project would be ideally an open access tool for the verification of wave fields produced by any free surface piercing disturbance. _Some rudimentary programming background is desirable for this project in MATLAB ideally. This will be necessary in processing and visualising the data._

### References

[^1]: [Li, M., Yuan, Z.M. and Yeung, R.W., 2020, August. Unsteady Wave-Making Resistance of an Accelerating Ship. In _International Conference on Offshore Mechanics and Arctic Engineering_ (Vol. 84379, p. V06AT06A020). American Society of Mechanical Engineers.](https://asmedigitalcollection.asme.org/OMAE/proceedings-abstract/OMAE2020/V06AT06A020/1092846?casa_token=uGwZhqV7QbwAAAAA:zfaRsB9bi2lKUs81_crKH8Qa0wIuQEddfh9Uw7kUb8uG9dA09x3-Ex1sUQfH3LFK18OYX0e7). 

[^2]: [Doctors, L.J., Day, A.H. and Clelland, D., 2008. Unsteady effects during resistance tests on a ship model in a towing tank. _Journal of ship research_, _52_(04), pp.263-273.](https://onepetro.org/JSR/article-abstract/52/04/263/175054/Unsteady-Effects-During-Resistance-Tests-on-a-Ship)

[^3]: [Calisal, S., 1977. Effect of initial acceleration on ship wave pattern and wake survey methods. _Journal of Ship Research_, _21_(04), pp.239-247.](https://onepetro.org/JSR/article-abstract/21/04/239/175494/Effect-of-Initial-Acceleration-on-Ship-Wave)

[^4]: [Miloh, T., Tulin, M.P. and Zilman, G., 1993. Dead-water effects of a ship moving in stratified seas.](https://asmedigitalcollection.asme.org/offshoremechanics/article-abstract/115/2/105/430865/Dead-Water-Effects-of-a-Ship-Moving-in-Stratified?redirectedFrom=PDF)

[^5]: [Grue, J., 2015. Nonlinear dead water resistance at subcritical speed. _Physics of Fluids_, _27_(8), p.082103.](https://aip.scitation.org/doi/full/10.1063/1.4928411?casa_token=Nvz7v8bhfb8AAAAA%3AYr-JTVxcH6kNgcUSyWFZUBffIpMp9GmjJ-xGZ6ryltuUZbz8wR59jROksAzclLnG_P4emYkoumDqvw)

[^6]: [Terziev, M., Tezdogan, T. and Incecik, A., 2020. A posteriori error and uncertainty estimation in computational ship hydrodynamics. _Ocean Engineering_, _208_, p.107434.](https://doi.org/10.1016/j.oceaneng.2020.107434). 

[^7]: [Terziev, M., Tezdogan, T., Demirel, Y.K., Villa, D., Mizzi, S. and Incecik, A., 2021. Exploring the effects of speed and scale on a ship’s form factor using CFD. _International Journal of Naval Architecture and Ocean Engineering_, _13_, pp.147-162.](https://doi.org/10.1016/j.ijnaoe.2020.12.002)

[^8]: [Terziev, M., Tezdogan, T. and Incecik, A., 2019. A geosim analysis of ship resistance decomposition and scale effects with the aid of CFD. _Applied Ocean Research_, _92_, p.101930.](https://www.sciencedirect.com/science/article/pii/S0141118719302573)

[^9]: [Terziev, M., Tezdogan, T. and Incecik, A., 2021. A numerical assessment of the scale effects of a ship advancing through restricted waters. _Ocean Engineering_, _229_, p.108972.](https://doi.org/10.1016/j.oceaneng.2021.108972)]

[^10]: [Terziev, M., Tezdogan, T. and Incecik, A., 2019. A geosim analysis of ship resistance decomposition and scale effects with the aid of CFD. _Applied Ocean Research_, _92_, p.101930.](https://www.sciencedirect.com/science/article/pii/S0141118719302573)

[^11]: [Korkmaz, K.B., Werner, S., Sakamoto, N., Queutey, P., Deng, G., Yuling, G., Guoxiang, D., Maki, K., Ye, H., Akinturk, A. and Sayeed, T., 2021. CFD based form factor determination method. _Ocean Engineering_, _220_, p.108451.](https://doi.org/10.1016/j.oceaneng.2020.108451)

[^12]: [Terziev, M., Tezdogan, T. and Incecik, A., 2020. Application of eddy-viscosity turbulence models to problems in ship hydrodynamics. _Ships and Offshore Structures_, _15_(5), pp.511-534.](https://doi.org/10.1080/17445302.2019.1661625)

[^13]: [Kurdistani, S.M., Tomasicchio, G.R., D'Alessandro, F. and Hassanabadi, L., 2019. River bank protection from ship-induced waves and river flow. _Water Science and Engineering_, _12_(2), pp.129-135.](https://doi.org/10.1016/j.wse.2019.05.002)

[^14]: [Verheij, Henk, 2006, Hydraulic aspects of the Montgomery Canal Restoration, *Report Q3967; prepared for British Waterways*](https://canalrivertrust.org.uk/media/original/24189-montgomery-canal-hydraulic-aspects.pdf)

[^15]: [Gourlay, T., 2011. Notes on shoreline erosion due to boat wakes and wind waves. _Centre for Marine Science and Technology, Curtin University research report No: 2011_, _16_.](https://www.perthhydro.com/pdf/Gourlay2011ShorelineErosion.pdf)]]
