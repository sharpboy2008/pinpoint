/**
 * Autogenerated by Thrift Compiler (0.8.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.profiler.common.dto.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AgentInfo implements org.apache.thrift.TBase<AgentInfo, AgentInfo._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AgentInfo");

  private static final org.apache.thrift.protocol.TField HOSTNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("hostname", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField IP_FIELD_DESC = new org.apache.thrift.protocol.TField("ip", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PORTS_FIELD_DESC = new org.apache.thrift.protocol.TField("ports", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField AGENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("agentId", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField APPLICATION_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("applicationName", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField SERVICE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("serviceType", org.apache.thrift.protocol.TType.I16, (short)6);
  private static final org.apache.thrift.protocol.TField IS_ALIVE_FIELD_DESC = new org.apache.thrift.protocol.TField("isAlive", org.apache.thrift.protocol.TType.BOOL, (short)7);
  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)8);
  private static final org.apache.thrift.protocol.TField IDENTIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("identifier", org.apache.thrift.protocol.TType.I16, (short)9);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AgentInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AgentInfoTupleSchemeFactory());
  }

  private String hostname; // required
  private String ip; // required
  private String ports; // required
  private String agentId; // required
  private String applicationName; // required
  private short serviceType; // required
  private boolean isAlive; // required
  private long timestamp; // required
  private short identifier; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOSTNAME((short)1, "hostname"),
    IP((short)2, "ip"),
    PORTS((short)3, "ports"),
    AGENT_ID((short)4, "agentId"),
    APPLICATION_NAME((short)5, "applicationName"),
    SERVICE_TYPE((short)6, "serviceType"),
    IS_ALIVE((short)7, "isAlive"),
    TIMESTAMP((short)8, "timestamp"),
    IDENTIFIER((short)9, "identifier");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // HOSTNAME
          return HOSTNAME;
        case 2: // IP
          return IP;
        case 3: // PORTS
          return PORTS;
        case 4: // AGENT_ID
          return AGENT_ID;
        case 5: // APPLICATION_NAME
          return APPLICATION_NAME;
        case 6: // SERVICE_TYPE
          return SERVICE_TYPE;
        case 7: // IS_ALIVE
          return IS_ALIVE;
        case 8: // TIMESTAMP
          return TIMESTAMP;
        case 9: // IDENTIFIER
          return IDENTIFIER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __SERVICETYPE_ISSET_ID = 0;
  private static final int __ISALIVE_ISSET_ID = 1;
  private static final int __TIMESTAMP_ISSET_ID = 2;
  private static final int __IDENTIFIER_ISSET_ID = 3;
  private BitSet __isset_bit_vector = new BitSet(4);
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOSTNAME, new org.apache.thrift.meta_data.FieldMetaData("hostname", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IP, new org.apache.thrift.meta_data.FieldMetaData("ip", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PORTS, new org.apache.thrift.meta_data.FieldMetaData("ports", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AGENT_ID, new org.apache.thrift.meta_data.FieldMetaData("agentId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.APPLICATION_NAME, new org.apache.thrift.meta_data.FieldMetaData("applicationName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SERVICE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("serviceType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.IS_ALIVE, new org.apache.thrift.meta_data.FieldMetaData("isAlive", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IDENTIFIER, new org.apache.thrift.meta_data.FieldMetaData("identifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AgentInfo.class, metaDataMap);
  }

  public AgentInfo() {
  }

  public AgentInfo(
    String hostname,
    String ip,
    String ports,
    String agentId,
    String applicationName,
    short serviceType,
    boolean isAlive,
    long timestamp,
    short identifier)
  {
    this();
    this.hostname = hostname;
    this.ip = ip;
    this.ports = ports;
    this.agentId = agentId;
    this.applicationName = applicationName;
    this.serviceType = serviceType;
    setServiceTypeIsSet(true);
    this.isAlive = isAlive;
    setIsAliveIsSet(true);
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.identifier = identifier;
    setIdentifierIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AgentInfo(AgentInfo other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetHostname()) {
      this.hostname = other.hostname;
    }
    if (other.isSetIp()) {
      this.ip = other.ip;
    }
    if (other.isSetPorts()) {
      this.ports = other.ports;
    }
    if (other.isSetAgentId()) {
      this.agentId = other.agentId;
    }
    if (other.isSetApplicationName()) {
      this.applicationName = other.applicationName;
    }
    this.serviceType = other.serviceType;
    this.isAlive = other.isAlive;
    this.timestamp = other.timestamp;
    this.identifier = other.identifier;
  }

  public AgentInfo deepCopy() {
    return new AgentInfo(this);
  }

  @Override
  public void clear() {
    this.hostname = null;
    this.ip = null;
    this.ports = null;
    this.agentId = null;
    this.applicationName = null;
    setServiceTypeIsSet(false);
    this.serviceType = 0;
    setIsAliveIsSet(false);
    this.isAlive = false;
    setTimestampIsSet(false);
    this.timestamp = 0;
    setIdentifierIsSet(false);
    this.identifier = 0;
  }

  public String getHostname() {
    return this.hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public void unsetHostname() {
    this.hostname = null;
  }

  /** Returns true if field hostname is set (has been assigned a value) and false otherwise */
  public boolean isSetHostname() {
    return this.hostname != null;
  }

  public void setHostnameIsSet(boolean value) {
    if (!value) {
      this.hostname = null;
    }
  }

  public String getIp() {
    return this.ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public void unsetIp() {
    this.ip = null;
  }

  /** Returns true if field ip is set (has been assigned a value) and false otherwise */
  public boolean isSetIp() {
    return this.ip != null;
  }

  public void setIpIsSet(boolean value) {
    if (!value) {
      this.ip = null;
    }
  }

  public String getPorts() {
    return this.ports;
  }

  public void setPorts(String ports) {
    this.ports = ports;
  }

  public void unsetPorts() {
    this.ports = null;
  }

  /** Returns true if field ports is set (has been assigned a value) and false otherwise */
  public boolean isSetPorts() {
    return this.ports != null;
  }

  public void setPortsIsSet(boolean value) {
    if (!value) {
      this.ports = null;
    }
  }

  public String getAgentId() {
    return this.agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public void unsetAgentId() {
    this.agentId = null;
  }

  /** Returns true if field agentId is set (has been assigned a value) and false otherwise */
  public boolean isSetAgentId() {
    return this.agentId != null;
  }

  public void setAgentIdIsSet(boolean value) {
    if (!value) {
      this.agentId = null;
    }
  }

  public String getApplicationName() {
    return this.applicationName;
  }

  public void setApplicationName(String applicationName) {
    this.applicationName = applicationName;
  }

  public void unsetApplicationName() {
    this.applicationName = null;
  }

  /** Returns true if field applicationName is set (has been assigned a value) and false otherwise */
  public boolean isSetApplicationName() {
    return this.applicationName != null;
  }

  public void setApplicationNameIsSet(boolean value) {
    if (!value) {
      this.applicationName = null;
    }
  }

  public short getServiceType() {
    return this.serviceType;
  }

  public void setServiceType(short serviceType) {
    this.serviceType = serviceType;
    setServiceTypeIsSet(true);
  }

  public void unsetServiceType() {
    __isset_bit_vector.clear(__SERVICETYPE_ISSET_ID);
  }

  /** Returns true if field serviceType is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceType() {
    return __isset_bit_vector.get(__SERVICETYPE_ISSET_ID);
  }

  public void setServiceTypeIsSet(boolean value) {
    __isset_bit_vector.set(__SERVICETYPE_ISSET_ID, value);
  }

  public boolean isIsAlive() {
    return this.isAlive;
  }

  public void setIsAlive(boolean isAlive) {
    this.isAlive = isAlive;
    setIsAliveIsSet(true);
  }

  public void unsetIsAlive() {
    __isset_bit_vector.clear(__ISALIVE_ISSET_ID);
  }

  /** Returns true if field isAlive is set (has been assigned a value) and false otherwise */
  public boolean isSetIsAlive() {
    return __isset_bit_vector.get(__ISALIVE_ISSET_ID);
  }

  public void setIsAliveIsSet(boolean value) {
    __isset_bit_vector.set(__ISALIVE_ISSET_ID, value);
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public void setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
  }

  public void unsetTimestamp() {
    __isset_bit_vector.clear(__TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return __isset_bit_vector.get(__TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bit_vector.set(__TIMESTAMP_ISSET_ID, value);
  }

  public short getIdentifier() {
    return this.identifier;
  }

  public void setIdentifier(short identifier) {
    this.identifier = identifier;
    setIdentifierIsSet(true);
  }

  public void unsetIdentifier() {
    __isset_bit_vector.clear(__IDENTIFIER_ISSET_ID);
  }

  /** Returns true if field identifier is set (has been assigned a value) and false otherwise */
  public boolean isSetIdentifier() {
    return __isset_bit_vector.get(__IDENTIFIER_ISSET_ID);
  }

  public void setIdentifierIsSet(boolean value) {
    __isset_bit_vector.set(__IDENTIFIER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HOSTNAME:
      if (value == null) {
        unsetHostname();
      } else {
        setHostname((String)value);
      }
      break;

    case IP:
      if (value == null) {
        unsetIp();
      } else {
        setIp((String)value);
      }
      break;

    case PORTS:
      if (value == null) {
        unsetPorts();
      } else {
        setPorts((String)value);
      }
      break;

    case AGENT_ID:
      if (value == null) {
        unsetAgentId();
      } else {
        setAgentId((String)value);
      }
      break;

    case APPLICATION_NAME:
      if (value == null) {
        unsetApplicationName();
      } else {
        setApplicationName((String)value);
      }
      break;

    case SERVICE_TYPE:
      if (value == null) {
        unsetServiceType();
      } else {
        setServiceType((Short)value);
      }
      break;

    case IS_ALIVE:
      if (value == null) {
        unsetIsAlive();
      } else {
        setIsAlive((Boolean)value);
      }
      break;

    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case IDENTIFIER:
      if (value == null) {
        unsetIdentifier();
      } else {
        setIdentifier((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HOSTNAME:
      return getHostname();

    case IP:
      return getIp();

    case PORTS:
      return getPorts();

    case AGENT_ID:
      return getAgentId();

    case APPLICATION_NAME:
      return getApplicationName();

    case SERVICE_TYPE:
      return Short.valueOf(getServiceType());

    case IS_ALIVE:
      return Boolean.valueOf(isIsAlive());

    case TIMESTAMP:
      return Long.valueOf(getTimestamp());

    case IDENTIFIER:
      return Short.valueOf(getIdentifier());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HOSTNAME:
      return isSetHostname();
    case IP:
      return isSetIp();
    case PORTS:
      return isSetPorts();
    case AGENT_ID:
      return isSetAgentId();
    case APPLICATION_NAME:
      return isSetApplicationName();
    case SERVICE_TYPE:
      return isSetServiceType();
    case IS_ALIVE:
      return isSetIsAlive();
    case TIMESTAMP:
      return isSetTimestamp();
    case IDENTIFIER:
      return isSetIdentifier();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AgentInfo)
      return this.equals((AgentInfo)that);
    return false;
  }

  public boolean equals(AgentInfo that) {
    if (that == null)
      return false;

    boolean this_present_hostname = true && this.isSetHostname();
    boolean that_present_hostname = true && that.isSetHostname();
    if (this_present_hostname || that_present_hostname) {
      if (!(this_present_hostname && that_present_hostname))
        return false;
      if (!this.hostname.equals(that.hostname))
        return false;
    }

    boolean this_present_ip = true && this.isSetIp();
    boolean that_present_ip = true && that.isSetIp();
    if (this_present_ip || that_present_ip) {
      if (!(this_present_ip && that_present_ip))
        return false;
      if (!this.ip.equals(that.ip))
        return false;
    }

    boolean this_present_ports = true && this.isSetPorts();
    boolean that_present_ports = true && that.isSetPorts();
    if (this_present_ports || that_present_ports) {
      if (!(this_present_ports && that_present_ports))
        return false;
      if (!this.ports.equals(that.ports))
        return false;
    }

    boolean this_present_agentId = true && this.isSetAgentId();
    boolean that_present_agentId = true && that.isSetAgentId();
    if (this_present_agentId || that_present_agentId) {
      if (!(this_present_agentId && that_present_agentId))
        return false;
      if (!this.agentId.equals(that.agentId))
        return false;
    }

    boolean this_present_applicationName = true && this.isSetApplicationName();
    boolean that_present_applicationName = true && that.isSetApplicationName();
    if (this_present_applicationName || that_present_applicationName) {
      if (!(this_present_applicationName && that_present_applicationName))
        return false;
      if (!this.applicationName.equals(that.applicationName))
        return false;
    }

    boolean this_present_serviceType = true;
    boolean that_present_serviceType = true;
    if (this_present_serviceType || that_present_serviceType) {
      if (!(this_present_serviceType && that_present_serviceType))
        return false;
      if (this.serviceType != that.serviceType)
        return false;
    }

    boolean this_present_isAlive = true;
    boolean that_present_isAlive = true;
    if (this_present_isAlive || that_present_isAlive) {
      if (!(this_present_isAlive && that_present_isAlive))
        return false;
      if (this.isAlive != that.isAlive)
        return false;
    }

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_identifier = true;
    boolean that_present_identifier = true;
    if (this_present_identifier || that_present_identifier) {
      if (!(this_present_identifier && that_present_identifier))
        return false;
      if (this.identifier != that.identifier)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(AgentInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    AgentInfo typedOther = (AgentInfo)other;

    lastComparison = Boolean.valueOf(isSetHostname()).compareTo(typedOther.isSetHostname());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHostname()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hostname, typedOther.hostname);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIp()).compareTo(typedOther.isSetIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ip, typedOther.ip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPorts()).compareTo(typedOther.isSetPorts());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPorts()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ports, typedOther.ports);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAgentId()).compareTo(typedOther.isSetAgentId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAgentId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.agentId, typedOther.agentId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetApplicationName()).compareTo(typedOther.isSetApplicationName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetApplicationName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.applicationName, typedOther.applicationName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServiceType()).compareTo(typedOther.isSetServiceType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.serviceType, typedOther.serviceType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsAlive()).compareTo(typedOther.isSetIsAlive());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsAlive()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isAlive, typedOther.isAlive);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(typedOther.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, typedOther.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIdentifier()).compareTo(typedOther.isSetIdentifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIdentifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.identifier, typedOther.identifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AgentInfo(");
    boolean first = true;

    sb.append("hostname:");
    if (this.hostname == null) {
      sb.append("null");
    } else {
      sb.append(this.hostname);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ip:");
    if (this.ip == null) {
      sb.append("null");
    } else {
      sb.append(this.ip);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ports:");
    if (this.ports == null) {
      sb.append("null");
    } else {
      sb.append(this.ports);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("agentId:");
    if (this.agentId == null) {
      sb.append("null");
    } else {
      sb.append(this.agentId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("applicationName:");
    if (this.applicationName == null) {
      sb.append("null");
    } else {
      sb.append(this.applicationName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("serviceType:");
    sb.append(this.serviceType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isAlive:");
    sb.append(this.isAlive);
    first = false;
    if (!first) sb.append(", ");
    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("identifier:");
    sb.append(this.identifier);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AgentInfoStandardSchemeFactory implements SchemeFactory {
    public AgentInfoStandardScheme getScheme() {
      return new AgentInfoStandardScheme();
    }
  }

  private static class AgentInfoStandardScheme extends StandardScheme<AgentInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AgentInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOSTNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.hostname = iprot.readString();
              struct.setHostnameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ip = iprot.readString();
              struct.setIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PORTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ports = iprot.readString();
              struct.setPortsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AGENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.agentId = iprot.readString();
              struct.setAgentIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // APPLICATION_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.applicationName = iprot.readString();
              struct.setApplicationNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SERVICE_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.serviceType = iprot.readI16();
              struct.setServiceTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // IS_ALIVE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isAlive = iprot.readBool();
              struct.setIsAliveIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // IDENTIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.identifier = iprot.readI16();
              struct.setIdentifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AgentInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hostname != null) {
        oprot.writeFieldBegin(HOSTNAME_FIELD_DESC);
        oprot.writeString(struct.hostname);
        oprot.writeFieldEnd();
      }
      if (struct.ip != null) {
        oprot.writeFieldBegin(IP_FIELD_DESC);
        oprot.writeString(struct.ip);
        oprot.writeFieldEnd();
      }
      if (struct.ports != null) {
        oprot.writeFieldBegin(PORTS_FIELD_DESC);
        oprot.writeString(struct.ports);
        oprot.writeFieldEnd();
      }
      if (struct.agentId != null) {
        oprot.writeFieldBegin(AGENT_ID_FIELD_DESC);
        oprot.writeString(struct.agentId);
        oprot.writeFieldEnd();
      }
      if (struct.applicationName != null) {
        oprot.writeFieldBegin(APPLICATION_NAME_FIELD_DESC);
        oprot.writeString(struct.applicationName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SERVICE_TYPE_FIELD_DESC);
      oprot.writeI16(struct.serviceType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_ALIVE_FIELD_DESC);
      oprot.writeBool(struct.isAlive);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IDENTIFIER_FIELD_DESC);
      oprot.writeI16(struct.identifier);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AgentInfoTupleSchemeFactory implements SchemeFactory {
    public AgentInfoTupleScheme getScheme() {
      return new AgentInfoTupleScheme();
    }
  }

  private static class AgentInfoTupleScheme extends TupleScheme<AgentInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AgentInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHostname()) {
        optionals.set(0);
      }
      if (struct.isSetIp()) {
        optionals.set(1);
      }
      if (struct.isSetPorts()) {
        optionals.set(2);
      }
      if (struct.isSetAgentId()) {
        optionals.set(3);
      }
      if (struct.isSetApplicationName()) {
        optionals.set(4);
      }
      if (struct.isSetServiceType()) {
        optionals.set(5);
      }
      if (struct.isSetIsAlive()) {
        optionals.set(6);
      }
      if (struct.isSetTimestamp()) {
        optionals.set(7);
      }
      if (struct.isSetIdentifier()) {
        optionals.set(8);
      }
      oprot.writeBitSet(optionals, 9);
      if (struct.isSetHostname()) {
        oprot.writeString(struct.hostname);
      }
      if (struct.isSetIp()) {
        oprot.writeString(struct.ip);
      }
      if (struct.isSetPorts()) {
        oprot.writeString(struct.ports);
      }
      if (struct.isSetAgentId()) {
        oprot.writeString(struct.agentId);
      }
      if (struct.isSetApplicationName()) {
        oprot.writeString(struct.applicationName);
      }
      if (struct.isSetServiceType()) {
        oprot.writeI16(struct.serviceType);
      }
      if (struct.isSetIsAlive()) {
        oprot.writeBool(struct.isAlive);
      }
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
      if (struct.isSetIdentifier()) {
        oprot.writeI16(struct.identifier);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AgentInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(9);
      if (incoming.get(0)) {
        struct.hostname = iprot.readString();
        struct.setHostnameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.ip = iprot.readString();
        struct.setIpIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ports = iprot.readString();
        struct.setPortsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.agentId = iprot.readString();
        struct.setAgentIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.applicationName = iprot.readString();
        struct.setApplicationNameIsSet(true);
      }
      if (incoming.get(5)) {
        struct.serviceType = iprot.readI16();
        struct.setServiceTypeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.isAlive = iprot.readBool();
        struct.setIsAliveIsSet(true);
      }
      if (incoming.get(7)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(8)) {
        struct.identifier = iprot.readI16();
        struct.setIdentifierIsSet(true);
      }
    }
  }

}

