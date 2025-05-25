# Chef-and-Strings
CodeChef Difficulty 1094 Problem.

🎸 Chef and Guitar Strings
Chef, having mastered the art of cooking, is now learning to play the guitar. While playing his favorite song, he often needs to switch between guitar strings that aren't adjacent. This is manageable with a standard 6-string guitar, but Chef is using a guitar with 106 strings, making the task more complex.

To make things easier, Chef needs a program that calculates the total number of strings he skips when playing a song. Help Chef by writing this program!

📘 Problem Description
Chef plucks a series of strings in a specific order. For each transition from one string to another, the number of skipped strings is the absolute difference between the two string numbers minus 1.

For example, going from string 1 to string 6 means skipping over strings 2, 3, 4, and 5 — a total of 4 skipped strings.

🧾 Input Format
The first line contains a single integer T — the number of test cases.

For each test case:

The first line contains a single integer N — the number of strings Chef will pluck.

The second line contains N space-separated integers S1, S2, ..., SN — the string numbers Chef plucks in order.

🖨 Output Format
For each test case, output a single line with the total number of strings Chef skips while playing the song.
