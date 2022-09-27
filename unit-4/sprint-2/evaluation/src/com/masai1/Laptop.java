package com.masai1;

public class Laptop {
	private String color;
	private String companyName;
	private String name;
	private String purpose;
	private CPU cpu;
	private GraphicCard graphicCard;

	public void displayDetails() {
		if (purpose == "gaming") {
			this.color = "Black";
			this.companyName = "Radeon";
			this.name = "Acer";
			this.purpose = "gaming";
			cpu.setManufacturer("Radeon");
			cpu.setProcessor("Ryzen 9 5800H");
			cpu.setClockSpeed(3200.0);
			graphicCard.setManufacturer("Radeon");
			graphicCard.setSeries("RTX 3050 Ti");
			graphicCard.setCapcity("16GB");

			printDetails();
		} else if (purpose == "business") {
			this.color = "Rose Gold";
			this.companyName = "HP";
			this.name = "Aero 13";
			this.purpose = "business";
			cpu.setManufacturer("Intel");
			cpu.setProcessor("i5 10210U");
			cpu.setClockSpeed(1800.0);
			graphicCard.setManufacturer("Intel");
			graphicCard.setSeries("Iris Xe");
			graphicCard.setCapcity("Integrated");

			printDetails();
		}

	}

	public void printDetails() {
		System.out.println("Laptop Details");
		System.out.println("==============");
		System.out.println("Laptop Name => " + this.name);
		System.out.println("Company name => " + this.companyName);
		System.out.println("Laptop Color => " + this.color);
		System.out.println("Laptop Purpose => " + this.purpose);
		System.out.println("Cpu's Manufacturer => " + cpu.getManufacturer());
		System.out.println("Cpu's Processor => " + cpu.getProcessor());
		System.out.println("Cpu's ClockSpeed => " + cpu.getClockSpeed());
		System.out.println("Graphic card's Manufacturer => " + graphicCard.getManufacturer());
		System.out.println("Graphic card's Series => " + graphicCard.getSeries());
		System.out.println("Graphic card's Capacity => " + graphicCard.getCapcity());
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public GraphicCard getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(GraphicCard graphicCard) {
		this.graphicCard = graphicCard;
	}

}
