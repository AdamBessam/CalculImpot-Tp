Develop an Android application to calculate local taxes for a car based on specific formulas.

Components to be used in the project:

EditText: To input the surface area and the number of rooms.
RadioButton: To indicate the presence of a pool.
Button: To trigger the calculation.
TextView: To display the result.
Main steps of the Java code:

Declare the variables for the input fields, the radio button, and the result field.
Initialize these variables in the onCreate() method.
Create a method to calculate the taxes:
Retrieve the values entered by the user.
Calculate the base tax: surface * 2.
Calculate the additional tax: number of rooms * 50 + 100 if a pool is present.
Add these values to get the total tax amount.
Associate this method with the calculate button using setOnClickListener().
Display the result in the TextView.
Recommended layout: A vertical LinearLayout is suitable as it allows the elements to be organized simply, one below the other.


https://github.com/user-attachments/assets/679c87cb-e4fd-4a5f-ad49-cdab3f1c9ee9

