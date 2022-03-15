// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3control.inputs;

import io.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsPublicAccessBlockGetArgs;
import io.pulumi.aws.s3control.inputs.MultiRegionAccessPointDetailsRegionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MultiRegionAccessPointDetailsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final MultiRegionAccessPointDetailsGetArgs Empty = new MultiRegionAccessPointDetailsGetArgs();

    /**
     * The name of the Multi-Region Access Point.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Configuration block to manage the `PublicAccessBlock` configuration that you want to apply to this Multi-Region Access Point. You can enable the configuration options in any combination. See Public Access Block Configuration below for more details.
     * 
     */
    @Import(name="publicAccessBlock")
      private final @Nullable Output<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock;

    public Output<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> getPublicAccessBlock() {
        return this.publicAccessBlock == null ? Output.empty() : this.publicAccessBlock;
    }

    /**
     * The Region configuration block to specify the bucket associated with the Multi-Region Access Point. See Region Configuration below for more details.
     * 
     */
    @Import(name="regions", required=true)
      private final Output<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions;

    public Output<List<MultiRegionAccessPointDetailsRegionGetArgs>> getRegions() {
        return this.regions;
    }

    public MultiRegionAccessPointDetailsGetArgs(
        Output<String> name,
        @Nullable Output<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock,
        Output<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.publicAccessBlock = publicAccessBlock;
        this.regions = Objects.requireNonNull(regions, "expected parameter 'regions' to be non-null");
    }

    private MultiRegionAccessPointDetailsGetArgs() {
        this.name = Output.empty();
        this.publicAccessBlock = Output.empty();
        this.regions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiRegionAccessPointDetailsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock;
        private Output<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(MultiRegionAccessPointDetailsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.publicAccessBlock = defaults.publicAccessBlock;
    	      this.regions = defaults.regions;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder publicAccessBlock(@Nullable Output<MultiRegionAccessPointDetailsPublicAccessBlockGetArgs> publicAccessBlock) {
            this.publicAccessBlock = publicAccessBlock;
            return this;
        }

        public Builder publicAccessBlock(@Nullable MultiRegionAccessPointDetailsPublicAccessBlockGetArgs publicAccessBlock) {
            this.publicAccessBlock = Output.ofNullable(publicAccessBlock);
            return this;
        }

        public Builder regions(Output<List<MultiRegionAccessPointDetailsRegionGetArgs>> regions) {
            this.regions = Objects.requireNonNull(regions);
            return this;
        }

        public Builder regions(List<MultiRegionAccessPointDetailsRegionGetArgs> regions) {
            this.regions = Output.of(Objects.requireNonNull(regions));
            return this;
        }
        public MultiRegionAccessPointDetailsGetArgs build() {
            return new MultiRegionAccessPointDetailsGetArgs(name, publicAccessBlock, regions);
        }
    }
}
