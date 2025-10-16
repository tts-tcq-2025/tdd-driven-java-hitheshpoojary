# TDD Driven StringCalculator

Build a StringCalculator functionality that can take up to two numbers, separated by commas, and will return their sum. 
for example “” or “1” or “1,2” as inputs.

> DO NOT jump into implementation! Read the example and the starting task below.

- For an empty string it will return 0
- Allow the Add method to handle an unknown amount of numbers
- Allow the Add method to handle new lines between numbers (instead of commas).
  - the following input is ok: “1\n2,3” (will equal 6)
  - the following input is NOT ok: “1,\n” (not need to prove it - just clarifying)
- Support different delimiters : to change a delimiter, the beginning of the string will contain a separate line that looks like this: “//[delimiter]\n[numbers…]” for example “//;\n1;2” should return three where the default delimiter is ‘;’ .
the first line is optional. all existing scenarios should still be supported
- Calling Method with a negative number will throw an exception “negatives not allowed” - and the negative that was passed. if there are multiple negatives, show all of them in the exception message.
- Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
- Delimiters can be of any length with the following format: “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6

## Test Specification 

| Test Case ID | Description                      | Input                  | Expected Output / Behavior                     | Comment                                              |
| ------------ | -------------------------------- | ---------------------- | ---------------------------------------------- | ---------------------------------------------------- |
| TC-01        | Empty string                     | `""`                   | `0`                                            | Handles case where no numbers are provided.          |
| TC-02        | Single digit                     | `"1"`                  | `1`                                            | Should return the number itself.                     |
| TC-03        | Two numbers                      | `"1,2"`                | `3`                                            | Adds two comma-separated numbers.                    |
| TC-04        | Unknown amount of numbers        | `"1,2,3,4"`            | `10`                                           | Supports summing multiple numbers.                   |
| TC-05        | Newline as delimiter             | `"1\n2,3"`             | `6`                                            | Supports both commas and newlines as separators.     |
| TC-06        | Bad formatting (comma + newline) | `"1,\n2"`              | Not handled                                    | Shows input with invalid delimiter sequence.         |
| TC-07        | Custom delimiter                 | `"//;\n1;2"`           | `3`                                            | Allows defining a custom single-character delimiter. |
| TC-08        | Ignore numbers greater than 1000 | `"2,1001"`             | `2`                                            | Numbers > 1000 should be ignored.                    |
| TC-09        | Multi-character delimiter        | `"//[***]\n1***2***3"` | `6`                                            | Supports custom delimiters with multiple characters. |
| TC-10        | Negative numbers                 | `"-1,-2"`              | Exception with all negatives listed: `"-1,-2"` | Throws error when negatives are included.            |



Establish quality parameters:

- Ensure  maximum complexity (CCN) per function == 3

- Ensure 100% line and branch coverage at every step

  

Start Test-driven approach

1. Write the smallest possible failing test: give input `"" assert output to be 0 ` .
2. Write the minimum amount of code that'll make it pass.
3. Refactor any assumptions, continue to pass this test. Do not add any code without a corresponding test.
