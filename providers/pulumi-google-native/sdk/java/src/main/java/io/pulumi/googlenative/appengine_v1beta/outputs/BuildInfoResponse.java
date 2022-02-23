// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class BuildInfoResponse {
    /**
     * The Google Cloud Build id. Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
     * 
     */
    private final String cloudBuildId;

    @OutputCustomType.Constructor({"cloudBuildId"})
    private BuildInfoResponse(String cloudBuildId) {
        this.cloudBuildId = Objects.requireNonNull(cloudBuildId);
    }

    /**
     * The Google Cloud Build id. Example: "f966068f-08b2-42c8-bdfe-74137dff2bf9"
     * 
     */
    public String getCloudBuildId() {
        return this.cloudBuildId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudBuildId;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildId = defaults.cloudBuildId;
        }

        public Builder setCloudBuildId(String cloudBuildId) {
            this.cloudBuildId = Objects.requireNonNull(cloudBuildId);
            return this;
        }
        public BuildInfoResponse build() {
            return new BuildInfoResponse(cloudBuildId);
        }
    }
}
