// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne extends io.pulumi.resources.InvokeArgs {

    public static final DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne Empty = new DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne();

    @Import(name="regions")
      private final @Nullable List<String> regions;

    public List<String> getRegions() {
        return this.regions == null ? List.of() : this.regions;
    }

    @Import(name="waitDuration")
      private final @Nullable String waitDuration;

    public Optional<String> getWaitDuration() {
        return this.waitDuration == null ? Optional.empty() : Optional.ofNullable(this.waitDuration);
    }

    public DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne(
        @Nullable List<String> regions,
        @Nullable String waitDuration) {
        this.regions = regions;
        this.waitDuration = waitDuration;
    }

    private DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne() {
        this.regions = List.of();
        this.waitDuration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> regions;
        private @Nullable String waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regions = defaults.regions;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder regions(@Nullable List<String> regions) {
            this.regions = regions;
            return this;
        }

        public Builder waitDuration(@Nullable String waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }
        public DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne build() {
            return new DefaultRolloutSpecificationResponseRestOfTheWorldGroupOne(regions, waitDuration);
        }
    }
}
