// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureClusterFleetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterFleetGetArgs Empty = new AzureClusterFleetGetArgs();

    /**
     * - 
     * The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/<project-number>/locations/global/membership/<cluster-id>.
     * 
     */
    @InputImport(name="membership")
        private final @Nullable Input<String> membership;

    public Input<String> getMembership() {
        return this.membership == null ? Input.empty() : this.membership;
    }

    /**
     * The project for the resource
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public AzureClusterFleetGetArgs(
        @Nullable Input<String> membership,
        @Nullable Input<String> project) {
        this.membership = membership;
        this.project = project;
    }

    private AzureClusterFleetGetArgs() {
        this.membership = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterFleetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> membership;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterFleetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.membership = defaults.membership;
    	      this.project = defaults.project;
        }

        public Builder setMembership(@Nullable Input<String> membership) {
            this.membership = membership;
            return this;
        }

        public Builder setMembership(@Nullable String membership) {
            this.membership = Input.ofNullable(membership);
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
        public AzureClusterFleetGetArgs build() {
            return new AzureClusterFleetGetArgs(membership, project);
        }
    }
}
