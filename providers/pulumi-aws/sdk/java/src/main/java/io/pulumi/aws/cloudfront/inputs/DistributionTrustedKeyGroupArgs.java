// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.DistributionTrustedKeyGroupItemArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionTrustedKeyGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionTrustedKeyGroupArgs Empty = new DistributionTrustedKeyGroupArgs();

    /**
     * A flag that specifies whether Origin Shield is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * List of nested attributes for each trusted signer
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<DistributionTrustedKeyGroupItemArgs>> items;

    public Output<List<DistributionTrustedKeyGroupItemArgs>> getItems() {
        return this.items == null ? Output.empty() : this.items;
    }

    public DistributionTrustedKeyGroupArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<DistributionTrustedKeyGroupItemArgs>> items) {
        this.enabled = enabled;
        this.items = items;
    }

    private DistributionTrustedKeyGroupArgs() {
        this.enabled = Output.empty();
        this.items = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedKeyGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<DistributionTrustedKeyGroupItemArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionTrustedKeyGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.items = defaults.items;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder items(@Nullable Output<List<DistributionTrustedKeyGroupItemArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder items(@Nullable List<DistributionTrustedKeyGroupItemArgs> items) {
            this.items = Output.ofNullable(items);
            return this;
        }
        public DistributionTrustedKeyGroupArgs build() {
            return new DistributionTrustedKeyGroupArgs(enabled, items);
        }
    }
}
