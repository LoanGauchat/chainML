// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chainML_service.proto

package com.chainML.pb;

public interface UploadFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chainML.UploadFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chainML.ImageInfo info = 1;</code>
   * @return Whether the info field is set.
   */
  boolean hasInfo();
  /**
   * <code>.chainML.ImageInfo info = 1;</code>
   * @return The info.
   */
  com.chainML.pb.ImageInfo getInfo();
  /**
   * <code>.chainML.ImageInfo info = 1;</code>
   */
  com.chainML.pb.ImageInfoOrBuilder getInfoOrBuilder();

  /**
   * <code>bytes chunk_data = 2;</code>
   * @return The chunkData.
   */
  com.google.protobuf.ByteString getChunkData();

  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   * @return Whether the typeFile field is set.
   */
  boolean hasTypeFile();
  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   * @return The typeFile.
   */
  com.chainML.pb.TypeFile getTypeFile();
  /**
   * <code>.chainML.TypeFile type_file = 3;</code>
   */
  com.chainML.pb.TypeFileOrBuilder getTypeFileOrBuilder();

  public com.chainML.pb.UploadFileRequest.DataCase getDataCase();
}
