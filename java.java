import javax.swing.JOptionPane;

//This is a program :]

public class java 
{

    public static void main(String[] args) 
    {
        String name = Welcome();
        Object choice = DisplayMenu();

        if (choice == "1) Calculate area of a 2D Rectangle")
        {
            CalculateArea();
        }
        else if (choice == "2) Calculate volume of a 3D Rectangle")
        {
            CalculateVolume();
        }
        else
        {
            Goodbye(name);
        }
    }

    public static String Welcome()
    {
        String name = JOptionPane.showInputDialog("Welcome! Please enter your name: ");
        JOptionPane.showMessageDialog(null, "Welcome to the program " + name + "!");
        return name;
    }

    public static Object DisplayMenu()
    {
        Object[] options = {"1) Calculate area of a 2D Rectangle", "2) Calculate volume of a 3D Rectangle", "3) Exit Program"};
        Object choice = JOptionPane.showInputDialog(null, "Select an Option", "Menu", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return choice;
    }

    public static void CalculateArea()
    {
        double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input rectangle length: "));
        double width = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input rectange width: "));

        double area = length * width;

        JOptionPane.showMessageDialog(null, "With a length of " + length + ", and a width of " + width + ", your rectangle has an area of " + area);
    }

    public static void CalculateVolume()
    {
        double length = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input prism length: "));
        double width = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input prism width: "));
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input prism height: "));

        double volume = length * width * height;

        JOptionPane.showMessageDialog(null, "With a length of " + length + ", a width of " + width + ", and a height of " + height + ", your prism has a volume of " + volume);
    }

    public static void Goodbye(String name)
    {
        JOptionPane.showMessageDialog(null, "Goodbye, " + name + "! We hope to see you again :)");
    }
}
