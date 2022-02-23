// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyPortalArgs;
import io.pulumi.awsnative.iotsitewise.inputs.AccessPolicyProjectArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The AWS IoT SiteWise Monitor resource for this access policy. Choose either portal or project but not both.
 * 
 */
public final class AccessPolicyResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyResourceArgs Empty = new AccessPolicyResourceArgs();

    @InputImport(name="portal")
        private final @Nullable Input<AccessPolicyPortalArgs> portal;

    public Input<AccessPolicyPortalArgs> getPortal() {
        return this.portal == null ? Input.empty() : this.portal;
    }

    @InputImport(name="project")
        private final @Nullable Input<AccessPolicyProjectArgs> project;

    public Input<AccessPolicyProjectArgs> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public AccessPolicyResourceArgs(
        @Nullable Input<AccessPolicyPortalArgs> portal,
        @Nullable Input<AccessPolicyProjectArgs> project) {
        this.portal = portal;
        this.project = project;
    }

    private AccessPolicyResourceArgs() {
        this.portal = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AccessPolicyPortalArgs> portal;
        private @Nullable Input<AccessPolicyProjectArgs> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.portal = defaults.portal;
    	      this.project = defaults.project;
        }

        public Builder setPortal(@Nullable Input<AccessPolicyPortalArgs> portal) {
            this.portal = portal;
            return this;
        }

        public Builder setPortal(@Nullable AccessPolicyPortalArgs portal) {
            this.portal = Input.ofNullable(portal);
            return this;
        }

        public Builder setProject(@Nullable Input<AccessPolicyProjectArgs> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable AccessPolicyProjectArgs project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public AccessPolicyResourceArgs build() {
            return new AccessPolicyResourceArgs(portal, project);
        }
    }
}
