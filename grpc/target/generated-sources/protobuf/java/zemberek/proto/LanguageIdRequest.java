// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language_id.proto

package zemberek.proto;

/**
 * Protobuf type {@code zemberek.langid.LanguageIdRequest}
 */
public  final class LanguageIdRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zemberek.langid.LanguageIdRequest)
    LanguageIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanguageIdRequest.newBuilder() to construct.
  private LanguageIdRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanguageIdRequest() {
    input_ = "";
    maxSampleCount_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LanguageIdRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            input_ = s;
            break;
          }
          case 16: {

            maxSampleCount_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zemberek.proto.LanguageIdRequest.class, zemberek.proto.LanguageIdRequest.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private volatile java.lang.Object input_;
  /**
   * <code>string input = 1;</code>
   */
  public java.lang.String getInput() {
    java.lang.Object ref = input_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      input_ = s;
      return s;
    }
  }
  /**
   * <code>string input = 1;</code>
   */
  public com.google.protobuf.ByteString
      getInputBytes() {
    java.lang.Object ref = input_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      input_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAXSAMPLECOUNT_FIELD_NUMBER = 2;
  private int maxSampleCount_;
  /**
   * <code>int32 maxSampleCount = 2;</code>
   */
  public int getMaxSampleCount() {
    return maxSampleCount_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getInputBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, input_);
    }
    if (maxSampleCount_ != 0) {
      output.writeInt32(2, maxSampleCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInputBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, input_);
    }
    if (maxSampleCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxSampleCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof zemberek.proto.LanguageIdRequest)) {
      return super.equals(obj);
    }
    zemberek.proto.LanguageIdRequest other = (zemberek.proto.LanguageIdRequest) obj;

    boolean result = true;
    result = result && getInput()
        .equals(other.getInput());
    result = result && (getMaxSampleCount()
        == other.getMaxSampleCount());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + INPUT_FIELD_NUMBER;
    hash = (53 * hash) + getInput().hashCode();
    hash = (37 * hash) + MAXSAMPLECOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxSampleCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zemberek.proto.LanguageIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zemberek.proto.LanguageIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.LanguageIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(zemberek.proto.LanguageIdRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code zemberek.langid.LanguageIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zemberek.langid.LanguageIdRequest)
      zemberek.proto.LanguageIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zemberek.proto.LanguageIdRequest.class, zemberek.proto.LanguageIdRequest.Builder.class);
    }

    // Construct using zemberek.proto.LanguageIdRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      input_ = "";

      maxSampleCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zemberek.proto.LanguageId.internal_static_zemberek_langid_LanguageIdRequest_descriptor;
    }

    @java.lang.Override
    public zemberek.proto.LanguageIdRequest getDefaultInstanceForType() {
      return zemberek.proto.LanguageIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public zemberek.proto.LanguageIdRequest build() {
      zemberek.proto.LanguageIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public zemberek.proto.LanguageIdRequest buildPartial() {
      zemberek.proto.LanguageIdRequest result = new zemberek.proto.LanguageIdRequest(this);
      result.input_ = input_;
      result.maxSampleCount_ = maxSampleCount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof zemberek.proto.LanguageIdRequest) {
        return mergeFrom((zemberek.proto.LanguageIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zemberek.proto.LanguageIdRequest other) {
      if (other == zemberek.proto.LanguageIdRequest.getDefaultInstance()) return this;
      if (!other.getInput().isEmpty()) {
        input_ = other.input_;
        onChanged();
      }
      if (other.getMaxSampleCount() != 0) {
        setMaxSampleCount(other.getMaxSampleCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      zemberek.proto.LanguageIdRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zemberek.proto.LanguageIdRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object input_ = "";
    /**
     * <code>string input = 1;</code>
     */
    public java.lang.String getInput() {
      java.lang.Object ref = input_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        input_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string input = 1;</code>
     */
    public com.google.protobuf.ByteString
        getInputBytes() {
      java.lang.Object ref = input_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        input_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string input = 1;</code>
     */
    public Builder setInput(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      input_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string input = 1;</code>
     */
    public Builder clearInput() {
      
      input_ = getDefaultInstance().getInput();
      onChanged();
      return this;
    }
    /**
     * <code>string input = 1;</code>
     */
    public Builder setInputBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      input_ = value;
      onChanged();
      return this;
    }

    private int maxSampleCount_ ;
    /**
     * <code>int32 maxSampleCount = 2;</code>
     */
    public int getMaxSampleCount() {
      return maxSampleCount_;
    }
    /**
     * <code>int32 maxSampleCount = 2;</code>
     */
    public Builder setMaxSampleCount(int value) {
      
      maxSampleCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 maxSampleCount = 2;</code>
     */
    public Builder clearMaxSampleCount() {
      
      maxSampleCount_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:zemberek.langid.LanguageIdRequest)
  }

  // @@protoc_insertion_point(class_scope:zemberek.langid.LanguageIdRequest)
  private static final zemberek.proto.LanguageIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zemberek.proto.LanguageIdRequest();
  }

  public static zemberek.proto.LanguageIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LanguageIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<LanguageIdRequest>() {
    @java.lang.Override
    public LanguageIdRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LanguageIdRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LanguageIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanguageIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public zemberek.proto.LanguageIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

