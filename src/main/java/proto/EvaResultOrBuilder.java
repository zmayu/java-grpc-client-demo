// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evamanage.proto

package proto;

public interface EvaResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.EvaResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 Code = 1;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>string Message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string Message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>int64 PrimaryKey = 3;</code>
   * @return The primaryKey.
   */
  long getPrimaryKey();
}
