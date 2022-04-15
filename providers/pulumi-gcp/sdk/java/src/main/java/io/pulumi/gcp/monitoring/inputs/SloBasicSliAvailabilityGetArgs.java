// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloBasicSliAvailabilityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloBasicSliAvailabilityGetArgs Empty = new SloBasicSliAvailabilityGetArgs();

    /**
     * Whether an availability SLI is enabled or not. Must be set to ` true. Defaults to  `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public SloBasicSliAvailabilityGetArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private SloBasicSliAvailabilityGetArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloBasicSliAvailabilityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SloBasicSliAvailabilityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public SloBasicSliAvailabilityGetArgs build() {
            return new SloBasicSliAvailabilityGetArgs(enabled);
        }
    }
}
