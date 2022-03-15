// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents configurations for a test case.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1TestConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1TestConfigResponse Empty = new GoogleCloudDialogflowCxV3beta1TestConfigResponse();

    /**
     * Flow name. If not set, default start flow is assumed. Format: `projects//locations//agents//flows/`.
     * 
     */
    @Import(name="flow", required=true)
      private final String flow;

    public String getFlow() {
        return this.flow;
    }

    /**
     * Session parameters to be compared when calculating differences.
     * 
     */
    @Import(name="trackingParameters", required=true)
      private final List<String> trackingParameters;

    public List<String> getTrackingParameters() {
        return this.trackingParameters;
    }

    public GoogleCloudDialogflowCxV3beta1TestConfigResponse(
        String flow,
        List<String> trackingParameters) {
        this.flow = Objects.requireNonNull(flow, "expected parameter 'flow' to be non-null");
        this.trackingParameters = Objects.requireNonNull(trackingParameters, "expected parameter 'trackingParameters' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1TestConfigResponse() {
        this.flow = null;
        this.trackingParameters = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1TestConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flow;
        private List<String> trackingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1TestConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flow = defaults.flow;
    	      this.trackingParameters = defaults.trackingParameters;
        }

        public Builder flow(String flow) {
            this.flow = Objects.requireNonNull(flow);
            return this;
        }

        public Builder trackingParameters(List<String> trackingParameters) {
            this.trackingParameters = Objects.requireNonNull(trackingParameters);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1TestConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1TestConfigResponse(flow, trackingParameters);
        }
    }
}
