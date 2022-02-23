// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.orgpolicy_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPolicyArgs Empty = new GetPolicyArgs();

    @InputImport(name="policyId", required=true)
      private final String policyId;

    public String getPolicyId() {
        return this.policyId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetPolicyArgs(
        String policyId,
        @Nullable String project) {
        this.policyId = Objects.requireNonNull(policyId, "expected parameter 'policyId' to be non-null");
        this.project = project;
    }

    private GetPolicyArgs() {
        this.policyId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String policyId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.project = defaults.project;
        }

        public Builder setPolicyId(String policyId) {
            this.policyId = Objects.requireNonNull(policyId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetPolicyArgs build() {
            return new GetPolicyArgs(policyId, project);
        }
    }
}
