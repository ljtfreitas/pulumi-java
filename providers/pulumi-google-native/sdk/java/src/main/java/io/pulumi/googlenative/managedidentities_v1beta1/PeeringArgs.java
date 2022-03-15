// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.managedidentities_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeringArgs extends io.pulumi.resources.ResourceArgs {

    public static final PeeringArgs Empty = new PeeringArgs();

    /**
     * The full names of the Google Compute Engine [networks](/compute/docs/networks-and-firewalls#networks) to which the instance is connected. Caller needs to make sure that CIDR subnets do not overlap between networks, else peering creation will fail.
     * 
     */
    @Import(name="authorizedNetwork", required=true)
      private final Output<String> authorizedNetwork;

    public Output<String> getAuthorizedNetwork() {
        return this.authorizedNetwork;
    }

    /**
     * Full domain resource path for the Managed AD Domain involved in peering. The resource path should be in the form: `projects/{project_id}/locations/global/domains/{domain_name}`
     * 
     */
    @Import(name="domainResource", required=true)
      private final Output<String> domainResource;

    public Output<String> getDomainResource() {
        return this.domainResource;
    }

    /**
     * Optional. Resource labels to represent user provided metadata.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    @Import(name="peeringId", required=true)
      private final Output<String> peeringId;

    public Output<String> getPeeringId() {
        return this.peeringId;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public PeeringArgs(
        Output<String> authorizedNetwork,
        Output<String> domainResource,
        @Nullable Output<Map<String,String>> labels,
        Output<String> peeringId,
        @Nullable Output<String> project) {
        this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork, "expected parameter 'authorizedNetwork' to be non-null");
        this.domainResource = Objects.requireNonNull(domainResource, "expected parameter 'domainResource' to be non-null");
        this.labels = labels;
        this.peeringId = Objects.requireNonNull(peeringId, "expected parameter 'peeringId' to be non-null");
        this.project = project;
    }

    private PeeringArgs() {
        this.authorizedNetwork = Output.empty();
        this.domainResource = Output.empty();
        this.labels = Output.empty();
        this.peeringId = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authorizedNetwork;
        private Output<String> domainResource;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> peeringId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetwork = defaults.authorizedNetwork;
    	      this.domainResource = defaults.domainResource;
    	      this.labels = defaults.labels;
    	      this.peeringId = defaults.peeringId;
    	      this.project = defaults.project;
        }

        public Builder authorizedNetwork(Output<String> authorizedNetwork) {
            this.authorizedNetwork = Objects.requireNonNull(authorizedNetwork);
            return this;
        }

        public Builder authorizedNetwork(String authorizedNetwork) {
            this.authorizedNetwork = Output.of(Objects.requireNonNull(authorizedNetwork));
            return this;
        }

        public Builder domainResource(Output<String> domainResource) {
            this.domainResource = Objects.requireNonNull(domainResource);
            return this;
        }

        public Builder domainResource(String domainResource) {
            this.domainResource = Output.of(Objects.requireNonNull(domainResource));
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder peeringId(Output<String> peeringId) {
            this.peeringId = Objects.requireNonNull(peeringId);
            return this;
        }

        public Builder peeringId(String peeringId) {
            this.peeringId = Output.of(Objects.requireNonNull(peeringId));
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
        public PeeringArgs build() {
            return new PeeringArgs(authorizedNetwork, domainResource, labels, peeringId, project);
        }
    }
}
