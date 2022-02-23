// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.deploymentmanager_v2.outputs.DeploymentUpdateLabelEntryResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DeploymentUpdateResponse {
    /**
     * An optional user-provided description of the deployment after the current update has been applied.
     * 
     */
    private final String description;
    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    private final List<DeploymentUpdateLabelEntryResponse> labels;
    /**
     * URL of the manifest representing the update configuration of this deployment.
     * 
     */
    private final String manifest;

    @OutputCustomType.Constructor({"description","labels","manifest"})
    private DeploymentUpdateResponse(
        String description,
        List<DeploymentUpdateLabelEntryResponse> labels,
        String manifest) {
        this.description = Objects.requireNonNull(description);
        this.labels = Objects.requireNonNull(labels);
        this.manifest = Objects.requireNonNull(manifest);
    }

    /**
     * An optional user-provided description of the deployment after the current update has been applied.
     * 
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Map of One Platform labels; provided by the client when the resource is created or updated. Specifically: Label keys must be between 1 and 63 characters long and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?` Label values must be between 0 and 63 characters long and must conform to the regular expression `([a-z]([-a-z0-9]*[a-z0-9])?)?`.
     * 
     */
    public List<DeploymentUpdateLabelEntryResponse> getLabels() {
        return this.labels;
    }
    /**
     * URL of the manifest representing the update configuration of this deployment.
     * 
     */
    public String getManifest() {
        return this.manifest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentUpdateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<DeploymentUpdateLabelEntryResponse> labels;
        private String manifest;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentUpdateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.manifest = defaults.manifest;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setLabels(List<DeploymentUpdateLabelEntryResponse> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setManifest(String manifest) {
            this.manifest = Objects.requireNonNull(manifest);
            return this;
        }
        public DeploymentUpdateResponse build() {
            return new DeploymentUpdateResponse(description, labels, manifest);
        }
    }
}
