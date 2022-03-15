// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetManagedInstanceAzureADOnlyAuthenticationResult {
    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    private final Boolean azureADOnlyAuthentication;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetManagedInstanceAzureADOnlyAuthenticationResult(
        @CustomType.Parameter("azureADOnlyAuthentication") Boolean azureADOnlyAuthentication,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * Azure Active Directory only Authentication enabled.
     * 
    */
    public Boolean getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedInstanceAzureADOnlyAuthenticationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean azureADOnlyAuthentication;
        private String id;
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedInstanceAzureADOnlyAuthenticationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder azureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Objects.requireNonNull(azureADOnlyAuthentication);
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

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetManagedInstanceAzureADOnlyAuthenticationResult build() {
            return new GetManagedInstanceAzureADOnlyAuthenticationResult(azureADOnlyAuthentication, id, name, type);
        }
    }
}
