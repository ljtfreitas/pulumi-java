// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedInstanceAzureADOnlyAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedInstanceAzureADOnlyAuthenticationArgs Empty = new ManagedInstanceAzureADOnlyAuthenticationArgs();

    /**
     * The name of server azure active directory only authentication.
     * 
     */
    @InputImport(name="authenticationName")
    private final @Nullable Input<String> authenticationName;

    public Input<String> getAuthenticationName() {
        return this.authenticationName == null ? Input.empty() : this.authenticationName;
    }

    /**
     * Azure Active Directory only Authentication enabled.
     * 
     */
    @InputImport(name="azureADOnlyAuthentication", required=true)
    private final Input<Boolean> azureADOnlyAuthentication;

    public Input<Boolean> getAzureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @InputImport(name="managedInstanceName", required=true)
    private final Input<String> managedInstanceName;

    public Input<String> getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ManagedInstanceAzureADOnlyAuthenticationArgs(
        @Nullable Input<String> authenticationName,
        Input<Boolean> azureADOnlyAuthentication,
        Input<String> managedInstanceName,
        Input<String> resourceGroupName) {
        this.authenticationName = authenticationName;
        this.azureADOnlyAuthentication = Objects.requireNonNull(azureADOnlyAuthentication, "expected parameter 'azureADOnlyAuthentication' to be non-null");
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ManagedInstanceAzureADOnlyAuthenticationArgs() {
        this.authenticationName = Input.empty();
        this.azureADOnlyAuthentication = Input.empty();
        this.managedInstanceName = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedInstanceAzureADOnlyAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authenticationName;
        private Input<Boolean> azureADOnlyAuthentication;
        private Input<String> managedInstanceName;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedInstanceAzureADOnlyAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationName = defaults.authenticationName;
    	      this.azureADOnlyAuthentication = defaults.azureADOnlyAuthentication;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAuthenticationName(@Nullable Input<String> authenticationName) {
            this.authenticationName = authenticationName;
            return this;
        }

        public Builder setAuthenticationName(@Nullable String authenticationName) {
            this.authenticationName = Input.ofNullable(authenticationName);
            return this;
        }

        public Builder setAzureADOnlyAuthentication(Input<Boolean> azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Objects.requireNonNull(azureADOnlyAuthentication);
            return this;
        }

        public Builder setAzureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
            this.azureADOnlyAuthentication = Input.of(Objects.requireNonNull(azureADOnlyAuthentication));
            return this;
        }

        public Builder setManagedInstanceName(Input<String> managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }

        public Builder setManagedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Input.of(Objects.requireNonNull(managedInstanceName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public ManagedInstanceAzureADOnlyAuthenticationArgs build() {
            return new ManagedInstanceAzureADOnlyAuthenticationArgs(authenticationName, azureADOnlyAuthentication, managedInstanceName, resourceGroupName);
        }
    }
}
