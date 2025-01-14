// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: morphology.proto

package zemberek.proto.morphology;

/**
 * <pre>
 * Contains all analyses of a word.
 * </pre>
 *
 * Protobuf type {@code zemberek.morphology.WordAnalysisProto}
 */
public  final class WordAnalysisProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zemberek.morphology.WordAnalysisProto)
    WordAnalysisProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WordAnalysisProto.newBuilder() to construct.
  private WordAnalysisProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WordAnalysisProto() {
    input_ = "";
    analyses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WordAnalysisProto(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              analyses_ = new java.util.ArrayList<zemberek.proto.morphology.SingleAnalysisProto>();
              mutable_bitField0_ |= 0x00000002;
            }
            analyses_.add(
                input.readMessage(zemberek.proto.morphology.SingleAnalysisProto.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        analyses_ = java.util.Collections.unmodifiableList(analyses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return zemberek.proto.morphology.Morphology.internal_static_zemberek_morphology_WordAnalysisProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zemberek.proto.morphology.Morphology.internal_static_zemberek_morphology_WordAnalysisProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zemberek.proto.morphology.WordAnalysisProto.class, zemberek.proto.morphology.WordAnalysisProto.Builder.class);
  }

  private int bitField0_;
  public static final int INPUT_FIELD_NUMBER = 1;
  private volatile java.lang.Object input_;
  /**
   * <pre>
   * input word.
   * </pre>
   *
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
   * <pre>
   * input word.
   * </pre>
   *
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

  public static final int ANALYSES_FIELD_NUMBER = 2;
  private java.util.List<zemberek.proto.morphology.SingleAnalysisProto> analyses_;
  /**
   * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
   */
  public java.util.List<zemberek.proto.morphology.SingleAnalysisProto> getAnalysesList() {
    return analyses_;
  }
  /**
   * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
   */
  public java.util.List<? extends zemberek.proto.morphology.SingleAnalysisProtoOrBuilder> 
      getAnalysesOrBuilderList() {
    return analyses_;
  }
  /**
   * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
   */
  public int getAnalysesCount() {
    return analyses_.size();
  }
  /**
   * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
   */
  public zemberek.proto.morphology.SingleAnalysisProto getAnalyses(int index) {
    return analyses_.get(index);
  }
  /**
   * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
   */
  public zemberek.proto.morphology.SingleAnalysisProtoOrBuilder getAnalysesOrBuilder(
      int index) {
    return analyses_.get(index);
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
    for (int i = 0; i < analyses_.size(); i++) {
      output.writeMessage(2, analyses_.get(i));
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
    for (int i = 0; i < analyses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, analyses_.get(i));
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
    if (!(obj instanceof zemberek.proto.morphology.WordAnalysisProto)) {
      return super.equals(obj);
    }
    zemberek.proto.morphology.WordAnalysisProto other = (zemberek.proto.morphology.WordAnalysisProto) obj;

    boolean result = true;
    result = result && getInput()
        .equals(other.getInput());
    result = result && getAnalysesList()
        .equals(other.getAnalysesList());
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
    if (getAnalysesCount() > 0) {
      hash = (37 * hash) + ANALYSES_FIELD_NUMBER;
      hash = (53 * hash) + getAnalysesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.morphology.WordAnalysisProto parseFrom(
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
  public static Builder newBuilder(zemberek.proto.morphology.WordAnalysisProto prototype) {
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
   * <pre>
   * Contains all analyses of a word.
   * </pre>
   *
   * Protobuf type {@code zemberek.morphology.WordAnalysisProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zemberek.morphology.WordAnalysisProto)
      zemberek.proto.morphology.WordAnalysisProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zemberek.proto.morphology.Morphology.internal_static_zemberek_morphology_WordAnalysisProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zemberek.proto.morphology.Morphology.internal_static_zemberek_morphology_WordAnalysisProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zemberek.proto.morphology.WordAnalysisProto.class, zemberek.proto.morphology.WordAnalysisProto.Builder.class);
    }

    // Construct using zemberek.proto.morphology.WordAnalysisProto.newBuilder()
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
        getAnalysesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      input_ = "";

      if (analysesBuilder_ == null) {
        analyses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        analysesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zemberek.proto.morphology.Morphology.internal_static_zemberek_morphology_WordAnalysisProto_descriptor;
    }

    @java.lang.Override
    public zemberek.proto.morphology.WordAnalysisProto getDefaultInstanceForType() {
      return zemberek.proto.morphology.WordAnalysisProto.getDefaultInstance();
    }

    @java.lang.Override
    public zemberek.proto.morphology.WordAnalysisProto build() {
      zemberek.proto.morphology.WordAnalysisProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public zemberek.proto.morphology.WordAnalysisProto buildPartial() {
      zemberek.proto.morphology.WordAnalysisProto result = new zemberek.proto.morphology.WordAnalysisProto(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.input_ = input_;
      if (analysesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          analyses_ = java.util.Collections.unmodifiableList(analyses_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.analyses_ = analyses_;
      } else {
        result.analyses_ = analysesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof zemberek.proto.morphology.WordAnalysisProto) {
        return mergeFrom((zemberek.proto.morphology.WordAnalysisProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zemberek.proto.morphology.WordAnalysisProto other) {
      if (other == zemberek.proto.morphology.WordAnalysisProto.getDefaultInstance()) return this;
      if (!other.getInput().isEmpty()) {
        input_ = other.input_;
        onChanged();
      }
      if (analysesBuilder_ == null) {
        if (!other.analyses_.isEmpty()) {
          if (analyses_.isEmpty()) {
            analyses_ = other.analyses_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAnalysesIsMutable();
            analyses_.addAll(other.analyses_);
          }
          onChanged();
        }
      } else {
        if (!other.analyses_.isEmpty()) {
          if (analysesBuilder_.isEmpty()) {
            analysesBuilder_.dispose();
            analysesBuilder_ = null;
            analyses_ = other.analyses_;
            bitField0_ = (bitField0_ & ~0x00000002);
            analysesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAnalysesFieldBuilder() : null;
          } else {
            analysesBuilder_.addAllMessages(other.analyses_);
          }
        }
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
      zemberek.proto.morphology.WordAnalysisProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zemberek.proto.morphology.WordAnalysisProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object input_ = "";
    /**
     * <pre>
     * input word.
     * </pre>
     *
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
     * <pre>
     * input word.
     * </pre>
     *
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
     * <pre>
     * input word.
     * </pre>
     *
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
     * <pre>
     * input word.
     * </pre>
     *
     * <code>string input = 1;</code>
     */
    public Builder clearInput() {
      
      input_ = getDefaultInstance().getInput();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * input word.
     * </pre>
     *
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

    private java.util.List<zemberek.proto.morphology.SingleAnalysisProto> analyses_ =
      java.util.Collections.emptyList();
    private void ensureAnalysesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        analyses_ = new java.util.ArrayList<zemberek.proto.morphology.SingleAnalysisProto>(analyses_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        zemberek.proto.morphology.SingleAnalysisProto, zemberek.proto.morphology.SingleAnalysisProto.Builder, zemberek.proto.morphology.SingleAnalysisProtoOrBuilder> analysesBuilder_;

    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public java.util.List<zemberek.proto.morphology.SingleAnalysisProto> getAnalysesList() {
      if (analysesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(analyses_);
      } else {
        return analysesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public int getAnalysesCount() {
      if (analysesBuilder_ == null) {
        return analyses_.size();
      } else {
        return analysesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public zemberek.proto.morphology.SingleAnalysisProto getAnalyses(int index) {
      if (analysesBuilder_ == null) {
        return analyses_.get(index);
      } else {
        return analysesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder setAnalyses(
        int index, zemberek.proto.morphology.SingleAnalysisProto value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.set(index, value);
        onChanged();
      } else {
        analysesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder setAnalyses(
        int index, zemberek.proto.morphology.SingleAnalysisProto.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.set(index, builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder addAnalyses(zemberek.proto.morphology.SingleAnalysisProto value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.add(value);
        onChanged();
      } else {
        analysesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder addAnalyses(
        int index, zemberek.proto.morphology.SingleAnalysisProto value) {
      if (analysesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAnalysesIsMutable();
        analyses_.add(index, value);
        onChanged();
      } else {
        analysesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder addAnalyses(
        zemberek.proto.morphology.SingleAnalysisProto.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.add(builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder addAnalyses(
        int index, zemberek.proto.morphology.SingleAnalysisProto.Builder builderForValue) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.add(index, builderForValue.build());
        onChanged();
      } else {
        analysesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder addAllAnalyses(
        java.lang.Iterable<? extends zemberek.proto.morphology.SingleAnalysisProto> values) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, analyses_);
        onChanged();
      } else {
        analysesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder clearAnalyses() {
      if (analysesBuilder_ == null) {
        analyses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        analysesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public Builder removeAnalyses(int index) {
      if (analysesBuilder_ == null) {
        ensureAnalysesIsMutable();
        analyses_.remove(index);
        onChanged();
      } else {
        analysesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public zemberek.proto.morphology.SingleAnalysisProto.Builder getAnalysesBuilder(
        int index) {
      return getAnalysesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public zemberek.proto.morphology.SingleAnalysisProtoOrBuilder getAnalysesOrBuilder(
        int index) {
      if (analysesBuilder_ == null) {
        return analyses_.get(index);  } else {
        return analysesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public java.util.List<? extends zemberek.proto.morphology.SingleAnalysisProtoOrBuilder> 
         getAnalysesOrBuilderList() {
      if (analysesBuilder_ != null) {
        return analysesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(analyses_);
      }
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public zemberek.proto.morphology.SingleAnalysisProto.Builder addAnalysesBuilder() {
      return getAnalysesFieldBuilder().addBuilder(
          zemberek.proto.morphology.SingleAnalysisProto.getDefaultInstance());
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public zemberek.proto.morphology.SingleAnalysisProto.Builder addAnalysesBuilder(
        int index) {
      return getAnalysesFieldBuilder().addBuilder(
          index, zemberek.proto.morphology.SingleAnalysisProto.getDefaultInstance());
    }
    /**
     * <code>repeated .zemberek.morphology.SingleAnalysisProto analyses = 2;</code>
     */
    public java.util.List<zemberek.proto.morphology.SingleAnalysisProto.Builder> 
         getAnalysesBuilderList() {
      return getAnalysesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        zemberek.proto.morphology.SingleAnalysisProto, zemberek.proto.morphology.SingleAnalysisProto.Builder, zemberek.proto.morphology.SingleAnalysisProtoOrBuilder> 
        getAnalysesFieldBuilder() {
      if (analysesBuilder_ == null) {
        analysesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            zemberek.proto.morphology.SingleAnalysisProto, zemberek.proto.morphology.SingleAnalysisProto.Builder, zemberek.proto.morphology.SingleAnalysisProtoOrBuilder>(
                analyses_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        analyses_ = null;
      }
      return analysesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:zemberek.morphology.WordAnalysisProto)
  }

  // @@protoc_insertion_point(class_scope:zemberek.morphology.WordAnalysisProto)
  private static final zemberek.proto.morphology.WordAnalysisProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zemberek.proto.morphology.WordAnalysisProto();
  }

  public static zemberek.proto.morphology.WordAnalysisProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WordAnalysisProto>
      PARSER = new com.google.protobuf.AbstractParser<WordAnalysisProto>() {
    @java.lang.Override
    public WordAnalysisProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WordAnalysisProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WordAnalysisProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WordAnalysisProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public zemberek.proto.morphology.WordAnalysisProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

