// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1TraceSamplingConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OverrideArgs extends io.pulumi.resources.ResourceArgs {

    public static final OverrideArgs Empty = new OverrideArgs();

    /**
     * ID of the API proxy that will have its trace configuration overridden.
     * 
     */
    @Import(name="apiProxy")
      private final @Nullable Output<String> apiProxy;

    public Output<String> getApiProxy() {
        return this.apiProxy == null ? Output.empty() : this.apiProxy;
    }

    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * ID of the trace configuration override specified as a system-generated UUID.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="organizationId", required=true)
      private final Output<String> organizationId;

    public Output<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Trace configuration to override.
     * 
     */
    @Import(name="samplingConfig")
      private final @Nullable Output<GoogleCloudApigeeV1TraceSamplingConfigArgs> samplingConfig;

    public Output<GoogleCloudApigeeV1TraceSamplingConfigArgs> getSamplingConfig() {
        return this.samplingConfig == null ? Output.empty() : this.samplingConfig;
    }

    public OverrideArgs(
        @Nullable Output<String> apiProxy,
        Output<String> environmentId,
        @Nullable Output<String> name,
        Output<String> organizationId,
        @Nullable Output<GoogleCloudApigeeV1TraceSamplingConfigArgs> samplingConfig) {
        this.apiProxy = apiProxy;
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.samplingConfig = samplingConfig;
    }

    private OverrideArgs() {
        this.apiProxy = Output.empty();
        this.environmentId = Output.empty();
        this.name = Output.empty();
        this.organizationId = Output.empty();
        this.samplingConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OverrideArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> apiProxy;
        private Output<String> environmentId;
        private @Nullable Output<String> name;
        private Output<String> organizationId;
        private @Nullable Output<GoogleCloudApigeeV1TraceSamplingConfigArgs> samplingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(OverrideArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProxy = defaults.apiProxy;
    	      this.environmentId = defaults.environmentId;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.samplingConfig = defaults.samplingConfig;
        }

        public Builder apiProxy(@Nullable Output<String> apiProxy) {
            this.apiProxy = apiProxy;
            return this;
        }

        public Builder apiProxy(@Nullable String apiProxy) {
            this.apiProxy = Output.ofNullable(apiProxy);
            return this;
        }

        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder organizationId(Output<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Output.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder samplingConfig(@Nullable Output<GoogleCloudApigeeV1TraceSamplingConfigArgs> samplingConfig) {
            this.samplingConfig = samplingConfig;
            return this;
        }

        public Builder samplingConfig(@Nullable GoogleCloudApigeeV1TraceSamplingConfigArgs samplingConfig) {
            this.samplingConfig = Output.ofNullable(samplingConfig);
            return this;
        }
        public OverrideArgs build() {
            return new OverrideArgs(apiProxy, environmentId, name, organizationId, samplingConfig);
        }
    }
}
