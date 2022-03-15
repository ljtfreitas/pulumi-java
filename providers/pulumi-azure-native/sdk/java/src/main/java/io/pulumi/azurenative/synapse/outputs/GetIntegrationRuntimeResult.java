// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.ManagedIntegrationRuntimeResponse;
import io.pulumi.azurenative.synapse.outputs.SelfHostedIntegrationRuntimeResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetIntegrationRuntimeResult {
    /**
     * Resource Etag.
     * 
     */
    private final String etag;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Integration runtime properties.
     * 
     */
    private final Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> properties;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIntegrationRuntimeResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> properties,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * Resource Etag.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Integration runtime properties.
     * 
    */
    public Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> getProperties() {
        return this.properties;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationRuntimeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String name;
        private Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationRuntimeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder properties(Either<ManagedIntegrationRuntimeResponse,SelfHostedIntegrationRuntimeResponse> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetIntegrationRuntimeResult build() {
            return new GetIntegrationRuntimeResult(etag, id, name, properties, type);
        }
    }
}
