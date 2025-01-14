// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: preprocess.proto

package zemberek.proto;

/**
 * Protobuf type {@code zemberek.preprocessor.SentenceExtractionResponse}
 */
public  final class SentenceExtractionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:zemberek.preprocessor.SentenceExtractionResponse)
    SentenceExtractionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SentenceExtractionResponse.newBuilder() to construct.
  private SentenceExtractionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SentenceExtractionResponse() {
    sentences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SentenceExtractionResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              sentences_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            sentences_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        sentences_ = sentences_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            zemberek.proto.SentenceExtractionResponse.class, zemberek.proto.SentenceExtractionResponse.Builder.class);
  }

  public static final int SENTENCES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList sentences_;
  /**
   * <code>repeated string sentences = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getSentencesList() {
    return sentences_;
  }
  /**
   * <code>repeated string sentences = 1;</code>
   */
  public int getSentencesCount() {
    return sentences_.size();
  }
  /**
   * <code>repeated string sentences = 1;</code>
   */
  public java.lang.String getSentences(int index) {
    return sentences_.get(index);
  }
  /**
   * <code>repeated string sentences = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSentencesBytes(int index) {
    return sentences_.getByteString(index);
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
    for (int i = 0; i < sentences_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sentences_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < sentences_.size(); i++) {
        dataSize += computeStringSizeNoTag(sentences_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSentencesList().size();
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
    if (!(obj instanceof zemberek.proto.SentenceExtractionResponse)) {
      return super.equals(obj);
    }
    zemberek.proto.SentenceExtractionResponse other = (zemberek.proto.SentenceExtractionResponse) obj;

    boolean result = true;
    result = result && getSentencesList()
        .equals(other.getSentencesList());
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
    if (getSentencesCount() > 0) {
      hash = (37 * hash) + SENTENCES_FIELD_NUMBER;
      hash = (53 * hash) + getSentencesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static zemberek.proto.SentenceExtractionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static zemberek.proto.SentenceExtractionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static zemberek.proto.SentenceExtractionResponse parseFrom(
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
  public static Builder newBuilder(zemberek.proto.SentenceExtractionResponse prototype) {
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
   * Protobuf type {@code zemberek.preprocessor.SentenceExtractionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:zemberek.preprocessor.SentenceExtractionResponse)
      zemberek.proto.SentenceExtractionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              zemberek.proto.SentenceExtractionResponse.class, zemberek.proto.SentenceExtractionResponse.Builder.class);
    }

    // Construct using zemberek.proto.SentenceExtractionResponse.newBuilder()
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
      sentences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return zemberek.proto.Preprocess.internal_static_zemberek_preprocessor_SentenceExtractionResponse_descriptor;
    }

    @java.lang.Override
    public zemberek.proto.SentenceExtractionResponse getDefaultInstanceForType() {
      return zemberek.proto.SentenceExtractionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public zemberek.proto.SentenceExtractionResponse build() {
      zemberek.proto.SentenceExtractionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public zemberek.proto.SentenceExtractionResponse buildPartial() {
      zemberek.proto.SentenceExtractionResponse result = new zemberek.proto.SentenceExtractionResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        sentences_ = sentences_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.sentences_ = sentences_;
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
      if (other instanceof zemberek.proto.SentenceExtractionResponse) {
        return mergeFrom((zemberek.proto.SentenceExtractionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(zemberek.proto.SentenceExtractionResponse other) {
      if (other == zemberek.proto.SentenceExtractionResponse.getDefaultInstance()) return this;
      if (!other.sentences_.isEmpty()) {
        if (sentences_.isEmpty()) {
          sentences_ = other.sentences_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureSentencesIsMutable();
          sentences_.addAll(other.sentences_);
        }
        onChanged();
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
      zemberek.proto.SentenceExtractionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (zemberek.proto.SentenceExtractionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList sentences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureSentencesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        sentences_ = new com.google.protobuf.LazyStringArrayList(sentences_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getSentencesList() {
      return sentences_.getUnmodifiableView();
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public int getSentencesCount() {
      return sentences_.size();
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public java.lang.String getSentences(int index) {
      return sentences_.get(index);
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSentencesBytes(int index) {
      return sentences_.getByteString(index);
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public Builder setSentences(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSentencesIsMutable();
      sentences_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public Builder addSentences(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureSentencesIsMutable();
      sentences_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public Builder addAllSentences(
        java.lang.Iterable<java.lang.String> values) {
      ensureSentencesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, sentences_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public Builder clearSentences() {
      sentences_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string sentences = 1;</code>
     */
    public Builder addSentencesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureSentencesIsMutable();
      sentences_.add(value);
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


    // @@protoc_insertion_point(builder_scope:zemberek.preprocessor.SentenceExtractionResponse)
  }

  // @@protoc_insertion_point(class_scope:zemberek.preprocessor.SentenceExtractionResponse)
  private static final zemberek.proto.SentenceExtractionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new zemberek.proto.SentenceExtractionResponse();
  }

  public static zemberek.proto.SentenceExtractionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SentenceExtractionResponse>
      PARSER = new com.google.protobuf.AbstractParser<SentenceExtractionResponse>() {
    @java.lang.Override
    public SentenceExtractionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SentenceExtractionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SentenceExtractionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SentenceExtractionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public zemberek.proto.SentenceExtractionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

