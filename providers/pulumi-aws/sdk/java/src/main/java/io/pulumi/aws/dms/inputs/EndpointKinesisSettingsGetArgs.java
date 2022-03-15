// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointKinesisSettingsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointKinesisSettingsGetArgs Empty = new EndpointKinesisSettingsGetArgs();

    /**
     * Shows detailed control information for table definition, column definition, and table and column changes in the Kinesis message output. The default is `false`.
     * 
     */
    @Import(name="includeControlDetails")
      private final @Nullable Output<Boolean> includeControlDetails;

    public Output<Boolean> getIncludeControlDetails() {
        return this.includeControlDetails == null ? Output.empty() : this.includeControlDetails;
    }

    /**
     * Include NULL and empty columns in the target. The default is `false`.
     * 
     */
    @Import(name="includeNullAndEmpty")
      private final @Nullable Output<Boolean> includeNullAndEmpty;

    public Output<Boolean> getIncludeNullAndEmpty() {
        return this.includeNullAndEmpty == null ? Output.empty() : this.includeNullAndEmpty;
    }

    /**
     * Shows the partition value within the Kinesis message output, unless the partition type is schema-table-type. The default is `false`.
     * 
     */
    @Import(name="includePartitionValue")
      private final @Nullable Output<Boolean> includePartitionValue;

    public Output<Boolean> getIncludePartitionValue() {
        return this.includePartitionValue == null ? Output.empty() : this.includePartitionValue;
    }

    /**
     * Includes any data definition language (DDL) operations that change the table in the control data. The default is `false`.
     * 
     */
    @Import(name="includeTableAlterOperations")
      private final @Nullable Output<Boolean> includeTableAlterOperations;

    public Output<Boolean> getIncludeTableAlterOperations() {
        return this.includeTableAlterOperations == null ? Output.empty() : this.includeTableAlterOperations;
    }

    /**
     * Provides detailed transaction information from the source database. The default is `false`.
     * 
     */
    @Import(name="includeTransactionDetails")
      private final @Nullable Output<Boolean> includeTransactionDetails;

    public Output<Boolean> getIncludeTransactionDetails() {
        return this.includeTransactionDetails == null ? Output.empty() : this.includeTransactionDetails;
    }

    /**
     * Output format for the records created. Defaults to `json`. Valid values are `json` and `json_unformatted` (a single line with no tab).
     * 
     */
    @Import(name="messageFormat")
      private final @Nullable Output<String> messageFormat;

    public Output<String> getMessageFormat() {
        return this.messageFormat == null ? Output.empty() : this.messageFormat;
    }

    /**
     * Prefixes schema and table names to partition values, when the partition type is primary-key-type. The default is `false`.
     * 
     */
    @Import(name="partitionIncludeSchemaTable")
      private final @Nullable Output<Boolean> partitionIncludeSchemaTable;

    public Output<Boolean> getPartitionIncludeSchemaTable() {
        return this.partitionIncludeSchemaTable == null ? Output.empty() : this.partitionIncludeSchemaTable;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Kinesis data stream.
     * 
     */
    @Import(name="serviceAccessRoleArn")
      private final @Nullable Output<String> serviceAccessRoleArn;

    public Output<String> getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn == null ? Output.empty() : this.serviceAccessRoleArn;
    }

    /**
     * Amazon Resource Name (ARN) of the Kinesis data stream.
     * 
     */
    @Import(name="streamArn")
      private final @Nullable Output<String> streamArn;

    public Output<String> getStreamArn() {
        return this.streamArn == null ? Output.empty() : this.streamArn;
    }

    public EndpointKinesisSettingsGetArgs(
        @Nullable Output<Boolean> includeControlDetails,
        @Nullable Output<Boolean> includeNullAndEmpty,
        @Nullable Output<Boolean> includePartitionValue,
        @Nullable Output<Boolean> includeTableAlterOperations,
        @Nullable Output<Boolean> includeTransactionDetails,
        @Nullable Output<String> messageFormat,
        @Nullable Output<Boolean> partitionIncludeSchemaTable,
        @Nullable Output<String> serviceAccessRoleArn,
        @Nullable Output<String> streamArn) {
        this.includeControlDetails = includeControlDetails;
        this.includeNullAndEmpty = includeNullAndEmpty;
        this.includePartitionValue = includePartitionValue;
        this.includeTableAlterOperations = includeTableAlterOperations;
        this.includeTransactionDetails = includeTransactionDetails;
        this.messageFormat = messageFormat;
        this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        this.streamArn = streamArn;
    }

    private EndpointKinesisSettingsGetArgs() {
        this.includeControlDetails = Output.empty();
        this.includeNullAndEmpty = Output.empty();
        this.includePartitionValue = Output.empty();
        this.includeTableAlterOperations = Output.empty();
        this.includeTransactionDetails = Output.empty();
        this.messageFormat = Output.empty();
        this.partitionIncludeSchemaTable = Output.empty();
        this.serviceAccessRoleArn = Output.empty();
        this.streamArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointKinesisSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> includeControlDetails;
        private @Nullable Output<Boolean> includeNullAndEmpty;
        private @Nullable Output<Boolean> includePartitionValue;
        private @Nullable Output<Boolean> includeTableAlterOperations;
        private @Nullable Output<Boolean> includeTransactionDetails;
        private @Nullable Output<String> messageFormat;
        private @Nullable Output<Boolean> partitionIncludeSchemaTable;
        private @Nullable Output<String> serviceAccessRoleArn;
        private @Nullable Output<String> streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointKinesisSettingsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.includeControlDetails = defaults.includeControlDetails;
    	      this.includeNullAndEmpty = defaults.includeNullAndEmpty;
    	      this.includePartitionValue = defaults.includePartitionValue;
    	      this.includeTableAlterOperations = defaults.includeTableAlterOperations;
    	      this.includeTransactionDetails = defaults.includeTransactionDetails;
    	      this.messageFormat = defaults.messageFormat;
    	      this.partitionIncludeSchemaTable = defaults.partitionIncludeSchemaTable;
    	      this.serviceAccessRoleArn = defaults.serviceAccessRoleArn;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder includeControlDetails(@Nullable Output<Boolean> includeControlDetails) {
            this.includeControlDetails = includeControlDetails;
            return this;
        }

        public Builder includeControlDetails(@Nullable Boolean includeControlDetails) {
            this.includeControlDetails = Output.ofNullable(includeControlDetails);
            return this;
        }

        public Builder includeNullAndEmpty(@Nullable Output<Boolean> includeNullAndEmpty) {
            this.includeNullAndEmpty = includeNullAndEmpty;
            return this;
        }

        public Builder includeNullAndEmpty(@Nullable Boolean includeNullAndEmpty) {
            this.includeNullAndEmpty = Output.ofNullable(includeNullAndEmpty);
            return this;
        }

        public Builder includePartitionValue(@Nullable Output<Boolean> includePartitionValue) {
            this.includePartitionValue = includePartitionValue;
            return this;
        }

        public Builder includePartitionValue(@Nullable Boolean includePartitionValue) {
            this.includePartitionValue = Output.ofNullable(includePartitionValue);
            return this;
        }

        public Builder includeTableAlterOperations(@Nullable Output<Boolean> includeTableAlterOperations) {
            this.includeTableAlterOperations = includeTableAlterOperations;
            return this;
        }

        public Builder includeTableAlterOperations(@Nullable Boolean includeTableAlterOperations) {
            this.includeTableAlterOperations = Output.ofNullable(includeTableAlterOperations);
            return this;
        }

        public Builder includeTransactionDetails(@Nullable Output<Boolean> includeTransactionDetails) {
            this.includeTransactionDetails = includeTransactionDetails;
            return this;
        }

        public Builder includeTransactionDetails(@Nullable Boolean includeTransactionDetails) {
            this.includeTransactionDetails = Output.ofNullable(includeTransactionDetails);
            return this;
        }

        public Builder messageFormat(@Nullable Output<String> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder messageFormat(@Nullable String messageFormat) {
            this.messageFormat = Output.ofNullable(messageFormat);
            return this;
        }

        public Builder partitionIncludeSchemaTable(@Nullable Output<Boolean> partitionIncludeSchemaTable) {
            this.partitionIncludeSchemaTable = partitionIncludeSchemaTable;
            return this;
        }

        public Builder partitionIncludeSchemaTable(@Nullable Boolean partitionIncludeSchemaTable) {
            this.partitionIncludeSchemaTable = Output.ofNullable(partitionIncludeSchemaTable);
            return this;
        }

        public Builder serviceAccessRoleArn(@Nullable Output<String> serviceAccessRoleArn) {
            this.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        public Builder serviceAccessRoleArn(@Nullable String serviceAccessRoleArn) {
            this.serviceAccessRoleArn = Output.ofNullable(serviceAccessRoleArn);
            return this;
        }

        public Builder streamArn(@Nullable Output<String> streamArn) {
            this.streamArn = streamArn;
            return this;
        }

        public Builder streamArn(@Nullable String streamArn) {
            this.streamArn = Output.ofNullable(streamArn);
            return this;
        }
        public EndpointKinesisSettingsGetArgs build() {
            return new EndpointKinesisSettingsGetArgs(includeControlDetails, includeNullAndEmpty, includePartitionValue, includeTableAlterOperations, includeTransactionDetails, messageFormat, partitionIncludeSchemaTable, serviceAccessRoleArn, streamArn);
        }
    }
}
