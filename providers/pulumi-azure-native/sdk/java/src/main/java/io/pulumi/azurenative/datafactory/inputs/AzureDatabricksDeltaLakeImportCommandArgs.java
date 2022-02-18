// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Azure Databricks Delta Lake import command settings.
 * 
 */
public final class AzureDatabricksDeltaLakeImportCommandArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureDatabricksDeltaLakeImportCommandArgs Empty = new AzureDatabricksDeltaLakeImportCommandArgs();

    /**
     * Specify the date format for csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="dateFormat")
    private final @Nullable Input<Object> dateFormat;

    public Input<Object> getDateFormat() {
        return this.dateFormat == null ? Input.empty() : this.dateFormat;
    }

    /**
     * Specify the timestamp format for csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with resultType string).
     * 
     */
    @InputImport(name="timestampFormat")
    private final @Nullable Input<Object> timestampFormat;

    public Input<Object> getTimestampFormat() {
        return this.timestampFormat == null ? Input.empty() : this.timestampFormat;
    }

    /**
     * The import setting type.
     * Expected value is 'AzureDatabricksDeltaLakeImportCommand'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public AzureDatabricksDeltaLakeImportCommandArgs(
        @Nullable Input<Object> dateFormat,
        @Nullable Input<Object> timestampFormat,
        Input<String> type) {
        this.dateFormat = dateFormat;
        this.timestampFormat = timestampFormat;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AzureDatabricksDeltaLakeImportCommandArgs() {
        this.dateFormat = Input.empty();
        this.timestampFormat = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDatabricksDeltaLakeImportCommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> dateFormat;
        private @Nullable Input<Object> timestampFormat;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDatabricksDeltaLakeImportCommandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateFormat = defaults.dateFormat;
    	      this.timestampFormat = defaults.timestampFormat;
    	      this.type = defaults.type;
        }

        public Builder setDateFormat(@Nullable Input<Object> dateFormat) {
            this.dateFormat = dateFormat;
            return this;
        }

        public Builder setDateFormat(@Nullable Object dateFormat) {
            this.dateFormat = Input.ofNullable(dateFormat);
            return this;
        }

        public Builder setTimestampFormat(@Nullable Input<Object> timestampFormat) {
            this.timestampFormat = timestampFormat;
            return this;
        }

        public Builder setTimestampFormat(@Nullable Object timestampFormat) {
            this.timestampFormat = Input.ofNullable(timestampFormat);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public AzureDatabricksDeltaLakeImportCommandArgs build() {
            return new AzureDatabricksDeltaLakeImportCommandArgs(dateFormat, timestampFormat, type);
        }
    }
}
