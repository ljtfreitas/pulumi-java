// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A tag of the LegalHold of a blob container.
 * 
 */
public final class TagPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final TagPropertyResponse Empty = new TagPropertyResponse();

    /**
     * Returns the Object ID of the user who added the tag.
     * 
     */
    @InputImport(name="objectIdentifier", required=true)
    private final String objectIdentifier;

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * The tag value.
     * 
     */
    @InputImport(name="tag", required=true)
    private final String tag;

    public String getTag() {
        return this.tag;
    }

    /**
     * Returns the Tenant ID that issued the token for the user who added the tag.
     * 
     */
    @InputImport(name="tenantId", required=true)
    private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Returns the date and time the tag was added.
     * 
     */
    @InputImport(name="timestamp", required=true)
    private final String timestamp;

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * Returns the User Principal Name of the user who added the tag.
     * 
     */
    @InputImport(name="upn", required=true)
    private final String upn;

    public String getUpn() {
        return this.upn;
    }

    public TagPropertyResponse(
        String objectIdentifier,
        String tag,
        String tenantId,
        String timestamp,
        String upn) {
        this.objectIdentifier = Objects.requireNonNull(objectIdentifier, "expected parameter 'objectIdentifier' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.timestamp = Objects.requireNonNull(timestamp, "expected parameter 'timestamp' to be non-null");
        this.upn = Objects.requireNonNull(upn, "expected parameter 'upn' to be non-null");
    }

    private TagPropertyResponse() {
        this.objectIdentifier = null;
        this.tag = null;
        this.tenantId = null;
        this.timestamp = null;
        this.upn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectIdentifier;
        private String tag;
        private String tenantId;
        private String timestamp;
        private String upn;

        public Builder() {
    	      // Empty
        }

        public Builder(TagPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectIdentifier = defaults.objectIdentifier;
    	      this.tag = defaults.tag;
    	      this.tenantId = defaults.tenantId;
    	      this.timestamp = defaults.timestamp;
    	      this.upn = defaults.upn;
        }

        public Builder setObjectIdentifier(String objectIdentifier) {
            this.objectIdentifier = Objects.requireNonNull(objectIdentifier);
            return this;
        }

        public Builder setTag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder setUpn(String upn) {
            this.upn = Objects.requireNonNull(upn);
            return this;
        }

        public TagPropertyResponse build() {
            return new TagPropertyResponse(objectIdentifier, tag, tenantId, timestamp, upn);
        }
    }
}
