# Exercise 4 — Predict, Then Run

**Fill in the PREDICTED column completely before you run any code.** That's the whole exercise. Checking the answer without committing to a guess teaches you nothing.

| # | Expression | Predicted | Actual | Right? | If wrong, why? |
|---|---|---|---|---|---|
| 1 | `9 / 2` | 4 | 4 | Yes | |
| 2 | `9 % 2` | 1 | 1 | Yes | |
| 3 | `9.0 / 2` | 4.5 | 4.5 | Yes | |
| 4 | `9 / 2.0` | 4.5 | 4.5 | Yes | |
| 5 | `2 + 3 * 4` | 14 | 14 | Yes | |
| 6 | `(2 + 3) * 4` | 20 | 20 | Yes | |
| 7 | `20 - 5 - 3` | 12 | 12 | Yes | |
| 8 | `17 % 5` | 2 | 2 | Yes | |
| 9 | `5 % 17` | 0 | 5 | No | I thought 5 wasn't divisible by 17, forgot about decimals |
| 10 | `100 / 3 / 3` | 10 | 11 | No | Thought it would be only an integer for the first divison such as 100/3 = 30 |
| 11 | `1 / 2 * 100` | 50 | 0 | No | Thought it would be 50 because i forgot that 1/2 there is 0.5 which goes to 0 |
| 12 | `100 * 1 / 2` | 50 | 50 | Yes | |

---

## Follow-up

**1. Compare #11 and #12. Same numbers, same operators, completely different answers. Explain why.**

Different orders of operations

**2. #9 gives `5`. Explain why `5 % 17` is 5 and not 0.**

17 cannot go into 5 even a single time (0 times), leaving the entire numerator (5) as the remainder.

**3. A classmate writes this to calculate a percentage:**
```java
int correct = 7;
int total = 10;
double percent = correct / total * 100;
```
**They get `0.0`. Explain what went wrong and write the corrected line.**

Since correct and double 

```java
// corrected line:
```

**4. Give one real situation where `%` would genuinely be useful. Not from this worksheet — something from your own life or your project idea.**

[your answer]
