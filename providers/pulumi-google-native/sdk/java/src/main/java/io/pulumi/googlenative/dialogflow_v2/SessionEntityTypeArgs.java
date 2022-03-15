// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2.enums.SessionEntityTypeEntityOverrideMode;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2EntityTypeEntityArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SessionEntityTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SessionEntityTypeArgs Empty = new SessionEntityTypeArgs();

    /**
     * The collection of entities associated with this session entity type.
     * 
     */
    @Import(name="entities", required=true)
      private final Output<List<GoogleCloudDialogflowV2EntityTypeEntityArgs>> entities;

    public Output<List<GoogleCloudDialogflowV2EntityTypeEntityArgs>> getEntities() {
        return this.entities;
    }

    /**
     * Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    @Import(name="entityOverrideMode", required=true)
      private final Output<SessionEntityTypeEntityOverrideMode> entityOverrideMode;

    public Output<SessionEntityTypeEntityOverrideMode> getEntityOverrideMode() {
        return this.entityOverrideMode;
    }

    @Import(name="environmentId", required=true)
      private final Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The unique identifier of this session entity type. Format: `projects//agent/sessions//entityTypes/`, or `projects//agent/environments//users//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. `` must be the display name of an existing entity type in the same agent that will be overridden or supplemented.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="sessionId", required=true)
      private final Output<String> sessionId;

    public Output<String> getSessionId() {
        return this.sessionId;
    }

    @Import(name="userId", required=true)
      private final Output<String> userId;

    public Output<String> getUserId() {
        return this.userId;
    }

    public SessionEntityTypeArgs(
        Output<List<GoogleCloudDialogflowV2EntityTypeEntityArgs>> entities,
        Output<SessionEntityTypeEntityOverrideMode> entityOverrideMode,
        Output<String> environmentId,
        @Nullable Output<String> location,
        Output<String> name,
        @Nullable Output<String> project,
        Output<String> sessionId,
        Output<String> userId) {
        this.entities = Objects.requireNonNull(entities, "expected parameter 'entities' to be non-null");
        this.entityOverrideMode = Objects.requireNonNull(entityOverrideMode, "expected parameter 'entityOverrideMode' to be non-null");
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.project = project;
        this.sessionId = Objects.requireNonNull(sessionId, "expected parameter 'sessionId' to be non-null");
        this.userId = Objects.requireNonNull(userId, "expected parameter 'userId' to be non-null");
    }

    private SessionEntityTypeArgs() {
        this.entities = Output.empty();
        this.entityOverrideMode = Output.empty();
        this.environmentId = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.sessionId = Output.empty();
        this.userId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SessionEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<GoogleCloudDialogflowV2EntityTypeEntityArgs>> entities;
        private Output<SessionEntityTypeEntityOverrideMode> entityOverrideMode;
        private Output<String> environmentId;
        private @Nullable Output<String> location;
        private Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> sessionId;
        private Output<String> userId;

        public Builder() {
    	      // Empty
        }

        public Builder(SessionEntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entities = defaults.entities;
    	      this.entityOverrideMode = defaults.entityOverrideMode;
    	      this.environmentId = defaults.environmentId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.sessionId = defaults.sessionId;
    	      this.userId = defaults.userId;
        }

        public Builder entities(Output<List<GoogleCloudDialogflowV2EntityTypeEntityArgs>> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }

        public Builder entities(List<GoogleCloudDialogflowV2EntityTypeEntityArgs> entities) {
            this.entities = Output.of(Objects.requireNonNull(entities));
            return this;
        }

        public Builder entityOverrideMode(Output<SessionEntityTypeEntityOverrideMode> entityOverrideMode) {
            this.entityOverrideMode = Objects.requireNonNull(entityOverrideMode);
            return this;
        }

        public Builder entityOverrideMode(SessionEntityTypeEntityOverrideMode entityOverrideMode) {
            this.entityOverrideMode = Output.of(Objects.requireNonNull(entityOverrideMode));
            return this;
        }

        public Builder environmentId(Output<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder environmentId(String environmentId) {
            this.environmentId = Output.of(Objects.requireNonNull(environmentId));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder sessionId(Output<String> sessionId) {
            this.sessionId = Objects.requireNonNull(sessionId);
            return this;
        }

        public Builder sessionId(String sessionId) {
            this.sessionId = Output.of(Objects.requireNonNull(sessionId));
            return this;
        }

        public Builder userId(Output<String> userId) {
            this.userId = Objects.requireNonNull(userId);
            return this;
        }

        public Builder userId(String userId) {
            this.userId = Output.of(Objects.requireNonNull(userId));
            return this;
        }
        public SessionEntityTypeArgs build() {
            return new SessionEntityTypeArgs(entities, entityOverrideMode, environmentId, location, name, project, sessionId, userId);
        }
    }
}
