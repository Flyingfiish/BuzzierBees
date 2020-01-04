package com.bagel.buzzierbees.common.blocks.Piston;

import net.minecraft.util.IStringSerializable;

public enum AdvancedPistonType implements IStringSerializable {
	   DEFAULT("normal"),
	   SLIMY("slimy"),
	   HONEY("sticky");

	   private final String name;

	   private AdvancedPistonType(String name) {
	      this.name = name;
	   }

	   public String toString() {
	      return this.name;
	   }

	   public String getName() {
	      return this.name;
	   }
	}