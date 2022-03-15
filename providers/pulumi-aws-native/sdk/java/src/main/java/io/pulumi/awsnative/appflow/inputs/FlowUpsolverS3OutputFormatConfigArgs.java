// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.enums.FlowFileType;
import io.pulumi.awsnative.appflow.inputs.FlowAggregationConfigArgs;
import io.pulumi.awsnative.appflow.inputs.FlowPrefixConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlowUpsolverS3OutputFormatConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowUpsolverS3OutputFormatConfigArgs Empty = new FlowUpsolverS3OutputFormatConfigArgs();

    @Import(name="aggregationConfig")
      private final @Nullable Output<FlowAggregationConfigArgs> aggregationConfig;

    public Output<FlowAggregationConfigArgs> getAggregationConfig() {
        return this.aggregationConfig == null ? Output.empty() : this.aggregationConfig;
    }

    @Import(name="fileType")
      private final @Nullable Output<FlowFileType> fileType;

    public Output<FlowFileType> getFileType() {
        return this.fileType == null ? Output.empty() : this.fileType;
    }

    @Import(name="prefixConfig", required=true)
      private final Output<FlowPrefixConfigArgs> prefixConfig;

    public Output<FlowPrefixConfigArgs> getPrefixConfig() {
        return this.prefixConfig;
    }

    public FlowUpsolverS3OutputFormatConfigArgs(
        @Nullable Output<FlowAggregationConfigArgs> aggregationConfig,
        @Nullable Output<FlowFileType> fileType,
        Output<FlowPrefixConfigArgs> prefixConfig) {
        this.aggregationConfig = aggregationConfig;
        this.fileType = fileType;
        this.prefixConfig = Objects.requireNonNull(prefixConfig, "expected parameter 'prefixConfig' to be non-null");
    }

    private FlowUpsolverS3OutputFormatConfigArgs() {
        this.aggregationConfig = Output.empty();
        this.fileType = Output.empty();
        this.prefixConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowUpsolverS3OutputFormatConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FlowAggregationConfigArgs> aggregationConfig;
        private @Nullable Output<FlowFileType> fileType;
        private Output<FlowPrefixConfigArgs> prefixConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowUpsolverS3OutputFormatConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationConfig = defaults.aggregationConfig;
    	      this.fileType = defaults.fileType;
    	      this.prefixConfig = defaults.prefixConfig;
        }

        public Builder aggregationConfig(@Nullable Output<FlowAggregationConfigArgs> aggregationConfig) {
            this.aggregationConfig = aggregationConfig;
            return this;
        }

        public Builder aggregationConfig(@Nullable FlowAggregationConfigArgs aggregationConfig) {
            this.aggregationConfig = Output.ofNullable(aggregationConfig);
            return this;
        }

        public Builder fileType(@Nullable Output<FlowFileType> fileType) {
            this.fileType = fileType;
            return this;
        }

        public Builder fileType(@Nullable FlowFileType fileType) {
            this.fileType = Output.ofNullable(fileType);
            return this;
        }

        public Builder prefixConfig(Output<FlowPrefixConfigArgs> prefixConfig) {
            this.prefixConfig = Objects.requireNonNull(prefixConfig);
            return this;
        }

        public Builder prefixConfig(FlowPrefixConfigArgs prefixConfig) {
            this.prefixConfig = Output.of(Objects.requireNonNull(prefixConfig));
            return this;
        }
        public FlowUpsolverS3OutputFormatConfigArgs build() {
            return new FlowUpsolverS3OutputFormatConfigArgs(aggregationConfig, fileType, prefixConfig);
        }
    }
}
