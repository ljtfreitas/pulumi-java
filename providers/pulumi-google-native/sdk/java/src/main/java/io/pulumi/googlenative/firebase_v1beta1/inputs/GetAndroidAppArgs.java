// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebase_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAndroidAppArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAndroidAppArgs Empty = new GetAndroidAppArgs();

    @InputImport(name="androidAppId", required=true)
      private final String androidAppId;

    public String getAndroidAppId() {
        return this.androidAppId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetAndroidAppArgs(
        String androidAppId,
        @Nullable String project) {
        this.androidAppId = Objects.requireNonNull(androidAppId, "expected parameter 'androidAppId' to be non-null");
        this.project = project;
    }

    private GetAndroidAppArgs() {
        this.androidAppId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAndroidAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String androidAppId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAndroidAppArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidAppId = defaults.androidAppId;
    	      this.project = defaults.project;
        }

        public Builder setAndroidAppId(String androidAppId) {
            this.androidAppId = Objects.requireNonNull(androidAppId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetAndroidAppArgs build() {
            return new GetAndroidAppArgs(androidAppId, project);
        }
    }
}
