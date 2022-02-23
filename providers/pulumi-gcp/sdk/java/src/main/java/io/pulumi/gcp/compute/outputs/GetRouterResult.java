// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.GetRouterBgp;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetRouterResult {
    private final List<GetRouterBgp> bgps;
    private final String creationTimestamp;
    private final String description;
    private final Boolean encryptedInterconnectRouter;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    private final String network;
    private final @Nullable String project;
    private final @Nullable String region;
    private final String selfLink;

    @OutputCustomType.Constructor({"bgps","creationTimestamp","description","encryptedInterconnectRouter","id","name","network","project","region","selfLink"})
    private GetRouterResult(
        List<GetRouterBgp> bgps,
        String creationTimestamp,
        String description,
        Boolean encryptedInterconnectRouter,
        String id,
        String name,
        String network,
        @Nullable String project,
        @Nullable String region,
        String selfLink) {
        this.bgps = Objects.requireNonNull(bgps);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.encryptedInterconnectRouter = Objects.requireNonNull(encryptedInterconnectRouter);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.project = project;
        this.region = region;
        this.selfLink = Objects.requireNonNull(selfLink);
    }

    public List<GetRouterBgp> getBgps() {
        return this.bgps;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public Boolean getEncryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getNetwork() {
        return this.network;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> getRegion() {
        return Optional.ofNullable(this.region);
    }
    public String getSelfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRouterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetRouterBgp> bgps;
        private String creationTimestamp;
        private String description;
        private Boolean encryptedInterconnectRouter;
        private String id;
        private String name;
        private String network;
        private @Nullable String project;
        private @Nullable String region;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRouterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgps = defaults.bgps;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.encryptedInterconnectRouter = defaults.encryptedInterconnectRouter;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setBgps(List<GetRouterBgp> bgps) {
            this.bgps = Objects.requireNonNull(bgps);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setEncryptedInterconnectRouter(Boolean encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = Objects.requireNonNull(encryptedInterconnectRouter);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = region;
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public GetRouterResult build() {
            return new GetRouterResult(bgps, creationTimestamp, description, encryptedInterconnectRouter, id, name, network, project, region, selfLink);
        }
    }
}
