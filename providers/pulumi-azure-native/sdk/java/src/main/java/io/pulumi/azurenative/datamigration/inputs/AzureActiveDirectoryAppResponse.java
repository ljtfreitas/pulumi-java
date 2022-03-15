// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Azure Active Directory Application
 * 
 */
public final class AzureActiveDirectoryAppResponse extends io.pulumi.resources.InvokeArgs {

    public static final AzureActiveDirectoryAppResponse Empty = new AzureActiveDirectoryAppResponse();

    /**
     * Key used to authenticate to the Azure Active Directory Application
     * 
     */
    @Import(name="appKey", required=true)
      private final String appKey;

    public String getAppKey() {
        return this.appKey;
    }

    /**
     * Application ID of the Azure Active Directory Application
     * 
     */
    @Import(name="applicationId", required=true)
      private final String applicationId;

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * Tenant id of the customer
     * 
     */
    @Import(name="tenantId", required=true)
      private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    public AzureActiveDirectoryAppResponse(
        String appKey,
        String applicationId,
        String tenantId) {
        this.appKey = Objects.requireNonNull(appKey, "expected parameter 'appKey' to be non-null");
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private AzureActiveDirectoryAppResponse() {
        this.appKey = null;
        this.applicationId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureActiveDirectoryAppResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appKey;
        private String applicationId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureActiveDirectoryAppResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appKey = defaults.appKey;
    	      this.applicationId = defaults.applicationId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder appKey(String appKey) {
            this.appKey = Objects.requireNonNull(appKey);
            return this;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public AzureActiveDirectoryAppResponse build() {
            return new AzureActiveDirectoryAppResponse(appKey, applicationId, tenantId);
        }
    }
}
