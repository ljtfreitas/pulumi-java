// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Writes to the DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html). One column of the DynamoDB table receives all attribute-value pairs in the payload that you specify. For more information, see [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html) in *AWS IoT Events Developer Guide*.
 * 
 */
public final class DetectorModelDynamoDB extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelDynamoDB Empty = new DetectorModelDynamoDB();

    /**
     * The name of the hash key (also called the partition key).
     * 
     */
    @InputImport(name="hashKeyField", required=true)
        private final String hashKeyField;

    public String getHashKeyField() {
        return this.hashKeyField;
    }

    /**
     * The data type for the hash key (also called the partition key). You can specify the following values:
     * 
     * * `STRING` - The hash key is a string.
     * 
     * * `NUMBER` - The hash key is a number.
     * 
     * If you don't specify `hashKeyType`, the default value is `STRING`.
     * 
     */
    @InputImport(name="hashKeyType")
        private final @Nullable String hashKeyType;

    public Optional<String> getHashKeyType() {
        return this.hashKeyType == null ? Optional.empty() : Optional.ofNullable(this.hashKeyType);
    }

    /**
     * The value of the hash key (also called the partition key).
     * 
     */
    @InputImport(name="hashKeyValue", required=true)
        private final String hashKeyValue;

    public String getHashKeyValue() {
        return this.hashKeyValue;
    }

    /**
     * The type of operation to perform. You can specify the following values:
     * 
     * * `INSERT` - Insert data as a new item into the DynamoDB table. This item uses the specified hash key as a partition key. If you specified a range key, the item uses the range key as a sort key.
     * 
     * * `UPDATE` - Update an existing item of the DynamoDB table with new data. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * 
     * * `DELETE` - Delete an existing item of the DynamoDB table. This item's partition key must match the specified hash key. If you specified a range key, the range key must match the item's sort key.
     * 
     * If you don't specify this parameter, AWS IoT Events triggers the `INSERT` operation.
     * 
     */
    @InputImport(name="operation")
        private final @Nullable String operation;

    public Optional<String> getOperation() {
        return this.operation == null ? Optional.empty() : Optional.ofNullable(this.operation);
    }

    @InputImport(name="payload")
        private final @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> getPayload() {
        return this.payload == null ? Optional.empty() : Optional.ofNullable(this.payload);
    }

    /**
     * The name of the DynamoDB column that receives the action payload.
     * 
     * If you don't specify this parameter, the name of the DynamoDB column is `payload`.
     * 
     */
    @InputImport(name="payloadField")
        private final @Nullable String payloadField;

    public Optional<String> getPayloadField() {
        return this.payloadField == null ? Optional.empty() : Optional.ofNullable(this.payloadField);
    }

    /**
     * The name of the range key (also called the sort key).
     * 
     */
    @InputImport(name="rangeKeyField")
        private final @Nullable String rangeKeyField;

    public Optional<String> getRangeKeyField() {
        return this.rangeKeyField == null ? Optional.empty() : Optional.ofNullable(this.rangeKeyField);
    }

    /**
     * The data type for the range key (also called the sort key), You can specify the following values:
     * 
     * * `STRING` - The range key is a string.
     * 
     * * `NUMBER` - The range key is number.
     * 
     * If you don't specify `rangeKeyField`, the default value is `STRING`.
     * 
     */
    @InputImport(name="rangeKeyType")
        private final @Nullable String rangeKeyType;

    public Optional<String> getRangeKeyType() {
        return this.rangeKeyType == null ? Optional.empty() : Optional.ofNullable(this.rangeKeyType);
    }

    /**
     * The value of the range key (also called the sort key).
     * 
     */
    @InputImport(name="rangeKeyValue")
        private final @Nullable String rangeKeyValue;

    public Optional<String> getRangeKeyValue() {
        return this.rangeKeyValue == null ? Optional.empty() : Optional.ofNullable(this.rangeKeyValue);
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @InputImport(name="tableName", required=true)
        private final String tableName;

    public String getTableName() {
        return this.tableName;
    }

    public DetectorModelDynamoDB(
        String hashKeyField,
        @Nullable String hashKeyType,
        String hashKeyValue,
        @Nullable String operation,
        @Nullable DetectorModelPayload payload,
        @Nullable String payloadField,
        @Nullable String rangeKeyField,
        @Nullable String rangeKeyType,
        @Nullable String rangeKeyValue,
        String tableName) {
        this.hashKeyField = Objects.requireNonNull(hashKeyField, "expected parameter 'hashKeyField' to be non-null");
        this.hashKeyType = hashKeyType;
        this.hashKeyValue = Objects.requireNonNull(hashKeyValue, "expected parameter 'hashKeyValue' to be non-null");
        this.operation = operation;
        this.payload = payload;
        this.payloadField = payloadField;
        this.rangeKeyField = rangeKeyField;
        this.rangeKeyType = rangeKeyType;
        this.rangeKeyValue = rangeKeyValue;
        this.tableName = Objects.requireNonNull(tableName, "expected parameter 'tableName' to be non-null");
    }

    private DetectorModelDynamoDB() {
        this.hashKeyField = null;
        this.hashKeyType = null;
        this.hashKeyValue = null;
        this.operation = null;
        this.payload = null;
        this.payloadField = null;
        this.rangeKeyField = null;
        this.rangeKeyType = null;
        this.rangeKeyValue = null;
        this.tableName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDynamoDB defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hashKeyField;
        private @Nullable String hashKeyType;
        private String hashKeyValue;
        private @Nullable String operation;
        private @Nullable DetectorModelPayload payload;
        private @Nullable String payloadField;
        private @Nullable String rangeKeyField;
        private @Nullable String rangeKeyType;
        private @Nullable String rangeKeyValue;
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDynamoDB defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKeyField = defaults.hashKeyField;
    	      this.hashKeyType = defaults.hashKeyType;
    	      this.hashKeyValue = defaults.hashKeyValue;
    	      this.operation = defaults.operation;
    	      this.payload = defaults.payload;
    	      this.payloadField = defaults.payloadField;
    	      this.rangeKeyField = defaults.rangeKeyField;
    	      this.rangeKeyType = defaults.rangeKeyType;
    	      this.rangeKeyValue = defaults.rangeKeyValue;
    	      this.tableName = defaults.tableName;
        }

        public Builder setHashKeyField(String hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }

        public Builder setHashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }

        public Builder setHashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }

        public Builder setOperation(@Nullable String operation) {
            this.operation = operation;
            return this;
        }

        public Builder setPayload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }

        public Builder setPayloadField(@Nullable String payloadField) {
            this.payloadField = payloadField;
            return this;
        }

        public Builder setRangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }

        public Builder setRangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }

        public Builder setRangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }

        public Builder setTableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }
        public DetectorModelDynamoDB build() {
            return new DetectorModelDynamoDB(hashKeyField, hashKeyType, hashKeyValue, operation, payload, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, tableName);
        }
    }
}
