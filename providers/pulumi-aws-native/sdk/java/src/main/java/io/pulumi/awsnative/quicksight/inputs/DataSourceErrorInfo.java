// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.DataSourceErrorInfoType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>Error information for the data source creation or update.</p>
 * 
 */
public final class DataSourceErrorInfo extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceErrorInfo Empty = new DataSourceErrorInfo();

    /**
     * <p>Error message.</p>
     * 
     */
    @Import(name="message")
      private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @Import(name="type")
      private final @Nullable DataSourceErrorInfoType type;

    public Optional<DataSourceErrorInfoType> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public DataSourceErrorInfo(
        @Nullable String message,
        @Nullable DataSourceErrorInfoType type) {
        this.message = message;
        this.type = type;
    }

    private DataSourceErrorInfo() {
        this.message = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceErrorInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String message;
        private @Nullable DataSourceErrorInfoType type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceErrorInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder type(@Nullable DataSourceErrorInfoType type) {
            this.type = type;
            return this;
        }
        public DataSourceErrorInfo build() {
            return new DataSourceErrorInfo(message, type);
        }
    }
}
