// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RouterBgpGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterState extends io.pulumi.resources.ResourceArgs {

    public static final RouterState Empty = new RouterState();

    /**
     * BGP information specific to this router.
     * Structure is documented below.
     * 
     */
    @InputImport(name="bgp")
        private final @Nullable Input<RouterBgpGetArgs> bgp;

    public Input<RouterBgpGetArgs> getBgp() {
        return this.bgp == null ? Input.empty() : this.bgp;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
        private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * User-specified description for the IP range.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Field to indicate if a router is dedicated to use with encrypted
     * Interconnect Attachment (IPsec-encrypted Cloud Interconnect feature).
     * Not currently available publicly.
     * 
     */
    @InputImport(name="encryptedInterconnectRouter")
        private final @Nullable Input<Boolean> encryptedInterconnectRouter;

    public Input<Boolean> getEncryptedInterconnectRouter() {
        return this.encryptedInterconnectRouter == null ? Input.empty() : this.encryptedInterconnectRouter;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and
     * comply with RFC1035. Specifically, the name must be 1-63 characters
     * long and match the regular expression `a-z?`
     * which means the first character must be a lowercase letter, and all
     * following characters must be a dash, lowercase letter, or digit,
     * except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A reference to the network to which this router belongs.
     * 
     */
    @InputImport(name="network")
        private final @Nullable Input<String> network;

    public Input<String> getNetwork() {
        return this.network == null ? Input.empty() : this.network;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Region where the router resides.
     * 
     */
    @InputImport(name="region")
        private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
        private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    public RouterState(
        @Nullable Input<RouterBgpGetArgs> bgp,
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> encryptedInterconnectRouter,
        @Nullable Input<String> name,
        @Nullable Input<String> network,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> selfLink) {
        this.bgp = bgp;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.encryptedInterconnectRouter = encryptedInterconnectRouter;
        this.name = name;
        this.network = network;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
    }

    private RouterState() {
        this.bgp = Input.empty();
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.encryptedInterconnectRouter = Input.empty();
        this.name = Input.empty();
        this.network = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.selfLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RouterBgpGetArgs> bgp;
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> encryptedInterconnectRouter;
        private @Nullable Input<String> name;
        private @Nullable Input<String> network;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgp = defaults.bgp;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.encryptedInterconnectRouter = defaults.encryptedInterconnectRouter;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setBgp(@Nullable Input<RouterBgpGetArgs> bgp) {
            this.bgp = bgp;
            return this;
        }

        public Builder setBgp(@Nullable RouterBgpGetArgs bgp) {
            this.bgp = Input.ofNullable(bgp);
            return this;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEncryptedInterconnectRouter(@Nullable Input<Boolean> encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = encryptedInterconnectRouter;
            return this;
        }

        public Builder setEncryptedInterconnectRouter(@Nullable Boolean encryptedInterconnectRouter) {
            this.encryptedInterconnectRouter = Input.ofNullable(encryptedInterconnectRouter);
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

        public Builder setNetwork(@Nullable Input<String> network) {
            this.network = network;
            return this;
        }

        public Builder setNetwork(@Nullable String network) {
            this.network = Input.ofNullable(network);
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

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }
        public RouterState build() {
            return new RouterState(bgp, creationTimestamp, description, encryptedInterconnectRouter, name, network, project, region, selfLink);
        }
    }
}
