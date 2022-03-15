// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.azurenative.scheduler.enums.JobCollectionState;
import io.pulumi.azurenative.scheduler.inputs.JobCollectionQuotaArgs;
import io.pulumi.azurenative.scheduler.inputs.SkuArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobCollectionPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobCollectionPropertiesArgs Empty = new JobCollectionPropertiesArgs();

    /**
     * Gets or sets the job collection quota.
     * 
     */
    @Import(name="quota")
      private final @Nullable Output<JobCollectionQuotaArgs> quota;

    public Output<JobCollectionQuotaArgs> getQuota() {
        return this.quota == null ? Output.empty() : this.quota;
    }

    /**
     * Gets or sets the SKU.
     * 
     */
    @Import(name="sku")
      private final @Nullable Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku == null ? Output.empty() : this.sku;
    }

    /**
     * Gets or sets the state.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<JobCollectionState> state;

    public Output<JobCollectionState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    public JobCollectionPropertiesArgs(
        @Nullable Output<JobCollectionQuotaArgs> quota,
        @Nullable Output<SkuArgs> sku,
        @Nullable Output<JobCollectionState> state) {
        this.quota = quota;
        this.sku = sku;
        this.state = state;
    }

    private JobCollectionPropertiesArgs() {
        this.quota = Output.empty();
        this.sku = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCollectionPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobCollectionQuotaArgs> quota;
        private @Nullable Output<SkuArgs> sku;
        private @Nullable Output<JobCollectionState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCollectionPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quota = defaults.quota;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
        }

        public Builder quota(@Nullable Output<JobCollectionQuotaArgs> quota) {
            this.quota = quota;
            return this;
        }

        public Builder quota(@Nullable JobCollectionQuotaArgs quota) {
            this.quota = Output.ofNullable(quota);
            return this;
        }

        public Builder sku(@Nullable Output<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder sku(@Nullable SkuArgs sku) {
            this.sku = Output.ofNullable(sku);
            return this;
        }

        public Builder state(@Nullable Output<JobCollectionState> state) {
            this.state = state;
            return this;
        }

        public Builder state(@Nullable JobCollectionState state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public JobCollectionPropertiesArgs build() {
            return new JobCollectionPropertiesArgs(quota, sku, state);
        }
    }
}
