// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/firestore/v1/firestore.proto

package com.google.firestore.v1;

public interface CreateDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.firestore.v1.CreateDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The parent resource. For example:
   * `projects/{project_id}/databases/{database_id}/documents` or
   * `projects/{project_id}/databases/{database_id}/documents/chatrooms/{chatroom_id}`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The parent resource. For example:
   * `projects/{project_id}/databases/{database_id}/documents` or
   * `projects/{project_id}/databases/{database_id}/documents/chatrooms/{chatroom_id}`
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The collection ID, relative to `parent`, to list. For example: `chatrooms`.
   * </pre>
   *
   * <code>string collection_id = 2;</code>
   */
  java.lang.String getCollectionId();
  /**
   *
   *
   * <pre>
   * The collection ID, relative to `parent`, to list. For example: `chatrooms`.
   * </pre>
   *
   * <code>string collection_id = 2;</code>
   */
  com.google.protobuf.ByteString getCollectionIdBytes();

  /**
   *
   *
   * <pre>
   * The client-assigned document ID to use for this document.
   * Optional. If not specified, an ID will be assigned by the service.
   * </pre>
   *
   * <code>string document_id = 3;</code>
   */
  java.lang.String getDocumentId();
  /**
   *
   *
   * <pre>
   * The client-assigned document ID to use for this document.
   * Optional. If not specified, an ID will be assigned by the service.
   * </pre>
   *
   * <code>string document_id = 3;</code>
   */
  com.google.protobuf.ByteString getDocumentIdBytes();

  /**
   *
   *
   * <pre>
   * The document to create. `name` must not be set.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 4;</code>
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * The document to create. `name` must not be set.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 4;</code>
   */
  com.google.firestore.v1.Document getDocument();
  /**
   *
   *
   * <pre>
   * The document to create. `name` must not be set.
   * </pre>
   *
   * <code>.google.firestore.v1.Document document = 4;</code>
   */
  com.google.firestore.v1.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If the document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 5;</code>
   */
  boolean hasMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If the document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 5;</code>
   */
  com.google.firestore.v1.DocumentMask getMask();
  /**
   *
   *
   * <pre>
   * The fields to return. If not set, returns all fields.
   * If the document has a field that is not present in this mask, that field
   * will not be returned in the response.
   * </pre>
   *
   * <code>.google.firestore.v1.DocumentMask mask = 5;</code>
   */
  com.google.firestore.v1.DocumentMaskOrBuilder getMaskOrBuilder();
}