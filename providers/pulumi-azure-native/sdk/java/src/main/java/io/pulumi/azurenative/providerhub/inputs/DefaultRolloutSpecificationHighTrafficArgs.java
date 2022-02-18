// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationHighTrafficArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultRolloutSpecificationHighTrafficArgs Empty = new DefaultRolloutSpecificationHighTrafficArgs();

    @InputImport(name="regions")
    private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    @InputImport(name="waitDuration")
    private final @Nullable Input<String> waitDuration;

    public Input<String> getWaitDuration() {
        return this.waitDuration == null ? Input.empty() : this.waitDuration;
    }

    public DefaultRolloutSpecificationHighTrafficArgs(
        @Nullable Input<List<String>> regions,
        @Nullable Input<String> waitDuration) {
        this.regions = regions;
        this.waitDuration = waitDuration;
    }

    private DefaultRolloutSpecificationHighTrafficArgs() {
        this.regions = Input.empty();
        this.waitDuration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationHighTrafficArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> regions;
        private @Nullable Input<String> waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationHighTrafficArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regions = defaults.regions;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder setRegions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }

        public Builder setWaitDuration(@Nullable Input<String> waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }

        public Builder setWaitDuration(@Nullable String waitDuration) {
            this.waitDuration = Input.ofNullable(waitDuration);
            return this;
        }

        public DefaultRolloutSpecificationHighTrafficArgs build() {
            return new DefaultRolloutSpecificationHighTrafficArgs(regions, waitDuration);
        }
    }
}
