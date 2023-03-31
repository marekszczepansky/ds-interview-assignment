DS interview assignment
=======================


Summary
-------
Repository contains job interview assignments at Dynamic Solutions.


Prerequisites
-------------

- JDK 8
- Maven 3


Implementation of `StringUtil.contains()`
------------------------------------------

Implement the `StringUtil.contains(String string, String pattern)` method to take two
input parameters. The method must verify if the first parameter contains a pattern passed
as the second parameter.

A pattern may contain single or multiple wildcard characters `*`.
Each occurrence of `*` in the `pattern` means that it can be a match for
zero or more characters of the `string`.</p>

Asterisk (*) is considered as a regular character, if it is preceded by a backslash (\)
in a pattern. Backslash (\) is considered as a regular character in all cases other
than preceding the asterisk (*).

Implementation cannot use any standard library or third party utility methods operating
on strings (`String.matches()`, `String.contains()`, `String.indexOf()`, etc.) or regular expressions.
Methods like `String.toCharArray()`, `String.charAt()`, `String.length()`, etc. are allowed to use.

It is allowed to add any testing libraries of your choice, but the main framework (JUnit 5) should remain.

Exact requirements are specified in a JavaDoc for the implemented method. In case of doubts or
any clarifications are needed, do not hesitate to contact recruiters.
