// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vpcaccess.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorSubnetGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorSubnetGetArgs Empty = new ConnectorSubnetGetArgs();

    /**
     * Subnet name (relative, not fully qualified). E.g. if the full subnet selfLink is
     * https://compute.googleapis.com/compute/v1/projects/{project}/regions/{region}/subnetworks/{subnetName} the correct input for this field would be {subnetName}"
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Project in which the subnet exists. If not set, this project is assumed to be the project for which the connector create request was issued.
     * 
     */
    @Import(name="projectId")
      private final @Nullable Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId == null ? Output.empty() : this.projectId;
    }

    public ConnectorSubnetGetArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> projectId) {
        this.name = name;
        this.projectId = projectId;
    }

    private ConnectorSubnetGetArgs() {
        this.name = Output.empty();
        this.projectId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorSubnetGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorSubnetGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.projectId = defaults.projectId;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder projectId(@Nullable Output<String> projectId) {
            this.projectId = projectId;
            return this;
        }

        public Builder projectId(@Nullable String projectId) {
            this.projectId = Output.ofNullable(projectId);
            return this;
        }
        public ConnectorSubnetGetArgs build() {
            return new ConnectorSubnetGetArgs(name, projectId);
        }
    }
}
