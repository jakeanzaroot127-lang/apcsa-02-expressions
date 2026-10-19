# Exercise 11 — The Debugging Gauntlet

Five programs, escalating difficulty. Fix each one, then document it.

For each: what type of error, what the message said (or didn't), and what was actually wrong.

---

## DebugMe1

| | |
|---|---|
| **Error type** (syntax / runtime / logic) | Syntax |
| **Message Java gave** | Syntax error, insert ";" |
| **What was actually wrong** | Missing ";" after 3 |
| **The fix** | Add a ";" after 3 |

---

## DebugMe2

| | |
|---|---|
| **Error type** | Syntax |
| **Message** | Type mismatch: cannot convert from String to int, and Syntax error, insert ";" to complete Statement |
| **What was wrong** | Quotation marks are for strings, int's don't use them. On top of that there is a semicolon missing after the print line. |
| **The fix** | Remove quotation marks on the int, and add a semicolon after the print line. |

---

## DebugMe3

| | |
|---|---|
| **Error type** | Syntax |
| **Message** | error: incompatible types |
| **What was wrong** | Price was coming in as a double rather then an integer |
| **The fix** | int rounded = (int) Math.round(price); |

---

## DebugMe4

| | |
|---|---|
| **Error type** | Syntax |
| **Message** | error: cannot find symbol|
| **What was wrong** | 's' in totalScore is supposed to be capital, and 'a' in Average is supposed to be lowercase |
| **The fix** | Capitalize the 's' making it totalScore, and lowercase the 'a' making it average |

---

## DebugMe5

> ⚠️ This one **compiles and runs**. It just gives the wrong answer.

| | |
|---|---|
| **Error type** | logic |
| **What output did you expect?** | 86.0% |
| **What output did you get?** | 0.0%|
| **What was actually wrong** | Dividing a smaller int by a larger one will always result in zero |
| **The fix** | Multiply by 100 first then divide |
| **How did you find it?** | Doing simple math |

---

## Reflection

**1. Which was hardest? Why?**

[your answer]

**2. DebugMe5 had no error message at all. What strategy did you use to find the problem?**

[your answer]

**3. Why is a logic error more dangerous in real software than a syntax error?**

[your answer]
