// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.enums.SessionEntityTypeEntityOverrideMode;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3EntityTypeEntityArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SessionEntityTypeArgs extends io.pulumi.resources.ResourceArgs {

    public static final SessionEntityTypeArgs Empty = new SessionEntityTypeArgs();

    @InputImport(name="agentId", required=true)
      private final Input<String> agentId;

    public Input<String> getAgentId() {
        return this.agentId;
    }

    /**
     * The collection of entities to override or supplement the custom entity type.
     * 
     */
    @InputImport(name="entities", required=true)
      private final Input<List<GoogleCloudDialogflowCxV3EntityTypeEntityArgs>> entities;

    public Input<List<GoogleCloudDialogflowCxV3EntityTypeEntityArgs>> getEntities() {
        return this.entities;
    }

    /**
     * Indicates whether the additional data should override or supplement the custom entity type definition.
     * 
     */
    @InputImport(name="entityOverrideMode", required=true)
      private final Input<SessionEntityTypeEntityOverrideMode> entityOverrideMode;

    public Input<SessionEntityTypeEntityOverrideMode> getEntityOverrideMode() {
        return this.entityOverrideMode;
    }

    @InputImport(name="environmentId", required=true)
      private final Input<String> environmentId;

    public Input<String> getEnvironmentId() {
        return this.environmentId;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The unique identifier of the session entity type. Format: `projects//locations//agents//sessions//entityTypes/` or `projects//locations//agents//environments//sessions//entityTypes/`. If `Environment ID` is not specified, we assume default 'draft' environment.
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

    @InputImport(name="sessionId", required=true)
      private final Input<String> sessionId;

    public Input<String> getSessionId() {
        return this.sessionId;
    }

    public SessionEntityTypeArgs(
        Input<String> agentId,
        Input<List<GoogleCloudDialogflowCxV3EntityTypeEntityArgs>> entities,
        Input<SessionEntityTypeEntityOverrideMode> entityOverrideMode,
        Input<String> environmentId,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<String> sessionId) {
        this.agentId = Objects.requireNonNull(agentId, "expected parameter 'agentId' to be non-null");
        this.entities = Objects.requireNonNull(entities, "expected parameter 'entities' to be non-null");
        this.entityOverrideMode = Objects.requireNonNull(entityOverrideMode, "expected parameter 'entityOverrideMode' to be non-null");
        this.environmentId = Objects.requireNonNull(environmentId, "expected parameter 'environmentId' to be non-null");
        this.location = location;
        this.name = name;
        this.project = project;
        this.sessionId = Objects.requireNonNull(sessionId, "expected parameter 'sessionId' to be non-null");
    }

    private SessionEntityTypeArgs() {
        this.agentId = Input.empty();
        this.entities = Input.empty();
        this.entityOverrideMode = Input.empty();
        this.environmentId = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.sessionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SessionEntityTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> agentId;
        private Input<List<GoogleCloudDialogflowCxV3EntityTypeEntityArgs>> entities;
        private Input<SessionEntityTypeEntityOverrideMode> entityOverrideMode;
        private Input<String> environmentId;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<String> sessionId;

        public Builder() {
    	      // Empty
        }

        public Builder(SessionEntityTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentId = defaults.agentId;
    	      this.entities = defaults.entities;
    	      this.entityOverrideMode = defaults.entityOverrideMode;
    	      this.environmentId = defaults.environmentId;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.sessionId = defaults.sessionId;
        }

        public Builder setAgentId(Input<String> agentId) {
            this.agentId = Objects.requireNonNull(agentId);
            return this;
        }

        public Builder setAgentId(String agentId) {
            this.agentId = Input.of(Objects.requireNonNull(agentId));
            return this;
        }

        public Builder setEntities(Input<List<GoogleCloudDialogflowCxV3EntityTypeEntityArgs>> entities) {
            this.entities = Objects.requireNonNull(entities);
            return this;
        }

        public Builder setEntities(List<GoogleCloudDialogflowCxV3EntityTypeEntityArgs> entities) {
            this.entities = Input.of(Objects.requireNonNull(entities));
            return this;
        }

        public Builder setEntityOverrideMode(Input<SessionEntityTypeEntityOverrideMode> entityOverrideMode) {
            this.entityOverrideMode = Objects.requireNonNull(entityOverrideMode);
            return this;
        }

        public Builder setEntityOverrideMode(SessionEntityTypeEntityOverrideMode entityOverrideMode) {
            this.entityOverrideMode = Input.of(Objects.requireNonNull(entityOverrideMode));
            return this;
        }

        public Builder setEnvironmentId(Input<String> environmentId) {
            this.environmentId = Objects.requireNonNull(environmentId);
            return this;
        }

        public Builder setEnvironmentId(String environmentId) {
            this.environmentId = Input.of(Objects.requireNonNull(environmentId));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setSessionId(Input<String> sessionId) {
            this.sessionId = Objects.requireNonNull(sessionId);
            return this;
        }

        public Builder setSessionId(String sessionId) {
            this.sessionId = Input.of(Objects.requireNonNull(sessionId));
            return this;
        }
        public SessionEntityTypeArgs build() {
            return new SessionEntityTypeArgs(agentId, entities, entityOverrideMode, environmentId, location, name, project, sessionId);
        }
    }
}
