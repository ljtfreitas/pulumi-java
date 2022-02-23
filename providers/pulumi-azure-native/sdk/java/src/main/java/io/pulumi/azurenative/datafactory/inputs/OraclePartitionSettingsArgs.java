// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings that will be leveraged for Oracle source partitioning.
 * 
 */
public final class OraclePartitionSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final OraclePartitionSettingsArgs Empty = new OraclePartitionSettingsArgs();

    /**
     * The name of the column in integer type that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionColumnName")
        private final @Nullable Input<Object> partitionColumnName;

    public Input<Object> getPartitionColumnName() {
        return this.partitionColumnName == null ? Input.empty() : this.partitionColumnName;
    }

    /**
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionLowerBound")
        private final @Nullable Input<Object> partitionLowerBound;

    public Input<Object> getPartitionLowerBound() {
        return this.partitionLowerBound == null ? Input.empty() : this.partitionLowerBound;
    }

    /**
     * Names of the physical partitions of Oracle table.
     * 
     */
    @InputImport(name="partitionNames")
        private final @Nullable Input<List<Object>> partitionNames;

    public Input<List<Object>> getPartitionNames() {
        return this.partitionNames == null ? Input.empty() : this.partitionNames;
    }

    /**
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="partitionUpperBound")
        private final @Nullable Input<Object> partitionUpperBound;

    public Input<Object> getPartitionUpperBound() {
        return this.partitionUpperBound == null ? Input.empty() : this.partitionUpperBound;
    }

    public OraclePartitionSettingsArgs(
        @Nullable Input<Object> partitionColumnName,
        @Nullable Input<Object> partitionLowerBound,
        @Nullable Input<List<Object>> partitionNames,
        @Nullable Input<Object> partitionUpperBound) {
        this.partitionColumnName = partitionColumnName;
        this.partitionLowerBound = partitionLowerBound;
        this.partitionNames = partitionNames;
        this.partitionUpperBound = partitionUpperBound;
    }

    private OraclePartitionSettingsArgs() {
        this.partitionColumnName = Input.empty();
        this.partitionLowerBound = Input.empty();
        this.partitionNames = Input.empty();
        this.partitionUpperBound = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OraclePartitionSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> partitionColumnName;
        private @Nullable Input<Object> partitionLowerBound;
        private @Nullable Input<List<Object>> partitionNames;
        private @Nullable Input<Object> partitionUpperBound;

        public Builder() {
    	      // Empty
        }

        public Builder(OraclePartitionSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partitionColumnName = defaults.partitionColumnName;
    	      this.partitionLowerBound = defaults.partitionLowerBound;
    	      this.partitionNames = defaults.partitionNames;
    	      this.partitionUpperBound = defaults.partitionUpperBound;
        }

        public Builder setPartitionColumnName(@Nullable Input<Object> partitionColumnName) {
            this.partitionColumnName = partitionColumnName;
            return this;
        }

        public Builder setPartitionColumnName(@Nullable Object partitionColumnName) {
            this.partitionColumnName = Input.ofNullable(partitionColumnName);
            return this;
        }

        public Builder setPartitionLowerBound(@Nullable Input<Object> partitionLowerBound) {
            this.partitionLowerBound = partitionLowerBound;
            return this;
        }

        public Builder setPartitionLowerBound(@Nullable Object partitionLowerBound) {
            this.partitionLowerBound = Input.ofNullable(partitionLowerBound);
            return this;
        }

        public Builder setPartitionNames(@Nullable Input<List<Object>> partitionNames) {
            this.partitionNames = partitionNames;
            return this;
        }

        public Builder setPartitionNames(@Nullable List<Object> partitionNames) {
            this.partitionNames = Input.ofNullable(partitionNames);
            return this;
        }

        public Builder setPartitionUpperBound(@Nullable Input<Object> partitionUpperBound) {
            this.partitionUpperBound = partitionUpperBound;
            return this;
        }

        public Builder setPartitionUpperBound(@Nullable Object partitionUpperBound) {
            this.partitionUpperBound = Input.ofNullable(partitionUpperBound);
            return this;
        }
        public OraclePartitionSettingsArgs build() {
            return new OraclePartitionSettingsArgs(partitionColumnName, partitionLowerBound, partitionNames, partitionUpperBound);
        }
    }
}
