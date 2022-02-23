// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRoleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRoleArgs Empty = new GetRoleArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="roleId", required=true)
      private final String roleId;

    public String getRoleId() {
        return this.roleId;
    }

    public GetRoleArgs(
        @Nullable String project,
        String roleId) {
        this.project = project;
        this.roleId = Objects.requireNonNull(roleId, "expected parameter 'roleId' to be non-null");
    }

    private GetRoleArgs() {
        this.project = null;
        this.roleId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String roleId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.roleId = defaults.roleId;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }
        public GetRoleArgs build() {
            return new GetRoleArgs(project, roleId);
        }
    }
}
