package main.java.demo;


import javax.crac.Context;
import javax.crac.Core;
import javax.crac.Resource;

public class NamedResource implements Resource {

	public NamedResource() {
		Core.getGlobalContext().register(NamedResource.this);
	}

	@Override
	public void beforeCheckpoint(Context<? extends Resource> context) throws Exception {
		System.out.println("Before Checkpointing");

	}

	@Override
	public void afterRestore(Context<? extends Resource> context) throws Exception {
		System.out.println("After Checkpointing");

	}

	public void printNumber() throws InterruptedException {
		for (int i = 0; i < 100000; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}

	}

}
