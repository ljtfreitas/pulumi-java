// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClfsTargetResponse {
    /**
     * Resource ID of storage container.
     * 
     */
    private final @Nullable String target;

    @CustomType.Constructor
    private ClfsTargetResponse(@CustomType.Parameter("target") @Nullable String target) {
        this.target = target;
    }

    /**
     * Resource ID of storage container.
     * 
    */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClfsTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(ClfsTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder target(@Nullable String target) {
            this.target = target;
            return this;
        }
        public ClfsTargetResponse build() {
            return new ClfsTargetResponse(target);
        }
    }
}
