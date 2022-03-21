// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evamanage.proto

package proto;

public interface EvaLogConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.EvaLogCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 开始时间
   * </pre>
   *
   * <code>string StartTime = 1;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * 开始时间
   * </pre>
   *
   * <code>string StartTime = 1;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * 结束时间
   * </pre>
   *
   * <code>string EndTime = 2;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <pre>
   * 结束时间
   * </pre>
   *
   * <code>string EndTime = 2;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <pre>
   * 当前第几页
   * </pre>
   *
   * <code>int32 PageIndex = 3;</code>
   * @return The pageIndex.
   */
  int getPageIndex();

  /**
   * <pre>
   * 每页大小
   * </pre>
   *
   * <code>int32 PageSize = 4;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   *评价员工的name
   * </pre>
   *
   * <code>string StaffName = 5;</code>
   * @return The staffName.
   */
  java.lang.String getStaffName();
  /**
   * <pre>
   *评价员工的name
   * </pre>
   *
   * <code>string StaffName = 5;</code>
   * @return The bytes for staffName.
   */
  com.google.protobuf.ByteString
      getStaffNameBytes();

  /**
   * <pre>
   *系统编号
   * </pre>
   *
   * <code>string SystemCode = 6;</code>
   * @return The systemCode.
   */
  java.lang.String getSystemCode();
  /**
   * <pre>
   *系统编号
   * </pre>
   *
   * <code>string SystemCode = 6;</code>
   * @return The bytes for systemCode.
   */
  com.google.protobuf.ByteString
      getSystemCodeBytes();

  /**
   * <pre>
   * 用户日志类型 0:查询所有 1：用户登录日志   2：用户登出日志
   * </pre>
   *
   * <code>int32 Type = 7;</code>
   * @return The type.
   */
  int getType();
}
