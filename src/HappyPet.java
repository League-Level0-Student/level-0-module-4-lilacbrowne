
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	// Initialize to zero.
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
		String Pet = JOptionPane.showInputDialog("What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!

		// 3. Use showOptionDialog to ask the user what they want to do to make their
		// pet happy
		// (eg: cuddle, food, water, take a walk, groom, clean up poop).
		// Make sure to customize the title and question too.
		for (int i = 0; i < 4; i++) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet",
					0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "pet it", "give it a walk", "give it food" }, null);
			if (task == 0) {
				cuddlePet(Pet);
			} else if (task == 1) {
				walkPet(Pet);
			} else if (task == 2) {
				feedPet(Pet);
			}
			if (happinessLevel > 5) {
				JOptionPane.showMessageDialog(null, "Your pet is so happy! You love your pet!");
				break;
			}
		}
	}
	// 5. Use user input to call the appropriate method created in step 4.

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),

	// and INCREMENT the pet's happiness Level.

	static void cuddlePet(String Pet) {
		JOptionPane.showMessageDialog(null, "Your " + Pet + " is smiling!");
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happinessLevel);

	}

	static void feedPet(String Pet) {
		JOptionPane.showMessageDialog(null, "Your " + Pet + " is sleepy and happy now!");
		happinessLevel = happinessLevel + 1;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happinessLevel);

	}

	static void walkPet(String Pet) {
		JOptionPane.showMessageDialog(null, "Your " + Pet + " loves walking with you!");
		happinessLevel = happinessLevel + 2;
		JOptionPane.showMessageDialog(null, "Your pet's happiness level is " + happinessLevel);
	}
}