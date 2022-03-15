// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datapipelines_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs;
import io.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1LaunchTemplateRequestArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Workload details for creating the pipeline jobs.
 * 
 */
public final class GoogleCloudDatapipelinesV1WorkloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1WorkloadArgs Empty = new GoogleCloudDatapipelinesV1WorkloadArgs();

    /**
     * Template information and additional parameters needed to launch a Dataflow job using the flex launch API.
     * 
     */
    @Import(name="dataflowFlexTemplateRequest")
      private final @Nullable Output<GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs> dataflowFlexTemplateRequest;

    public Output<GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs> getDataflowFlexTemplateRequest() {
        return this.dataflowFlexTemplateRequest == null ? Output.empty() : this.dataflowFlexTemplateRequest;
    }

    /**
     * Template information and additional parameters needed to launch a Dataflow job using the standard launch API.
     * 
     */
    @Import(name="dataflowLaunchTemplateRequest")
      private final @Nullable Output<GoogleCloudDatapipelinesV1LaunchTemplateRequestArgs> dataflowLaunchTemplateRequest;

    public Output<GoogleCloudDatapipelinesV1LaunchTemplateRequestArgs> getDataflowLaunchTemplateRequest() {
        return this.dataflowLaunchTemplateRequest == null ? Output.empty() : this.dataflowLaunchTemplateRequest;
    }

    public GoogleCloudDatapipelinesV1WorkloadArgs(
        @Nullable Output<GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs> dataflowFlexTemplateRequest,
        @Nullable Output<GoogleCloudDatapipelinesV1LaunchTemplateRequestArgs> dataflowLaunchTemplateRequest) {
        this.dataflowFlexTemplateRequest = dataflowFlexTemplateRequest;
        this.dataflowLaunchTemplateRequest = dataflowLaunchTemplateRequest;
    }

    private GoogleCloudDatapipelinesV1WorkloadArgs() {
        this.dataflowFlexTemplateRequest = Output.empty();
        this.dataflowLaunchTemplateRequest = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatapipelinesV1WorkloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs> dataflowFlexTemplateRequest;
        private @Nullable Output<GoogleCloudDatapipelinesV1LaunchTemplateRequestArgs> dataflowLaunchTemplateRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatapipelinesV1WorkloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataflowFlexTemplateRequest = defaults.dataflowFlexTemplateRequest;
    	      this.dataflowLaunchTemplateRequest = defaults.dataflowLaunchTemplateRequest;
        }

        public Builder dataflowFlexTemplateRequest(@Nullable Output<GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs> dataflowFlexTemplateRequest) {
            this.dataflowFlexTemplateRequest = dataflowFlexTemplateRequest;
            return this;
        }

        public Builder dataflowFlexTemplateRequest(@Nullable GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs dataflowFlexTemplateRequest) {
            this.dataflowFlexTemplateRequest = Output.ofNullable(dataflowFlexTemplateRequest);
            return this;
        }

        public Builder dataflowLaunchTemplateRequest(@Nullable Output<GoogleCloudDatapipelinesV1LaunchTemplateRequestArgs> dataflowLaunchTemplateRequest) {
            this.dataflowLaunchTemplateRequest = dataflowLaunchTemplateRequest;
            return this;
        }

        public Builder dataflowLaunchTemplateRequest(@Nullable GoogleCloudDatapipelinesV1LaunchTemplateRequestArgs dataflowLaunchTemplateRequest) {
            this.dataflowLaunchTemplateRequest = Output.ofNullable(dataflowLaunchTemplateRequest);
            return this;
        }
        public GoogleCloudDatapipelinesV1WorkloadArgs build() {
            return new GoogleCloudDatapipelinesV1WorkloadArgs(dataflowFlexTemplateRequest, dataflowLaunchTemplateRequest);
        }
    }
}
