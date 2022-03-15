// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Service Endpoint policy definitions.
 * 
 */
public final class ServiceEndpointPolicyDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPolicyDefinitionArgs Empty = new ServiceEndpointPolicyDefinitionArgs();

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Service endpoint name.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> getService() {
        return this.service == null ? Output.empty() : this.service;
    }

    /**
     * A list of service resources.
     * 
     */
    @Import(name="serviceResources")
      private final @Nullable Output<List<String>> serviceResources;

    public Output<List<String>> getServiceResources() {
        return this.serviceResources == null ? Output.empty() : this.serviceResources;
    }

    public ServiceEndpointPolicyDefinitionArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> id,
        @Nullable Output<String> name,
        @Nullable Output<String> service,
        @Nullable Output<List<String>> serviceResources) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.service = service;
        this.serviceResources = serviceResources;
    }

    private ServiceEndpointPolicyDefinitionArgs() {
        this.description = Output.empty();
        this.id = Output.empty();
        this.name = Output.empty();
        this.service = Output.empty();
        this.serviceResources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> id;
        private @Nullable Output<String> name;
        private @Nullable Output<String> service;
        private @Nullable Output<List<String>> serviceResources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointPolicyDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.service = defaults.service;
    	      this.serviceResources = defaults.serviceResources;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }

        public Builder service(@Nullable String service) {
            this.service = Output.ofNullable(service);
            return this;
        }

        public Builder serviceResources(@Nullable Output<List<String>> serviceResources) {
            this.serviceResources = serviceResources;
            return this;
        }

        public Builder serviceResources(@Nullable List<String> serviceResources) {
            this.serviceResources = Output.ofNullable(serviceResources);
            return this;
        }
        public ServiceEndpointPolicyDefinitionArgs build() {
            return new ServiceEndpointPolicyDefinitionArgs(description, id, name, service, serviceResources);
        }
    }
}
