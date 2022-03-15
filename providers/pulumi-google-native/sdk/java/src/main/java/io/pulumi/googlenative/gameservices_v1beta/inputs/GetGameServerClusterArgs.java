// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGameServerClusterArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetGameServerClusterArgs Empty = new GetGameServerClusterArgs();

    @Import(name="gameServerClusterId", required=true)
      private final String gameServerClusterId;

    public String getGameServerClusterId() {
        return this.gameServerClusterId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="realmId", required=true)
      private final String realmId;

    public String getRealmId() {
        return this.realmId;
    }

    @Import(name="view")
      private final @Nullable String view;

    public Optional<String> getView() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetGameServerClusterArgs(
        String gameServerClusterId,
        String location,
        @Nullable String project,
        String realmId,
        @Nullable String view) {
        this.gameServerClusterId = Objects.requireNonNull(gameServerClusterId, "expected parameter 'gameServerClusterId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.realmId = Objects.requireNonNull(realmId, "expected parameter 'realmId' to be non-null");
        this.view = view;
    }

    private GetGameServerClusterArgs() {
        this.gameServerClusterId = null;
        this.location = null;
        this.project = null;
        this.realmId = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGameServerClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gameServerClusterId;
        private String location;
        private @Nullable String project;
        private String realmId;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGameServerClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gameServerClusterId = defaults.gameServerClusterId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.realmId = defaults.realmId;
    	      this.view = defaults.view;
        }

        public Builder gameServerClusterId(String gameServerClusterId) {
            this.gameServerClusterId = Objects.requireNonNull(gameServerClusterId);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder realmId(String realmId) {
            this.realmId = Objects.requireNonNull(realmId);
            return this;
        }

        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }
        public GetGameServerClusterArgs build() {
            return new GetGameServerClusterArgs(gameServerClusterId, location, project, realmId, view);
        }
    }
}
