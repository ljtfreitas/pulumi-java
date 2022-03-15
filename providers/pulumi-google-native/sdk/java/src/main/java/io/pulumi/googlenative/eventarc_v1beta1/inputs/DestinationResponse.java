// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.eventarc_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.eventarc_v1beta1.inputs.CloudRunServiceResponse;
import java.util.Objects;


/**
 * Represents a target of an invocation over HTTP.
 * 
 */
public final class DestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DestinationResponse Empty = new DestinationResponse();

    /**
     * Cloud Run fully-managed service that receives the events. The service should be running in the same project as the trigger.
     * 
     */
    @Import(name="cloudRunService", required=true)
      private final CloudRunServiceResponse cloudRunService;

    public CloudRunServiceResponse getCloudRunService() {
        return this.cloudRunService;
    }

    public DestinationResponse(CloudRunServiceResponse cloudRunService) {
        this.cloudRunService = Objects.requireNonNull(cloudRunService, "expected parameter 'cloudRunService' to be non-null");
    }

    private DestinationResponse() {
        this.cloudRunService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudRunServiceResponse cloudRunService;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudRunService = defaults.cloudRunService;
        }

        public Builder cloudRunService(CloudRunServiceResponse cloudRunService) {
            this.cloudRunService = Objects.requireNonNull(cloudRunService);
            return this;
        }
        public DestinationResponse build() {
            return new DestinationResponse(cloudRunService);
        }
    }
}
