// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.search.inputs;

import io.pulumi.azurenative.search.enums.SkuName;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the SKU of an Azure Cognitive Search Service, which determines price tier and capacity limits.
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The SKU of the search service. Valid values include: 'free': Shared service. 'basic': Dedicated service with up to 3 replicas. 'standard': Dedicated service with up to 12 partitions and 12 replicas. 'standard2': Similar to standard, but with more capacity per search unit. 'standard3': The largest Standard offering with up to 12 partitions and 12 replicas (or up to 3 partitions with more indexes if you also set the hostingMode property to 'highDensity'). 'storage_optimized_l1': Supports 1TB per partition, up to 12 partitions. 'storage_optimized_l2': Supports 2TB per partition, up to 12 partitions.'
     * 
     */
    @Import(name="name")
      private final @Nullable Output<SkuName> name;

    public Output<SkuName> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public SkuArgs(@Nullable Output<SkuName> name) {
        this.name = name;
    }

    private SkuArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SkuName> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable Output<SkuName> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable SkuName name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public SkuArgs build() {
            return new SkuArgs(name);
        }
    }
}
