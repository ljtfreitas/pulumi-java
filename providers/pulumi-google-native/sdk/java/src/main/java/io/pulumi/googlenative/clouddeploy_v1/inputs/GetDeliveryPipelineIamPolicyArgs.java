// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.clouddeploy_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeliveryPipelineIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeliveryPipelineIamPolicyArgs Empty = new GetDeliveryPipelineIamPolicyArgs();

    @Import(name="deliveryPipelineId", required=true)
      private final String deliveryPipelineId;

    public String getDeliveryPipelineId() {
        return this.deliveryPipelineId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDeliveryPipelineIamPolicyArgs(
        String deliveryPipelineId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.deliveryPipelineId = Objects.requireNonNull(deliveryPipelineId, "expected parameter 'deliveryPipelineId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetDeliveryPipelineIamPolicyArgs() {
        this.deliveryPipelineId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeliveryPipelineIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deliveryPipelineId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeliveryPipelineIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryPipelineId = defaults.deliveryPipelineId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder deliveryPipelineId(String deliveryPipelineId) {
            this.deliveryPipelineId = Objects.requireNonNull(deliveryPipelineId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetDeliveryPipelineIamPolicyArgs build() {
            return new GetDeliveryPipelineIamPolicyArgs(deliveryPipelineId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
