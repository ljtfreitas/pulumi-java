// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Per database settings of an elastic pool.
 * 
 */
public final class ElasticPoolPerDatabaseSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ElasticPoolPerDatabaseSettingsArgs Empty = new ElasticPoolPerDatabaseSettingsArgs();

    /**
     * The maximum capacity any one database can consume.
     * 
     */
    @InputImport(name="maxCapacity")
        private final @Nullable Input<Double> maxCapacity;

    public Input<Double> getMaxCapacity() {
        return this.maxCapacity == null ? Input.empty() : this.maxCapacity;
    }

    /**
     * The minimum capacity all databases are guaranteed.
     * 
     */
    @InputImport(name="minCapacity")
        private final @Nullable Input<Double> minCapacity;

    public Input<Double> getMinCapacity() {
        return this.minCapacity == null ? Input.empty() : this.minCapacity;
    }

    public ElasticPoolPerDatabaseSettingsArgs(
        @Nullable Input<Double> maxCapacity,
        @Nullable Input<Double> minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
    }

    private ElasticPoolPerDatabaseSettingsArgs() {
        this.maxCapacity = Input.empty();
        this.minCapacity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticPoolPerDatabaseSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> maxCapacity;
        private @Nullable Input<Double> minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticPoolPerDatabaseSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder setMaxCapacity(@Nullable Input<Double> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder setMaxCapacity(@Nullable Double maxCapacity) {
            this.maxCapacity = Input.ofNullable(maxCapacity);
            return this;
        }

        public Builder setMinCapacity(@Nullable Input<Double> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public Builder setMinCapacity(@Nullable Double minCapacity) {
            this.minCapacity = Input.ofNullable(minCapacity);
            return this;
        }
        public ElasticPoolPerDatabaseSettingsArgs build() {
            return new ElasticPoolPerDatabaseSettingsArgs(maxCapacity, minCapacity);
        }
    }
}
