// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: language_id.proto

package zemberek.proto;

public final class LanguageId {
  private LanguageId() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zemberek_langid_LanguageIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zemberek_langid_LanguageIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_zemberek_langid_LanguageIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_zemberek_langid_LanguageIdResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021language_id.proto\022\017zemberek.langid\":\n\021" +
      "LanguageIdRequest\022\r\n\005input\030\001 \001(\t\022\026\n\016maxS" +
      "ampleCount\030\002 \001(\005\"$\n\022LanguageIdResponse\022\016" +
      "\n\006langId\030\001 \001(\t2\275\001\n\021LanguageIdService\022Q\n\006" +
      "Detect\022\".zemberek.langid.LanguageIdReque" +
      "st\032#.zemberek.langid.LanguageIdResponse\022" +
      "U\n\nDetectFast\022\".zemberek.langid.Language" +
      "IdRequest\032#.zemberek.langid.LanguageIdRe" +
      "sponseB\022\n\016zemberek.protoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_zemberek_langid_LanguageIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_zemberek_langid_LanguageIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zemberek_langid_LanguageIdRequest_descriptor,
        new java.lang.String[] { "Input", "MaxSampleCount", });
    internal_static_zemberek_langid_LanguageIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_zemberek_langid_LanguageIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_zemberek_langid_LanguageIdResponse_descriptor,
        new java.lang.String[] { "LangId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
