// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A class that contains database statistics information.
 * 
 */
public final class DatabaseStatisticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabaseStatisticsResponse Empty = new DatabaseStatisticsResponse();

    /**
     * The database size - the total size of compressed data and index in bytes.
     * 
     */
    @Import(name="size")
      private final @Nullable Double size;

    public Optional<Double> getSize() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    public DatabaseStatisticsResponse(@Nullable Double size) {
        this.size = size;
    }

    private DatabaseStatisticsResponse() {
        this.size = null;
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

        public Builder size(@Nullable Double size) {
            this.size = size;
            return this;
        }
        public DatabaseStatisticsResponse build() {
            return new DatabaseStatisticsResponse(size);
        }
    }
}
