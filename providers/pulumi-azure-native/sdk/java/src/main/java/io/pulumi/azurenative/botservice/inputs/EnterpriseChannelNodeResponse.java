// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties specific to an Enterprise Channel Node.
 * 
 */
public final class EnterpriseChannelNodeResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnterpriseChannelNodeResponse Empty = new EnterpriseChannelNodeResponse();

    /**
     * The location of the Enterprise Channel Node.
     * 
     */
    @Import(name="azureLocation", required=true)
      private final String azureLocation;

    public String getAzureLocation() {
        return this.azureLocation;
    }

    /**
     * The sku of the Enterprise Channel Node.
     * 
     */
    @Import(name="azureSku", required=true)
      private final String azureSku;

    public String getAzureSku() {
        return this.azureSku;
    }

    /**
     * Id of Enterprise Channel Node. This is generated by the Bot Framework.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The name of the Enterprise Channel Node.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The current state of the Enterprise Channel Node.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    public EnterpriseChannelNodeResponse(
        String azureLocation,
        String azureSku,
        String id,
        String name,
        @Nullable String state) {
        this.azureLocation = Objects.requireNonNull(azureLocation, "expected parameter 'azureLocation' to be non-null");
        this.azureSku = Objects.requireNonNull(azureSku, "expected parameter 'azureSku' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.state = state;
    }

    private EnterpriseChannelNodeResponse() {
        this.azureLocation = null;
        this.azureSku = null;
        this.id = null;
        this.name = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseChannelNodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String azureLocation;
        private String azureSku;
        private String id;
        private String name;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseChannelNodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureLocation = defaults.azureLocation;
    	      this.azureSku = defaults.azureSku;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder azureLocation(String azureLocation) {
            this.azureLocation = Objects.requireNonNull(azureLocation);
            return this;
        }

        public Builder azureSku(String azureSku) {
            this.azureSku = Objects.requireNonNull(azureSku);
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

        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public EnterpriseChannelNodeResponse build() {
            return new EnterpriseChannelNodeResponse(azureLocation, azureSku, id, name, state);
        }
    }
}
