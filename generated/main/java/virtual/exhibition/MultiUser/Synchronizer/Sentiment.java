// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExampleServices.proto

package virtual.exhibition.MultiUser.Synchronizer;

/**
 * Protobuf enum {@code virtual.exhibition.MultiUser.Synchronizer.Sentiment}
 */
public enum Sentiment
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>HAPPY = 0;</code>
   */
  HAPPY(0),
  /**
   * <code>SLEEPY = 1;</code>
   */
  SLEEPY(1),
  /**
   * <code>ANGRY = 2;</code>
   */
  ANGRY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>HAPPY = 0;</code>
   */
  public static final int HAPPY_VALUE = 0;
  /**
   * <code>SLEEPY = 1;</code>
   */
  public static final int SLEEPY_VALUE = 1;
  /**
   * <code>ANGRY = 2;</code>
   */
  public static final int ANGRY_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Sentiment valueOf(int value) {
    return forNumber(value);
  }

  public static Sentiment forNumber(int value) {
    switch (value) {
      case 0: return HAPPY;
      case 1: return SLEEPY;
      case 2: return ANGRY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Sentiment>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Sentiment> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Sentiment>() {
          public Sentiment findValueByNumber(int number) {
            return Sentiment.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return virtual.exhibition.MultiUser.Synchronizer.ExampleServices.getDescriptor().getEnumTypes().get(0);
  }

  private static final Sentiment[] VALUES = values();

  public static Sentiment valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Sentiment(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:virtual.exhibition.MultiUser.Synchronizer.Sentiment)
}

