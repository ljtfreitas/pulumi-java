// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.timestream;

import io.pulumi.awsnative.timestream.inputs.MagneticStoreWritePropertiesPropertiesArgs;
import io.pulumi.awsnative.timestream.inputs.RetentionPropertiesPropertiesArgs;
import io.pulumi.awsnative.timestream.inputs.TableTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableArgs Empty = new TableArgs();

    /**
     * The name for the database which the table to be created belongs to.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The properties that determine whether magnetic store writes are enabled.
     * 
     */
    @Import(name="magneticStoreWriteProperties")
      private final @Nullable Output<MagneticStoreWritePropertiesPropertiesArgs> magneticStoreWriteProperties;

    public Output<MagneticStoreWritePropertiesPropertiesArgs> getMagneticStoreWriteProperties() {
        return this.magneticStoreWriteProperties == null ? Output.empty() : this.magneticStoreWriteProperties;
    }

    /**
     * The retention duration of the memory store and the magnetic store.
     * 
     */
    @Import(name="retentionProperties")
      private final @Nullable Output<RetentionPropertiesPropertiesArgs> retentionProperties;

    public Output<RetentionPropertiesPropertiesArgs> getRetentionProperties() {
        return this.retentionProperties == null ? Output.empty() : this.retentionProperties;
    }

    /**
     * The name for the table. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the table name.
     * 
     */
    @Import(name="tableName")
      private final @Nullable Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName == null ? Output.empty() : this.tableName;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<TableTagArgs>> tags;

    public Output<List<TableTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public TableArgs(
        Output<String> databaseName,
        @Nullable Output<MagneticStoreWritePropertiesPropertiesArgs> magneticStoreWriteProperties,
        @Nullable Output<RetentionPropertiesPropertiesArgs> retentionProperties,
        @Nullable Output<String> tableName,
        @Nullable Output<List<TableTagArgs>> tags) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.magneticStoreWriteProperties = magneticStoreWriteProperties;
        this.retentionProperties = retentionProperties;
        this.tableName = tableName;
        this.tags = tags;
    }

    private TableArgs() {
        this.databaseName = Output.empty();
        this.magneticStoreWriteProperties = Output.empty();
        this.retentionProperties = Output.empty();
        this.tableName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> databaseName;
        private @Nullable Output<MagneticStoreWritePropertiesPropertiesArgs> magneticStoreWriteProperties;
        private @Nullable Output<RetentionPropertiesPropertiesArgs> retentionProperties;
        private @Nullable Output<String> tableName;
        private @Nullable Output<List<TableTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(TableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.magneticStoreWriteProperties = defaults.magneticStoreWriteProperties;
    	      this.retentionProperties = defaults.retentionProperties;
    	      this.tableName = defaults.tableName;
    	      this.tags = defaults.tags;
        }

        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder magneticStoreWriteProperties(@Nullable Output<MagneticStoreWritePropertiesPropertiesArgs> magneticStoreWriteProperties) {
            this.magneticStoreWriteProperties = magneticStoreWriteProperties;
            return this;
        }

        public Builder magneticStoreWriteProperties(@Nullable MagneticStoreWritePropertiesPropertiesArgs magneticStoreWriteProperties) {
            this.magneticStoreWriteProperties = Output.ofNullable(magneticStoreWriteProperties);
            return this;
        }

        public Builder retentionProperties(@Nullable Output<RetentionPropertiesPropertiesArgs> retentionProperties) {
            this.retentionProperties = retentionProperties;
            return this;
        }

        public Builder retentionProperties(@Nullable RetentionPropertiesPropertiesArgs retentionProperties) {
            this.retentionProperties = Output.ofNullable(retentionProperties);
            return this;
        }

        public Builder tableName(@Nullable Output<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder tableName(@Nullable String tableName) {
            this.tableName = Output.ofNullable(tableName);
            return this;
        }

        public Builder tags(@Nullable Output<List<TableTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<TableTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public TableArgs build() {
            return new TableArgs(databaseName, magneticStoreWriteProperties, retentionProperties, tableName, tags);
        }
    }
}
