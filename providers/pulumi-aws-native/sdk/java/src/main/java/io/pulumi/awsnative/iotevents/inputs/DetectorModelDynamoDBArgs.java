// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayloadArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Writes to the DynamoDB table that you created. The default action payload contains all attribute-value pairs that have the information about the detector model instance and the event that triggered the action. You can also customize the [payload](https://docs.aws.amazon.com/iotevents/latest/apireference/API_Payload.html). One column of the DynamoDB table receives all attribute-value pairs in the payload that you specify. For more information, see [Actions](https://docs.aws.amazon.com/iotevents/latest/developerguide/iotevents-event-actions.html) in *AWS IoT Events Developer Guide*.
 * 
 */
public final class DetectorModelDynamoDBArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorModelDynamoDBArgs Empty = new DetectorModelDynamoDBArgs();

    /**
     * The name of the hash key (also called the partition key).
     * 
     */
    @Import(name="hashKeyField", required=true)
      private final Output<String> hashKeyField;

    public Output<String> getHashKeyField() {
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
    @Import(name="hashKeyType")
      private final @Nullable Output<String> hashKeyType;

    public Output<String> getHashKeyType() {
        return this.hashKeyType == null ? Output.empty() : this.hashKeyType;
    }

    /**
     * The value of the hash key (also called the partition key).
     * 
     */
    @Import(name="hashKeyValue", required=true)
      private final Output<String> hashKeyValue;

    public Output<String> getHashKeyValue() {
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
    @Import(name="operation")
      private final @Nullable Output<String> operation;

    public Output<String> getOperation() {
        return this.operation == null ? Output.empty() : this.operation;
    }

    @Import(name="payload")
      private final @Nullable Output<DetectorModelPayloadArgs> payload;

    public Output<DetectorModelPayloadArgs> getPayload() {
        return this.payload == null ? Output.empty() : this.payload;
    }

    /**
     * The name of the DynamoDB column that receives the action payload.
     * 
     * If you don't specify this parameter, the name of the DynamoDB column is `payload`.
     * 
     */
    @Import(name="payloadField")
      private final @Nullable Output<String> payloadField;

    public Output<String> getPayloadField() {
        return this.payloadField == null ? Output.empty() : this.payloadField;
    }

    /**
     * The name of the range key (also called the sort key).
     * 
     */
    @Import(name="rangeKeyField")
      private final @Nullable Output<String> rangeKeyField;

    public Output<String> getRangeKeyField() {
        return this.rangeKeyField == null ? Output.empty() : this.rangeKeyField;
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
    @Import(name="rangeKeyType")
      private final @Nullable Output<String> rangeKeyType;

    public Output<String> getRangeKeyType() {
        return this.rangeKeyType == null ? Output.empty() : this.rangeKeyType;
    }

    /**
     * The value of the range key (also called the sort key).
     * 
     */
    @Import(name="rangeKeyValue")
      private final @Nullable Output<String> rangeKeyValue;

    public Output<String> getRangeKeyValue() {
        return this.rangeKeyValue == null ? Output.empty() : this.rangeKeyValue;
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @Import(name="tableName", required=true)
      private final Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName;
    }

    public DetectorModelDynamoDBArgs(
        Output<String> hashKeyField,
        @Nullable Output<String> hashKeyType,
        Output<String> hashKeyValue,
        @Nullable Output<String> operation,
        @Nullable Output<DetectorModelPayloadArgs> payload,
        @Nullable Output<String> payloadField,
        @Nullable Output<String> rangeKeyField,
        @Nullable Output<String> rangeKeyType,
        @Nullable Output<String> rangeKeyValue,
        Output<String> tableName) {
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

    private DetectorModelDynamoDBArgs() {
        this.hashKeyField = Output.empty();
        this.hashKeyType = Output.empty();
        this.hashKeyValue = Output.empty();
        this.operation = Output.empty();
        this.payload = Output.empty();
        this.payloadField = Output.empty();
        this.rangeKeyField = Output.empty();
        this.rangeKeyType = Output.empty();
        this.rangeKeyValue = Output.empty();
        this.tableName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelDynamoDBArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> hashKeyField;
        private @Nullable Output<String> hashKeyType;
        private Output<String> hashKeyValue;
        private @Nullable Output<String> operation;
        private @Nullable Output<DetectorModelPayloadArgs> payload;
        private @Nullable Output<String> payloadField;
        private @Nullable Output<String> rangeKeyField;
        private @Nullable Output<String> rangeKeyType;
        private @Nullable Output<String> rangeKeyValue;
        private Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelDynamoDBArgs defaults) {
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

        public Builder hashKeyField(Output<String> hashKeyField) {
            this.hashKeyField = Objects.requireNonNull(hashKeyField);
            return this;
        }

        public Builder hashKeyField(String hashKeyField) {
            this.hashKeyField = Output.of(Objects.requireNonNull(hashKeyField));
            return this;
        }

        public Builder hashKeyType(@Nullable Output<String> hashKeyType) {
            this.hashKeyType = hashKeyType;
            return this;
        }

        public Builder hashKeyType(@Nullable String hashKeyType) {
            this.hashKeyType = Output.ofNullable(hashKeyType);
            return this;
        }

        public Builder hashKeyValue(Output<String> hashKeyValue) {
            this.hashKeyValue = Objects.requireNonNull(hashKeyValue);
            return this;
        }

        public Builder hashKeyValue(String hashKeyValue) {
            this.hashKeyValue = Output.of(Objects.requireNonNull(hashKeyValue));
            return this;
        }

        public Builder operation(@Nullable Output<String> operation) {
            this.operation = operation;
            return this;
        }

        public Builder operation(@Nullable String operation) {
            this.operation = Output.ofNullable(operation);
            return this;
        }

        public Builder payload(@Nullable Output<DetectorModelPayloadArgs> payload) {
            this.payload = payload;
            return this;
        }

        public Builder payload(@Nullable DetectorModelPayloadArgs payload) {
            this.payload = Output.ofNullable(payload);
            return this;
        }

        public Builder payloadField(@Nullable Output<String> payloadField) {
            this.payloadField = payloadField;
            return this;
        }

        public Builder payloadField(@Nullable String payloadField) {
            this.payloadField = Output.ofNullable(payloadField);
            return this;
        }

        public Builder rangeKeyField(@Nullable Output<String> rangeKeyField) {
            this.rangeKeyField = rangeKeyField;
            return this;
        }

        public Builder rangeKeyField(@Nullable String rangeKeyField) {
            this.rangeKeyField = Output.ofNullable(rangeKeyField);
            return this;
        }

        public Builder rangeKeyType(@Nullable Output<String> rangeKeyType) {
            this.rangeKeyType = rangeKeyType;
            return this;
        }

        public Builder rangeKeyType(@Nullable String rangeKeyType) {
            this.rangeKeyType = Output.ofNullable(rangeKeyType);
            return this;
        }

        public Builder rangeKeyValue(@Nullable Output<String> rangeKeyValue) {
            this.rangeKeyValue = rangeKeyValue;
            return this;
        }

        public Builder rangeKeyValue(@Nullable String rangeKeyValue) {
            this.rangeKeyValue = Output.ofNullable(rangeKeyValue);
            return this;
        }

        public Builder tableName(Output<String> tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }

        public Builder tableName(String tableName) {
            this.tableName = Output.of(Objects.requireNonNull(tableName));
            return this;
        }
        public DetectorModelDynamoDBArgs build() {
            return new DetectorModelDynamoDBArgs(hashKeyField, hashKeyType, hashKeyValue, operation, payload, payloadField, rangeKeyField, rangeKeyType, rangeKeyValue, tableName);
        }
    }
}
