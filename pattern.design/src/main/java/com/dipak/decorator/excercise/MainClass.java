package com.dipak.decorator.excercise;

public class MainClass implements Artifact {

	private Artifact artifact;
	
	public MainClass(Artifact artifact) {
		this.artifact = artifact;
	}
	
	@Override
	public void showIcon(String className) {
		addGreenIcon(className);
		artifact.showIcon(className);
	}

	private void addGreenIcon(String className) {
			System.out.println("green icon");		
	}

}
