// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1TraceSamplingConfigResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetOverrideResult {
    /**
     * ID of the API proxy that will have its trace configuration overridden.
     * 
     */
    private final String apiProxy;
    /**
     * ID of the trace configuration override specified as a system-generated UUID.
     * 
     */
    private final String name;
    /**
     * Trace configuration to override.
     * 
     */
    private final GoogleCloudApigeeV1TraceSamplingConfigResponse samplingConfig;

    @OutputCustomType.Constructor({"apiProxy","name","samplingConfig"})
    private GetOverrideResult(
        String apiProxy,
        String name,
        GoogleCloudApigeeV1TraceSamplingConfigResponse samplingConfig) {
        this.apiProxy = Objects.requireNonNull(apiProxy);
        this.name = Objects.requireNonNull(name);
        this.samplingConfig = Objects.requireNonNull(samplingConfig);
    }

    /**
     * ID of the API proxy that will have its trace configuration overridden.
     * 
     */
    public String getApiProxy() {
        return this.apiProxy;
    }
    /**
     * ID of the trace configuration override specified as a system-generated UUID.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Trace configuration to override.
     * 
     */
    public GoogleCloudApigeeV1TraceSamplingConfigResponse getSamplingConfig() {
        return this.samplingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOverrideResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiProxy;
        private String name;
        private GoogleCloudApigeeV1TraceSamplingConfigResponse samplingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOverrideResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProxy = defaults.apiProxy;
    	      this.name = defaults.name;
    	      this.samplingConfig = defaults.samplingConfig;
        }

        public Builder setApiProxy(String apiProxy) {
            this.apiProxy = Objects.requireNonNull(apiProxy);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSamplingConfig(GoogleCloudApigeeV1TraceSamplingConfigResponse samplingConfig) {
            this.samplingConfig = Objects.requireNonNull(samplingConfig);
            return this;
        }
        public GetOverrideResult build() {
            return new GetOverrideResult(apiProxy, name, samplingConfig);
        }
    }
}
