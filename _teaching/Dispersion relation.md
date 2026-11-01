# Dispersion Relation for Water Waves

**Contents:**
1 Setup ·
2 Laplace ·
3 Boundary conditions (bed, kinematic, dynamic) ·
4 Linearisation ·
5 Form of φ ·
6 Laplace → ODE ·
7 Solve for F(z) ·
8 Dynamic condition → B ·
9 Dispersion relation ·
10 Phase speed ·
11 Deep and shallow water ·
12 Velocity field ·
13 Pressure ·
14 Summary

---

## 1. Setup

- $x$: horizontal. $z$: upward, $z = 0$ at the mean free surface. Bed at $z = -h$.
- 2D flow in the $x$–$z$ plane, unit width.
- Surface elevation:

$$
\eta = A\cos(kx - \omega t) \tag{1.1}
$$

- $k = 2\pi/\lambda$ (wavenumber), $\omega = 2\pi/T$ (angular frequency).
- Shorthand: $\theta \equiv kx - \omega t$, so $\dfrac{\partial\theta}{\partial x} = k$, $\dfrac{\partial\theta}{\partial z} = 0$, $\dfrac{\partial\theta}{\partial t} = -\omega$.
- Velocity from the potential:

$$
u = \frac{\partial\phi}{\partial x}, \qquad w = \frac{\partial\phi}{\partial z} \tag{1.2}
$$

- Incompressible, inviscid, irrotational.

**Goal:** the relation between $\omega$ and $k$.

---

## 2. Governing equation

$$
\frac{\partial^2\phi}{\partial x^2} + \frac{\partial^2\phi}{\partial z^2} = 0 \tag{2.1}
$$

---

## 3. Boundary conditions

### 3.1 Bed: no flow through the bottom

$$
w = \frac{\partial\phi}{\partial z} = 0 \quad \text{at } z = -h \tag{3.1}
$$

### 3.2 Kinematic surface condition

A particle on the surface stays on the surface.

At time $t$, a surface particle at horizontal position $x$ has height $\eta(x, t)$. In time $\mathrm{d}t$ it moves to

$$
x + u\,\mathrm{d}t, \qquad \eta(x, t) + w\,\mathrm{d}t
$$

It is still on the surface:

$$
\eta(x, t) + w\,\mathrm{d}t = \eta(x + u\,\mathrm{d}t,\; t + \mathrm{d}t)
$$

Expand the right side for small $\mathrm{d}t$ (chain rule):

$$
\eta(x + u\,\mathrm{d}t,\; t + \mathrm{d}t) = \eta(x, t) + \frac{\partial\eta}{\partial x}\,u\,\mathrm{d}t + \frac{\partial\eta}{\partial t}\,\mathrm{d}t
$$

Substitute:

$$
\eta + w\,\mathrm{d}t = \eta + u\frac{\partial\eta}{\partial x}\,\mathrm{d}t + \frac{\partial\eta}{\partial t}\,\mathrm{d}t
$$

Cancel $\eta$, divide by $\mathrm{d}t$:

$$
\frac{\partial\eta}{\partial t} + u\,\frac{\partial\eta}{\partial x} = w \quad \text{at } z = \eta \tag{3.2}
$$

### 3.3 Dynamic surface condition

Needs the unsteady Bernoulli equation, derived from Euler's equations.

#### Euler's equations

Newton's second law for a small rectangular fluid element.

**The element**

Sides $\mathrm{d}x$ and $\mathrm{d}z$, unit width. Mass:

$$
m = \rho\,\mathrm{d}x\,\mathrm{d}z \tag{3.3}
$$

**Forces in $x$**

Inviscid: no shear forces. Pressure only.

- Left face, at $x$, area $\mathrm{d}z$: force $p\,\mathrm{d}z$ in $+x$.
- Right face, at $x + \mathrm{d}x$, pressure $p + \dfrac{\partial p}{\partial x}\mathrm{d}x$: force $\left(p + \dfrac{\partial p}{\partial x}\mathrm{d}x\right)\mathrm{d}z$ in $-x$.

$$
F_x = p\,\mathrm{d}z - \left(p + \frac{\partial p}{\partial x}\mathrm{d}x\right)\mathrm{d}z = -\frac{\partial p}{\partial x}\,\mathrm{d}x\,\mathrm{d}z \tag{3.4}
$$

**Forces in $z$**

Pressure on bottom and top faces, plus gravity on the mass:

$$
F_z = p\,\mathrm{d}x - \left(p + \frac{\partial p}{\partial z}\mathrm{d}z\right)\mathrm{d}x - \rho g\,\mathrm{d}x\,\mathrm{d}z = -\frac{\partial p}{\partial z}\,\mathrm{d}x\,\mathrm{d}z - \rho g\,\mathrm{d}x\,\mathrm{d}z \tag{3.5}
$$

**Acceleration**

In time $\mathrm{d}t$ the element moves from $(x, z)$ to $(x + u\,\mathrm{d}t,\ z + w\,\mathrm{d}t)$. Its change in $u$:

$$
\mathrm{d}u = u(x + u\,\mathrm{d}t,\ z + w\,\mathrm{d}t,\ t + \mathrm{d}t) - u(x, z, t)
$$

Expand for small $\mathrm{d}t$ (chain rule):

$$
\mathrm{d}u = \frac{\partial u}{\partial t}\mathrm{d}t + \frac{\partial u}{\partial x}\,u\,\mathrm{d}t + \frac{\partial u}{\partial z}\,w\,\mathrm{d}t
$$

Divide by $\mathrm{d}t$:

$$
a_x = \frac{\partial u}{\partial t} + u\frac{\partial u}{\partial x} + w\frac{\partial u}{\partial z} \tag{3.6}
$$

Same steps for $w$:

$$
a_z = \frac{\partial w}{\partial t} + u\frac{\partial w}{\partial x} + w\frac{\partial w}{\partial z} \tag{3.7}
$$

The acceleration is not just $\partial u/\partial t$: the element moves to places where the velocity is different.

**Newton's second law, $m\,a = F$**

**$x$:** (3.3), (3.4), (3.6):

$$
\rho\,\mathrm{d}x\,\mathrm{d}z\left(\frac{\partial u}{\partial t} + u\frac{\partial u}{\partial x} + w\frac{\partial u}{\partial z}\right) = -\frac{\partial p}{\partial x}\,\mathrm{d}x\,\mathrm{d}z
$$

Divide by $\rho\,\mathrm{d}x\,\mathrm{d}z$:

$$
\frac{\partial u}{\partial t} + u\frac{\partial u}{\partial x} + w\frac{\partial u}{\partial z} = -\frac{1}{\rho}\frac{\partial p}{\partial x} \tag{3.8}
$$

**$z$:** (3.3), (3.5), (3.7):

$$
\rho\,\mathrm{d}x\,\mathrm{d}z\left(\frac{\partial w}{\partial t} + u\frac{\partial w}{\partial x} + w\frac{\partial w}{\partial z}\right) = -\frac{\partial p}{\partial z}\,\mathrm{d}x\,\mathrm{d}z - \rho g\,\mathrm{d}x\,\mathrm{d}z
$$

Divide by $\rho\,\mathrm{d}x\,\mathrm{d}z$:

$$
\frac{\partial w}{\partial t} + u\frac{\partial w}{\partial x} + w\frac{\partial w}{\partial z} = -\frac{1}{\rho}\frac{\partial p}{\partial z} - g \tag{3.9}
$$

#### Unsteady Bernoulli equation

**Convective terms of (3.8)**

$$
u\frac{\partial u}{\partial x} + w\frac{\partial u}{\partial z}
$$

Irrotationality, $\dfrac{\partial u}{\partial z} = \dfrac{\partial w}{\partial x}$, replaces the second term:

$$
u\frac{\partial u}{\partial x} + w\frac{\partial w}{\partial x}
$$

Chain rule on each term:

$$
\frac{\partial}{\partial x}\left(\frac{1}{2}u^2\right) = \frac{1}{2}\cdot 2u\cdot\frac{\partial u}{\partial x} = u\frac{\partial u}{\partial x}, \qquad
\frac{\partial}{\partial x}\left(\frac{1}{2}w^2\right) = \frac{1}{2}\cdot 2w\cdot\frac{\partial w}{\partial x} = w\frac{\partial w}{\partial x}
$$

Add:

$$
u\frac{\partial u}{\partial x} + w\frac{\partial u}{\partial z} = \frac{\partial}{\partial x}\left[\frac{1}{2}\left(u^2 + w^2\right)\right] \tag{3.10}
$$

**Convective terms of (3.9)**

$$
u\frac{\partial w}{\partial x} + w\frac{\partial w}{\partial z}
$$

Irrotationality replaces $\dfrac{\partial w}{\partial x}$ by $\dfrac{\partial u}{\partial z}$:

$$
u\frac{\partial u}{\partial z} + w\frac{\partial w}{\partial z}
$$

Chain rule, as for (3.10):

$$
u\frac{\partial w}{\partial x} + w\frac{\partial w}{\partial z} = \frac{\partial}{\partial z}\left[\frac{1}{2}\left(u^2 + w^2\right)\right] \tag{3.11}
$$

**Time derivatives**

From (1.2), and swapping the order of differentiation:

$$
\frac{\partial u}{\partial t} = \frac{\partial}{\partial t}\frac{\partial\phi}{\partial x} = \frac{\partial}{\partial x}\frac{\partial\phi}{\partial t}, \qquad
\frac{\partial w}{\partial t} = \frac{\partial}{\partial t}\frac{\partial\phi}{\partial z} = \frac{\partial}{\partial z}\frac{\partial\phi}{\partial t} \tag{3.12}
$$

**Gravity**

$$
g = \frac{\partial (gz)}{\partial z}, \qquad 0 = \frac{\partial (gz)}{\partial x}
$$

**Combine**

Substitute (3.10), (3.12) into (3.8); add $\dfrac{\partial (gz)}{\partial x} = 0$; move all terms left:

$$
\frac{\partial}{\partial x}\left[\frac{\partial\phi}{\partial t} + \frac{1}{2}\left(u^2 + w^2\right) + \frac{p}{\rho} + gz\right] = 0 \tag{3.13}
$$

Substitute (3.11), (3.12) and $g = \dfrac{\partial (gz)}{\partial z}$ into (3.9); move all terms left:

$$
\frac{\partial}{\partial z}\left[\frac{\partial\phi}{\partial t} + \frac{1}{2}\left(u^2 + w^2\right) + \frac{p}{\rho} + gz\right] = 0 \tag{3.14}
$$

The bracket varies with neither $x$ nor $z$, so it depends on $t$ only:

$$
\frac{\partial\phi}{\partial t} + \frac{1}{2}\left(u^2 + w^2\right) + \frac{p}{\rho} + gz = C(t) \tag{3.15}
$$

**Remove $C(t)$**

Define

$$
\Phi = \phi - \int C(t)\,\mathrm{d}t
$$

**Same velocities.** The added term has no $x$ or $z$ dependence:

$$
\frac{\partial \Phi}{\partial x} = \frac{\partial \phi}{\partial x} = u, \qquad \frac{\partial \Phi}{\partial z} = \frac{\partial \phi}{\partial z} = w
$$

**Time derivative.** Since $\dfrac{\mathrm{d}}{\mathrm{d}t}\displaystyle\int C(t)\,\mathrm{d}t = C(t)$:

$$
\frac{\partial \Phi}{\partial t} = \frac{\partial \phi}{\partial t} - C(t) \quad\Rightarrow\quad \frac{\partial \phi}{\partial t} = \frac{\partial \Phi}{\partial t} + C(t)
$$

**Substitute into (3.15):**

$$
\frac{\partial \Phi}{\partial t} + C(t) + \frac{1}{2}\left(u^2 + w^2\right) + \frac{p}{\rho} + gz = C(t)
$$

$C(t)$ cancels. Only derivatives of the potential have physical meaning, so rename $\Phi$ as $\phi$:

$$
\boxed{\;\frac{\partial\phi}{\partial t} + \frac{1}{2}\left(u^2 + w^2\right) + \frac{p}{\rho} + gz = 0\;} \tag{3.16}
$$

Holds at every point in the fluid.

#### Apply at the surface

Apply (3.16) at $z = \eta$, where the pressure is atmospheric, taken as zero (gauge), $p = 0$:

$$
\frac{\partial\phi}{\partial t} + \frac{1}{2}\left(u^2 + w^2\right) + g\eta = 0 \quad \text{at } z = \eta \tag{3.17}
$$

---

## 4. Linearisation (small amplitude: $A \ll \lambda$, $A \ll h$)

$\eta$, $u$, $w$, $\phi$ are all proportional to $A$. Products of two of them are proportional to $A^2$ and are dropped.

- (3.2): $u\,\dfrac{\partial\eta}{\partial x}$ is a product of two small quantities → dropped.
- (3.17): $\tfrac{1}{2}(u^2 + w^2)$ is a product of two small quantities → dropped.
- **Evaluate at $z = 0$ instead of $z = \eta$.** Expand $w$ about $z = 0$:

$$
w\big|_{z=\eta} = w\big|_{z=0} + \eta\,\frac{\partial w}{\partial z}\bigg|_{z=0} + \dots
$$

The second term is $\eta \times$ (small) → dropped. Same for $\dfrac{\partial\phi}{\partial t}$.

Linearised kinematic condition:

$$
\frac{\partial\eta}{\partial t} = \frac{\partial\phi}{\partial z} \quad \text{at } z = 0 \tag{4.1}
$$

Linearised dynamic condition:

$$
\frac{\partial\phi}{\partial t} + g\eta = 0 \quad \text{at } z = 0 \tag{4.2}
$$

---

## 5. Form of $\phi$

From (4.2) and (1.1): $\dfrac{\partial\phi}{\partial t} = -g\eta = -gA\cos\theta$ at the surface.

Since $\dfrac{\partial}{\partial t}\sin\theta = \cos\theta\cdot(-\omega)$, $\phi$ must vary as $\sin\theta$. Depth variation unknown:

$$
\phi = F(z)\,\sin\theta \tag{5.1}
$$

---

## 6. Substitute into Laplace

From (5.1):

$$
\frac{\partial\phi}{\partial x} = F\,k\cos\theta, \qquad \frac{\partial^2\phi}{\partial x^2} = -F\,k^2\sin\theta
$$

$$
\frac{\partial\phi}{\partial z} = F'\sin\theta, \qquad \frac{\partial^2\phi}{\partial z^2} = F''\sin\theta
$$

Into (2.1):

$$
-k^2F\sin\theta + F''\sin\theta = 0
$$

Divide by $\sin\theta$:

$$
F'' - k^2F = 0 \tag{6.1}
$$

---

## 7. Solve for $F(z)$

### 7.1 Two solutions

Try $F = e^{mz}$, so $F'' = m^2e^{mz}$. Into (6.1):

$$
m^2e^{mz} - k^2e^{mz} = 0 \quad\Rightarrow\quad m^2 = k^2 \quad\Rightarrow\quad m = \pm k
$$

General solution:

$$
F = C'\,e^{kz} + D'\,e^{-kz} \tag{7.1}
$$

### 7.2 Rewrite with $z + h$

Since $e^{k(z+h)} = e^{kh}\,e^{kz}$:

$$
C\,e^{k(z+h)} = \left(C\,e^{kh}\right)e^{kz}, \qquad D\,e^{-k(z+h)} = \left(D\,e^{-kh}\right)e^{-kz}
$$

These are (7.1) with $C' = C\,e^{kh}$, $D' = D\,e^{-kh}$. Same solution, relabelled constants:

$$
F = C\,e^{k(z+h)} + D\,e^{-k(z+h)} \tag{7.2}
$$

Reason: at the bed, $z + h = 0$, so both exponentials equal $e^0 = 1$.

### 7.3 Apply the bed condition

Differentiate (7.2):

$$
F' = kC\,e^{k(z+h)} - kD\,e^{-k(z+h)}
$$

(3.1): $\dfrac{\partial\phi}{\partial z} = F'\sin\theta = 0$ at $z = -h$ for all $\theta$, so $F'(-h) = 0$:

$$
kC\,e^{0} - kD\,e^{0} = 0 \quad\Rightarrow\quad C = D
$$

$$
F = C\left[e^{k(z+h)} + e^{-k(z+h)}\right] = 2C\cosh k(z+h)
$$

using $\cosh x = \tfrac{1}{2}\left(e^{x} + e^{-x}\right)$. Write $B = 2C$:

$$
F = B\cosh k(z+h) \tag{7.3}
$$

$$
\phi = B\cosh k(z+h)\,\sin\theta \tag{7.4}
$$

---

## 8. Dynamic condition → $B$

Differentiate (7.4) with respect to $t$:

$$
\frac{\partial\phi}{\partial t} = B\cosh k(z+h)\cdot\cos\theta\cdot(-\omega) = -\omega B\cosh k(z+h)\cos\theta
$$

At $z = 0$:

$$
\frac{\partial\phi}{\partial t} = -\omega B\cosh(kh)\cos\theta
$$

Into (4.2) with $\eta = A\cos\theta$ from (1.1):

$$
-\omega B\cosh(kh)\cos\theta + gA\cos\theta = 0
$$

Divide by $\cos\theta$, solve for $B$:

$$
B = \frac{gA}{\omega\cosh kh} \tag{8.1}
$$

Into (7.4):

$$
\boxed{\;\phi = \frac{gA}{\omega}\,\frac{\cosh k(z+h)}{\cosh kh}\,\sin(kx - \omega t)\;} \tag{8.2}
$$

---

## 9. Kinematic condition → dispersion relation

**Left side of (4.1)**, from (1.1):

$$
\frac{\partial\eta}{\partial t} = A\cdot(-\sin\theta)\cdot(-\omega) = A\omega\sin\theta
$$

**Right side of (4.1)**, from (8.2):

$$
\frac{\partial\phi}{\partial z} = \frac{gA}{\omega}\,\frac{k\sinh k(z+h)}{\cosh kh}\,\sin\theta
$$

At $z = 0$:

$$
\frac{\partial\phi}{\partial z}\bigg|_{z=0} = \frac{gAk}{\omega}\,\frac{\sinh kh}{\cosh kh}\,\sin\theta = \frac{gAk}{\omega}\tanh(kh)\,\sin\theta
$$

**Equate:**

$$
A\omega\sin\theta = \frac{gAk}{\omega}\tanh(kh)\,\sin\theta
$$

Divide by $A\sin\theta$, multiply by $\omega$:

$$
\boxed{\;\omega^2 = gk\tanh(kh)\;} \tag{9.1}
$$

---

## 10. Phase speed

### 10.1 Direction of travel

A crest of (1.1) is where $\theta = kx - \omega t = 0$:

$$
x = \frac{\omega}{k}\,t \tag{10.1}
$$

As $t$ increases, $x$ increases: the wave moves in $+x$.

($A\cos(kx + \omega t)$ has its crest at $x = -\omega t/k$, moving in $-x$.)

### 10.2 Why $c = \omega/k$

Follow one crest, so $\theta$ is constant:

$$
kx - \omega t = \text{const}
$$

Differentiate with respect to $t$:

$$
k\frac{\mathrm{d}x}{\mathrm{d}t} - \omega = 0
$$

$$
c = \frac{\mathrm{d}x}{\mathrm{d}t} = \frac{\omega}{k} \tag{10.2}
$$

Equivalently, one wavelength per period: $c = \dfrac{\lambda}{T} = \dfrac{2\pi/k}{2\pi/\omega} = \dfrac{\omega}{k}$.

### 10.3 Phase speed from the dispersion relation

From (9.1), $\omega = \sqrt{gk\tanh kh}$. Into (10.2):

$$
c = \frac{\sqrt{gk\tanh kh}}{k} = \sqrt{\frac{gk\tanh kh}{k^2}}
$$

$$
\boxed{\;c = \sqrt{\frac{g}{k}\tanh(kh)}\;} \tag{10.3}
$$

With $k = 2\pi/\lambda$:

$$
c = \sqrt{\frac{g\lambda}{2\pi}\tanh\!\left(\frac{2\pi h}{\lambda}\right)} \tag{10.4}
$$

---

## 11. Deep and shallow water

### 11.1 Deep water ($kh$ large, $h \gtrsim \lambda/2$)

$\tanh(kh) \to 1$ in (9.1) and (10.3):

$$
\omega^2 = gk, \qquad c = \sqrt{\frac{g}{k}} = \sqrt{\frac{g\lambda}{2\pi}} \tag{11.1}
$$

Wavelength from period: $\omega = 2\pi/T$, $k = 2\pi/\lambda$ into $\omega^2 = gk$:

$$
\frac{4\pi^2}{T^2} = \frac{2\pi g}{\lambda}
$$

$$
\lambda = \frac{gT^2}{2\pi} \tag{11.2}
$$

Potential: for $kh$ large, the $e^{-k(z+h)}$ and $e^{-kh}$ terms are negligible:

$$
\frac{\cosh k(z+h)}{\cosh kh} = \frac{e^{k(z+h)} + e^{-k(z+h)}}{e^{kh} + e^{-kh}} \to \frac{e^{k(z+h)}}{e^{kh}} = e^{kz}
$$

Into (8.2):

$$
\phi = \frac{gA}{\omega}\,e^{kz}\sin(kx - \omega t) \tag{11.3}
$$

### 11.2 Shallow water ($kh$ small, $h \lesssim \lambda/20$)

$\tanh(kh) \to kh$ in (9.1):

$$
\omega^2 = gk\cdot kh = gk^2h
$$

Into (10.2):

$$
c = \frac{\omega}{k} = \sqrt{gh} \tag{11.4}
$$

Independent of wavelength.

---

## 12. Velocity field

From (1.2) and (8.2):

$$
u = \frac{\partial\phi}{\partial x} = \frac{gAk}{\omega}\,\frac{\cosh k(z+h)}{\cosh kh}\,\cos(kx - \omega t) \tag{12.1}
$$

$$
w = \frac{\partial\phi}{\partial z} = \frac{gAk}{\omega}\,\frac{\sinh k(z+h)}{\cosh kh}\,\sin(kx - \omega t) \tag{12.2}
$$

At $z = -h$: $\sinh 0 = 0$, so $w = 0$, satisfying (3.1).

---

## 13. Pressure

(3.16), with $\tfrac{1}{2}(u^2 + w^2)$ dropped as in §4:

$$
\frac{\partial\phi}{\partial t} + \frac{p}{\rho} + gz = 0
$$

$$
p = -\rho gz - \rho\frac{\partial\phi}{\partial t}
$$

From §8 with $B$ from (8.1):

$$
\frac{\partial\phi}{\partial t} = -\omega\cdot\frac{gA}{\omega\cosh kh}\cosh k(z+h)\cos\theta = -gA\,\frac{\cosh k(z+h)}{\cosh kh}\cos\theta
$$

$$
\boxed{\;p = \underbrace{-\rho gz}_{\text{hydrostatic}} + \underbrace{\rho gA\,\frac{\cosh k(z+h)}{\cosh kh}\cos(kx - \omega t)}_{\text{wave}}\;} \tag{13.1}
$$

At $z = 0$: $p = \rho gA\cos\theta = \rho g\eta$, the hydrostatic pressure of the water column of height $\eta$ above $z = 0$.

Deep water: wave part becomes $\rho gA\,e^{kz}\cos\theta$.

---

## 14. Summary

| Quantity | Result | Eq. |
|---|---|---|
| Euler, $x$ | $\dfrac{\partial u}{\partial t} + u\dfrac{\partial u}{\partial x} + w\dfrac{\partial u}{\partial z} = -\dfrac{1}{\rho}\dfrac{\partial p}{\partial x}$ | (3.8) |
| Euler, $z$ | $\dfrac{\partial w}{\partial t} + u\dfrac{\partial w}{\partial x} + w\dfrac{\partial w}{\partial z} = -\dfrac{1}{\rho}\dfrac{\partial p}{\partial z} - g$ | (3.9) |
| Unsteady Bernoulli | $\dfrac{\partial\phi}{\partial t} + \tfrac{1}{2}(u^2+w^2) + \dfrac{p}{\rho} + gz = 0$ | (3.16) |
| Kinematic BC | $\dfrac{\partial\eta}{\partial t} + u\dfrac{\partial\eta}{\partial x} = w$ at $z=\eta$ | (3.2) |
| Dynamic BC | $\dfrac{\partial\phi}{\partial t} + \tfrac{1}{2}(u^2+w^2) + g\eta = 0$ at $z=\eta$ | (3.17) |
| Linearised kinematic | $\dfrac{\partial\eta}{\partial t} = \dfrac{\partial\phi}{\partial z}$ at $z=0$ | (4.1) |
| Linearised dynamic | $\dfrac{\partial\phi}{\partial t} + g\eta = 0$ at $z=0$ | (4.2) |
| Potential | $\phi = \dfrac{gA}{\omega}\dfrac{\cosh k(z+h)}{\cosh kh}\sin(kx-\omega t)$ | (8.2) |
| Dispersion relation | $\omega^2 = gk\tanh kh$ | (9.1) |
| Phase speed | $c = \omega/k = \sqrt{\dfrac{g}{k}\tanh kh}$ | (10.2), (10.3) |
| Deep water | $\omega^2 = gk$, $c = \sqrt{g\lambda/2\pi}$, $\lambda = gT^2/2\pi$ | (11.1), (11.2) |
| Shallow water | $c = \sqrt{gh}$ | (11.4) |
| Horizontal velocity | $u = \dfrac{gAk}{\omega}\dfrac{\cosh k(z+h)}{\cosh kh}\cos\theta$ | (12.1) |
| Vertical velocity | $w = \dfrac{gAk}{\omega}\dfrac{\sinh k(z+h)}{\cosh kh}\sin\theta$ | (12.2) |
| Pressure | $p = -\rho gz + \rho gA\dfrac{\cosh k(z+h)}{\cosh kh}\cos\theta$ | (13.1) |
