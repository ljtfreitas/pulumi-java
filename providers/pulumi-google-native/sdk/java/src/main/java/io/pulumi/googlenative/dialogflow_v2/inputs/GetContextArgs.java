// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetContextArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContextArgs Empty = new GetContextArgs();

    @InputImport(name="contextId", required=true)
      private final String contextId;

    public String getContextId() {
        return this.contextId;
    }

    @InputImport(name="environmentId", required=true)
      private final String environmentId;

    public String getEnvironmentId() {
        return this.environmentId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="sessionId", required=true)
      private final String sessionId;

    public String getSessionId() {
        return this.sessionId;
    }

    @InputImport(name="userId", required=true)
      private final String userId;

    public String getUserId() {
        return this.userId;
    }

    public GetContextArgs(
        String contextId,
        String environmentId,
        String location,
        @Nullable String project,
        String sessionId,
        String userId) {
        this.contextId = Objects.requireNonNull(contextId, "expected parameter 'contextId' to be non-null");
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.sessionId = Objects.requireNonNull(sessionId, "expected parameter 'sessionId' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private GetContextArgs() {
        this.contextId = null;
        this.environmentId = null;
        this.location = null;
        this.project = null;
        this.sessionId = null;
        this.userId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contextId;
        private String environmentId;
        private String location;
        private @Nullable String project;
        private String sessionId;
        private String userId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContextArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contextId = defaults.contextId;
    	      this.environmentId = defaults.environmentId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.sessionId = defaults.sessionId;
    	      this.userId = defaults.userId;
        }

        public Builder setContextId(String contextId) {
            this.contextId = Objects.requireNonNull(contextId);
            return this;
        }

        public Builder setEnvironmentId(String environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setSessionId(String sessionId) {
            this.sessionId = Objects.requireNonNull(sessionId);
            return this;
        }

        public Builder setUserId(String userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }
        public GetContextArgs build() {
            return new GetContextArgs(contextId, environmentId, location, project, sessionId, userId);
        }
    }
}
