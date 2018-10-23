# Master Theorem
* If we have a recurrence of this form:

T(n) = aT(n/b) + f(n) and f(n) ∈ Θ (n<sup>2</sup>) then:
* T(n) ∈ Θ(n<sup>d</sup>) if a < b<sup>d</sup>
* T(n) ∈ Θ(n<sup>d</sup>logn) if a = b<sup>d</sup>
* T(n) ∈ Θ(n<sup>log<sub>b</sub>a</sup>) if a > b<sup>d</sup>

Analogous results for O and Ω
* For this course we have to know how to apply the Master Theorem, not prove it or derive it