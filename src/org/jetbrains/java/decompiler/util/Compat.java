package org.jetbrains.java.decompiler.util;

public final class Compat {

  public static String repeat(String toRepeat, int amount) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < amount; i++) builder.append(toRepeat);
    return builder.toString();
  }

  private Compat() {
    throw new UnsupportedOperationException();
  }

}