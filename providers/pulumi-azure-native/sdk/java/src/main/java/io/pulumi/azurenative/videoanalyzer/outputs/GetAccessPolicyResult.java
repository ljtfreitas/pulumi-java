// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.JwtAuthenticationResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAccessPolicyResult {
    /**
     * Authentication method to be used when validating client API access.
     * 
     */
    private final @Nullable JwtAuthenticationResponse authentication;
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
     * Defines the access level granted by this policy.
     * 
     */
    private final @Nullable String role;
    /**
     * The system metadata relating to this resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"authentication","id","name","role","systemData","type"})
    private GetAccessPolicyResult(
        @Nullable JwtAuthenticationResponse authentication,
        String id,
        String name,
        @Nullable String role,
        SystemDataResponse systemData,
        String type) {
        this.authentication = authentication;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.role = role;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Authentication method to be used when validating client API access.
     * 
     */
    public Optional<JwtAuthenticationResponse> getAuthentication() {
        return Optional.ofNullable(this.authentication);
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
     * Defines the access level granted by this policy.
     * 
     */
    public Optional<String> getRole() {
        return Optional.ofNullable(this.role);
    }
    /**
     * The system metadata relating to this resource.
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
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

    public static Builder builder(GetAccessPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JwtAuthenticationResponse authentication;
        private String id;
        private String name;
        private @Nullable String role;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccessPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setAuthentication(@Nullable JwtAuthenticationResponse authentication) {
            this.authentication = authentication;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = role;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAccessPolicyResult build() {
            return new GetAccessPolicyResult(authentication, id, name, role, systemData, type);
        }
    }
}
