// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecurityPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecurityPolicyArgs Empty = new GetSecurityPolicyArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="securityPolicy", required=true)
      private final String securityPolicy;

    public String getSecurityPolicy() {
        return this.securityPolicy;
    }

    public GetSecurityPolicyArgs(
        @Nullable String project,
        String securityPolicy) {
        this.project = project;
        this.securityPolicy = Objects.requireNonNull(securityPolicy, "expected parameter 'securityPolicy' to be non-null");
    }

    private GetSecurityPolicyArgs() {
        this.project = null;
        this.securityPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String securityPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.securityPolicy = defaults.securityPolicy;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSecurityPolicy(String securityPolicy) {
            this.securityPolicy = Objects.requireNonNull(securityPolicy);
            return this;
        }
        public GetSecurityPolicyArgs build() {
            return new GetSecurityPolicyArgs(project, securityPolicy);
        }
    }
}
