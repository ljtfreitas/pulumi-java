// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.IPAMIpamOperatingRegionArgs;
import io.pulumi.awsnative.ec2.inputs.IPAMTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IPAMArgs extends io.pulumi.resources.ResourceArgs {

    public static final IPAMArgs Empty = new IPAMArgs();

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
     * 
     */
    @Import(name="operatingRegions")
      private final @Nullable Output<List<IPAMIpamOperatingRegionArgs>> operatingRegions;

    public Output<List<IPAMIpamOperatingRegionArgs>> getOperatingRegions() {
        return this.operatingRegions == null ? Output.empty() : this.operatingRegions;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<IPAMTagArgs>> tags;

    public Output<List<IPAMTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public IPAMArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<IPAMIpamOperatingRegionArgs>> operatingRegions,
        @Nullable Output<List<IPAMTagArgs>> tags) {
        this.description = description;
        this.operatingRegions = operatingRegions;
        this.tags = tags;
    }

    private IPAMArgs() {
        this.description = Output.empty();
        this.operatingRegions = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPAMArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<IPAMIpamOperatingRegionArgs>> operatingRegions;
        private @Nullable Output<List<IPAMTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IPAMArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.operatingRegions = defaults.operatingRegions;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder operatingRegions(@Nullable Output<List<IPAMIpamOperatingRegionArgs>> operatingRegions) {
            this.operatingRegions = operatingRegions;
            return this;
        }

        public Builder operatingRegions(@Nullable List<IPAMIpamOperatingRegionArgs> operatingRegions) {
            this.operatingRegions = Output.ofNullable(operatingRegions);
            return this;
        }

        public Builder tags(@Nullable Output<List<IPAMTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<IPAMTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public IPAMArgs build() {
            return new IPAMArgs(description, operatingRegions, tags);
        }
    }
}
