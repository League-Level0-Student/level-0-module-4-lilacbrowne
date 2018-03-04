import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {

		String door = JOptionPane
				.showInputDialog("You see two different doors: a pink door and a blue door. Which do you choose?");
		if (door.equalsIgnoreCase("pink door")) {
			String room = JOptionPane.showInputDialog(
					"You chose the pink door, and it leads to two rooms. A yellow room and an orange room. Which do you choose?");
			if (room.equalsIgnoreCase("yellow room")) {

			} else if (room.equalsIgnoreCase("orange room")) {
				String machine = JOptionPane
						.showInputDialog("The orange room leads to a metal robot and R2D2. Which one do you fight?");
				if (machine.equalsIgnoreCase("R2D2")) {
					JOptionPane.showMessageDialog(null, "You underestimated the power of R2D2 and you died.");
				} else if (machine.equalsIgnoreCase("metal robot")) {
					JOptionPane.showMessageDialog(null, "Congrats! You won!");
				}

				String boatcar = JOptionPane
						.showInputDialog("The yellow room leads to a boat and a car. Which do you choose?");
				if (boatcar.equalsIgnoreCase("car")) {
					JOptionPane.showMessageDialog(null,
							"Your car crashed into a pit of fire and you died. Better luck next time!");
				} else if (boatcar.equalsIgnoreCase("boat")) {
					JOptionPane.showMessageDialog(null,
							"You escaped! But then you get eaten by snakes on the island you traveled to.");
				}

			}
		}

		if (door.equalsIgnoreCase("blue door")) {
			String tunnel = JOptionPane
					.showInputDialog("The blue door leads to a stone tunnel and a dirt tunnel. Which do you choose?");
			if (tunnel.equalsIgnoreCase("stone tunnel")) {
				String animal = JOptionPane.showInputDialog(
						"The stone tunnel means you have to fight an animal. Rattlesnake or elephant?");
			} else if (tunnel.equalsIgnoreCase("dirt tunnel")) {
				JOptionPane.showInputDialog(
						"The dirt tunnels leads to a large chasm and a river. You have to cross. Which one?");
			}
		}

	}
}
