// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databricks.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Provides details of the entity that created/updated the workspace.
 * 
 */
public final class CreatedByResponse extends io.pulumi.resources.InvokeArgs {

    public static final CreatedByResponse Empty = new CreatedByResponse();

    /**
     * The application ID of the application that initiated the creation of the workspace. For example, Azure Portal.
     * 
     */
    @InputImport(name="applicationId", required=true)
    private final String applicationId;

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The Object ID that created the workspace.
     * 
     */
    @InputImport(name="oid", required=true)
    private final String oid;

    public String getOid() {
        return this.oid;
    }

    /**
     * The Personal Object ID corresponding to the object ID above
     * 
     */
    @InputImport(name="puid", required=true)
    private final String puid;

    public String getPuid() {
        return this.puid;
    }

    public CreatedByResponse(
        String applicationId,
        String oid,
        String puid) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
        this.oid = Objects.requireNonNull(oid, "expected parameter 'oid' to be non-null");
        this.puid = Objects.requireNonNull(puid, "expected parameter 'puid' to be non-null");
    }

    private CreatedByResponse() {
        this.applicationId = null;
        this.oid = null;
        this.puid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreatedByResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationId;
        private String oid;
        private String puid;

        public Builder() {
    	      // Empty
        }

        public Builder(CreatedByResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.oid = defaults.oid;
    	      this.puid = defaults.puid;
        }

        public Builder setApplicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder setOid(String oid) {
            this.oid = Objects.requireNonNull(oid);
            return this;
        }

        public Builder setPuid(String puid) {
            this.puid = Objects.requireNonNull(puid);
            return this;
        }

        public CreatedByResponse build() {
            return new CreatedByResponse(applicationId, oid, puid);
        }
    }
}
