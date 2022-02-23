// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceGuardOperationResponse {
    /**
     * Type of resource request.
     * 
     */
    private final String requestResourceType;
    /**
     * Name of the critical operation.
     * 
     */
    private final String vaultCriticalOperation;

    @OutputCustomType.Constructor({"requestResourceType","vaultCriticalOperation"})
    private ResourceGuardOperationResponse(
        String requestResourceType,
        String vaultCriticalOperation) {
        this.requestResourceType = Objects.requireNonNull(requestResourceType);
        this.vaultCriticalOperation = Objects.requireNonNull(vaultCriticalOperation);
    }

    /**
     * Type of resource request.
     * 
     */
    public String getRequestResourceType() {
        return this.requestResourceType;
    }
    /**
     * Name of the critical operation.
     * 
     */
    public String getVaultCriticalOperation() {
        return this.vaultCriticalOperation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardOperationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String requestResourceType;
        private String vaultCriticalOperation;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardOperationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestResourceType = defaults.requestResourceType;
    	      this.vaultCriticalOperation = defaults.vaultCriticalOperation;
        }

        public Builder setRequestResourceType(String requestResourceType) {
            this.requestResourceType = Objects.requireNonNull(requestResourceType);
            return this;
        }

        public Builder setVaultCriticalOperation(String vaultCriticalOperation) {
            this.vaultCriticalOperation = Objects.requireNonNull(vaultCriticalOperation);
            return this;
        }
        public ResourceGuardOperationResponse build() {
            return new ResourceGuardOperationResponse(requestResourceType, vaultCriticalOperation);
        }
    }
}
