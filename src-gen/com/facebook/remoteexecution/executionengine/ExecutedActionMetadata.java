/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.executionengine;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ExecutedActionMetadata implements TBase, java.io.Serializable, Cloneable, Comparable<ExecutedActionMetadata> {
  private static final TStruct STRUCT_DESC = new TStruct("ExecutedActionMetadata");
  private static final TField WORKER_FIELD_DESC = new TField("worker", TType.STRING, (short)1);
  private static final TField QUEUED_TIMESTAMP_FIELD_DESC = new TField("queued_timestamp", TType.I64, (short)2);
  private static final TField WORKER_START_TIMESTAMP_FIELD_DESC = new TField("worker_start_timestamp", TType.I64, (short)3);
  private static final TField WORKER_COMPLETED_TIMESTAMP_FIELD_DESC = new TField("worker_completed_timestamp", TType.I64, (short)4);
  private static final TField INPUT_FETCH_START_TIMESTAMP_FIELD_DESC = new TField("input_fetch_start_timestamp", TType.I64, (short)5);
  private static final TField INPUT_FETCH_COMPLETED_TIMESTAMP_FIELD_DESC = new TField("input_fetch_completed_timestamp", TType.I64, (short)6);
  private static final TField EXECUTION_START_TIMESTAMP_FIELD_DESC = new TField("execution_start_timestamp", TType.I64, (short)7);
  private static final TField EXECUTION_COMPLETED_TIMESTAMP_FIELD_DESC = new TField("execution_completed_timestamp", TType.I64, (short)8);
  private static final TField OUTPUT_UPLOAD_START_TIMESTAMP_FIELD_DESC = new TField("output_upload_start_timestamp", TType.I64, (short)9);
  private static final TField OUTPUT_UPLOAD_COMPLETED_TIMESTAMP_FIELD_DESC = new TField("output_upload_completed_timestamp", TType.I64, (short)10);

  public String worker;
  public long queued_timestamp;
  public long worker_start_timestamp;
  public long worker_completed_timestamp;
  public long input_fetch_start_timestamp;
  public long input_fetch_completed_timestamp;
  public long execution_start_timestamp;
  public long execution_completed_timestamp;
  public long output_upload_start_timestamp;
  public long output_upload_completed_timestamp;
  public static final int WORKER = 1;
  public static final int QUEUED_TIMESTAMP = 2;
  public static final int WORKER_START_TIMESTAMP = 3;
  public static final int WORKER_COMPLETED_TIMESTAMP = 4;
  public static final int INPUT_FETCH_START_TIMESTAMP = 5;
  public static final int INPUT_FETCH_COMPLETED_TIMESTAMP = 6;
  public static final int EXECUTION_START_TIMESTAMP = 7;
  public static final int EXECUTION_COMPLETED_TIMESTAMP = 8;
  public static final int OUTPUT_UPLOAD_START_TIMESTAMP = 9;
  public static final int OUTPUT_UPLOAD_COMPLETED_TIMESTAMP = 10;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __QUEUED_TIMESTAMP_ISSET_ID = 0;
  private static final int __WORKER_START_TIMESTAMP_ISSET_ID = 1;
  private static final int __WORKER_COMPLETED_TIMESTAMP_ISSET_ID = 2;
  private static final int __INPUT_FETCH_START_TIMESTAMP_ISSET_ID = 3;
  private static final int __INPUT_FETCH_COMPLETED_TIMESTAMP_ISSET_ID = 4;
  private static final int __EXECUTION_START_TIMESTAMP_ISSET_ID = 5;
  private static final int __EXECUTION_COMPLETED_TIMESTAMP_ISSET_ID = 6;
  private static final int __OUTPUT_UPLOAD_START_TIMESTAMP_ISSET_ID = 7;
  private static final int __OUTPUT_UPLOAD_COMPLETED_TIMESTAMP_ISSET_ID = 8;
  private BitSet __isset_bit_vector = new BitSet(9);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(WORKER, new FieldMetaData("worker", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(QUEUED_TIMESTAMP, new FieldMetaData("queued_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(WORKER_START_TIMESTAMP, new FieldMetaData("worker_start_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(WORKER_COMPLETED_TIMESTAMP, new FieldMetaData("worker_completed_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(INPUT_FETCH_START_TIMESTAMP, new FieldMetaData("input_fetch_start_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(INPUT_FETCH_COMPLETED_TIMESTAMP, new FieldMetaData("input_fetch_completed_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(EXECUTION_START_TIMESTAMP, new FieldMetaData("execution_start_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(EXECUTION_COMPLETED_TIMESTAMP, new FieldMetaData("execution_completed_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(OUTPUT_UPLOAD_START_TIMESTAMP, new FieldMetaData("output_upload_start_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    tmpMetaDataMap.put(OUTPUT_UPLOAD_COMPLETED_TIMESTAMP, new FieldMetaData("output_upload_completed_timestamp", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ExecutedActionMetadata.class, metaDataMap);
  }

  public ExecutedActionMetadata() {
  }

  public ExecutedActionMetadata(
    String worker,
    long queued_timestamp,
    long worker_start_timestamp,
    long worker_completed_timestamp,
    long input_fetch_start_timestamp,
    long input_fetch_completed_timestamp,
    long execution_start_timestamp,
    long execution_completed_timestamp,
    long output_upload_start_timestamp,
    long output_upload_completed_timestamp)
  {
    this();
    this.worker = worker;
    this.queued_timestamp = queued_timestamp;
    setQueued_timestampIsSet(true);
    this.worker_start_timestamp = worker_start_timestamp;
    setWorker_start_timestampIsSet(true);
    this.worker_completed_timestamp = worker_completed_timestamp;
    setWorker_completed_timestampIsSet(true);
    this.input_fetch_start_timestamp = input_fetch_start_timestamp;
    setInput_fetch_start_timestampIsSet(true);
    this.input_fetch_completed_timestamp = input_fetch_completed_timestamp;
    setInput_fetch_completed_timestampIsSet(true);
    this.execution_start_timestamp = execution_start_timestamp;
    setExecution_start_timestampIsSet(true);
    this.execution_completed_timestamp = execution_completed_timestamp;
    setExecution_completed_timestampIsSet(true);
    this.output_upload_start_timestamp = output_upload_start_timestamp;
    setOutput_upload_start_timestampIsSet(true);
    this.output_upload_completed_timestamp = output_upload_completed_timestamp;
    setOutput_upload_completed_timestampIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecutedActionMetadata(ExecutedActionMetadata other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetWorker()) {
      this.worker = TBaseHelper.deepCopy(other.worker);
    }
    this.queued_timestamp = TBaseHelper.deepCopy(other.queued_timestamp);
    this.worker_start_timestamp = TBaseHelper.deepCopy(other.worker_start_timestamp);
    this.worker_completed_timestamp = TBaseHelper.deepCopy(other.worker_completed_timestamp);
    this.input_fetch_start_timestamp = TBaseHelper.deepCopy(other.input_fetch_start_timestamp);
    this.input_fetch_completed_timestamp = TBaseHelper.deepCopy(other.input_fetch_completed_timestamp);
    this.execution_start_timestamp = TBaseHelper.deepCopy(other.execution_start_timestamp);
    this.execution_completed_timestamp = TBaseHelper.deepCopy(other.execution_completed_timestamp);
    this.output_upload_start_timestamp = TBaseHelper.deepCopy(other.output_upload_start_timestamp);
    this.output_upload_completed_timestamp = TBaseHelper.deepCopy(other.output_upload_completed_timestamp);
  }

  public ExecutedActionMetadata deepCopy() {
    return new ExecutedActionMetadata(this);
  }

  @Deprecated
  public ExecutedActionMetadata clone() {
    return new ExecutedActionMetadata(this);
  }

  public String  getWorker() {
    return this.worker;
  }

  public ExecutedActionMetadata setWorker(String worker) {
    this.worker = worker;
    return this;
  }

  public void unsetWorker() {
    this.worker = null;
  }

  // Returns true if field worker is set (has been assigned a value) and false otherwise
  public boolean isSetWorker() {
    return this.worker != null;
  }

  public void setWorkerIsSet(boolean value) {
    if (!value) {
      this.worker = null;
    }
  }

  public long  getQueued_timestamp() {
    return this.queued_timestamp;
  }

  public ExecutedActionMetadata setQueued_timestamp(long queued_timestamp) {
    this.queued_timestamp = queued_timestamp;
    setQueued_timestampIsSet(true);
    return this;
  }

  public void unsetQueued_timestamp() {
    __isset_bit_vector.clear(__QUEUED_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field queued_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetQueued_timestamp() {
    return __isset_bit_vector.get(__QUEUED_TIMESTAMP_ISSET_ID);
  }

  public void setQueued_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__QUEUED_TIMESTAMP_ISSET_ID, value);
  }

  public long  getWorker_start_timestamp() {
    return this.worker_start_timestamp;
  }

  public ExecutedActionMetadata setWorker_start_timestamp(long worker_start_timestamp) {
    this.worker_start_timestamp = worker_start_timestamp;
    setWorker_start_timestampIsSet(true);
    return this;
  }

  public void unsetWorker_start_timestamp() {
    __isset_bit_vector.clear(__WORKER_START_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field worker_start_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetWorker_start_timestamp() {
    return __isset_bit_vector.get(__WORKER_START_TIMESTAMP_ISSET_ID);
  }

  public void setWorker_start_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__WORKER_START_TIMESTAMP_ISSET_ID, value);
  }

  public long  getWorker_completed_timestamp() {
    return this.worker_completed_timestamp;
  }

  public ExecutedActionMetadata setWorker_completed_timestamp(long worker_completed_timestamp) {
    this.worker_completed_timestamp = worker_completed_timestamp;
    setWorker_completed_timestampIsSet(true);
    return this;
  }

  public void unsetWorker_completed_timestamp() {
    __isset_bit_vector.clear(__WORKER_COMPLETED_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field worker_completed_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetWorker_completed_timestamp() {
    return __isset_bit_vector.get(__WORKER_COMPLETED_TIMESTAMP_ISSET_ID);
  }

  public void setWorker_completed_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__WORKER_COMPLETED_TIMESTAMP_ISSET_ID, value);
  }

  public long  getInput_fetch_start_timestamp() {
    return this.input_fetch_start_timestamp;
  }

  public ExecutedActionMetadata setInput_fetch_start_timestamp(long input_fetch_start_timestamp) {
    this.input_fetch_start_timestamp = input_fetch_start_timestamp;
    setInput_fetch_start_timestampIsSet(true);
    return this;
  }

  public void unsetInput_fetch_start_timestamp() {
    __isset_bit_vector.clear(__INPUT_FETCH_START_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field input_fetch_start_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetInput_fetch_start_timestamp() {
    return __isset_bit_vector.get(__INPUT_FETCH_START_TIMESTAMP_ISSET_ID);
  }

  public void setInput_fetch_start_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__INPUT_FETCH_START_TIMESTAMP_ISSET_ID, value);
  }

  public long  getInput_fetch_completed_timestamp() {
    return this.input_fetch_completed_timestamp;
  }

  public ExecutedActionMetadata setInput_fetch_completed_timestamp(long input_fetch_completed_timestamp) {
    this.input_fetch_completed_timestamp = input_fetch_completed_timestamp;
    setInput_fetch_completed_timestampIsSet(true);
    return this;
  }

  public void unsetInput_fetch_completed_timestamp() {
    __isset_bit_vector.clear(__INPUT_FETCH_COMPLETED_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field input_fetch_completed_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetInput_fetch_completed_timestamp() {
    return __isset_bit_vector.get(__INPUT_FETCH_COMPLETED_TIMESTAMP_ISSET_ID);
  }

  public void setInput_fetch_completed_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__INPUT_FETCH_COMPLETED_TIMESTAMP_ISSET_ID, value);
  }

  public long  getExecution_start_timestamp() {
    return this.execution_start_timestamp;
  }

  public ExecutedActionMetadata setExecution_start_timestamp(long execution_start_timestamp) {
    this.execution_start_timestamp = execution_start_timestamp;
    setExecution_start_timestampIsSet(true);
    return this;
  }

  public void unsetExecution_start_timestamp() {
    __isset_bit_vector.clear(__EXECUTION_START_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field execution_start_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetExecution_start_timestamp() {
    return __isset_bit_vector.get(__EXECUTION_START_TIMESTAMP_ISSET_ID);
  }

  public void setExecution_start_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__EXECUTION_START_TIMESTAMP_ISSET_ID, value);
  }

  public long  getExecution_completed_timestamp() {
    return this.execution_completed_timestamp;
  }

  public ExecutedActionMetadata setExecution_completed_timestamp(long execution_completed_timestamp) {
    this.execution_completed_timestamp = execution_completed_timestamp;
    setExecution_completed_timestampIsSet(true);
    return this;
  }

  public void unsetExecution_completed_timestamp() {
    __isset_bit_vector.clear(__EXECUTION_COMPLETED_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field execution_completed_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetExecution_completed_timestamp() {
    return __isset_bit_vector.get(__EXECUTION_COMPLETED_TIMESTAMP_ISSET_ID);
  }

  public void setExecution_completed_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__EXECUTION_COMPLETED_TIMESTAMP_ISSET_ID, value);
  }

  public long  getOutput_upload_start_timestamp() {
    return this.output_upload_start_timestamp;
  }

  public ExecutedActionMetadata setOutput_upload_start_timestamp(long output_upload_start_timestamp) {
    this.output_upload_start_timestamp = output_upload_start_timestamp;
    setOutput_upload_start_timestampIsSet(true);
    return this;
  }

  public void unsetOutput_upload_start_timestamp() {
    __isset_bit_vector.clear(__OUTPUT_UPLOAD_START_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field output_upload_start_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetOutput_upload_start_timestamp() {
    return __isset_bit_vector.get(__OUTPUT_UPLOAD_START_TIMESTAMP_ISSET_ID);
  }

  public void setOutput_upload_start_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__OUTPUT_UPLOAD_START_TIMESTAMP_ISSET_ID, value);
  }

  public long  getOutput_upload_completed_timestamp() {
    return this.output_upload_completed_timestamp;
  }

  public ExecutedActionMetadata setOutput_upload_completed_timestamp(long output_upload_completed_timestamp) {
    this.output_upload_completed_timestamp = output_upload_completed_timestamp;
    setOutput_upload_completed_timestampIsSet(true);
    return this;
  }

  public void unsetOutput_upload_completed_timestamp() {
    __isset_bit_vector.clear(__OUTPUT_UPLOAD_COMPLETED_TIMESTAMP_ISSET_ID);
  }

  // Returns true if field output_upload_completed_timestamp is set (has been assigned a value) and false otherwise
  public boolean isSetOutput_upload_completed_timestamp() {
    return __isset_bit_vector.get(__OUTPUT_UPLOAD_COMPLETED_TIMESTAMP_ISSET_ID);
  }

  public void setOutput_upload_completed_timestampIsSet(boolean value) {
    __isset_bit_vector.set(__OUTPUT_UPLOAD_COMPLETED_TIMESTAMP_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case WORKER:
      if (value == null) {
        unsetWorker();
      } else {
        setWorker((String)value);
      }
      break;

    case QUEUED_TIMESTAMP:
      if (value == null) {
        unsetQueued_timestamp();
      } else {
        setQueued_timestamp((Long)value);
      }
      break;

    case WORKER_START_TIMESTAMP:
      if (value == null) {
        unsetWorker_start_timestamp();
      } else {
        setWorker_start_timestamp((Long)value);
      }
      break;

    case WORKER_COMPLETED_TIMESTAMP:
      if (value == null) {
        unsetWorker_completed_timestamp();
      } else {
        setWorker_completed_timestamp((Long)value);
      }
      break;

    case INPUT_FETCH_START_TIMESTAMP:
      if (value == null) {
        unsetInput_fetch_start_timestamp();
      } else {
        setInput_fetch_start_timestamp((Long)value);
      }
      break;

    case INPUT_FETCH_COMPLETED_TIMESTAMP:
      if (value == null) {
        unsetInput_fetch_completed_timestamp();
      } else {
        setInput_fetch_completed_timestamp((Long)value);
      }
      break;

    case EXECUTION_START_TIMESTAMP:
      if (value == null) {
        unsetExecution_start_timestamp();
      } else {
        setExecution_start_timestamp((Long)value);
      }
      break;

    case EXECUTION_COMPLETED_TIMESTAMP:
      if (value == null) {
        unsetExecution_completed_timestamp();
      } else {
        setExecution_completed_timestamp((Long)value);
      }
      break;

    case OUTPUT_UPLOAD_START_TIMESTAMP:
      if (value == null) {
        unsetOutput_upload_start_timestamp();
      } else {
        setOutput_upload_start_timestamp((Long)value);
      }
      break;

    case OUTPUT_UPLOAD_COMPLETED_TIMESTAMP:
      if (value == null) {
        unsetOutput_upload_completed_timestamp();
      } else {
        setOutput_upload_completed_timestamp((Long)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case WORKER:
      return getWorker();

    case QUEUED_TIMESTAMP:
      return new Long(getQueued_timestamp());

    case WORKER_START_TIMESTAMP:
      return new Long(getWorker_start_timestamp());

    case WORKER_COMPLETED_TIMESTAMP:
      return new Long(getWorker_completed_timestamp());

    case INPUT_FETCH_START_TIMESTAMP:
      return new Long(getInput_fetch_start_timestamp());

    case INPUT_FETCH_COMPLETED_TIMESTAMP:
      return new Long(getInput_fetch_completed_timestamp());

    case EXECUTION_START_TIMESTAMP:
      return new Long(getExecution_start_timestamp());

    case EXECUTION_COMPLETED_TIMESTAMP:
      return new Long(getExecution_completed_timestamp());

    case OUTPUT_UPLOAD_START_TIMESTAMP:
      return new Long(getOutput_upload_start_timestamp());

    case OUTPUT_UPLOAD_COMPLETED_TIMESTAMP:
      return new Long(getOutput_upload_completed_timestamp());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case WORKER:
      return isSetWorker();
    case QUEUED_TIMESTAMP:
      return isSetQueued_timestamp();
    case WORKER_START_TIMESTAMP:
      return isSetWorker_start_timestamp();
    case WORKER_COMPLETED_TIMESTAMP:
      return isSetWorker_completed_timestamp();
    case INPUT_FETCH_START_TIMESTAMP:
      return isSetInput_fetch_start_timestamp();
    case INPUT_FETCH_COMPLETED_TIMESTAMP:
      return isSetInput_fetch_completed_timestamp();
    case EXECUTION_START_TIMESTAMP:
      return isSetExecution_start_timestamp();
    case EXECUTION_COMPLETED_TIMESTAMP:
      return isSetExecution_completed_timestamp();
    case OUTPUT_UPLOAD_START_TIMESTAMP:
      return isSetOutput_upload_start_timestamp();
    case OUTPUT_UPLOAD_COMPLETED_TIMESTAMP:
      return isSetOutput_upload_completed_timestamp();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecutedActionMetadata)
      return this.equals((ExecutedActionMetadata)that);
    return false;
  }

  public boolean equals(ExecutedActionMetadata that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_worker = true && this.isSetWorker();
    boolean that_present_worker = true && that.isSetWorker();
    if (this_present_worker || that_present_worker) {
      if (!(this_present_worker && that_present_worker))
        return false;
      if (!TBaseHelper.equalsNobinary(this.worker, that.worker))
        return false;
    }

    boolean this_present_queued_timestamp = true;
    boolean that_present_queued_timestamp = true;
    if (this_present_queued_timestamp || that_present_queued_timestamp) {
      if (!(this_present_queued_timestamp && that_present_queued_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.queued_timestamp, that.queued_timestamp))
        return false;
    }

    boolean this_present_worker_start_timestamp = true;
    boolean that_present_worker_start_timestamp = true;
    if (this_present_worker_start_timestamp || that_present_worker_start_timestamp) {
      if (!(this_present_worker_start_timestamp && that_present_worker_start_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.worker_start_timestamp, that.worker_start_timestamp))
        return false;
    }

    boolean this_present_worker_completed_timestamp = true;
    boolean that_present_worker_completed_timestamp = true;
    if (this_present_worker_completed_timestamp || that_present_worker_completed_timestamp) {
      if (!(this_present_worker_completed_timestamp && that_present_worker_completed_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.worker_completed_timestamp, that.worker_completed_timestamp))
        return false;
    }

    boolean this_present_input_fetch_start_timestamp = true;
    boolean that_present_input_fetch_start_timestamp = true;
    if (this_present_input_fetch_start_timestamp || that_present_input_fetch_start_timestamp) {
      if (!(this_present_input_fetch_start_timestamp && that_present_input_fetch_start_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.input_fetch_start_timestamp, that.input_fetch_start_timestamp))
        return false;
    }

    boolean this_present_input_fetch_completed_timestamp = true;
    boolean that_present_input_fetch_completed_timestamp = true;
    if (this_present_input_fetch_completed_timestamp || that_present_input_fetch_completed_timestamp) {
      if (!(this_present_input_fetch_completed_timestamp && that_present_input_fetch_completed_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.input_fetch_completed_timestamp, that.input_fetch_completed_timestamp))
        return false;
    }

    boolean this_present_execution_start_timestamp = true;
    boolean that_present_execution_start_timestamp = true;
    if (this_present_execution_start_timestamp || that_present_execution_start_timestamp) {
      if (!(this_present_execution_start_timestamp && that_present_execution_start_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.execution_start_timestamp, that.execution_start_timestamp))
        return false;
    }

    boolean this_present_execution_completed_timestamp = true;
    boolean that_present_execution_completed_timestamp = true;
    if (this_present_execution_completed_timestamp || that_present_execution_completed_timestamp) {
      if (!(this_present_execution_completed_timestamp && that_present_execution_completed_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.execution_completed_timestamp, that.execution_completed_timestamp))
        return false;
    }

    boolean this_present_output_upload_start_timestamp = true;
    boolean that_present_output_upload_start_timestamp = true;
    if (this_present_output_upload_start_timestamp || that_present_output_upload_start_timestamp) {
      if (!(this_present_output_upload_start_timestamp && that_present_output_upload_start_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.output_upload_start_timestamp, that.output_upload_start_timestamp))
        return false;
    }

    boolean this_present_output_upload_completed_timestamp = true;
    boolean that_present_output_upload_completed_timestamp = true;
    if (this_present_output_upload_completed_timestamp || that_present_output_upload_completed_timestamp) {
      if (!(this_present_output_upload_completed_timestamp && that_present_output_upload_completed_timestamp))
        return false;
      if (!TBaseHelper.equalsNobinary(this.output_upload_completed_timestamp, that.output_upload_completed_timestamp))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ExecutedActionMetadata other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetWorker()).compareTo(other.isSetWorker());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(worker, other.worker);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetQueued_timestamp()).compareTo(other.isSetQueued_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(queued_timestamp, other.queued_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetWorker_start_timestamp()).compareTo(other.isSetWorker_start_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(worker_start_timestamp, other.worker_start_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetWorker_completed_timestamp()).compareTo(other.isSetWorker_completed_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(worker_completed_timestamp, other.worker_completed_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetInput_fetch_start_timestamp()).compareTo(other.isSetInput_fetch_start_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(input_fetch_start_timestamp, other.input_fetch_start_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetInput_fetch_completed_timestamp()).compareTo(other.isSetInput_fetch_completed_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(input_fetch_completed_timestamp, other.input_fetch_completed_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetExecution_start_timestamp()).compareTo(other.isSetExecution_start_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(execution_start_timestamp, other.execution_start_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetExecution_completed_timestamp()).compareTo(other.isSetExecution_completed_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(execution_completed_timestamp, other.execution_completed_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOutput_upload_start_timestamp()).compareTo(other.isSetOutput_upload_start_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(output_upload_start_timestamp, other.output_upload_start_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOutput_upload_completed_timestamp()).compareTo(other.isSetOutput_upload_completed_timestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(output_upload_completed_timestamp, other.output_upload_completed_timestamp);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case WORKER:
          if (field.type == TType.STRING) {
            this.worker = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case QUEUED_TIMESTAMP:
          if (field.type == TType.I64) {
            this.queued_timestamp = iprot.readI64();
            setQueued_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case WORKER_START_TIMESTAMP:
          if (field.type == TType.I64) {
            this.worker_start_timestamp = iprot.readI64();
            setWorker_start_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case WORKER_COMPLETED_TIMESTAMP:
          if (field.type == TType.I64) {
            this.worker_completed_timestamp = iprot.readI64();
            setWorker_completed_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INPUT_FETCH_START_TIMESTAMP:
          if (field.type == TType.I64) {
            this.input_fetch_start_timestamp = iprot.readI64();
            setInput_fetch_start_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case INPUT_FETCH_COMPLETED_TIMESTAMP:
          if (field.type == TType.I64) {
            this.input_fetch_completed_timestamp = iprot.readI64();
            setInput_fetch_completed_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EXECUTION_START_TIMESTAMP:
          if (field.type == TType.I64) {
            this.execution_start_timestamp = iprot.readI64();
            setExecution_start_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EXECUTION_COMPLETED_TIMESTAMP:
          if (field.type == TType.I64) {
            this.execution_completed_timestamp = iprot.readI64();
            setExecution_completed_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OUTPUT_UPLOAD_START_TIMESTAMP:
          if (field.type == TType.I64) {
            this.output_upload_start_timestamp = iprot.readI64();
            setOutput_upload_start_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OUTPUT_UPLOAD_COMPLETED_TIMESTAMP:
          if (field.type == TType.I64) {
            this.output_upload_completed_timestamp = iprot.readI64();
            setOutput_upload_completed_timestampIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.worker != null) {
      oprot.writeFieldBegin(WORKER_FIELD_DESC);
      oprot.writeString(this.worker);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(QUEUED_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.queued_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(WORKER_START_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.worker_start_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(WORKER_COMPLETED_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.worker_completed_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(INPUT_FETCH_START_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.input_fetch_start_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(INPUT_FETCH_COMPLETED_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.input_fetch_completed_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(EXECUTION_START_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.execution_start_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(EXECUTION_COMPLETED_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.execution_completed_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(OUTPUT_UPLOAD_START_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.output_upload_start_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(OUTPUT_UPLOAD_COMPLETED_TIMESTAMP_FIELD_DESC);
    oprot.writeI64(this.output_upload_completed_timestamp);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ExecutedActionMetadata");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("worker");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getWorker() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getWorker(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("queued_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getQueued_timestamp(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("worker_start_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getWorker_start_timestamp(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("worker_completed_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getWorker_completed_timestamp(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("input_fetch_start_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getInput_fetch_start_timestamp(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("input_fetch_completed_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getInput_fetch_completed_timestamp(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("execution_start_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getExecution_start_timestamp(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("execution_completed_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getExecution_completed_timestamp(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("output_upload_start_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getOutput_upload_start_timestamp(), indent + 1, prettyPrint));
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("output_upload_completed_timestamp");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. getOutput_upload_completed_timestamp(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

