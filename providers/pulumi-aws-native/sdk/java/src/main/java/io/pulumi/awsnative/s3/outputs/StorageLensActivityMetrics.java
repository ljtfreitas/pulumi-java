// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class StorageLensActivityMetrics {
    /**
     * Specifies whether activity metrics are enabled or disabled.
     * 
     */
    private final @Nullable Boolean isEnabled;

    @OutputCustomType.Constructor({"isEnabled"})
    private StorageLensActivityMetrics(@Nullable Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * Specifies whether activity metrics are enabled or disabled.
     * 
     */
    public Optional<Boolean> getIsEnabled() {
        return Optional.ofNullable(this.isEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageLensActivityMetrics defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageLensActivityMetrics defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder setIsEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public StorageLensActivityMetrics build() {
            return new StorageLensActivityMetrics(isEnabled);
        }
    }
}
