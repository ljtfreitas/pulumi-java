// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatabaseStatisticsResponse {
    /**
     * The database size - the total size of compressed data and index in bytes.
     * 
     */
    private final @Nullable Double size;

    @OutputCustomType.Constructor({"size"})
    private DatabaseStatisticsResponse(@Nullable Double size) {
        this.size = size;
    }

    /**
     * The database size - the total size of compressed data and index in bytes.
     * 
     */
    public Optional<Double> getSize() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double size;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.size = defaults.size;
        }

        public Builder setSize(@Nullable Double size) {
            this.size = size;
            return this;
        }
        public DatabaseStatisticsResponse build() {
            return new DatabaseStatisticsResponse(size);
        }
    }
}
