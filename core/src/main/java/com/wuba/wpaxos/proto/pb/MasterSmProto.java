// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: masterSmProto.proto

package com.wuba.wpaxos.proto.pb;

public final class MasterSmProto {
  private MasterSmProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface MasterOperatorOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required uint64 nodeid = 1;
    /**
     * <code>required uint64 nodeid = 1;</code>
     */
    boolean hasNodeid();
    /**
     * <code>required uint64 nodeid = 1;</code>
     */
    long getNodeid();

    // required uint64 version = 2;
    /**
     * <code>required uint64 version = 2;</code>
     */
    boolean hasVersion();
    /**
     * <code>required uint64 version = 2;</code>
     */
    long getVersion();

    // required int32 timeout = 3;
    /**
     * <code>required int32 timeout = 3;</code>
     */
    boolean hasTimeout();
    /**
     * <code>required int32 timeout = 3;</code>
     */
    int getTimeout();

    // required uint32 operator = 4;
    /**
     * <code>required uint32 operator = 4;</code>
     */
    boolean hasOperator();
    /**
     * <code>required uint32 operator = 4;</code>
     */
    int getOperator();

    // required uint32 sid = 5;
    /**
     * <code>required uint32 sid = 5;</code>
     */
    boolean hasSid();
    /**
     * <code>required uint32 sid = 5;</code>
     */
    int getSid();

    // optional uint64 lastversion = 6;
    /**
     * <code>optional uint64 lastversion = 6;</code>
     */
    boolean hasLastversion();
    /**
     * <code>optional uint64 lastversion = 6;</code>
     */
    long getLastversion();
  }
  /**
   * Protobuf type {@code com.bj58.spat.wpaxos.proto.MasterOperator}
   */
  public static final class MasterOperator extends
      com.google.protobuf.GeneratedMessage
      implements MasterOperatorOrBuilder {
    // Use MasterOperator.newBuilder() to construct.
    private MasterOperator(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private MasterOperator(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final MasterOperator defaultInstance;
    public static MasterOperator getDefaultInstance() {
      return defaultInstance;
    }

    public MasterOperator getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private MasterOperator(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
 //     int mutable_bitField0_ = 0;
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              nodeid_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              version_ = input.readUInt64();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              timeout_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              operator_ = input.readUInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              sid_ = input.readUInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              lastversion_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wuba.wpaxos.proto.pb.MasterSmProto.internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wuba.wpaxos.proto.pb.MasterSmProto.internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator.class, com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator.Builder.class);
    }

    public static com.google.protobuf.Parser<MasterOperator> PARSER =
        new com.google.protobuf.AbstractParser<MasterOperator>() {
      public MasterOperator parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MasterOperator(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<MasterOperator> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required uint64 nodeid = 1;
    public static final int NODEID_FIELD_NUMBER = 1;
    private long nodeid_;
    /**
     * <code>required uint64 nodeid = 1;</code>
     */
    public boolean hasNodeid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint64 nodeid = 1;</code>
     */
    public long getNodeid() {
      return nodeid_;
    }

    // required uint64 version = 2;
    public static final int VERSION_FIELD_NUMBER = 2;
    private long version_;
    /**
     * <code>required uint64 version = 2;</code>
     */
    public boolean hasVersion() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint64 version = 2;</code>
     */
    public long getVersion() {
      return version_;
    }

    // required int32 timeout = 3;
    public static final int TIMEOUT_FIELD_NUMBER = 3;
    private int timeout_;
    /**
     * <code>required int32 timeout = 3;</code>
     */
    public boolean hasTimeout() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 timeout = 3;</code>
     */
    public int getTimeout() {
      return timeout_;
    }

    // required uint32 operator = 4;
    public static final int OPERATOR_FIELD_NUMBER = 4;
    private int operator_;
    /**
     * <code>required uint32 operator = 4;</code>
     */
    public boolean hasOperator() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required uint32 operator = 4;</code>
     */
    public int getOperator() {
      return operator_;
    }

    // required uint32 sid = 5;
    public static final int SID_FIELD_NUMBER = 5;
    private int sid_;
    /**
     * <code>required uint32 sid = 5;</code>
     */
    public boolean hasSid() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>required uint32 sid = 5;</code>
     */
    public int getSid() {
      return sid_;
    }

    // optional uint64 lastversion = 6;
    public static final int LASTVERSION_FIELD_NUMBER = 6;
    private long lastversion_;
    /**
     * <code>optional uint64 lastversion = 6;</code>
     */
    public boolean hasLastversion() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint64 lastversion = 6;</code>
     */
    public long getLastversion() {
      return lastversion_;
    }

    private void initFields() {
      nodeid_ = 0L;
      version_ = 0L;
      timeout_ = 0;
      operator_ = 0;
      sid_ = 0;
      lastversion_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasNodeid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasTimeout()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasOperator()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasSid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, nodeid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, version_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, timeout_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(4, operator_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeUInt32(5, sid_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeUInt64(6, lastversion_);
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, nodeid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, version_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, timeout_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, operator_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, sid_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(6, lastversion_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.bj58.spat.wpaxos.proto.MasterOperator}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperatorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.wuba.wpaxos.proto.pb.MasterSmProto.internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.wuba.wpaxos.proto.pb.MasterSmProto.internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator.class, com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator.Builder.class);
      }

      // Construct using com.bj58.spat.wpaxos.proto.MasterSmProto.MasterOperator.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        nodeid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        version_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        timeout_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        operator_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        sid_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        lastversion_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.wuba.wpaxos.proto.pb.MasterSmProto.internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_descriptor;
      }

      public com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator getDefaultInstanceForType() {
        return com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator.getDefaultInstance();
      }

      public com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator build() {
        com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator buildPartial() {
        com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator result = new com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.nodeid_ = nodeid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.version_ = version_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.timeout_ = timeout_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.operator_ = operator_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.sid_ = sid_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.lastversion_ = lastversion_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator) {
          return mergeFrom((com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator other) {
        if (other == com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator.getDefaultInstance()) return this;
        if (other.hasNodeid()) {
          setNodeid(other.getNodeid());
        }
        if (other.hasVersion()) {
          setVersion(other.getVersion());
        }
        if (other.hasTimeout()) {
          setTimeout(other.getTimeout());
        }
        if (other.hasOperator()) {
          setOperator(other.getOperator());
        }
        if (other.hasSid()) {
          setSid(other.getSid());
        }
        if (other.hasLastversion()) {
          setLastversion(other.getLastversion());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasNodeid()) {
          
          return false;
        }
        if (!hasVersion()) {
          
          return false;
        }
        if (!hasTimeout()) {
          
          return false;
        }
        if (!hasOperator()) {
          
          return false;
        }
        if (!hasSid()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.wuba.wpaxos.proto.pb.MasterSmProto.MasterOperator) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required uint64 nodeid = 1;
      private long nodeid_ ;
      /**
       * <code>required uint64 nodeid = 1;</code>
       */
      public boolean hasNodeid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint64 nodeid = 1;</code>
       */
      public long getNodeid() {
        return nodeid_;
      }
      /**
       * <code>required uint64 nodeid = 1;</code>
       */
      public Builder setNodeid(long value) {
        bitField0_ |= 0x00000001;
        nodeid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 nodeid = 1;</code>
       */
      public Builder clearNodeid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        nodeid_ = 0L;
        onChanged();
        return this;
      }

      // required uint64 version = 2;
      private long version_ ;
      /**
       * <code>required uint64 version = 2;</code>
       */
      public boolean hasVersion() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint64 version = 2;</code>
       */
      public long getVersion() {
        return version_;
      }
      /**
       * <code>required uint64 version = 2;</code>
       */
      public Builder setVersion(long value) {
        bitField0_ |= 0x00000002;
        version_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint64 version = 2;</code>
       */
      public Builder clearVersion() {
        bitField0_ = (bitField0_ & ~0x00000002);
        version_ = 0L;
        onChanged();
        return this;
      }

      // required int32 timeout = 3;
      private int timeout_ ;
      /**
       * <code>required int32 timeout = 3;</code>
       */
      public boolean hasTimeout() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 timeout = 3;</code>
       */
      public int getTimeout() {
        return timeout_;
      }
      /**
       * <code>required int32 timeout = 3;</code>
       */
      public Builder setTimeout(int value) {
        bitField0_ |= 0x00000004;
        timeout_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 timeout = 3;</code>
       */
      public Builder clearTimeout() {
        bitField0_ = (bitField0_ & ~0x00000004);
        timeout_ = 0;
        onChanged();
        return this;
      }

      // required uint32 operator = 4;
      private int operator_ ;
      /**
       * <code>required uint32 operator = 4;</code>
       */
      public boolean hasOperator() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required uint32 operator = 4;</code>
       */
      public int getOperator() {
        return operator_;
      }
      /**
       * <code>required uint32 operator = 4;</code>
       */
      public Builder setOperator(int value) {
        bitField0_ |= 0x00000008;
        operator_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 operator = 4;</code>
       */
      public Builder clearOperator() {
        bitField0_ = (bitField0_ & ~0x00000008);
        operator_ = 0;
        onChanged();
        return this;
      }

      // required uint32 sid = 5;
      private int sid_ ;
      /**
       * <code>required uint32 sid = 5;</code>
       */
      public boolean hasSid() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>required uint32 sid = 5;</code>
       */
      public int getSid() {
        return sid_;
      }
      /**
       * <code>required uint32 sid = 5;</code>
       */
      public Builder setSid(int value) {
        bitField0_ |= 0x00000010;
        sid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 sid = 5;</code>
       */
      public Builder clearSid() {
        bitField0_ = (bitField0_ & ~0x00000010);
        sid_ = 0;
        onChanged();
        return this;
      }

      // optional uint64 lastversion = 6;
      private long lastversion_ ;
      /**
       * <code>optional uint64 lastversion = 6;</code>
       */
      public boolean hasLastversion() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      /**
       * <code>optional uint64 lastversion = 6;</code>
       */
      public long getLastversion() {
        return lastversion_;
      }
      /**
       * <code>optional uint64 lastversion = 6;</code>
       */
      public Builder setLastversion(long value) {
        bitField0_ |= 0x00000020;
        lastversion_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional uint64 lastversion = 6;</code>
       */
      public Builder clearLastversion() {
        bitField0_ = (bitField0_ & ~0x00000020);
        lastversion_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.bj58.spat.wpaxos.proto.MasterOperator)
    }

    static {
      defaultInstance = new MasterOperator(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.bj58.spat.wpaxos.proto.MasterOperator)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023masterSmProto.proto\022\032com.bj58.spat.wpa" +
      "xos.proto\"v\n\016MasterOperator\022\016\n\006nodeid\030\001 " +
      "\002(\004\022\017\n\007version\030\002 \002(\004\022\017\n\007timeout\030\003 \002(\005\022\020\n" +
      "\010operator\030\004 \002(\r\022\013\n\003sid\030\005 \002(\r\022\023\n\013lastvers" +
      "ion\030\006 \001(\004"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_bj58_spat_wpaxos_proto_MasterOperator_descriptor,
              new java.lang.String[] { "Nodeid", "Version", "Timeout", "Operator", "Sid", "Lastversion", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}