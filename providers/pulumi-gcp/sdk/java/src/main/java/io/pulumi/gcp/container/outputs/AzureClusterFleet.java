// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureClusterFleet {
    /**
     * - 
     * The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/<project-number>/locations/global/membership/<cluster-id>.
     * 
     */
    private final @Nullable String membership;
    /**
     * The project for the resource
     * 
     */
    private final @Nullable String project;

    @OutputCustomType.Constructor({"membership","project"})
    private AzureClusterFleet(
        @Nullable String membership,
        @Nullable String project) {
        this.membership = membership;
        this.project = project;
    }

    /**
     * - 
     * The name of the managed Hub Membership resource associated to this cluster. Membership names are formatted as projects/<project-number>/locations/global/membership/<cluster-id>.
     * 
     */
    public Optional<String> getMembership() {
        return Optional.ofNullable(this.membership);
    }
    /**
     * The project for the resource
     * 
     */
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterFleet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String membership;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterFleet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.membership = defaults.membership;
    	      this.project = defaults.project;
        }

        public Builder setMembership(@Nullable String membership) {
            this.membership = membership;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public AzureClusterFleet build() {
            return new AzureClusterFleet(membership, project);
        }
    }
}
