// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebaseappcheck_v1beta;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DebugTokenArgs extends io.pulumi.resources.ResourceArgs {

    public static final DebugTokenArgs Empty = new DebugTokenArgs();

    @InputImport(name="appId", required=true)
      private final Input<String> appId;

    public Input<String> getAppId() {
        return this.appId;
    }

    /**
     * A human readable display name used to identify this debug token.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The relative resource name of the debug token, in the format: ```projects/{project_number}/apps/{app_id}/debugTokens/{debug_token_id}```
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Input only. Immutable. The secret token itself. Must be provided during creation, and must be a UUID4, case insensitive. This field is immutable once set, and cannot be provided during an UpdateDebugToken request. You can, however, delete this debug token using DeleteDebugToken to revoke it. For security reasons, this field will never be populated in any response.
     * 
     */
    @InputImport(name="token", required=true)
      private final Input<String> token;

    public Input<String> getToken() {
        return this.token;
    }

    public DebugTokenArgs(
        Input<String> appId,
        Input<String> displayName,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> token) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.name = name;
        this.project = project;
        this.token = Objects.requireNonNull(token, "expected parameter 'token' to be non-null");
    }

    private DebugTokenArgs() {
        this.appId = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.token = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DebugTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> appId;
        private Input<String> displayName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> token;

        public Builder() {
    	      // Empty
        }

        public Builder(DebugTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.token = defaults.token;
        }

        public Builder setAppId(Input<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setAppId(String appId) {
            this.appId = Input.of(Objects.requireNonNull(appId));
            return this;
        }

        public Builder setDisplayName(Input<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Input.of(Objects.requireNonNull(displayName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setToken(Input<String> token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }

        public Builder setToken(String token) {
            this.token = Input.of(Objects.requireNonNull(token));
            return this;
        }
        public DebugTokenArgs build() {
            return new DebugTokenArgs(appId, displayName, name, project, token);
        }
    }
}
