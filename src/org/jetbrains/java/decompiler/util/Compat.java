package org.jetbrains.java.decompiler.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Compat {

  public static String repeat(String toRepeat, int amount) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < amount; i++) builder.append(toRepeat);
    return builder.toString();
  }

  @SuppressWarnings("unchecked")
  public static <T, U> Map<T, U> mapOf(Object... objs) {
    Map<T, U> ret = new HashMap<>();
    for (int i = 0; i < objs.length; i += 2) {
      ret.put((T) objs[i], (U) objs[i + 1]);
    }
    return ret;
  }

  @SuppressWarnings("unchecked")
  public static <T> Set<T> setOf(T... objs) {
    return new HashSet<>(Arrays.asList(objs));
  }

  @SuppressWarnings("unchecked")
  public static <T> List<T> copyOf(List<T> list) {
    return (List<T>) Arrays.asList(list.toArray());
  }

  public static class VarReference<T> {

    public T obj;

    public VarReference(T obj) {
      this.obj = obj;
    }

  }

  private Compat() {
    throw new UnsupportedOperationException();
  }

}