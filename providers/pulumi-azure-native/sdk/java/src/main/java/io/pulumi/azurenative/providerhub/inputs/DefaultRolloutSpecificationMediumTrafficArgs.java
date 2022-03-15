// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationMediumTrafficArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultRolloutSpecificationMediumTrafficArgs Empty = new DefaultRolloutSpecificationMediumTrafficArgs();

    @Import(name="regions")
      private final @Nullable Output<List<String>> regions;

    public Output<List<String>> getRegions() {
        return this.regions == null ? Output.empty() : this.regions;
    }

    @Import(name="waitDuration")
      private final @Nullable Output<String> waitDuration;

    public Output<String> getWaitDuration() {
        return this.waitDuration == null ? Output.empty() : this.waitDuration;
    }

    public DefaultRolloutSpecificationMediumTrafficArgs(
        @Nullable Output<List<String>> regions,
        @Nullable Output<String> waitDuration) {
        this.regions = regions;
        this.waitDuration = waitDuration;
    }

    private DefaultRolloutSpecificationMediumTrafficArgs() {
        this.regions = Output.empty();
        this.waitDuration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationMediumTrafficArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> regions;
        private @Nullable Output<String> waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationMediumTrafficArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regions = defaults.regions;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder regions(@Nullable Output<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder regions(@Nullable List<String> regions) {
            this.regions = Output.ofNullable(regions);
            return this;
        }

        public Builder waitDuration(@Nullable Output<String> waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }

        public Builder waitDuration(@Nullable String waitDuration) {
            this.waitDuration = Output.ofNullable(waitDuration);
            return this;
        }
        public DefaultRolloutSpecificationMediumTrafficArgs build() {
            return new DefaultRolloutSpecificationMediumTrafficArgs(regions, waitDuration);
        }
    }
}
