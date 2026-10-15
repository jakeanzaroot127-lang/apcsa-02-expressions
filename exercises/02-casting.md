# Exercise 9 — Casting, Rounding & Overflow Lab

## Part A — Casting predictions

Predict first. Then run.

| # | Expression | Predicted | Actual |
|---|---|---|---|
| 1 | `(int) 9.99` | 9 | 9 |
| 2 | `(int) -9.99` | -9 | -9 |
| 3 | `Math.round(9.5)` | 10 | 10 |
| 4 | `Math.round(9.4)` | 9 | 9 |
| 5 | `Math.round(-9.5)` | -10 | -9 |
| 6 | `(double) 7 / 2` | 3.5 | 3.5 |
| 7 | `(double) (7 / 2)` | 3.0 | 3.0 |
| 8 | `Math.round(3.14159 * 100) / 100.0` | 3.14 | 3.14 |

**#6 and #7 look almost identical and give different answers. Explain the difference precisely.**

For number 6 the double is specifically for the 7/2, but for number 7 the 7/2 is in parenthesis so it doubles the int of 7/2 which is 3.0.

---

## Part B — The overflow lab

Run this:

```java
int max = Integer.MAX_VALUE;
System.out.println("Max int:      " + max);
System.out.println("Max + 1:      " + (max + 1));
System.out.println("Max + 2:      " + (max + 2));

int min = Integer.MIN_VALUE;
System.out.println("Min int:      " + min);
System.out.println("Min - 1:      " + (min - 1));
```

**1. What is `Integer.MAX_VALUE`?**

2147483647

**2. What happened when you added 1 to it? Was there an error message?**

-2147483648, no error message.

**3. Why is silently wrapping around more dangerous than crashing with an error?**

Silently wrapping around is more dangerous than crashing because it introduces hidden data corruption that can go undetected for a long time.

**4. In 2014 a very popular music video broke YouTube's view counter. Based on this lab, what do you think happened?**

It went to the negative minimum number.

**5. Name one thing your project might count that could get large. Would `int` be enough?**

Total views, int would be enough even if you reach the maximum because you can use multiples of tens.

---

## Part C — Floating point

Run this:

```java
System.out.println(0.1 + 0.2);
System.out.println(0.1 + 0.2 == 0.3);
```

**1. What did you expect? What did you get?**

True, False

**2. Given this, why do you think real banking software stores money as a whole number of *cents* instead of a `double` number of dollars?**

With double numbers, they eventually round as it does math using BITS, and cents is the total number without the program rounding it.

**3. If you can't use `==` to compare two doubles, what could you do instead? Write a line of code.**

System.out.println(Math.abs(a - b) < 0.00001);
