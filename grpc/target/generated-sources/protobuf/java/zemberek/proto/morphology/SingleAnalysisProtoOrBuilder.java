// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: morphology.proto

package zemberek.proto.morphology;

public interface SingleAnalysisProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:zemberek.morphology.SingleAnalysisProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Defines the POS of the whole word.
   * </pre>
   *
   * <code>string pos = 1;</code>
   */
  java.lang.String getPos();
  /**
   * <pre>
   * Defines the POS of the whole word.
   * </pre>
   *
   * <code>string pos = 1;</code>
   */
  com.google.protobuf.ByteString
      getPosBytes();

  /**
   * <pre>
   * root word's dictionary information (contains lemma and pos values.)
   * </pre>
   *
   * <code>.zemberek.morphology.DictionaryItemProto dictionaryItem = 2;</code>
   */
  boolean hasDictionaryItem();
  /**
   * <pre>
   * root word's dictionary information (contains lemma and pos values.)
   * </pre>
   *
   * <code>.zemberek.morphology.DictionaryItemProto dictionaryItem = 2;</code>
   */
  zemberek.proto.morphology.DictionaryItemProto getDictionaryItem();
  /**
   * <pre>
   * root word's dictionary information (contains lemma and pos values.)
   * </pre>
   *
   * <code>.zemberek.morphology.DictionaryItemProto dictionaryItem = 2;</code>
   */
  zemberek.proto.morphology.DictionaryItemProtoOrBuilder getDictionaryItemOrBuilder();

  /**
   * <pre>
   * This is the long formatted analysis string.
   * </pre>
   *
   * <code>string analysis = 3;</code>
   */
  java.lang.String getAnalysis();
  /**
   * <pre>
   * This is the long formatted analysis string.
   * </pre>
   *
   * <code>string analysis = 3;</code>
   */
  com.google.protobuf.ByteString
      getAnalysisBytes();

  /**
   * <pre>
   * [true] if this analysis contain informal morphemes.
   * </pre>
   *
   * <code>bool informal = 4;</code>
   */
  boolean getInformal();

  /**
   * <pre>
   * [true] if this root form of the input does not exist in dictionary.
   * </pre>
   *
   * <code>bool runtime = 5;</code>
   */
  boolean getRuntime();

  /**
   * <pre>
   * all lemma values. Such as for input "kapattırdım" -&gt; ["kapat","kapattır"]
   * </pre>
   *
   * <code>repeated string lemmas = 6;</code>
   */
  java.util.List<java.lang.String>
      getLemmasList();
  /**
   * <pre>
   * all lemma values. Such as for input "kapattırdım" -&gt; ["kapat","kapattır"]
   * </pre>
   *
   * <code>repeated string lemmas = 6;</code>
   */
  int getLemmasCount();
  /**
   * <pre>
   * all lemma values. Such as for input "kapattırdım" -&gt; ["kapat","kapattır"]
   * </pre>
   *
   * <code>repeated string lemmas = 6;</code>
   */
  java.lang.String getLemmas(int index);
  /**
   * <pre>
   * all lemma values. Such as for input "kapattırdım" -&gt; ["kapat","kapattır"]
   * </pre>
   *
   * <code>repeated string lemmas = 6;</code>
   */
  com.google.protobuf.ByteString
      getLemmasBytes(int index);

  /**
   * <pre>
   * all morpheme information.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.MorphemeDataProto morphemes = 7;</code>
   */
  java.util.List<zemberek.proto.morphology.MorphemeDataProto> 
      getMorphemesList();
  /**
   * <pre>
   * all morpheme information.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.MorphemeDataProto morphemes = 7;</code>
   */
  zemberek.proto.morphology.MorphemeDataProto getMorphemes(int index);
  /**
   * <pre>
   * all morpheme information.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.MorphemeDataProto morphemes = 7;</code>
   */
  int getMorphemesCount();
  /**
   * <pre>
   * all morpheme information.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.MorphemeDataProto morphemes = 7;</code>
   */
  java.util.List<? extends zemberek.proto.morphology.MorphemeDataProtoOrBuilder> 
      getMorphemesOrBuilderList();
  /**
   * <pre>
   * all morpheme information.
   * </pre>
   *
   * <code>repeated .zemberek.morphology.MorphemeDataProto morphemes = 7;</code>
   */
  zemberek.proto.morphology.MorphemeDataProtoOrBuilder getMorphemesOrBuilder(
      int index);
}
