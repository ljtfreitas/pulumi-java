// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPatchDeploymentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPatchDeploymentArgs Empty = new GetPatchDeploymentArgs();

    @Import(name="patchDeploymentId", required=true)
      private final String patchDeploymentId;

    public String getPatchDeploymentId() {
        return this.patchDeploymentId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetPatchDeploymentArgs(
        String patchDeploymentId,
        @Nullable String project) {
        this.patchDeploymentId = Objects.requireNonNull(patchDeploymentId, "expected parameter 'patchDeploymentId' to be non-null");
        this.project = project;
    }

    private GetPatchDeploymentArgs() {
        this.patchDeploymentId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPatchDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String patchDeploymentId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPatchDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.patchDeploymentId = defaults.patchDeploymentId;
    	      this.project = defaults.project;
        }

        public Builder patchDeploymentId(String patchDeploymentId) {
            this.patchDeploymentId = Objects.requireNonNull(patchDeploymentId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetPatchDeploymentArgs build() {
            return new GetPatchDeploymentArgs(patchDeploymentId, project);
        }
    }
}
