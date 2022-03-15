// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSecretArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretArgs Empty = new GetSecretArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="secretId", required=true)
      private final String secretId;

    public String getSecretId() {
        return this.secretId;
    }

    public GetSecretArgs(
        @Nullable String project,
        String secretId) {
        this.project = project;
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
    }

    private GetSecretArgs() {
        this.project = null;
        this.secretId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.secretId = defaults.secretId;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder secretId(String secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }
        public GetSecretArgs build() {
            return new GetSecretArgs(project, secretId);
        }
    }
}
