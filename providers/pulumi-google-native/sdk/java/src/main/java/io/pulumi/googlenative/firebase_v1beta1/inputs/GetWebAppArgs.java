// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebAppArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppArgs Empty = new GetWebAppArgs();

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="webAppId", required=true)
      private final String webAppId;

    public String getWebAppId() {
        return this.webAppId;
    }

    public GetWebAppArgs(
        @Nullable String project,
        String webAppId) {
        this.project = project;
        this.webAppId = Objects.requireNonNull(webAppId, "expected parameter 'webAppId' to be non-null");
    }

    private GetWebAppArgs() {
        this.project = null;
        this.webAppId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String webAppId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.webAppId = defaults.webAppId;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setWebAppId(String webAppId) {
            this.webAppId = Objects.requireNonNull(webAppId);
            return this;
        }
        public GetWebAppArgs build() {
            return new GetWebAppArgs(project, webAppId);
        }
    }
}
