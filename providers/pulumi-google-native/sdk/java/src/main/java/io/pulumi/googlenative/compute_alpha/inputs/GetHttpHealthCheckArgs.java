// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetHttpHealthCheckArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHttpHealthCheckArgs Empty = new GetHttpHealthCheckArgs();

    @Import(name="httpHealthCheck", required=true)
      private final String httpHealthCheck;

    public String getHttpHealthCheck() {
        return this.httpHealthCheck;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetHttpHealthCheckArgs(
        String httpHealthCheck,
        @Nullable String project) {
        this.httpHealthCheck = Objects.requireNonNull(httpHealthCheck, "expected parameter 'httpHealthCheck' to be non-null");
        this.project = project;
    }

    private GetHttpHealthCheckArgs() {
        this.httpHealthCheck = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHttpHealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpHealthCheck;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHttpHealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHealthCheck = defaults.httpHealthCheck;
    	      this.project = defaults.project;
        }

        public Builder httpHealthCheck(String httpHealthCheck) {
            this.httpHealthCheck = Objects.requireNonNull(httpHealthCheck);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetHttpHealthCheckArgs build() {
            return new GetHttpHealthCheckArgs(httpHealthCheck, project);
        }
    }
}
