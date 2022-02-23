// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloBasicSliAvailabilityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloBasicSliAvailabilityGetArgs Empty = new SloBasicSliAvailabilityGetArgs();

    /**
     * Whether an availability SLI is enabled or not. Must be set to ` true. Defaults to  `true`.
     * 
     */
    @InputImport(name="enabled")
        private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public SloBasicSliAvailabilityGetArgs(@Nullable Input<Boolean> enabled) {
        this.enabled = enabled;
    }

    private SloBasicSliAvailabilityGetArgs() {
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloBasicSliAvailabilityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SloBasicSliAvailabilityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public SloBasicSliAvailabilityGetArgs build() {
            return new SloBasicSliAvailabilityGetArgs(enabled);
        }
    }
}
